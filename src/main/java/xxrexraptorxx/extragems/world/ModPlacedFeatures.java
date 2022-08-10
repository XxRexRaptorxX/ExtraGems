package xxrexraptorxx.extragems.world;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.utils.Config;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, References.MODID);


    public static final RegistryObject<PlacedFeature> RUBY_ORE_PLACED = PLACED_FEATURES.register("ruby_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RUBY_ORES.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)))));

    public static final RegistryObject<PlacedFeature> SAPPHIRE_ORE_PLACED = PLACED_FEATURES.register("sapphire_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.SAPPHIRE_ORES.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)))));

    public static final RegistryObject<PlacedFeature> TOPAZ_ORE_PLACED = PLACED_FEATURES.register("topaz_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.TOPAZ_ORES.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)))));

    public static final RegistryObject<PlacedFeature> CRYSTAL_ORE_PLACED = PLACED_FEATURES.register("crystal_ore_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.CRYSTAL_ORES.getHolder().get(),
                    commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(30)))));



    public static List<PlacementModifier> orePlacement(PlacementModifier type, PlacementModifier codec) {
        return List.of(type, InSquarePlacement.spread(), codec, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier placement) {
        return orePlacement(CountPlacement.of(count), placement);
    }

    public static List<PlacementModifier> rareOrePlacement(int count, PlacementModifier placement) {
        return orePlacement(RarityFilter.onAverageOnceEvery(count), placement);
    }


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}