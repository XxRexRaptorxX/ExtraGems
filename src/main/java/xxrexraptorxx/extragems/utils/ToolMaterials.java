package xxrexraptorxx.extragems.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.main.References;

public class ToolMaterials {

    public static final TagKey<Block> AMETHYST_TAG = BlockTags.create(new ResourceLocation(References.MODID, "needs_amethyst_tool"));
    public static final TagKey<Block> RUBY_TAG = BlockTags.create(new ResourceLocation(References.MODID, "needs_ruby_tool"));
    public static final TagKey<Block> SAPPHIRE_TAG = BlockTags.create(new ResourceLocation(References.MODID, "needs_sapphire_tool"));
    public static final TagKey<Block> CRYSTAL_TAG = BlockTags.create(new ResourceLocation(References.MODID, "needs_crystal_tool"));
    public static final TagKey<Block> TOPAZ_TAG = BlockTags.create(new ResourceLocation(References.MODID, "needs_topaz_tool"));
    public static final TagKey<Block> EMERALD_TAG = BlockTags.create(new ResourceLocation(References.MODID, "needs_emerald_tool"));



    public static final ForgeTier AMETHYST = new ForgeTier(getMiningLevel(), 500, 7.0f, 2.5f, 30, AMETHYST_TAG, () -> Ingredient.of(ModItems.AMETHYST.get()));
    public static final ForgeTier RUBY = new ForgeTier(getMiningLevel(), 500, 8.0f, 2.0f, 15, RUBY_TAG, () -> Ingredient.of(ModItems.RUBY.get()));
    public static final ForgeTier SAPPHIRE = new ForgeTier(getMiningLevel(), 500, 7.0f, 3.0f, 15, SAPPHIRE_TAG, () -> Ingredient.of(ModItems.SAPPHIRE.get()));
    public static final ForgeTier TOPAZ = new ForgeTier(getMiningLevel(), 450, 7.5f, 3.5f, 12, TOPAZ_TAG, () -> Ingredient.of(ModItems.TOPAZ.get()));
    public static final ForgeTier CRYSTAL = new ForgeTier(getMiningLevel(), 450, 8.0f, 3.0f, 20, CRYSTAL_TAG, () -> Ingredient.of(ModItems.CRYSTAL.get()));
    public static final ForgeTier EMERALD = new ForgeTier(getMiningLevel(), 600, 7.0f, 3.0f, 25, EMERALD_TAG, () -> Ingredient.of(Items.EMERALD));


    private static int getMiningLevel() {
        /**     TODO
        if(Config.MINING_LEVEL.get() == 1) {
            return Tiers.DIAMOND.getLevel();
        } else {
            return Tiers.IRON.getLevel();
        }
         **/

        return Tiers.DIAMOND.getLevel();
    }
}