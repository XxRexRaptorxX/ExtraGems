package xxrexraptorxx.extragems.utils;

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

    public static final TagKey<Item> AMETHYST_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/amethyst"));
    public static final TagKey<Item> RUBY_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/ruby"));
    public static final TagKey<Item> SAPPHIRE_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/sapphire"));
    public static final TagKey<Item> CRYSTAL_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/crystal"));
    public static final TagKey<Item> TOPAZ_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/topaz"));
    public static final TagKey<Item> EMERALD_TAG = ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/emerald"));

    public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_amethyst_tool"));
    public static final TagKey<Block> INCORRECT_FOR_RUBY_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_ruby_tool"));
    public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_sapphire_tool"));
    public static final TagKey<Block> INCORRECT_FOR_CRYSTAL_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_crystal_tool"));
    public static final TagKey<Block> INCORRECT_FOR_TOPAZ_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_topaz_tool"));
    public static final TagKey<Block> INCORRECT_FOR_EMERALD_TAG = BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "incorrect_for_emerald_tool"));



}
