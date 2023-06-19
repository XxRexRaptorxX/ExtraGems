package xxrexraptorxx.extragems.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.main.References;

public class BlockStateGen extends BlockStateProvider {


    public BlockStateGen(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, References.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(Registration.AMETHYST_ORE.get());
        simpleBlock(ModBlocks.AMETHYST_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_AMETHYST_BLOCK.get());
        simpleBlock(ModBlocks.RUBY_ORE.get());
        simpleBlock(ModBlocks.RUBY_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_RUBY_BLOCK.get());
        simpleBlock(ModBlocks.SAPPHIRE_ORE.get());
        simpleBlock(ModBlocks.SAPPHIRE_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_SAPPHIRE_BLOCK.get());
        simpleBlock(ModBlocks.TOPAZ_ORE.get());
        simpleBlock(ModBlocks.TOPAZ_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_TOPAZ_BLOCK.get());
        simpleBlock(ModBlocks.CRYSTAL_ORE.get());
        simpleBlock(ModBlocks.CRYSTAL_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_CRYSTAL_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_DIAMOND_BLOCK.get());
        simpleBlock(ModBlocks.CHARGED_EMERALD_BLOCK.get());
        simpleBlock(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_CRYSTAL_ORE.get());
    }

}