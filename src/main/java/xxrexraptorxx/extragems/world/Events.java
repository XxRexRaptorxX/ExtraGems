package xxrexraptorxx.extragems.world;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;
import xxrexraptorxx.extragems.main.ModBlocks;
import xxrexraptorxx.extragems.main.ModItems;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.utils.Config;

import java.util.UUID;

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

                    Minecraft.getInstance().player.sendMessage(new TextComponent(ChatFormatting.BLUE + "A newer version of " + ChatFormatting.YELLOW + References.NAME + ChatFormatting.BLUE + " is available!"), UUID.randomUUID());
                    Minecraft.getInstance().player.sendMessage(new TextComponent(ChatFormatting.GRAY + References.URL), UUID.randomUUID());

                    hasShownUp = true;
                } else if (VersionChecker.getResult(ModList.get().getModContainerById(References.MODID).get().getModInfo()).status() == VersionChecker.Status.FAILED) {
                    System.err.println("Version checker failed!");
                }
            }
        }
    }


    /** Gem Charger **/
    // from ThinkersConstruct and modified

    @SubscribeEvent
    public static void onInteract(PlayerInteractEvent.RightClickBlock event) {
        if(ItemStack.isSame(event.getItemStack(), new ItemStack(ModItems.AMETHYST.get())) || ItemStack.isSame(event.getItemStack(), new ItemStack(ModItems.RUBY.get())) || ItemStack.isSame(event.getItemStack(), new ItemStack(ModItems.SAPPHIRE.get()))
                || ItemStack.isSame(event.getItemStack(), new ItemStack(ModItems.CRYSTAL.get())) || ItemStack.isSame(event.getItemStack(), new ItemStack(ModItems.TOPAZ.get())) || ItemStack.isSame(event.getItemStack(), new ItemStack(Items.DIAMOND)) || ItemStack.isSame(event.getItemStack(), new ItemStack(Items.EMERALD))) {
            BlockPos pos = event.getPos();
            Player player = event.getPlayer();
            Level level = event.getWorld();

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
                            if(level.isClientSide) player.sendMessage(new TranslatableComponent("message.extragems.not_night"), player.getUUID());
                        }
                    } else {
                        if(level.isClientSide) player.sendMessage(new TranslatableComponent("message.extragems.not_enough_levels"), player.getUUID());
                    }
                } else {
                    if (level.isClientSide) player.sendMessage(new TranslatableComponent("message.extragems.wrong_block"), player.getUUID());
                }
        }
    }



    /** Utility **/

    public static Item getChargedGemVariant(ItemStack gem) {
        switch (gem.getItem().getRegistryName().toString()) {

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
}
