package xxrexraptorxx.extragems.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.extragems.blocks.*;
import xxrexraptorxx.extragems.main.References;

public class ModBlocks {

    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(References.MODID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }


    //BLOCKS
    //public static final DeferredBlock<BlockGemOre> AMETHYST_ORE = BLOCKS.register("amethyst_ore", BlockGemOre::new);
    //public static final DeferredItem<Item> AMETHYST_ORE_BLOCKITEM = ITEMS.register("amethyst_ore", () -> new BlockItem(AMETHYST_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockAmethyst> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", BlockAmethyst::new);
    public static final DeferredItem<Item> AMETHYST_BLOCKITEM = ITEMS.register("amethyst_block", () -> new BlockItem(AMETHYST_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockAmethystCharged> CHARGED_AMETHYST_BLOCK = BLOCKS.register("charged_amethyst_block", BlockAmethystCharged::new);
    public static final DeferredItem<Item> CHARGED_AMETHYST_BLOCKITEM = ITEMS.register("charged_amethyst_block", () -> new BlockItem(CHARGED_AMETHYST_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockGemOre> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", BlockGemOre::new);
    public static final DeferredItem<Item> SAPPHIRE_ORE_BLOCKITEM = ITEMS.register("sapphire_ore", () -> new BlockItem(SAPPHIRE_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_SAPPHIRE_ORE = BLOCKS.register("deepslate_sapphire_ore", BlockDeepslateGemOre::new);
    public static final DeferredItem<Item> DEEPSLATE_SAPPHIRE_ORE_BLOCKITEM = ITEMS.register("deepslate_sapphire_ore", () -> new BlockItem(DEEPSLATE_SAPPHIRE_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockSapphire> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", BlockSapphire::new);
    public static final DeferredItem<Item> SAPPHIRE_BLOCKITEM = ITEMS.register("sapphire_block", () -> new BlockItem(SAPPHIRE_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockSapphireCharged> CHARGED_SAPPHIRE_BLOCK = BLOCKS.register("charged_sapphire_block", BlockSapphireCharged::new);
    public static final DeferredItem<Item> CHARGED_SAPPHIRE_BLOCKITEM = ITEMS.register("charged_sapphire_block", () -> new BlockItem(CHARGED_SAPPHIRE_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockGemOre> RUBY_ORE = BLOCKS.register("ruby_ore", BlockGemOre::new);
    public static final DeferredItem<Item> RUBY_ORE_BLOCKITEM = ITEMS.register("ruby_ore", () -> new BlockItem(RUBY_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_RUBY_ORE = BLOCKS.register("deepslate_ruby_ore", BlockDeepslateGemOre::new);
    public static final DeferredItem<Item> DEEPSLATE_RUBY_ORE_BLOCKITEM = ITEMS.register("deepslate_ruby_ore", () -> new BlockItem(DEEPSLATE_RUBY_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockRuby> RUBY_BLOCK = BLOCKS.register("ruby_block", BlockRuby::new);
    public static final DeferredItem<Item> RUBY_BLOCKITEM = ITEMS.register("ruby_block", () -> new BlockItem(RUBY_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockRubyCharged> CHARGED_RUBY_BLOCK = BLOCKS.register("charged_ruby_block", BlockRubyCharged::new);
    public static final DeferredItem<Item> CHARGED_RUBY_BLOCKITEM = ITEMS.register("charged_ruby_block", () -> new BlockItem(CHARGED_RUBY_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockGemOre> TOPAZ_ORE = BLOCKS.register("topaz_ore", BlockGemOre::new);
    public static final DeferredItem<Item> TOPAZ_ORE_BLOCKITEM = ITEMS.register("topaz_ore", () -> new BlockItem(TOPAZ_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_TOPAZ_ORE = BLOCKS.register("deepslate_topaz_ore", BlockDeepslateGemOre::new);
    public static final DeferredItem<Item> DEEPSLATE_TOPAZ_ORE_BLOCKITEM = ITEMS.register("deepslate_topaz_ore", () -> new BlockItem(DEEPSLATE_TOPAZ_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockTopaz> TOPAZ_BLOCK = BLOCKS.register("topaz_block", BlockTopaz::new);
    public static final DeferredItem<Item> TOPAZ_BLOCKITEM = ITEMS.register("topaz_block", () -> new BlockItem(TOPAZ_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockTopazCharged> CHARGED_TOPAZ_BLOCK = BLOCKS.register("charged_topaz_block", BlockTopazCharged::new);
    public static final DeferredItem<Item> CHARGED_TOPAZ_BLOCKITEM = ITEMS.register("charged_topaz_block", () -> new BlockItem(CHARGED_TOPAZ_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockGemOre> CRYSTAL_ORE = BLOCKS.register("crystal_ore", BlockGemOre::new);
    public static final DeferredItem<Item> CRYSTAL_ORE_BLOCKITEM = ITEMS.register("crystal_ore", () -> new BlockItem(CRYSTAL_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_CRYSTAL_ORE = BLOCKS.register("deepslate_crystal_ore", BlockDeepslateGemOre::new);
    public static final DeferredItem<Item> DEEPSLATE_CRYSTAL_ORE_BLOCKITEM = ITEMS.register("deepslate_crystal_ore", () -> new BlockItem(DEEPSLATE_CRYSTAL_ORE.get(), new Item.Properties()));

    public static final DeferredBlock<BlockCrystal> CRYSTAL_BLOCK = BLOCKS.register("crystal_block", BlockCrystal::new);
    public static final DeferredItem<Item> CRYSTAL_BLOCKITEM = ITEMS.register("crystal_block", () -> new BlockItem(CRYSTAL_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockCrystalCharged> CHARGED_CRYSTAL_BLOCK = BLOCKS.register("charged_crystal_block", BlockCrystalCharged::new);
    public static final DeferredItem<Item> CHARGED_CRYSTAL_BLOCKITEM = ITEMS.register("charged_crystal_block", () -> new BlockItem(CHARGED_CRYSTAL_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockDiamondCharged> CHARGED_DIAMOND_BLOCK = BLOCKS.register("charged_diamond_block", BlockDiamondCharged::new);
    public static final DeferredItem<Item> CHARGED_DIAMOND_BLOCKITEM = ITEMS.register("charged_diamond_block", () -> new BlockItem(CHARGED_DIAMOND_BLOCK.get(), new Item.Properties()));

    public static final DeferredBlock<BlockEmeraldCharged> CHARGED_EMERALD_BLOCK = BLOCKS.register("charged_emerald_block", BlockEmeraldCharged::new);
    public static final DeferredItem<Item> CHARGED_EMERALD_BLOCKITEM = ITEMS.register("charged_emerald_block", () -> new BlockItem(CHARGED_EMERALD_BLOCK.get(), new Item.Properties()));


    public static final DeferredBlock<BlockGemCharger> GEM_CHARGER = BLOCKS.register("gem_charger", BlockGemCharger::new);
    public static final DeferredItem<Item> GEM_CHARGER_BLOCKITEM = ITEMS.register("gem_charger", () -> new BlockItem(GEM_CHARGER.get(), new Item.Properties()));


}