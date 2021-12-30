package xxrexraptorxx.extragems.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.extragems.main.ModBlocks;
import xxrexraptorxx.extragems.main.ModItems;
import xxrexraptorxx.extragems.main.References;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, References.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Generic
        singleTexture(ModItems.AMETHYST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst"));
        singleTexture(ModItems.RUBY.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby"));
        singleTexture(ModItems.SAPPHIRE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire"));
        singleTexture(ModItems.TOPAZ.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz"));
        singleTexture(ModItems.CRYSTAL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal"));

        singleTexture(ModItems.CHARGED_AMETHYST.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_charged"));
        singleTexture(ModItems.CHARGED_RUBY.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_charged"));
        singleTexture(ModItems.CHARGED_SAPPHIRE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_charged"));
        singleTexture(ModItems.CHARGED_TOPAZ.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_charged"));
        singleTexture(ModItems.CHARGED_CRYSTAL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_charged"));
        singleTexture(ModItems.CHARGED_DIAMOND.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/diamond_charged"));
        singleTexture(ModItems.CHARGED_EMERALD.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_charged"));

        singleTexture(ModItems.AMETHYST_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_amulet"));
        singleTexture(ModItems.RUBY_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_amulet"));
        singleTexture(ModItems.SAPPHIRE_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_amulet"));
        singleTexture(ModItems.TOPAZ_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_amulet"));
        singleTexture(ModItems.CRYSTAL_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_amulet"));
        singleTexture(ModItems.DIAMOND_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/diamond_amulet"));
        singleTexture(ModItems.EMERALD_AMULET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_amulet"));

        singleTexture(ModItems.AMETHYST_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_helmet"));
        singleTexture(ModItems.RUBY_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_helmet"));
        singleTexture(ModItems.SAPPHIRE_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_helmet"));
        singleTexture(ModItems.TOPAZ_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_helmet"));
        singleTexture(ModItems.CRYSTAL_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_helmet"));
        singleTexture(ModItems.EMERALD_HELMET.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_helmet"));

        singleTexture(ModItems.AMETHYST_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_chestplate"));
        singleTexture(ModItems.RUBY_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_chestplate"));
        singleTexture(ModItems.SAPPHIRE_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_chestplate"));
        singleTexture(ModItems.TOPAZ_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_chestplate"));
        singleTexture(ModItems.CRYSTAL_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_chestplate"));
        singleTexture(ModItems.EMERALD_CHESTPLATE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_chestplate"));

        singleTexture(ModItems.AMETHYST_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_leggings"));
        singleTexture(ModItems.RUBY_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_leggings"));
        singleTexture(ModItems.SAPPHIRE_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_leggings"));
        singleTexture(ModItems.TOPAZ_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_leggings"));
        singleTexture(ModItems.CRYSTAL_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_leggings"));
        singleTexture(ModItems.EMERALD_LEGGINGS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_leggings"));

        singleTexture(ModItems.AMETHYST_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_boots"));
        singleTexture(ModItems.RUBY_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_boots"));
        singleTexture(ModItems.SAPPHIRE_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_boots"));
        singleTexture(ModItems.TOPAZ_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_boots"));
        singleTexture(ModItems.CRYSTAL_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_boots"));
        singleTexture(ModItems.EMERALD_BOOTS.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_boots"));



        //Tools
        singleTexture(ModItems.AMETHYST_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_sword"));
        singleTexture(ModItems.RUBY_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/ruby_sword"));
        singleTexture(ModItems.SAPPHIRE_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_sword"));
        singleTexture(ModItems.TOPAZ_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/topaz_sword"));
        singleTexture(ModItems.CRYSTAL_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/crystal_sword"));
        singleTexture(ModItems.EMERALD_SWORD.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),"layer0", new ResourceLocation(References.MODID, "item/emerald_sword"));

        singleTexture(ModItems.AMETHYST_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_pickaxe"));
        singleTexture(ModItems.RUBY_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_pickaxe"));
        singleTexture(ModItems.SAPPHIRE_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_pickaxe"));
        singleTexture(ModItems.TOPAZ_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_pickaxe"));
        singleTexture(ModItems.CRYSTAL_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_pickaxe"));
        singleTexture(ModItems.EMERALD_PICKAXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_pickaxe"));

        singleTexture(ModItems.AMETHYST_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_axe"));
        singleTexture(ModItems.RUBY_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_axe"));
        singleTexture(ModItems.SAPPHIRE_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_axe"));
        singleTexture(ModItems.TOPAZ_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_axe"));
        singleTexture(ModItems.CRYSTAL_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_axe"));
        singleTexture(ModItems.EMERALD_AXE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_axe"));

        singleTexture(ModItems.AMETHYST_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_hoe"));
        singleTexture(ModItems.RUBY_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_hoe"));
        singleTexture(ModItems.SAPPHIRE_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_hoe"));
        singleTexture(ModItems.TOPAZ_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_hoe"));
        singleTexture(ModItems.CRYSTAL_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_hoe"));
        singleTexture(ModItems.EMERALD_HOE.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_hoe"));

        singleTexture(ModItems.AMETHYST_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/amethyst_shovel"));
        singleTexture(ModItems.RUBY_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/ruby_shovel"));
        singleTexture(ModItems.SAPPHIRE_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/sapphire_shovel"));
        singleTexture(ModItems.TOPAZ_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/topaz_shovel"));
        singleTexture(ModItems.CRYSTAL_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/crystal_shovel"));
        singleTexture(ModItems.EMERALD_SHOVEL.get().getRegistryName().getPath(), new ResourceLocation("item/generated"),"layer0", new ResourceLocation(References.MODID, "item/emerald_shovel"));



        //BlockItems
        withExistingParent(ModBlocks.RUBY_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/ruby_ore"));
        withExistingParent(ModBlocks.SAPPHIRE_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/sapphire_ore"));
        withExistingParent(ModBlocks.TOPAZ_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/topaz_ore"));
        withExistingParent(ModBlocks.CRYSTAL_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/crystal_ore"));

        withExistingParent(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/deepslate_ruby_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/deepslate_sapphire_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_TOPAZ_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/deepslate_topaz_ore"));
        withExistingParent(ModBlocks.DEEPSLATE_CRYSTAL_ORE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/deepslate_crystal_ore"));

        withExistingParent(ModBlocks.AMETHYST_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/amethyst_block"));
        withExistingParent(ModBlocks.RUBY_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/ruby_block"));
        withExistingParent(ModBlocks.SAPPHIRE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/sapphire_block"));
        withExistingParent(ModBlocks.TOPAZ_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/topaz_block"));
        withExistingParent(ModBlocks.CRYSTAL_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/crystal_block"));

        withExistingParent(ModBlocks.CHARGED_AMETHYST_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_amethyst_block"));
        withExistingParent(ModBlocks.CHARGED_RUBY_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_ruby_block"));
        withExistingParent(ModBlocks.CHARGED_SAPPHIRE_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_sapphire_block"));
        withExistingParent(ModBlocks.CHARGED_TOPAZ_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_topaz_block"));
        withExistingParent(ModBlocks.CHARGED_CRYSTAL_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_crystal_block"));
        withExistingParent(ModBlocks.CHARGED_DIAMOND_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_diamond_block"));
        withExistingParent(ModBlocks.CHARGED_EMERALD_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/charged_emerald_block"));

        withExistingParent(ModBlocks.GEM_CHARGER_BLOCKITEM.get().getRegistryName().getPath(), new ResourceLocation(References.MODID, "block/gem_charger"));
    }

}