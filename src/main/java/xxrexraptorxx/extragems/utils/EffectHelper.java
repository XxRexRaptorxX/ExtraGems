package xxrexraptorxx.extragems.utils;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import xxrexraptorxx.extragems.main.References;

public class EffectHelper {

    public static Holder<MobEffect> getEffect(String registryName) {
        switch (registryName) {
            case References.MODID + ":amethyst_amulet":
            case References.MODID + ":charged_amethyst_block":
                return MobEffects.REGENERATION;

            case References.MODID + ":ruby_amulet":
            case References.MODID + ":charged_ruby_block":
                return MobEffects.JUMP;

            case References.MODID + ":sapphire_amulet":
            case References.MODID + ":charged_sapphire_block":
                return MobEffects.DAMAGE_BOOST;

            case References.MODID + ":topaz_amulet":
            case References.MODID + ":charged_topaz_block":
                return MobEffects.FIRE_RESISTANCE;

            case References.MODID + ":crystal_amulet":
            case References.MODID + ":charged_crystal_block":
                return MobEffects.DIG_SPEED;

            case References.MODID + ":emerald_amulet":
            case References.MODID + ":charged_emerald_block":
                return MobEffects.MOVEMENT_SPEED;

            case References.MODID + ":diamond_amulet":
            case References.MODID + ":charged_diamond_block":
                return MobEffects.DAMAGE_RESISTANCE;

            default:
                return MobEffects.UNLUCK;
        }
    }

}
