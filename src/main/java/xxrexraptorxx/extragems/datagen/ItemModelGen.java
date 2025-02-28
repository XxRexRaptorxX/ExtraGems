package xxrexraptorxx.extragems.datagen;

import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.ResourceLocation;
import xxrexraptorxx.extragems.registry.ModItems;

import java.util.function.BiConsumer;

public class ItemModelGen extends ItemModelGenerators {

    public ItemModelGen(ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(itemModelOutput, modelOutput);
    }

    @Override
    public void run() {
        //Generic
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

        this.generateFlatItem(ModItems.AMETHYST_HELMET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RUBY_HELMET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_HELMET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_HELMET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_HELMET.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.EMERALD_HELMET.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RUBY_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.EMERALD_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RUBY_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.EMERALD_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);

        this.generateFlatItem(ModItems.AMETHYST_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.RUBY_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.SAPPHIRE_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.TOPAZ_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.CRYSTAL_BOOTS.get(), ModelTemplates.FLAT_ITEM);
        this.generateFlatItem(ModItems.EMERALD_BOOTS.get(), ModelTemplates.FLAT_ITEM);


        //Tools
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

}