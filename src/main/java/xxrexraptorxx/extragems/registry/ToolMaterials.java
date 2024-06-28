package xxrexraptorxx.extragems.registry;

import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import xxrexraptorxx.extragems.utils.ModTags;

public class ToolMaterials {

    public static final SimpleTier AMETHYST = new SimpleTier(ModTags.INCORRECT_FOR_AMETHYST_TAG, 500, 7.0f, 2.5f, 30, () -> Ingredient.of(ModTags.AMETHYST_TAG));
    public static final SimpleTier RUBY = new SimpleTier(ModTags.INCORRECT_FOR_RUBY_TAG, 500, 8.0f, 2.0f, 15, () -> Ingredient.of(ModTags.RUBY_TAG));
    public static final SimpleTier SAPPHIRE = new SimpleTier(ModTags.INCORRECT_FOR_SAPPHIRE_TAG, 500, 7.0f, 3.0f, 15, () -> Ingredient.of(ModTags.SAPPHIRE_TAG));
    public static final SimpleTier TOPAZ = new SimpleTier(ModTags.INCORRECT_FOR_CRYSTAL_TAG, 450, 7.5f, 3.5f, 12, () -> Ingredient.of(ModTags.CRYSTAL_TAG));
    public static final SimpleTier CRYSTAL = new SimpleTier(ModTags.INCORRECT_FOR_TOPAZ_TAG, 450, 8.0f, 3.0f, 20, () -> Ingredient.of(ModTags.TOPAZ_TAG));
    public static final SimpleTier EMERALD = new SimpleTier(ModTags.INCORRECT_FOR_EMERALD_TAG, 600, 7.0f, 3.0f, 25, () -> Ingredient.of(ModTags.EMERALD_TAG));

}