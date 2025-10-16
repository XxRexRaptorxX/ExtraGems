package xxrexraptorxx.extragems.main;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.extragems.registry.*;
import xxrexraptorxx.extragems.utils.Config;
import xxrexraptorxx.magmacore.main.ModRegistry;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/extra-gems">...</a>
 **/
@Mod(References.MODID)
public class ExtraGems {

    public static final Logger LOGGER = LogManager.getLogger();

    public ExtraGems(IEventBus bus, ModContainer container) {
        ModBlocks.init(bus);
        ModItems.init(bus);
        Config.init(container);
        CreativeTabs.init(bus);

        bus.addListener(this::addCreative);
        ModRegistry.register(References.MODID, References.NAME, References.URL);
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> key = event.getTabKey();

        if (key == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.AMETHYST.get());
            event.accept(ModItems.CHARGED_AMETHYST.get());
            event.accept(ModItems.RUBY.get());
            event.accept(ModItems.CHARGED_RUBY.get());
            event.accept(ModItems.SAPPHIRE.get());
            event.accept(ModItems.CHARGED_SAPPHIRE.get());
            event.accept(ModItems.TOPAZ.get());
            event.accept(ModItems.CHARGED_TOPAZ.get());
            event.accept(ModItems.CRYSTAL.get());
            event.accept(ModItems.CHARGED_CRYSTAL.get());
            event.accept(ModItems.CHARGED_DIAMOND.get());
            event.accept(ModItems.CHARGED_EMERALD.get());

        } else if (key == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.AMETHYST_AMULET.get());
            event.accept(ModItems.RUBY_AMULET.get());
            event.accept(ModItems.SAPPHIRE_AMULET.get());
            event.accept(ModItems.EMERALD_AMULET.get());
            event.accept(ModItems.TOPAZ_AMULET.get());
            event.accept(ModItems.CRYSTAL_AMULET.get());
            event.accept(ModItems.DIAMOND_AMULET.get());

            event.accept(ModItems.AMETHYST_PICKAXE.get());
            event.accept(ModItems.AMETHYST_AXE.get());
            event.accept(ModItems.AMETHYST_HOE.get());

            event.accept(ModItems.RUBY_SHOVEL.get());
            event.accept(ModItems.RUBY_PICKAXE.get());
            event.accept(ModItems.RUBY_AXE.get());
            event.accept(ModItems.RUBY_HOE.get());

            event.accept(ModItems.SAPPHIRE_SHOVEL.get());
            event.accept(ModItems.SAPPHIRE_PICKAXE.get());
            event.accept(ModItems.SAPPHIRE_AXE.get());
            event.accept(ModItems.SAPPHIRE_HOE.get());

            event.accept(ModItems.EMERALD_SHOVEL.get());
            event.accept(ModItems.EMERALD_PICKAXE.get());
            event.accept(ModItems.EMERALD_AXE.get());
            event.accept(ModItems.EMERALD_HOE.get());

            event.accept(ModItems.TOPAZ_SHOVEL.get());
            event.accept(ModItems.TOPAZ_PICKAXE.get());
            event.accept(ModItems.TOPAZ_AXE.get());
            event.accept(ModItems.TOPAZ_HOE.get());

            event.accept(ModItems.CRYSTAL_SHOVEL.get());
            event.accept(ModItems.CRYSTAL_PICKAXE.get());
            event.accept(ModItems.CRYSTAL_AXE.get());
            event.accept(ModItems.CRYSTAL_HOE.get());

        } else if (key == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.AMETHYST_SWORD.get());
            event.accept(ModItems.AMETHYST_AXE.get());
            event.accept(ModItems.AMETHYST_HELMET.get());
            event.accept(ModItems.AMETHYST_CHESTPLATE.get());
            event.accept(ModItems.AMETHYST_LEGGINGS.get());
            event.accept(ModItems.AMETHYST_BOOTS.get());

            event.accept(ModItems.RUBY_SWORD.get());
            event.accept(ModItems.RUBY_AXE.get());
            event.accept(ModItems.RUBY_HELMET.get());
            event.accept(ModItems.RUBY_CHESTPLATE.get());
            event.accept(ModItems.RUBY_LEGGINGS.get());
            event.accept(ModItems.RUBY_BOOTS.get());

            event.accept(ModItems.SAPPHIRE_SWORD.get());
            event.accept(ModItems.SAPPHIRE_AXE.get());
            event.accept(ModItems.SAPPHIRE_HELMET.get());
            event.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
            event.accept(ModItems.SAPPHIRE_LEGGINGS.get());
            event.accept(ModItems.SAPPHIRE_BOOTS.get());

            event.accept(ModItems.EMERALD_SWORD.get());
            event.accept(ModItems.EMERALD_AXE.get());
            event.accept(ModItems.EMERALD_HELMET.get());
            event.accept(ModItems.EMERALD_CHESTPLATE.get());
            event.accept(ModItems.EMERALD_LEGGINGS.get());
            event.accept(ModItems.EMERALD_BOOTS.get());

            event.accept(ModItems.TOPAZ_SWORD.get());
            event.accept(ModItems.TOPAZ_AXE.get());
            event.accept(ModItems.TOPAZ_HELMET.get());
            event.accept(ModItems.TOPAZ_CHESTPLATE.get());
            event.accept(ModItems.TOPAZ_LEGGINGS.get());
            event.accept(ModItems.TOPAZ_BOOTS.get());

            event.accept(ModItems.CRYSTAL_SWORD.get());
            event.accept(ModItems.CRYSTAL_AXE.get());
            event.accept(ModItems.CRYSTAL_HELMET.get());
            event.accept(ModItems.CRYSTAL_CHESTPLATE.get());
            event.accept(ModItems.CRYSTAL_LEGGINGS.get());
            event.accept(ModItems.CRYSTAL_BOOTS.get());

        } else if (key == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.GEM_CHARGER.get());
            event.accept(ModBlocks.CHARGED_AMETHYST_BLOCK.get());
            event.accept(ModBlocks.CHARGED_RUBY_BLOCK.get());
            event.accept(ModBlocks.CHARGED_SAPPHIRE_BLOCK.get());
            event.accept(ModBlocks.CHARGED_EMERALD_BLOCK.get());
            event.accept(ModBlocks.CHARGED_TOPAZ_BLOCK.get());
            event.accept(ModBlocks.CHARGED_CRYSTAL_BLOCK.get());
            event.accept(ModBlocks.CHARGED_DIAMOND_BLOCK.get());

        } else if (key == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.AMETHYST_BLOCK.get());
            event.accept(ModBlocks.RUBY_BLOCK.get());
            event.accept(ModBlocks.SAPPHIRE_BLOCK.get());
            event.accept(ModBlocks.TOPAZ_BLOCK.get());
            event.accept(ModBlocks.CRYSTAL_BLOCK.get());

        } else if (key == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.RUBY_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
            event.accept(ModBlocks.SAPPHIRE_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
            event.accept(ModBlocks.TOPAZ_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
            event.accept(ModBlocks.CRYSTAL_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_CRYSTAL_ORE.get());
        }
    }
}
