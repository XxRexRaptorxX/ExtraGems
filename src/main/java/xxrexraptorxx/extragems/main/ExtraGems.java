package xxrexraptorxx.extragems.main;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.extragems.utils.Config;

@Mod(References.MODID)
public class ExtraGems {

    public static final Logger LOGGER = LogManager.getLogger();

    public ExtraGems() {
        ModBlocks.init();
        ModItems.init();
        Config.init();
    }
}