package xxrexraptorxx.extragems.world;

import com.mojang.authlib.GameProfile;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.VersionChecker;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.util.TriState;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import xxrexraptorxx.extragems.main.ExtraGems;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.utils.Config;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.GAME)
public class Events {

    /** Update Checker **/
    private static boolean hasShownUp = false;

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Pre event) {
        if (Config.UPDATE_CHECKER != null && Config.UPDATE_CHECKER.get()) {

            if (!hasShownUp && Minecraft.getInstance().screen == null) {
                var player = Minecraft.getInstance().player;
                if (player == null) return;

                var modContainer = ModList.get().getModContainerById(References.MODID).orElse(null);

                if (modContainer != null) {
                    var versionCheckResult = VersionChecker.getResult(modContainer.getModInfo());

                    if (versionCheckResult.status() == VersionChecker.Status.OUTDATED || versionCheckResult.status() == VersionChecker.Status.BETA_OUTDATED) {
                        MutableComponent url = Component.translatable(ChatFormatting.GREEN + "Click here to update!")
                                .withStyle(style -> style.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, References.URL)));

                        player.displayClientMessage(Component.literal(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"), false);
                        player.displayClientMessage(url, false);

                        hasShownUp = true;

                    } else if (versionCheckResult.status() == VersionChecker.Status.FAILED) {
                        ExtraGems.LOGGER.error(References.NAME + "'s version checker failed!");
                        hasShownUp = true;
                    }
                }
            }
        }
    }


    private static final HttpClient HTTP_CLIENT = HttpClient.newHttpClient();

    /**
     * Distributes supporter rewards on first login.
     */
    @SubscribeEvent
    public static void SupporterRewards(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        Level level = player.level();

        if (Config.PATREON_REWARDS.get()) {
            // Check if the player already has rewards
            if (!player.getInventory().contains(new ItemStack(Items.PAPER))) {
                if (player instanceof ServerPlayer serverPlayer) { // Ensure the player is a ServerPlayer
                    // Check if the player is logging in for the first time
                    if (serverPlayer.getStats().getValue(Stats.CUSTOM, Stats.PLAY_TIME) < 5) {

                        // Perform supporter checks asynchronously
                        CompletableFuture.runAsync(() -> {
                            if (SupporterCheck(URI.create("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Supporter"), player)) {
                                giveSupporterReward(player, level);
                            }
                            if (SupporterCheck(URI.create("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Premium%20Supporter"), player)) {
                                givePremiumSupporterReward(player, level);
                            }
                            if (SupporterCheck(URI.create("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Elite"), player)) {
                                giveEliteReward(player);
                            }
                        });
                    }
                }
            }
        }
    }


    /**
     * Checks if the player is in the supporter list from the given URI.
     *
     * @param uri URI to a file containing supporter names
     * @param player The in-game player
     * @return true if the player is a supporter, otherwise false
     */
    private static boolean SupporterCheck(URI uri, Player player) {
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
            HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

            // Parse supporter list
            List<String> supporterList = List.of(response.body().split("\\R")); // Split lines
            return supporterList.contains(player.getName().getString());

        } catch (Exception e) {
            ExtraGems.LOGGER.error("Failed to fetch or process supporter list from URI: {}", uri, e);
            return false;
        }
    }


    private static void giveSupporterReward(Player player, Level level) {
        ItemStack certificate = new ItemStack(Items.PAPER);
        certificate.set(DataComponents.CUSTOM_NAME, Component.literal("Thank you for supporting me in my work!").withStyle(ChatFormatting.GOLD)
                .append(Component.literal(" - XxRexRaptorxX").withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.GREEN)));

        ItemStack reward = new ItemStack(Items.PLAYER_HEAD);
        var profile = new GameProfile(player.getUUID(), player.getName().getString());
        reward.set(DataComponents.PROFILE, new ResolvableProfile(profile));

        level.playSound(null, player.blockPosition(), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS, 0.5F, level.random.nextFloat() * 0.15F + 0.8F);
        player.getInventory().add(reward);
        player.getInventory().add(certificate);
    }

    private static void givePremiumSupporterReward(Player player, Level level) {
        ItemStack reward = new ItemStack(Items.DIAMOND_SWORD, 1);
        Registry<Enchantment> enchantmentsRegistry = level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT);

        reward.enchant(enchantmentsRegistry.getOrThrow(Enchantments.MENDING), 1);
        reward.enchant(enchantmentsRegistry.getOrThrow(Enchantments.SHARPNESS), 3);
        reward.set(DataComponents.ENCHANTMENTS, reward.getOrDefault(DataComponents.ENCHANTMENTS, ItemEnchantments.EMPTY));
        player.getInventory().add(reward);
    }

    private static void giveEliteReward(Player player) {
        ItemStack star = new ItemStack(Items.NETHER_STAR);

        star.set(DataComponents.CUSTOM_NAME, Component.literal("Elite Star"));
        player.getInventory().add(star);
    }


    /**
     * Tests if a player is a supporter
     *
     * @param url url to a file that contains the supporter names
     * @param player ingame player
     * @return true/false
     */
    private static boolean SupporterCheck(URL url, Player player) {
        try {
            Scanner scanner = new Scanner(url.openStream());
            List<String> supporterList = scanner.tokens().toList();

            for (String name: supporterList) {
                //test if player is in supporter list
                if (player.getName().getString().equals(name)) {
                    return true;
                }
            }

            scanner.close();

        } catch (MalformedURLException e) {
            ExtraGems.LOGGER.error("Supporter list URL not found! >>{}", url);

        } catch (Exception e) {
            ExtraGems.LOGGER.error("An unexpected error occurred while checking supporter list", e);
        }

        return false;
    }



    /** Gem Charger **/
    // from ThinkersConstruct and modified

    @SubscribeEvent
    public static void onInteract(PlayerInteractEvent.RightClickBlock event) {
        if(ItemStack.isSameItem(event.getItemStack(), new ItemStack(ModItems.AMETHYST.get())) || ItemStack.isSameItem(event.getItemStack(), new ItemStack(ModItems.RUBY.get())) || ItemStack.isSameItem(event.getItemStack(), new ItemStack(ModItems.SAPPHIRE.get()))
                || ItemStack.isSameItem(event.getItemStack(), new ItemStack(ModItems.CRYSTAL.get())) || ItemStack.isSameItem(event.getItemStack(), new ItemStack(ModItems.TOPAZ.get())) || ItemStack.isSameItem(event.getItemStack(), new ItemStack(Items.DIAMOND)) || ItemStack.isSameItem(event.getItemStack(), new ItemStack(Items.EMERALD))) {
            BlockPos pos = event.getPos();
            Player player = event.getEntity();
            Level level = event.getLevel();

                if (level.getBlockState(pos).getBlock() == ModBlocks.GEM_CHARGER.get()) {

                    if (player.experienceLevel >= Config.CHARGING_COST.get()) {

                        if (level.getMoonPhase() == 0) {
                            player.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);

                            for (int i = 0; i < 2; i++) {
                                level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 1.1F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                                level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 1.1F, pos.getY() + 0.5F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                                level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() - 0.1F, 0.0D, 0.0D, 0.0D);
                                level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() - 0.1F, pos.getY() + 0.5F, pos.getZ() + 0.5F, 0.0D, 0.0D, 0.0D);
                                level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 1.1F, 0.0D, 0.0D, 0.0D);
                            }
                            if (!level.isClientSide) {
                                event.getItemStack().shrink(1);
                                player.onEnchantmentPerformed(null, Config.CHARGING_COST.get());
                                ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(getChargedGemVariant(player.getItemInHand(player.getUsedItemHand()).copy())));

                                event.setUseBlock(TriState.FALSE);
                                event.setUseItem(TriState.FALSE);
                                event.setCanceled(true);
                            }
                        } else {
                            if(level.isClientSide) player.displayClientMessage(Component.translatable("message.extragems.not_night"), true);
                        }
                    } else {
                        if(level.isClientSide) player.displayClientMessage(Component.translatable("message.extragems.not_enough_levels"), true);
                    }
                } else {
                    if (level.isClientSide) player.displayClientMessage(Component.translatable("message.extragems.wrong_block"), true);
                }
        }
    }



    /** Utility **/

    public static Item getChargedGemVariant(ItemStack gem) {
        switch (BuiltInRegistries.ITEM.getKey(gem.getItem()).toString()) {

            case References.MODID + ":amethyst":
                return ModItems.CHARGED_AMETHYST.get();

            case References.MODID + ":ruby":
                return ModItems.CHARGED_RUBY.get();

            case References.MODID + ":sapphire":
                return ModItems.CHARGED_SAPPHIRE.get();

            case References.MODID + ":topaz":
                return ModItems.CHARGED_TOPAZ.get();

            case References.MODID + ":crystal":
                return ModItems.CHARGED_CRYSTAL.get();

            case "minecraft:diamond":
                return ModItems.CHARGED_DIAMOND.get();

            case "minecraft:emerald":
                return ModItems.CHARGED_EMERALD.get();

            default:
                ExtraGems.LOGGER.error("Invalid registry name for gem type.");
                return Items.COAL;
        }
    }


}
