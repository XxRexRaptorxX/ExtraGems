package xxrexraptorxx.extragems.main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.extragems.registry.CreativeModeTabs;
import xxrexraptorxx.extragems.registry.ModArmorMaterials;
import xxrexraptorxx.extragems.registry.ModBlocks;
import xxrexraptorxx.extragems.registry.ModItems;
import xxrexraptorxx.extragems.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/extra-gems
 **/
@Mod(References.MODID)
public class ExtraGems {

    public static final Logger LOGGER = LogManager.getLogger();


    public ExtraGems(IEventBus bus, ModContainer container) {

        ModBlocks.init(bus);
        ModItems.init(bus);
        ModArmorMaterials.init(bus);
        Config.init(container);
        CreativeModeTabs.init(bus);
    }

}