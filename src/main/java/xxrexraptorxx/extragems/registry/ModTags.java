package xxrexraptorxx.extragems.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.extragems.main.References;

public class ModTags {


    public static final TagKey<Block> NEEDS_AMETHYST_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath(References.MODID, "needs_amethyst_tool"));
    public static final TagKey<Block> NEEDS_RUBY_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath(References.MODID, "needs_ruby_tool"));
    public static final TagKey<Block> NEEDS_SAPPHIRE_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath(References.MODID, "needs_sapphire_tool"));
    public static final TagKey<Block> NEEDS_CRYSTAL_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath(References.MODID, "needs_crystal_tool"));
    public static final TagKey<Block> NEEDS_TOPAZ_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath(References.MODID, "needs_topaz_tool"));
    public static final TagKey<Block> NEEDS_EMERALD_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath(References.MODID, "needs_emerald_tool"));

    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "amethyst_tool_materials"));
    public static final TagKey<Item> RUBY_TOOL_MATERIALS_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ruby_tool_materials"));
    public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sapphire_tool_materials"));
    public static final TagKey<Item> CRYSTAL_TOOL_MATERIALS_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystal_tool_materials"));
    public static final TagKey<Item> TOPAZ_TOOL_MATERIALS_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "topaz_tool_materials"));
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "emerald_tool_materials"));

    public static final TagKey<Item> REPAIRS_AMETHYST_ARMOR_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "repairs_amethyst_armor"));
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "repairs_ruby_armor"));
    public static final TagKey<Item> REPAIRS_SAPPHIRE_ARMOR_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "repairs_sapphire_armor"));
    public static final TagKey<Item> REPAIRS_CRYSTAL_ARMOR_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "repairs_crystal_armor"));
    public static final TagKey<Item> REPAIRS_TOPAZ_ARMOR_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "repairs_topaz_armor"));
    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "repairs_emerald_armor"));

    public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_amethyst_tool"));
    public static final TagKey<Block> INCORRECT_FOR_RUBY_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_ruby_tool"));
    public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_sapphire_tool"));
    public static final TagKey<Block> INCORRECT_FOR_CRYSTAL_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_crystal_tool"));
    public static final TagKey<Block> INCORRECT_FOR_TOPAZ_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_topaz_tool"));
    public static final TagKey<Block> INCORRECT_FOR_EMERALD_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_emerald_tool"));



}
