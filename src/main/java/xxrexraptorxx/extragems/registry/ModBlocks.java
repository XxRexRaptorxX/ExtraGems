package xxrexraptorxx.extragems.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.extragems.blocks.BlockChargedGem;
import xxrexraptorxx.extragems.blocks.BlockDeepslateGemOre;
import xxrexraptorxx.extragems.blocks.BlockGemOre;
import xxrexraptorxx.extragems.main.References;

import java.util.function.Function;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(References.MODID);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }


    public static final DeferredBlock<Block> AMETHYST_BLOCK = registerBlock("amethyst_block", properties -> new Block(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_PURPLE)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_AMETHYST_BLOCK = registerBlock("charged_amethyst_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .sound(SoundType.STONE)
            .lightLevel(value -> 5)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_PURPLE)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockGemOre> SAPPHIRE_ORE = registerBlock("sapphire_ore", properties -> new BlockGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(3.0F, 5.0F)
            .sound(SoundType.STONE)
            .mapColor(MapColor.STONE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", properties -> new BlockDeepslateGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", properties -> new Block(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_BLUE)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_SAPPHIRE_BLOCK = registerBlock("charged_sapphire_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 5)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_BLUE)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockGemOre> RUBY_ORE = registerBlock("ruby_ore", properties -> new BlockGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(3.0F, 5.0F)
            .sound(SoundType.STONE)
            .mapColor(MapColor.STONE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", properties -> new BlockDeepslateGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block", properties -> new Block(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_RED)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_RUBY_BLOCK = registerBlock("charged_ruby_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 5)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_RED)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockGemOre> TOPAZ_ORE = registerBlock("topaz_ore", properties -> new BlockGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(3.0F, 5.0F)
            .sound(SoundType.STONE)
            .mapColor(MapColor.STONE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", properties -> new BlockDeepslateGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<Block> TOPAZ_BLOCK = registerBlock("topaz_block", properties -> new Block(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_YELLOW)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_TOPAZ_BLOCK = registerBlock("charged_topaz_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 5)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.COLOR_YELLOW)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockGemOre> CRYSTAL_ORE = registerBlock("crystal_ore", properties -> new BlockGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(3.0F, 5.0F)
            .sound(SoundType.STONE)
            .mapColor(MapColor.STONE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<BlockDeepslateGemOre> DEEPSLATE_CRYSTAL_ORE = registerBlock("deepslate_crystal_ore", properties -> new BlockDeepslateGemOre(properties
            .requiresCorrectToolForDrops()
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.DEEPSLATE)
            .instrument(NoteBlockInstrument.BASEDRUM)
    ));

    public static final DeferredBlock<Block> CRYSTAL_BLOCK = registerBlock("crystal_block", properties -> new Block(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_CRYSTAL_BLOCK = registerBlock("charged_crystal_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 5)
            .sound(SoundType.AMETHYST)
            .mapColor(MapColor.QUARTZ)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_DIAMOND_BLOCK = registerBlock("charged_diamond_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 5)
            .sound(SoundType.METAL)
            .mapColor(MapColor.DIAMOND)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<BlockChargedGem> CHARGED_EMERALD_BLOCK = registerBlock("charged_emerald_block", properties -> new BlockChargedGem(properties
            .requiresCorrectToolForDrops()
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 5)
            .sound(SoundType.METAL)
            .mapColor(MapColor.EMERALD)
            .instrument(NoteBlockInstrument.BIT)
    ));

    public static final DeferredBlock<Block> GEM_CHARGER = registerBlock("gem_charger", properties -> new Block(properties
            .strength(4.0F, 8.0F)
            .lightLevel(value -> 8)
            .sound(SoundType.METAL)
            .mapColor(MapColor.COLOR_PURPLE)
            .instrument(NoteBlockInstrument.BIT)
    ));




    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> blockCreator) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, () -> blockCreator.apply(BlockBehaviour.Properties.of().setId(blockId(name))));
        registerBlockItems(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ModItems.itemId(name)).useBlockDescriptionPrefix()));
    }

    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }

}