package xxrexraptorxx.extragems.world;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.TriState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.utils.Config;
import xxrexraptorxx.extragems.utils.GemHelper;
import xxrexraptorxx.magmacore.utils.FormattingHelper;

@EventBusSubscriber(modid = References.MODID)
public class Events {

    // from ThinkersConstruct and modified
    /** Gem Charger **/
    @SubscribeEvent
    public static void onInteract(PlayerInteractEvent.RightClickBlock event) {
        ItemStack stack = event.getItemStack();

        if (ItemStack.isSameItem(stack, new ItemStack(ModItems.AMETHYST.get())) || ItemStack.isSameItem(stack, new ItemStack(ModItems.RUBY.get()))
                || ItemStack.isSameItem(stack, new ItemStack(ModItems.SAPPHIRE.get())) || ItemStack.isSameItem(stack, new ItemStack(ModItems.CRYSTAL.get()))
                || ItemStack.isSameItem(stack, new ItemStack(ModItems.TOPAZ.get())) || ItemStack.isSameItem(stack, new ItemStack(Items.DIAMOND))
                || ItemStack.isSameItem(stack, new ItemStack(Items.EMERALD))) {
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
                        if (!level.isClientSide()) {
                            event.getItemStack().shrink(1);
                            player.onEnchantmentPerformed(null, Config.CHARGING_COST.get());
                            player.addItem(new ItemStack(GemHelper.getChargedGemVariant(player.getItemInHand(player.getUsedItemHand()).copy())));

                            event.setUseBlock(TriState.FALSE);
                            event.setUseItem(TriState.FALSE);
                            event.setCanceled(true);
                        }
                    } else {
                        if (level.isClientSide()) player.displayClientMessage(FormattingHelper.setDescComponent(References.MODID, "not_night"), true);
                    }
                } else {
                    if (level.isClientSide()) player.displayClientMessage(FormattingHelper.setDescComponent(References.MODID, "not_enough_levels"), true);
                }
            } else {
                if (level.isClientSide()) player.displayClientMessage(FormattingHelper.setDescComponent(References.MODID, "wrong_block"), true);
            }
        }
    }

}
