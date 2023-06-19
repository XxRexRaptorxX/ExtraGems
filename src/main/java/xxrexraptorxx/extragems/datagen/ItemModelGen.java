package xxrexraptorxx.extragems.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.main.References;

public class ItemModelGen extends ItemModelProvider {

    public ItemModelGen(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, References.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Generic
        itemGenerated(ModItems.AMETHYST);
        itemGenerated(ModItems.RUBY);
        itemGenerated(ModItems.SAPPHIRE);
        itemGenerated(ModItems.TOPAZ);
        itemGenerated(ModItems.CRYSTAL);

        itemHandheld(ModItems.CHARGED_AMETHYST);
        itemHandheld(ModItems.CHARGED_RUBY);
        itemHandheld(ModItems.CHARGED_SAPPHIRE);
        itemHandheld(ModItems.CHARGED_TOPAZ);
        itemHandheld(ModItems.CHARGED_CRYSTAL);
        itemHandheld(ModItems.CHARGED_DIAMOND);
        itemHandheld(ModItems.CHARGED_EMERALD);

        itemHandheld(ModItems.AMETHYST_AMULET);
        itemHandheld(ModItems.RUBY_AMULET);
        itemHandheld(ModItems.SAPPHIRE_AMULET);
        itemHandheld(ModItems.TOPAZ_AMULET);
        itemHandheld(ModItems.CRYSTAL_AMULET);
        itemHandheld(ModItems.DIAMOND_AMULET);
        itemHandheld(ModItems.EMERALD_AMULET);

        itemHandheld(ModItems.AMETHYST_HELMET);
        itemHandheld(ModItems.RUBY_HELMET);
        itemHandheld(ModItems.SAPPHIRE_HELMET);
        itemHandheld(ModItems.TOPAZ_HELMET);
        itemHandheld(ModItems.CRYSTAL_HELMET);
        itemHandheld(ModItems.EMERALD_HELMET);

        itemHandheld(ModItems.AMETHYST_CHESTPLATE);
        itemHandheld(ModItems.RUBY_CHESTPLATE);
        itemHandheld(ModItems.SAPPHIRE_CHESTPLATE);
        itemHandheld(ModItems.TOPAZ_CHESTPLATE);
        itemHandheld(ModItems.CRYSTAL_CHESTPLATE);
        itemHandheld(ModItems.EMERALD_CHESTPLATE);

        itemHandheld(ModItems.AMETHYST_LEGGINGS);
        itemHandheld(ModItems.RUBY_LEGGINGS);
        itemHandheld(ModItems.SAPPHIRE_LEGGINGS);
        itemHandheld(ModItems.TOPAZ_LEGGINGS);
        itemHandheld(ModItems.CRYSTAL_LEGGINGS);
        itemHandheld(ModItems.EMERALD_LEGGINGS);

        itemHandheld(ModItems.AMETHYST_BOOTS);
        itemHandheld(ModItems.RUBY_BOOTS);
        itemHandheld(ModItems.SAPPHIRE_BOOTS);
        itemHandheld(ModItems.TOPAZ_BOOTS);
        itemHandheld(ModItems.CRYSTAL_BOOTS);
        itemHandheld(ModItems.EMERALD_BOOTS);



        //Tools
        itemHandheld(ModItems.AMETHYST_SWORD);
        itemHandheld(ModItems.RUBY_SWORD);
        itemHandheld(ModItems.SAPPHIRE_SWORD);
        itemHandheld(ModItems.TOPAZ_SWORD);
        itemHandheld(ModItems.CRYSTAL_SWORD);
        itemHandheld(ModItems.EMERALD_SWORD);

        itemHandheld(ModItems.AMETHYST_PICKAXE);
        itemHandheld(ModItems.RUBY_PICKAXE);
        itemHandheld(ModItems.SAPPHIRE_PICKAXE);
        itemHandheld(ModItems.TOPAZ_PICKAXE);
        itemHandheld(ModItems.CRYSTAL_PICKAXE);
        itemHandheld(ModItems.EMERALD_PICKAXE);

        itemHandheld(ModItems.AMETHYST_AXE);
        itemHandheld(ModItems.RUBY_AXE);
        itemHandheld(ModItems.SAPPHIRE_AXE);
        itemHandheld(ModItems.TOPAZ_AXE);
        itemHandheld(ModItems.CRYSTAL_AXE);
        itemHandheld(ModItems.EMERALD_AXE);

        itemHandheld(ModItems.AMETHYST_HOE);
        itemHandheld(ModItems.RUBY_HOE);
        itemHandheld(ModItems.SAPPHIRE_HOE);
        itemHandheld(ModItems.TOPAZ_HOE);
        itemHandheld(ModItems.CRYSTAL_HOE);
        itemHandheld(ModItems.EMERALD_HOE);

        itemHandheld(ModItems.AMETHYST_SHOVEL);
        itemHandheld(ModItems.RUBY_SHOVEL);
        itemHandheld(ModItems.SAPPHIRE_SHOVEL);
        itemHandheld(ModItems.TOPAZ_SHOVEL);
        itemHandheld(ModItems.CRYSTAL_SHOVEL);
        itemHandheld(ModItems.EMERALD_SHOVEL);



        //BlockItems
        itemBlock(ModBlocks.RUBY_ORE_BLOCKITEM);
        itemBlock(ModBlocks.SAPPHIRE_ORE_BLOCKITEM);
        itemBlock(ModBlocks.TOPAZ_ORE_BLOCKITEM);
        itemBlock(ModBlocks.CRYSTAL_ORE_BLOCKITEM);

        itemBlock(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCKITEM);
        itemBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCKITEM);
        itemBlock(ModBlocks.DEEPSLATE_TOPAZ_ORE_BLOCKITEM);
        itemBlock(ModBlocks.DEEPSLATE_CRYSTAL_ORE_BLOCKITEM);

        itemBlock(ModBlocks.AMETHYST_BLOCKITEM);
        itemBlock(ModBlocks.RUBY_BLOCKITEM);
        itemBlock(ModBlocks.SAPPHIRE_BLOCKITEM);
        itemBlock(ModBlocks.TOPAZ_BLOCKITEM);
        itemBlock(ModBlocks.CRYSTAL_BLOCKITEM);

        itemBlock(ModBlocks.CHARGED_AMETHYST_BLOCKITEM);
        itemBlock(ModBlocks.CHARGED_RUBY_BLOCKITEM);
        itemBlock(ModBlocks.CHARGED_SAPPHIRE_BLOCKITEM);
        itemBlock(ModBlocks.CHARGED_TOPAZ_BLOCKITEM);
        itemBlock(ModBlocks.CHARGED_CRYSTAL_BLOCKITEM);
        itemBlock(ModBlocks.CHARGED_DIAMOND_BLOCKITEM);
        itemBlock(ModBlocks.CHARGED_EMERALD_BLOCKITEM);

        itemBlock(ModBlocks.GEM_CHARGER_BLOCKITEM);
    }



    private void itemGenerated(RegistryObject item) {
        singleTexture(item.getId().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/" + item.getId().getPath().toString().substring(References.MODID.length() + 1)));
    }

    private void itemHandheld(RegistryObject item) {
        singleTexture(item.getId().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/" + item.getId().getPath().toString().substring(References.MODID.length() + 1)));
    }

    private void itemBlock(RegistryObject item) {
        withExistingParent(item.getId().getPath(), new ResourceLocation(References.MODID, "block/" + item.getId().getPath().toString().substring(References.MODID.length() + 1)));
    }

}