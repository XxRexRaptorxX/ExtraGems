package xxrexraptorxx.extragems.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.registry.ModItems;

import java.util.ArrayList;

@JeiPlugin
public class JEIIntegration implements IModPlugin {

    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(References.MODID, "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }


    @Override
    public void registerRecipes(IRecipeRegistration registry) {
        ArrayList<ItemStack> gems = new ArrayList<ItemStack>();
        gems.add(new ItemStack(ModItems.CHARGED_AMETHYST.get()));
        gems.add(new ItemStack(ModItems.CHARGED_RUBY.get()));
        gems.add(new ItemStack(ModItems.CHARGED_SAPPHIRE.get()));
        gems.add(new ItemStack(ModItems.CHARGED_TOPAZ.get()));
        gems.add(new ItemStack(ModItems.CHARGED_CRYSTAL.get()));
        gems.add(new ItemStack(ModItems.CHARGED_DIAMOND.get()));
        gems.add(new ItemStack(ModItems.CHARGED_EMERALD.get()));

        IIngredientManager ingredientManager = registry.getIngredientManager();

        registry.addIngredientInfo(gems, VanillaTypes.ITEM_STACK, Component.translatable("message." + References.MODID + ".charged_gem_jei_desc"));
    }
}
