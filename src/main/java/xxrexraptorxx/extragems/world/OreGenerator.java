package xxrexraptorxx.extragems.world;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import xxrexraptorxx.extragems.main.ModBlocks;
import xxrexraptorxx.extragems.utils.Config;

public class OreGenerator {

    public static Holder<PlacedFeature> RUBY_GEN;
    public static Holder<PlacedFeature> SAPPHIRE_GEN;
    public static Holder<PlacedFeature> TOPAZ_GEN;
    public static Holder<PlacedFeature> CRYSTAL_GEN;
    public static Holder<PlacedFeature> DEEPSLATE_RUBY_GEN;
    public static Holder<PlacedFeature> DEEPSLATE_SAPPHIRE_GEN;
    public static Holder<PlacedFeature> DEEPSLATE_TOPAZ_GEN;
    public static Holder<PlacedFeature> DEEPSLATE_CRYSTAL_GEN;


            public static void registerConfiguredFeatures() {
                OreConfiguration rubyConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState(), 3);
                RUBY_GEN = registerPlacedFeature("ruby", new ConfiguredFeature<>(Feature.ORE, rubyConfig),
                        CountPlacement.of(Config.ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)));

                OreConfiguration sapphireConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState(), 3);
                SAPPHIRE_GEN = registerPlacedFeature("sapphire", new ConfiguredFeature<>(Feature.ORE, sapphireConfig),
                        CountPlacement.of(Config.ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)));

                OreConfiguration topazConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState(), 3);
                TOPAZ_GEN = registerPlacedFeature("topaz", new ConfiguredFeature<>(Feature.ORE, topazConfig),
                        CountPlacement.of(Config.ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)));

                OreConfiguration crystalConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRYSTAL_ORE.get().defaultBlockState(), 3);
                CRYSTAL_GEN = registerPlacedFeature("crystal", new ConfiguredFeature<>(Feature.ORE, crystalConfig),
                        CountPlacement.of(Config.ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)));


                OreConfiguration deepslateRubyConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState(), 3);
                DEEPSLATE_RUBY_GEN = registerPlacedFeature("deepslate_ruby", new ConfiguredFeature<>(Feature.ORE, deepslateRubyConfig),
                        CountPlacement.of(Config.DEEPSLATE_ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(0)));

                OreConfiguration deepslateSapphireConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState(), 3);
                DEEPSLATE_SAPPHIRE_GEN = registerPlacedFeature("deepslate_sapphire", new ConfiguredFeature<>(Feature.ORE, deepslateSapphireConfig),
                        CountPlacement.of(Config.DEEPSLATE_ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(0)));

                OreConfiguration deepslateTopazConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState(), 3);
                DEEPSLATE_TOPAZ_GEN = registerPlacedFeature("deepslate_topaz", new ConfiguredFeature<>(Feature.ORE, deepslateTopazConfig),
                        CountPlacement.of(Config.DEEPSLATE_ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(0)));

                OreConfiguration deepslateCrystalConfig = new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CRYSTAL_ORE.get().defaultBlockState(), 3);
                DEEPSLATE_CRYSTAL_GEN = registerPlacedFeature("deepslate_crystal", new ConfiguredFeature<>(Feature.ORE, deepslateCrystalConfig),
                        CountPlacement.of(Config.DEEPSLATE_ORE_RARITY.get()),
                        InSquarePlacement.spread(),
                        BiomeFilter.biome(),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-50), VerticalAnchor.absolute(0)));
            }


    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }


    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() != Biome.BiomeCategory.THEEND && event.getCategory() != Biome.BiomeCategory.NETHER) {
            if (Config.RUBY_ORE_GENERATION.get()) {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, RUBY_GEN);
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_RUBY_GEN);
            }
            if (Config.SAPPHIRE_ORE_GENERATION.get()) {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SAPPHIRE_GEN);
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_SAPPHIRE_GEN);
            }
            if (Config.TOPAZ_ORE_GENERATION.get()) {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TOPAZ_GEN);
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_TOPAZ_GEN);
            }
            if (Config.CRYSTAL_ORE_GENERATION.get()) {
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, CRYSTAL_GEN);
                event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, DEEPSLATE_CRYSTAL_GEN);
            }
        }
    }

}
