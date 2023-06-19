package xxrexraptorxx.extragems.main;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.extragems.registry.CreativeModeTabs;
import xxrexraptorxx.extragems.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/extra-gems
 **/
@Mod(References.MODID)
public class ExtraGems {

    public static final Logger LOGGER = LogManager.getLogger();
    private static final ResourceLocation CREATIVE_TAB = new ResourceLocation(References.MODID, "tab");


    public ExtraGems() {
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.init();
        ModItems.init();
        Config.init();
        CreativeModeTabs.init();
    }

}