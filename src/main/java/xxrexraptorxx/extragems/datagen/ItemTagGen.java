package xxrexraptorxx.extragems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.extragems.main.ModItems;
import xxrexraptorxx.extragems.main.References;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, blockTags, References.MODID, helper);
    }


    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(   ModItems.AMETHYST.get(),
                        ModItems.RUBY.get(),
                        ModItems.SAPPHIRE.get(),
                        ModItems.TOPAZ.get(),
                        ModItems.CRYSTAL.get(),
                        ModItems.CHARGED_AMETHYST.get(),
                        ModItems.CHARGED_RUBY.get(),
                        ModItems.CHARGED_SAPPHIRE.get(),
                        ModItems.CHARGED_TOPAZ.get(),
                        ModItems.CHARGED_CRYSTAL.get(),
                        ModItems.CHARGED_DIAMOND.get(),
                        ModItems.CHARGED_EMERALD.get()
                        );
    }

}

