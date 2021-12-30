package xxrexraptorxx.extragems.main;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.extragems.blocks.*;
import xxrexraptorxx.extragems.utils.CreativeTab;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }


    //BLOCKS
    //public static final RegistryObject<BlockGemOre> AMETHYST_ORE = BLOCKS.register("amethyst_ore", BlockGemOre::new);
    //public static final RegistryObject<Item> AMETHYST_ORE_BLOCKITEM = ITEMS.register("amethyst_ore", () -> new BlockItem(AMETHYST_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockAmethyst> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", BlockAmethyst::new);
    public static final RegistryObject<Item> AMETHYST_BLOCKITEM = ITEMS.register("amethyst_block", () -> new BlockItem(AMETHYST_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockAmethystCharged> CHARGED_AMETHYST_BLOCK = BLOCKS.register("charged_amethyst_block", BlockAmethystCharged::new);
    public static final RegistryObject<Item> CHARGED_AMETHYST_BLOCKITEM = ITEMS.register("charged_amethyst_block", () -> new BlockItem(CHARGED_AMETHYST_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockGemOre> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", BlockGemOre::new);
    public static final RegistryObject<Item> SAPPHIRE_ORE_BLOCKITEM = ITEMS.register("sapphire_ore", () -> new BlockItem(SAPPHIRE_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockDeepslateGemOre> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore", BlockDeepslateGemOre::new);
    public static final RegistryObject<Item> DEEPSLATE_SAPPHIRE_ORE_BLOCKITEM = ITEMS.register("deepslate_sapphire_ore", () -> new BlockItem(DEEPSLATE_SAPPHIRE_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockSapphire> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", BlockSapphire::new);
    public static final RegistryObject<Item> SAPPHIRE_BLOCKITEM = ITEMS.register("sapphire_block", () -> new BlockItem(SAPPHIRE_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockSapphireCharged> CHARGED_SAPPHIRE_BLOCK = BLOCKS.register("charged_sapphire_block", BlockSapphireCharged::new);
    public static final RegistryObject<Item> CHARGED_SAPPHIRE_BLOCKITEM = ITEMS.register("charged_sapphire_block", () -> new BlockItem(CHARGED_SAPPHIRE_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockGemOre> RUBY_ORE = BLOCKS.register("ruby_ore", BlockGemOre::new);
    public static final RegistryObject<Item> RUBY_ORE_BLOCKITEM = ITEMS.register("ruby_ore", () -> new BlockItem(RUBY_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockDeepslateGemOre> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore", BlockDeepslateGemOre::new);
    public static final RegistryObject<Item> DEEPSLATE_RUBY_ORE_BLOCKITEM = ITEMS.register("deepslate_ruby_ore", () -> new BlockItem(DEEPSLATE_RUBY_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockRuby> RUBY_BLOCK = BLOCKS.register("ruby_block", BlockRuby::new);
    public static final RegistryObject<Item> RUBY_BLOCKITEM = ITEMS.register("ruby_block", () -> new BlockItem(RUBY_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockRubyCharged> CHARGED_RUBY_BLOCK = BLOCKS.register("charged_ruby_block", BlockRubyCharged::new);
    public static final RegistryObject<Item> CHARGED_RUBY_BLOCKITEM = ITEMS.register("charged_ruby_block", () -> new BlockItem(CHARGED_RUBY_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockGemOre> TOPAZ_ORE = BLOCKS.register("topaz_ore", BlockGemOre::new);
    public static final RegistryObject<Item> TOPAZ_ORE_BLOCKITEM = ITEMS.register("topaz_ore", () -> new BlockItem(TOPAZ_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockDeepslateGemOre> DEEPSLATE_TOPAZ_ORE = BLOCKS.register("deepslate_topaz_ore", BlockDeepslateGemOre::new);
    public static final RegistryObject<Item> DEEPSLATE_TOPAZ_ORE_BLOCKITEM = ITEMS.register("deepslate_topaz_ore", () -> new BlockItem(DEEPSLATE_TOPAZ_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockTopaz> TOPAZ_BLOCK = BLOCKS.register("topaz_block", BlockTopaz::new);
    public static final RegistryObject<Item> TOPAZ_BLOCKITEM = ITEMS.register("topaz_block", () -> new BlockItem(TOPAZ_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockTopazCharged> CHARGED_TOPAZ_BLOCK = BLOCKS.register("charged_topaz_block", BlockTopazCharged::new);
    public static final RegistryObject<Item> CHARGED_TOPAZ_BLOCKITEM = ITEMS.register("charged_topaz_block", () -> new BlockItem(CHARGED_TOPAZ_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockGemOre> CRYSTAL_ORE = BLOCKS.register("crystal_ore", BlockGemOre::new);
    public static final RegistryObject<Item> CRYSTAL_ORE_BLOCKITEM = ITEMS.register("crystal_ore", () -> new BlockItem(CRYSTAL_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockDeepslateGemOre> DEEPSLATE_CRYSTAL_ORE = BLOCKS.register("deepslate_crystal_ore", BlockDeepslateGemOre::new);
    public static final RegistryObject<Item> DEEPSLATE_CRYSTAL_ORE_BLOCKITEM = ITEMS.register("deepslate_crystal_ore", () -> new BlockItem(DEEPSLATE_CRYSTAL_ORE.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockCrystal> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", BlockCrystal::new);
    public static final RegistryObject<Item> CRYSTAL_BLOCKITEM = ITEMS.register("crystal_block", () -> new BlockItem(CRYSTAL_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockCrystalCharged> CHARGED_CRYSTAL_BLOCK = BLOCKS.register("charged_crystal_block", BlockCrystalCharged::new);
    public static final RegistryObject<Item> CHARGED_CRYSTAL_BLOCKITEM = ITEMS.register("charged_crystal_block", () -> new BlockItem(CHARGED_CRYSTAL_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockDiamondCharged> CHARGED_DIAMOND_BLOCK = BLOCKS.register("charged_diamond_block", BlockDiamondCharged::new);
    public static final RegistryObject<Item> CHARGED_DIAMOND_BLOCKITEM = ITEMS.register("charged_diamond_block", () -> new BlockItem(CHARGED_DIAMOND_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<BlockEmeraldCharged> CHARGED_EMERALD_BLOCK = BLOCKS.register("charged_emerald_block", BlockEmeraldCharged::new);
    public static final RegistryObject<Item> CHARGED_EMERALD_BLOCKITEM = ITEMS.register("charged_emerald_block", () -> new BlockItem(CHARGED_EMERALD_BLOCK.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));


    public static final RegistryObject<BlockGemCharger> GEM_CHARGER = BLOCKS.register("gem_charger", BlockGemCharger::new);
    public static final RegistryObject<Item> GEM_CHARGER_BLOCKITEM = ITEMS.register("gem_charger", () -> new BlockItem(GEM_CHARGER.get(), new Item.Properties().tab(CreativeTab.GEM_TAB)));


}