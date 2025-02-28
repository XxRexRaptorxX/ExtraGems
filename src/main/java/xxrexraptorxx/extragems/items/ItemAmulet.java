package xxrexraptorxx.extragems.items;

import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.utils.Config;

import java.util.Random;


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
    public InteractionResult useOn(UseOnContext player) {
        Level level = player.getLevel();
        ItemStack stack = player.getItemInHand();
        Random random = new Random();

        level.playSound(player.getPlayer(), player.getPlayer().position().x, player.getPlayer().position().y, player.getPlayer().position().z, SoundEvents.ENDER_EYE_DEATH, SoundSource.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        player.getPlayer().getCooldowns().addCooldown(this, Config.AMULET_EFFECT_COOLDOWN.get());

        if (Config.AMULET_DESTROYABLE.get()) {
            stack.setDamageValue(stack.getDamageValue() + 1);

            if (stack.getDamageValue() == stack.getMaxDamage()) {
                level.playSound((Player) null, player.getPlayer().getX(), player.getPlayer().getY(), player.getPlayer().getZ(), SoundEvents.ITEM_BREAK, SoundSource.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
                stack.shrink(1);
            }
        }

        if (!level.isClientSide) {
            AreaEffectCloud cloud1 = new AreaEffectCloud(level, player.getPlayer().position().x, player.getPlayer().position().y + 0.5F, player.getPlayer().position().z);
            cloud1.setDuration(5);
            cloud1.setRadius(Config.AMULET_EFFECT_RADIUS.get());
            cloud1.setWaitTime(1);
            cloud1.setParticle(ParticleTypes.CRIT);
            cloud1.addEffect(new MobEffectInstance(getEffect(BuiltInRegistries.ITEM.getKey(this).toString()), Config.AMULET_EFFECT_DURATION.get(), Config.AMULET_EFFECT_AMPLIFIER.get()));
            level.addFreshEntity(cloud1);
        }


        return InteractionResult.SUCCESS;
    }


    private static Holder<MobEffect> getEffect(String registryName) {
        switch (registryName) {
            case References.MODID + ":amethyst_amulet":
                return MobEffects.REGENERATION;

            case References.MODID + ":ruby_amulet":
                return MobEffects.JUMP;

            case References.MODID + ":sapphire_amulet":
                return MobEffects.DAMAGE_BOOST;

            case References.MODID + ":topaz_amulet":
                return MobEffects.FIRE_RESISTANCE;

            case References.MODID + ":crystal_amulet":
                return MobEffects.DIG_SPEED;

            case References.MODID + ":emerald_amulet":
                return MobEffects.MOVEMENT_SPEED;

            case References.MODID + ":diamond_amulet":
                return MobEffects.DAMAGE_RESISTANCE;

            default:
                return MobEffects.UNLUCK;
        }
    }
}
