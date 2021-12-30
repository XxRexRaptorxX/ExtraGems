package xxrexraptorxx.extragems.world;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.extragems.main.ModBlocks;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.utils.Config;

import java.util.List;

@Mod.EventBusSubscriber(modid = References.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OreGenerator {

    @SubscribeEvent
    public static void oreGeneration (final BiomeLoadingEvent event){
        //The End
        if (event.getCategory() == Biome.BiomeCategory.THEEND){}
        //Nether
        else if (event.getCategory() == Biome.BiomeCategory.NETHER){}
        //Overworld
        else{
            genOre(event.getGeneration(), OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState(), 3,0, 30, Config.ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState(), 3,0, 30, Config.ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState(), 3,0, 30, Config.ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRYSTAL_ORE.get().defaultBlockState(), 3,0, 30, Config.ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState(), 3,-50, 0, Config.DEEPSLATE_ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState(), 3,-50, 0, Config.DEEPSLATE_ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState(), 3,-50, 0, Config.DEEPSLATE_ORE_RARITY.get());
            genOre(event.getGeneration(), OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CRYSTAL_ORE.get().defaultBlockState(), 3,-50, 0, Config.DEEPSLATE_ORE_RARITY.get());
        }

    }

    private static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillertype
            , BlockState state, int veinSize, int minHeight, int maxHeight, int maxperchunk){
        settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreConfiguration(fillertype, state, veinSize))
                        .placed(List.of((CountPlacement.of(UniformInt.of(0,maxperchunk)))
                                , InSquarePlacement.spread()
                                , HeightRangePlacement.uniform(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)), BiomeFilter.biome())));
    }
 }
