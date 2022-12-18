package xxrexraptorxx.extragems.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();


            //generator.addProvider(event.includeServer(), new LootTables(generator));
            //generator.addProvider(event.includeServer(), new TagsBlock(generator, helper));
            //generator.addProvider(event.includeServer(), new TagsItem(generator, new TagsBlock(generator, helper), helper));

            //generator.addProvider(event.includeClient(), new BlockStates(generator, helper));
            //generator.addProvider(event.includeClient(), new Items(generator, helper));
    }
}