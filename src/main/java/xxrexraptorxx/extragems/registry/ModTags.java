package xxrexraptorxx.extragems.registry;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.magmacore.content.TagHelper;

public class ModTags {

    public static final TagKey<Block> NEEDS_AMETHYST_TAG = TagHelper.createBlockTag(References.MODID, "needs_amethyst_tool");
    public static final TagKey<Block> NEEDS_RUBY_TAG = TagHelper.createBlockTag(References.MODID, "needs_ruby_tool");
    public static final TagKey<Block> NEEDS_SAPPHIRE_TAG = TagHelper.createBlockTag(References.MODID, "needs_sapphire_tool");
    public static final TagKey<Block> NEEDS_CRYSTAL_TAG = TagHelper.createBlockTag(References.MODID, "needs_crystal_tool");
    public static final TagKey<Block> NEEDS_TOPAZ_TAG = TagHelper.createBlockTag(References.MODID, "needs_topaz_tool");
    public static final TagKey<Block> NEEDS_EMERALD_TAG = TagHelper.createBlockTag(References.MODID, "needs_emerald_tool");

    public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TAG = TagHelper.createCBlockTag("incorrect_for_amethyst_tool");
    public static final TagKey<Block> INCORRECT_FOR_RUBY_TAG = TagHelper.createCBlockTag("incorrect_for_ruby_tool");
    public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TAG = TagHelper.createCBlockTag("incorrect_for_sapphire_tool");
    public static final TagKey<Block> INCORRECT_FOR_CRYSTAL_TAG = TagHelper.createCBlockTag("incorrect_for_crystal_tool");
    public static final TagKey<Block> INCORRECT_FOR_TOPAZ_TAG = TagHelper.createCBlockTag("incorrect_for_topaz_tool");
    public static final TagKey<Block> INCORRECT_FOR_EMERALD_TAG = TagHelper.createCBlockTag("incorrect_for_emerald_tool");


    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS_TAG = TagHelper.createCItemTag("amethyst_tool_materials");
    public static final TagKey<Item> RUBY_TOOL_MATERIALS_TAG = TagHelper.createCItemTag("ruby_tool_materials");
    public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS_TAG = TagHelper.createCItemTag("sapphire_tool_materials");
    public static final TagKey<Item> CRYSTAL_TOOL_MATERIALS_TAG = TagHelper.createCItemTag("crystal_tool_materials");
    public static final TagKey<Item> TOPAZ_TOOL_MATERIALS_TAG = TagHelper.createCItemTag("topaz_tool_materials");
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS_TAG = TagHelper.createCItemTag("emerald_tool_materials");

    public static final TagKey<Item> REPAIRS_AMETHYST_ARMOR_TAG = TagHelper.createCItemTag("repairs_amethyst_armor");
    public static final TagKey<Item> REPAIRS_RUBY_ARMOR_TAG = TagHelper.createCItemTag("repairs_ruby_armor");
    public static final TagKey<Item> REPAIRS_SAPPHIRE_ARMOR_TAG = TagHelper.createCItemTag("repairs_sapphire_armor");
    public static final TagKey<Item> REPAIRS_CRYSTAL_ARMOR_TAG = TagHelper.createCItemTag("repairs_crystal_armor");
    public static final TagKey<Item> REPAIRS_TOPAZ_ARMOR_TAG = TagHelper.createCItemTag("repairs_topaz_armor");
    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR_TAG = TagHelper.createCItemTag("repairs_emerald_armor");
}
