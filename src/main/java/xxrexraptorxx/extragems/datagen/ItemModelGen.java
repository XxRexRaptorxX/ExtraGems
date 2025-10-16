package xxrexraptorxx.extragems.datagen;

import net.minecraft.client.color.item.Dye;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.SelectItemModel;
import net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import xxrexraptorxx.extragems.registry.ModArmorMaterials;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.registry.ModTrimMaterials;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {

    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }


    @Override
    public void run() {
        // Generic
        this.generateFlatItem(ModItems.AMETHYST.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.TOPAZ.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.CHARGED_AMETHYST.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CHARGED_RUBY.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CHARGED_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CHARGED_TOPAZ.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CHARGED_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CHARGED_DIAMOND.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CHARGED_EMERALD.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_AMULET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RUBY_AMULET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_AMULET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_AMULET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_AMULET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.DIAMOND_AMULET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.EMERALD_AMULET.get(), ModelTemplates.FLAT_ITEM);

        generateTrimmableArmor(ModItems.AMETHYST_HELMET.get(), ModArmorMaterials.AMETHYST_EQUIPMENT_ASSET, TRIM_PREFIX_HELMET, false);
        generateTrimmableArmor(ModItems.RUBY_HELMET.get(), ModArmorMaterials.RUBY_EQUIPMENT_ASSET, TRIM_PREFIX_HELMET, false);
        generateTrimmableArmor(ModItems.SAPPHIRE_HELMET.get(), ModArmorMaterials.SAPPHIRE_EQUIPMENT_ASSET, TRIM_PREFIX_HELMET, false);
        generateTrimmableArmor(ModItems.TOPAZ_HELMET.get(), ModArmorMaterials.TOPAZ_EQUIPMENT_ASSET, TRIM_PREFIX_HELMET, false);
        generateTrimmableArmor(ModItems.CRYSTAL_HELMET.get(), ModArmorMaterials.CRYSTAL_EQUIPMENT_ASSET, TRIM_PREFIX_HELMET, false);
        generateTrimmableArmor(ModItems.EMERALD_HELMET.get(), ModArmorMaterials.EMERALD_EQUIPMENT_ASSET, TRIM_PREFIX_HELMET, false);

        generateTrimmableArmor(ModItems.AMETHYST_CHESTPLATE.get(), ModArmorMaterials.AMETHYST_EQUIPMENT_ASSET, TRIM_PREFIX_CHESTPLATE, false);
        generateTrimmableArmor(ModItems.RUBY_CHESTPLATE.get(), ModArmorMaterials.RUBY_EQUIPMENT_ASSET, TRIM_PREFIX_CHESTPLATE, false);
        generateTrimmableArmor(ModItems.SAPPHIRE_CHESTPLATE.get(), ModArmorMaterials.SAPPHIRE_EQUIPMENT_ASSET, TRIM_PREFIX_CHESTPLATE, false);
        generateTrimmableArmor(ModItems.TOPAZ_CHESTPLATE.get(), ModArmorMaterials.TOPAZ_EQUIPMENT_ASSET, TRIM_PREFIX_CHESTPLATE, false);
        generateTrimmableArmor(ModItems.CRYSTAL_CHESTPLATE.get(), ModArmorMaterials.CRYSTAL_EQUIPMENT_ASSET, TRIM_PREFIX_CHESTPLATE, false);
        generateTrimmableArmor(ModItems.EMERALD_CHESTPLATE.get(), ModArmorMaterials.EMERALD_EQUIPMENT_ASSET, TRIM_PREFIX_CHESTPLATE, false);

        generateTrimmableArmor(ModItems.AMETHYST_LEGGINGS.get(), ModArmorMaterials.AMETHYST_EQUIPMENT_ASSET, TRIM_PREFIX_LEGGINGS, false);
        generateTrimmableArmor(ModItems.RUBY_LEGGINGS.get(), ModArmorMaterials.RUBY_EQUIPMENT_ASSET, TRIM_PREFIX_LEGGINGS, false);
        generateTrimmableArmor(ModItems.SAPPHIRE_LEGGINGS.get(), ModArmorMaterials.SAPPHIRE_EQUIPMENT_ASSET, TRIM_PREFIX_LEGGINGS, false);
        generateTrimmableArmor(ModItems.TOPAZ_LEGGINGS.get(), ModArmorMaterials.TOPAZ_EQUIPMENT_ASSET, TRIM_PREFIX_LEGGINGS, false);
        generateTrimmableArmor(ModItems.CRYSTAL_LEGGINGS.get(), ModArmorMaterials.CRYSTAL_EQUIPMENT_ASSET, TRIM_PREFIX_LEGGINGS, false);
        generateTrimmableArmor(ModItems.EMERALD_LEGGINGS.get(), ModArmorMaterials.EMERALD_EQUIPMENT_ASSET, TRIM_PREFIX_LEGGINGS, false);

        generateTrimmableArmor(ModItems.AMETHYST_BOOTS.get(), ModArmorMaterials.AMETHYST_EQUIPMENT_ASSET, TRIM_PREFIX_BOOTS, false);
        generateTrimmableArmor(ModItems.RUBY_BOOTS.get(), ModArmorMaterials.RUBY_EQUIPMENT_ASSET, TRIM_PREFIX_BOOTS, false);
        generateTrimmableArmor(ModItems.SAPPHIRE_BOOTS.get(), ModArmorMaterials.SAPPHIRE_EQUIPMENT_ASSET, TRIM_PREFIX_BOOTS, false);
        generateTrimmableArmor(ModItems.TOPAZ_BOOTS.get(), ModArmorMaterials.TOPAZ_EQUIPMENT_ASSET, TRIM_PREFIX_BOOTS, false);
        generateTrimmableArmor(ModItems.CRYSTAL_BOOTS.get(), ModArmorMaterials.CRYSTAL_EQUIPMENT_ASSET, TRIM_PREFIX_BOOTS, false);
        generateTrimmableArmor(ModItems.EMERALD_BOOTS.get(), ModArmorMaterials.EMERALD_EQUIPMENT_ASSET, TRIM_PREFIX_BOOTS, false);

        // Tools
        this.generateFlatItem(ModItems.AMETHYST_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.EMERALD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.EMERALD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.EMERALD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.EMERALD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        this.generateFlatItem(ModItems.EMERALD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
    }


    public void generateTrimmableArmor(Item item, ResourceKey<EquipmentAsset> resourceKey, ResourceLocation location, boolean b) {
        ResourceLocation resourcelocation = ModelLocationUtils.getModelLocation(item);
        ResourceLocation resourcelocation1 = TextureMapping.getItemTexture(item);
        ResourceLocation resourcelocation2 = TextureMapping.getItemTexture(item, "_overlay");
        List<SelectItemModel.SwitchCase<ResourceKey<TrimMaterial>>> list = new ArrayList(TRIM_MATERIAL_MODELS.size());

        for (TrimMaterialData itemmodelgenerators$trimmaterialdata : TRIM_MATERIAL_MODELS) {
            ResourceLocation resourcelocation3 = resourcelocation.withSuffix("_" + itemmodelgenerators$trimmaterialdata.assets().base().suffix() + "_trim");
            String var10001 = itemmodelgenerators$trimmaterialdata.assets().assetId(resourceKey).suffix();
            ResourceLocation resourcelocation4 = location.withSuffix("_" + var10001);
            ItemModel.Unbaked itemmodel$unbaked;
            if (b) {
                this.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation2, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.tintedModel(resourcelocation3, new ItemTintSource[]{new Dye(-6265536)});
            } else {
                this.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.plainModel(resourcelocation3);
            }

            list.add(ItemModelUtils.when(itemmodelgenerators$trimmaterialdata.materialKey, itemmodel$unbaked));
        }

        ItemModel.Unbaked itemmodel$unbaked1;
        if (b) {
            ModelTemplates.TWO_LAYERED_ITEM.create(resourcelocation, TextureMapping.layered(resourcelocation1, resourcelocation2), this.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.tintedModel(resourcelocation, new ItemTintSource[]{new Dye(-6265536)});
        } else {
            ModelTemplates.FLAT_ITEM.create(resourcelocation, TextureMapping.layer0(resourcelocation1), this.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.plainModel(resourcelocation);
        }

        this.itemModelOutput.accept(item, ItemModelUtils.select(new TrimMaterialProperty(), itemmodel$unbaked1, list));
    }


    public static record TrimMaterialData(MaterialAssetGroup assets, ResourceKey<TrimMaterial> materialKey) {

        public TrimMaterialData(MaterialAssetGroup assets, ResourceKey<TrimMaterial> materialKey) {
            this.assets = assets;
            this.materialKey = materialKey;
        }


        public MaterialAssetGroup assets() {
            return this.assets;
        }


        public ResourceKey<TrimMaterial> materialKey() {
            return this.materialKey;
        }
    }


    public static final List<TrimMaterialData> TRIM_MATERIAL_MODELS = List.of(
            // VANILLA
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.QUARTZ, TrimMaterials.QUARTZ), new ItemModelGen.TrimMaterialData(MaterialAssetGroup.IRON, TrimMaterials.IRON),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.NETHERITE, TrimMaterials.NETHERITE),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.REDSTONE, TrimMaterials.REDSTONE),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.COPPER, TrimMaterials.COPPER), new ItemModelGen.TrimMaterialData(MaterialAssetGroup.GOLD, TrimMaterials.GOLD),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.EMERALD, TrimMaterials.EMERALD),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.DIAMOND, TrimMaterials.DIAMOND), new ItemModelGen.TrimMaterialData(MaterialAssetGroup.LAPIS, TrimMaterials.LAPIS),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.AMETHYST, TrimMaterials.AMETHYST),
            new ItemModelGen.TrimMaterialData(MaterialAssetGroup.RESIN, TrimMaterials.RESIN),
            // CUSTOM
            new ItemModelGen.TrimMaterialData(ModTrimMaterials.RUBY_ASSET_GROUP, ModTrimMaterials.RUBY),
            new ItemModelGen.TrimMaterialData(ModTrimMaterials.SAPPHIRE_ASSET_GROUP, ModTrimMaterials.SAPPHIRE),
            new ItemModelGen.TrimMaterialData(ModTrimMaterials.TOPAZ_ASSET_GROUP, ModTrimMaterials.TOPAZ),
            new ItemModelGen.TrimMaterialData(ModTrimMaterials.CRYSTAL_ASSET_GROUP, ModTrimMaterials.CRYSTAL));

}
