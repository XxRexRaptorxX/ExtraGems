package xxrexraptorxx.extragems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.main.References;

import java.util.concurrent.CompletableFuture;

public class ItemTagGen extends ItemTagsProvider {

    public ItemTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTags, ExistingFileHelper helper) {
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

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(   ModItems.AMETHYST_HELMET.get(),
                        ModItems.RUBY_HELMET.get(),
                        ModItems.SAPPHIRE_HELMET.get(),
                        ModItems.TOPAZ_HELMET.get(),
                        ModItems.CRYSTAL_HELMET.get(),
                        ModItems.EMERALD_HELMET.get(),
                        ModItems.AMETHYST_CHESTPLATE.get(),
                        ModItems.RUBY_CHESTPLATE.get(),
                        ModItems.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.TOPAZ_CHESTPLATE.get(),
                        ModItems.CRYSTAL_CHESTPLATE.get(),
                        ModItems.EMERALD_CHESTPLATE.get(),
                        ModItems.AMETHYST_LEGGINGS.get(),
                        ModItems.RUBY_LEGGINGS.get(),
                        ModItems.SAPPHIRE_LEGGINGS.get(),
                        ModItems.TOPAZ_LEGGINGS.get(),
                        ModItems.CRYSTAL_LEGGINGS.get(),
                        ModItems.EMERALD_LEGGINGS.get(),
                        ModItems.AMETHYST_BOOTS.get(),
                        ModItems.RUBY_BOOTS.get(),
                        ModItems.SAPPHIRE_BOOTS.get(),
                        ModItems.TOPAZ_BOOTS.get(),
                        ModItems.CRYSTAL_BOOTS.get(),
                        ModItems.EMERALD_BOOTS.get()
                );

        tag(ItemTags.PICKAXES)
                .add(   ModItems.AMETHYST_PICKAXE.get(),
                        ModItems.RUBY_PICKAXE.get(),
                        ModItems.SAPPHIRE_PICKAXE.get(),
                        ModItems.TOPAZ_PICKAXE.get(),
                        ModItems.CRYSTAL_PICKAXE.get(),
                        ModItems.EMERALD_PICKAXE.get()
                );

        tag(ItemTags.SWORDS)
                .add(   ModItems.AMETHYST_SWORD.get(),
                        ModItems.RUBY_SWORD.get(),
                        ModItems.SAPPHIRE_SWORD.get(),
                        ModItems.TOPAZ_SWORD.get(),
                        ModItems.CRYSTAL_SWORD.get(),
                        ModItems.EMERALD_SWORD.get()
                );

        tag(ItemTags.AXES)
                .add(   ModItems.AMETHYST_AXE.get(),
                        ModItems.RUBY_AXE.get(),
                        ModItems.SAPPHIRE_AXE.get(),
                        ModItems.TOPAZ_AXE.get(),
                        ModItems.CRYSTAL_AXE.get(),
                        ModItems.EMERALD_AXE.get()
                );

        tag(ItemTags.SHOVELS)
                .add(   ModItems.AMETHYST_SHOVEL.get(),
                        ModItems.RUBY_SHOVEL.get(),
                        ModItems.SAPPHIRE_SHOVEL.get(),
                        ModItems.TOPAZ_SHOVEL.get(),
                        ModItems.CRYSTAL_SHOVEL.get(),
                        ModItems.EMERALD_SHOVEL.get()
                );

        tag(ItemTags.HOES)
                .add(   ModItems.AMETHYST_HOE.get(),
                        ModItems.RUBY_HOE.get(),
                        ModItems.SAPPHIRE_HOE.get(),
                        ModItems.TOPAZ_HOE.get(),
                        ModItems.CRYSTAL_HOE.get(),
                        ModItems.EMERALD_HOE.get()
                );
    }

}

