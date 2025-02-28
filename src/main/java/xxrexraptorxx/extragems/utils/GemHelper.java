package xxrexraptorxx.extragems.utils;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import xxrexraptorxx.extragems.main.ExtraGems;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.registry.ModItems;

public class GemHelper {

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
