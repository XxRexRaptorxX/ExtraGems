package xxrexraptorxx.extragems.world;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.extragems.main.ModBlocks;
import xxrexraptorxx.extragems.main.References;

import java.util.List;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, References.MODID);


    public static final Supplier<List<OreConfiguration.TargetBlockState>> RUBY_ORE_GEN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RUBY_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> SAPPHIRE_ORE_GEN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> TOPAZ_ORE_GEN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TOPAZ_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TOPAZ_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> CRYSTAL_ORE_GEN = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CRYSTAL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CRYSTAL_ORE.get().defaultBlockState())));


    public static final RegistryObject<ConfiguredFeature<?, ?>> RUBY_ORES = CONFIGURED_FEATURES.register("ruby_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBY_ORE_GEN.get(),3)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SAPPHIRE_ORES = CONFIGURED_FEATURES.register("sapphire_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SAPPHIRE_ORE_GEN.get(),3)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> TOPAZ_ORES = CONFIGURED_FEATURES.register("topaz_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TOPAZ_ORE_GEN.get(),3)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CRYSTAL_ORES = CONFIGURED_FEATURES.register("crystal_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(CRYSTAL_ORE_GEN.get(),3)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}