package xxrexraptorxx.extragems.world;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.VersionChecker;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import xxrexraptorxx.extragems.main.ExtraGems;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.utils.Config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

@Mod.EventBusSubscriber(modid = References.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {

    /** Update-Checker **/
    private static boolean hasShownUp = false;

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (Config.UPDATE_CHECKER.get()) {
            if (!hasShownUp && Minecraft.getInstance().screen == null) {
                if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.OUTDATED ||
                        VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.BETA_OUTDATED ) {

                    MutableComponent url = Component.literal(ChatFormatting.GREEN + "Click here to update!");
                    url.withStyle(url.getStyle().withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, References.URL)));

                    Minecraft.getInstance().player.displayClientMessage(Component.literal(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"), false);
                    Minecraft.getInstance().player.displayClientMessage(url, false);

                    hasShownUp = true;

                } else if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.FAILED) {
                    ExtraGems.LOGGER.error(References.NAME + "'s version checker failed!");
                    hasShownUp = true;

                }
            }
        }
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

                                event.setUseBlock(Event.Result.DENY);
                                event.setUseItem(Event.Result.DENY);
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
                System.err.println("Invalid registry name for gem type.");
                return Items.COAL;
        }
    }


    /**
     * Distributes the supporter rewards on first join.
     */
    @SubscribeEvent
    public static void SupporterRewards(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        Level level = player.level();

        if (Config.PATREON_REWARDS.get()) {

            try {
                URL SUPPORTER_URL = new URL("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Supporter");
                URL PREMIUM_SUPPORTER_URL = new URL("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Premium%20Supporter");
                URL ELITE_URL = new URL("https://raw.githubusercontent.com/XxRexRaptorxX/Patreons/main/Elite");

                //test if a player already has rewards
                if (!player.getInventory().contains(new ItemStack(Items.PAPER))) {

                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    //test if player joins the first time
                    if (serverPlayer.getStats().getValue(Stats.CUSTOM, Stats.PLAY_TIME) < 5) {

                        //test if player is supporter
                        if (SupporterCheck(SUPPORTER_URL, player)) {

                            ItemStack certificate = new ItemStack(Items.PAPER).setHoverName((Component.literal("Thank you for supporting me in my work!").withStyle(ChatFormatting.GOLD).append(Component.literal(" - XxRexRaptorxX").withStyle(ChatFormatting.ITALIC).withStyle(ChatFormatting.GREEN))));

                            CompoundTag ownerNBT = new CompoundTag();
                            ItemStack reward = new ItemStack(Items.PLAYER_HEAD);
                            ownerNBT.putString("SkullOwner", player.getName().getString());
                            reward.setTag(ownerNBT);

                            level.playSound((Player) null, player.blockPosition(), SoundEvents.PLAYER_LEVELUP, SoundSource.PLAYERS, 0.5F, level.random.nextFloat() * 0.15F + 0.8F);
                            player.addItem(reward);
                            player.addItem(certificate);
                        }

                        //test if player is premium supporter
                        if (SupporterCheck(PREMIUM_SUPPORTER_URL, player)) {
                            ItemStack reward = new ItemStack(Items.DIAMOND_SWORD, 1).setHoverName(Component.literal("Rex's Night Sword").withStyle(ChatFormatting.DARK_GRAY));
                            reward.enchant(Enchantments.MENDING, 1);
                            reward.enchant(Enchantments.SHARPNESS, 3);
                            player.addItem(reward);
                        }

                        //test if player is elite
                        if (SupporterCheck(ELITE_URL, player)) {
                            player.addItem(new ItemStack(Items.NETHER_STAR).setHoverName(Component.literal("Elite Star")));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
            ExtraGems.LOGGER.error("Supporter list URL not found! >>" + url);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
