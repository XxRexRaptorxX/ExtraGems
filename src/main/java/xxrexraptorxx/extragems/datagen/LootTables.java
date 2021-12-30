package xxrexraptorxx.extragems.datagen;

import net.minecraft.data.DataGenerator;
import xxrexraptorxx.extragems.main.ModBlocks;

public class LootTables extends BaseLootTableProvider {

    public LootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        register(ModBlocks.AMETHYST_BLOCK.get());
        register(ModBlocks.RUBY_BLOCK.get());
        register(ModBlocks.SAPPHIRE_BLOCK.get());
        register(ModBlocks.TOPAZ_BLOCK.get());
        register(ModBlocks.CRYSTAL_BLOCK.get());
        register(ModBlocks.CHARGED_AMETHYST_BLOCK.get());
        register(ModBlocks.CHARGED_RUBY_BLOCK.get());
        register(ModBlocks.CHARGED_SAPPHIRE_BLOCK.get());
        register(ModBlocks.CHARGED_TOPAZ_BLOCK.get());
        register(ModBlocks.CHARGED_CRYSTAL_BLOCK.get());
        register(ModBlocks.GEM_CHARGER.get());
    }




}