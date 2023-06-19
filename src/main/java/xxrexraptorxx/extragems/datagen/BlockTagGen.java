package xxrexraptorxx.extragems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.main.References;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper helper) {
        super(packOutput, lookupProvider, References.MODID, helper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(   ModBlocks.GEM_CHARGER.get(),
                        ModBlocks.AMETHYST_BLOCK.get(),
                        ModBlocks.CHARGED_AMETHYST_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.CHARGED_RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.CHARGED_SAPPHIRE_BLOCK.get(),
                        ModBlocks.TOPAZ_BLOCK.get(),
                        ModBlocks.CHARGED_TOPAZ_BLOCK.get(),
                        ModBlocks.CRYSTAL_BLOCK.get(),
                        ModBlocks.CHARGED_CRYSTAL_BLOCK.get(),
                        ModBlocks.CHARGED_EMERALD_BLOCK.get(),
                        ModBlocks.CHARGED_DIAMOND_BLOCK.get(),
                        //Registration.AMETHYST_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.TOPAZ_ORE.get(),
                        ModBlocks.CRYSTAL_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_TOPAZ_ORE.get(),
                        ModBlocks.DEEPSLATE_CRYSTAL_ORE.get()
                );


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(   ModBlocks.GEM_CHARGER.get(),
                        ModBlocks.AMETHYST_BLOCK.get(),
                        ModBlocks.CHARGED_AMETHYST_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.CHARGED_RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.CHARGED_SAPPHIRE_BLOCK.get(),
                        ModBlocks.TOPAZ_BLOCK.get(),
                        ModBlocks.CHARGED_TOPAZ_BLOCK.get(),
                        ModBlocks.CRYSTAL_BLOCK.get(),
                        ModBlocks.CHARGED_CRYSTAL_BLOCK.get(),
                        ModBlocks.CHARGED_EMERALD_BLOCK.get(),
                        ModBlocks.CHARGED_DIAMOND_BLOCK.get(),
                        //Registration.AMETHYST_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.TOPAZ_ORE.get(),
                        ModBlocks.CRYSTAL_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_TOPAZ_ORE.get(),
                        ModBlocks.DEEPSLATE_CRYSTAL_ORE.get()
                        );


        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(   ModBlocks.AMETHYST_BLOCK.get(),
                        ModBlocks.CHARGED_AMETHYST_BLOCK.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.CHARGED_RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.CHARGED_SAPPHIRE_BLOCK.get(),
                        ModBlocks.TOPAZ_BLOCK.get(),
                        ModBlocks.CHARGED_TOPAZ_BLOCK.get(),
                        ModBlocks.CRYSTAL_BLOCK.get(),
                        ModBlocks.CHARGED_CRYSTAL_BLOCK.get(),
                        ModBlocks.CHARGED_EMERALD_BLOCK.get(),
                        ModBlocks.CHARGED_DIAMOND_BLOCK.get()
                );

    }
}

