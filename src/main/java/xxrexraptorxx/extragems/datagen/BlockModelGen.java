package xxrexraptorxx.extragems.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.model.ModelInstance;
import net.minecraft.resources.ResourceLocation;
import xxrexraptorxx.extragems.registry.ModBlocks;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BlockModelGen extends BlockModelGenerators {

    public BlockModelGen(Consumer<BlockModelDefinitionGenerator> blockstateOutput, ItemModelOutput itemModelOutput, BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(blockstateOutput, itemModelOutput, modelOutput);
    }


    @Override
    public void run() {
        // createTrivialCube(Registration.AMETHYST_ORE.get());
        createTrivialCube(ModBlocks.AMETHYST_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_AMETHYST_BLOCK.get());
        createTrivialCube(ModBlocks.RUBY_ORE.get());
        createTrivialCube(ModBlocks.RUBY_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_RUBY_BLOCK.get());
        createTrivialCube(ModBlocks.SAPPHIRE_ORE.get());
        createTrivialCube(ModBlocks.SAPPHIRE_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_SAPPHIRE_BLOCK.get());
        createTrivialCube(ModBlocks.TOPAZ_ORE.get());
        createTrivialCube(ModBlocks.TOPAZ_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_TOPAZ_BLOCK.get());
        createTrivialCube(ModBlocks.CRYSTAL_ORE.get());
        createTrivialCube(ModBlocks.CRYSTAL_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_CRYSTAL_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_DIAMOND_BLOCK.get());
        createTrivialCube(ModBlocks.CHARGED_EMERALD_BLOCK.get());
        createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        createTrivialCube(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        createTrivialCube(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
        createTrivialCube(ModBlocks.DEEPSLATE_CRYSTAL_ORE.get());
    }

}
