package xxrexraptorxx.extragems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import xxrexraptorxx.extragems.main.References;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = References.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper helper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        BlockTagGen blockTags = new BlockTagGen(packOutput, lookupProvider, event.getExistingFileHelper());

        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ItemTagGen(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeClient(), new BlockStateGen(packOutput, helper));
        generator.addProvider(event.includeClient(), new ItemModelGen(packOutput, helper));
    }
}