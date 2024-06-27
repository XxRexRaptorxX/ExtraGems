package xxrexraptorxx.extragems.registry;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.extragems.main.References;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {

    private static final DeferredRegister<ArmorMaterial> MATERIAL = DeferredRegister.create(BuiltInRegistries.ARMOR_MATERIAL, References.MODID);


    public static void init(IEventBus bus) {
        MATERIAL.register(bus);
    }

    public static final Holder<ArmorMaterial> EMERALD_ARMOR_MATERIAL = MATERIAL.register("emerald", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }),
            18, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModTags.EMERALD_TAG),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "emerald")),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "emerald"), "_overlay", false)
            ), 0, 0));


    public static final Holder<ArmorMaterial> RUBY_ARMOR_MATERIAL = MATERIAL.register("ruby", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }),
            18, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModTags.RUBY_TAG),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "ruby")),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "ruby"), "_overlay", false)
            ), 0, 0));


    public static final Holder<ArmorMaterial> SAPPHIRE_ARMOR_MATERIAL = MATERIAL.register("sapphire", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }),
            18, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModTags.SAPPHIRE_TAG),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "sapphire")),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "sapphire"), "_overlay", false)
                    ), 0, 0));


    public static final Holder<ArmorMaterial> TOPAZ_ARMOR_MATERIAL = MATERIAL.register("topaz", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }),
            18, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModTags.TOPAZ_TAG),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "topaz")),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "topaz"), "_overlay", false)
                    ), 0, 0));


    public static final Holder<ArmorMaterial> CRYSTAL_ARMOR_MATERIAL = MATERIAL.register("crystal", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }),
            18, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModTags.CRYSTAL_TAG),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "crystal")),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "crystal"), "_overlay", false)
                    ), 0, 0));


    public static final Holder<ArmorMaterial> AMETHYST_ARMOR_MATERIAL = MATERIAL.register("amethyst", () -> new ArmorMaterial(
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }),
            20, SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModTags.AMETHYST_TAG),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "amethyst")),
                    new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(References.MODID, "amethyst"), "_overlay", false)
                    ), 0, 0));

}