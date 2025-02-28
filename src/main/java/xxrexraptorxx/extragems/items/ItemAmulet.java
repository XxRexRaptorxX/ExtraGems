package xxrexraptorxx.extragems.items;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import xxrexraptorxx.extragems.utils.Config;
import xxrexraptorxx.extragems.utils.EffectHelper;


public class ItemAmulet extends Item {

    public ItemAmulet(Properties properties) {
        super(properties
            .stacksTo(1)
            .durability(100)
            .rarity(Rarity.RARE)
            //.defaultDurability(200)
        );

    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }


    @Override
    public InteractionResult useOn(UseOnContext event) {
        Level level = event.getLevel();
        ItemStack stack = event.getItemInHand();
        Player player = event.getPlayer();

        level.playSound(player, player.position().x, player.position().y, player.position().z, SoundEvents.ENDER_EYE_DEATH, SoundSource.PLAYERS, 0.5F, 0.4F / (level.random.nextFloat() * 0.4F + 0.8F));
        player.getCooldowns().addCooldown(stack, Config.AMULET_EFFECT_COOLDOWN.get());

        if (Config.AMULET_DESTROYABLE.get()) {
            stack.setDamageValue(stack.getDamageValue() + 1);

            if (stack.getDamageValue() == stack.getMaxDamage()) {
                level.playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_BREAK, SoundSource.PLAYERS, 0.5F, 0.4F / (level.random.nextFloat() * 0.4F + 0.8F));
                stack.shrink(1);
            }
        }

        if (!level.isClientSide) {
            AreaEffectCloud cloud = new AreaEffectCloud(level, player.position().x, player.position().y + 0.5F, player.position().z);
            cloud.setDuration(5);
            cloud.setRadius(Config.AMULET_EFFECT_RADIUS.get());
            cloud.setWaitTime(1);
            cloud.setParticle(ParticleTypes.CRIT);
            cloud.addEffect(new MobEffectInstance(EffectHelper.getEffect(BuiltInRegistries.ITEM.getKey(this).toString()), Config.AMULET_EFFECT_DURATION.get(), Config.AMULET_EFFECT_AMPLIFIER.get()));
            level.addFreshEntity(cloud);
        }


        return InteractionResult.SUCCESS;
    }

}
