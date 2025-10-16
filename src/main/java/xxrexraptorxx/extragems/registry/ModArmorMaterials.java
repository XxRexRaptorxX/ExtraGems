package xxrexraptorxx.extragems.registry;

import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import xxrexraptorxx.extragems.main.References;

import java.util.EnumMap;

public class ModArmorMaterials {

    public static final ResourceKey<EquipmentAsset> RUBY_EQUIPMENT_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            ResourceLocation.fromNamespaceAndPath(References.MODID, "ruby"));
    public static final ResourceKey<EquipmentAsset> EMERALD_EQUIPMENT_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            ResourceLocation.fromNamespaceAndPath(References.MODID, "emerald"));
    public static final ResourceKey<EquipmentAsset> SAPPHIRE_EQUIPMENT_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            ResourceLocation.fromNamespaceAndPath(References.MODID, "sapphire"));
    public static final ResourceKey<EquipmentAsset> TOPAZ_EQUIPMENT_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            ResourceLocation.fromNamespaceAndPath(References.MODID, "topaz"));
    public static final ResourceKey<EquipmentAsset> CRYSTAL_EQUIPMENT_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            ResourceLocation.fromNamespaceAndPath(References.MODID, "crystal"));
    public static final ResourceKey<EquipmentAsset> AMETHYST_EQUIPMENT_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID,
            ResourceLocation.fromNamespaceAndPath(References.MODID, "amethyst"));


    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(
            // The durability multiplier of the armor material.
            // ArmorType have different unit durabilities that the multiplier is applied to:
            // - HELMET: 11
            // - CHESTPLATE: 16
            // - LEGGINGS: 15
            // - BOOTS: 13
            // - BODY: 16
            20, Util.make(new EnumMap<>(ArmorType.class), map -> {
                map.put(ArmorType.BOOTS, 3);
                map.put(ArmorType.LEGGINGS, 6);
                map.put(ArmorType.CHESTPLATE, 8);
                map.put(ArmorType.HELMET, 3);
            }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.REPAIRS_EMERALD_ARMOR_TAG, EMERALD_EQUIPMENT_ASSET);


    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(20, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
    }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.REPAIRS_RUBY_ARMOR_TAG, RUBY_EQUIPMENT_ASSET);


    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(20, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
    }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.REPAIRS_SAPPHIRE_ARMOR_TAG, SAPPHIRE_EQUIPMENT_ASSET);


    public static final ArmorMaterial TOPAZ_ARMOR_MATERIAL = new ArmorMaterial(20, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
    }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.REPAIRS_TOPAZ_ARMOR_TAG, TOPAZ_EQUIPMENT_ASSET);


    public static final ArmorMaterial CRYSTAL_ARMOR_MATERIAL = new ArmorMaterial(20, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
    }), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.REPAIRS_CRYSTAL_ARMOR_TAG, CRYSTAL_EQUIPMENT_ASSET);


    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new ArmorMaterial(18, Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.BOOTS, 3);
        map.put(ArmorType.LEGGINGS, 6);
        map.put(ArmorType.CHESTPLATE, 8);
        map.put(ArmorType.HELMET, 3);
    }), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.REPAIRS_AMETHYST_ARMOR_TAG, AMETHYST_EQUIPMENT_ASSET);
}
