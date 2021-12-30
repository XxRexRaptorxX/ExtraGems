package xxrexraptorxx.extragems.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import xxrexraptorxx.extragems.main.ModItems;
import xxrexraptorxx.extragems.main.References;

import java.util.List;

public class ToolMaterials {

    public static final Tag.Named<Block> AMETHYST_TAG = BlockTags.createOptional(new ResourceLocation(References.MODID, "needs_amethyst_tool"));
    public static final Tag.Named<Block> RUBY_TAG = BlockTags.createOptional(new ResourceLocation(References.MODID, "needs_ruby_tool"));
    public static final Tag.Named<Block> SAPPHIRE_TAG = BlockTags.createOptional(new ResourceLocation(References.MODID, "needs_sapphire_tool"));
    public static final Tag.Named<Block> CRYSTAL_TAG = BlockTags.createOptional(new ResourceLocation(References.MODID, "needs_crystal_tool"));
    public static final Tag.Named<Block> TOPAZ_TAG = BlockTags.createOptional(new ResourceLocation(References.MODID, "needs_topaz_tool"));
    public static final Tag.Named<Block> EMERALD_TAG = BlockTags.createOptional(new ResourceLocation(References.MODID, "needs_emerald_tool"));



    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 500, 7.0f, 2.5f, 30, AMETHYST_TAG, () -> Ingredient.of(ModItems.AMETHYST.get())),
            new ResourceLocation(References.MODID, "amethyst"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 500, 8.0f, 2.0f, 15, RUBY_TAG, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(References.MODID, "ruby"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 500, 7.0f, 3.0f, 15, SAPPHIRE_TAG, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(References.MODID, "sapphire"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier TOPAZ = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 450, 7.5f, 3.5f, 12, TOPAZ_TAG, () -> Ingredient.of(ModItems.TOPAZ.get())),
            new ResourceLocation(References.MODID, "topaz"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier CRYSTAL = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 450, 8.0f, 3.0f, 20, CRYSTAL_TAG, () -> Ingredient.of(ModItems.CRYSTAL.get())),
            new ResourceLocation(References.MODID, "crystal"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(Tiers.DIAMOND.getLevel(), 600, 7.0f, 3.0f, 25, EMERALD_TAG, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(References.MODID, "emerald"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}