package xxrexraptorxx.extragems.main;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        Mod.EventBusSubscriber.Bus.MOD.bus().get().register(ExtraGems.class);
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.init();
        ModItems.init();
        Config.init();
    }


    //Creative Tab
    @SubscribeEvent
    public static void registerTabs(final CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(CREATIVE_TAB, (cf) -> cf.icon(() -> new ItemStack(ModItems.CHARGED_AMETHYST.get()))
                .title(Component.translatable("itemGroup." + References.MODID + "_tab")).displayItems((params, output) -> {

                    output.accept(ModItems.AMETHYST.get());
                    output.accept(ModItems.CHARGED_AMETHYST.get());
                    output.accept(ModItems.AMETHYST_AMULET.get());
                    output.accept(ModItems.AMETHYST_SWORD.get());
                    output.accept(ModItems.AMETHYST_PICKAXE.get());
                    output.accept(ModItems.AMETHYST_AXE.get());
                    output.accept(ModItems.AMETHYST_SHOVEL.get());
                    output.accept(ModItems.AMETHYST_HOE.get());
                    output.accept(ModItems.AMETHYST_HELMET.get());
                    output.accept(ModItems.AMETHYST_CHESTPLATE.get());
                    output.accept(ModItems.AMETHYST_LEGGINGS.get());
                    output.accept(ModItems.AMETHYST_BOOTS.get());

                    output.accept(ModItems.RUBY.get());
                    output.accept(ModItems.CHARGED_RUBY.get());
                    output.accept(ModItems.RUBY_AMULET.get());
                    output.accept(ModItems.RUBY_SWORD.get());
                    output.accept(ModItems.RUBY_PICKAXE.get());
                    output.accept(ModItems.RUBY_AXE.get());
                    output.accept(ModItems.RUBY_SHOVEL.get());
                    output.accept(ModItems.RUBY_HOE.get());
                    output.accept(ModItems.RUBY_HELMET.get());
                    output.accept(ModItems.RUBY_CHESTPLATE.get());
                    output.accept(ModItems.RUBY_LEGGINGS.get());
                    output.accept(ModItems.RUBY_BOOTS.get());

                    output.accept(ModItems.SAPPHIRE.get());
                    output.accept(ModItems.CHARGED_SAPPHIRE.get());
                    output.accept(ModItems.SAPPHIRE_AMULET.get());
                    output.accept(ModItems.SAPPHIRE_SWORD.get());
                    output.accept(ModItems.SAPPHIRE_PICKAXE.get());
                    output.accept(ModItems.SAPPHIRE_AXE.get());
                    output.accept(ModItems.SAPPHIRE_SHOVEL.get());
                    output.accept(ModItems.SAPPHIRE_HOE.get());
                    output.accept(ModItems.SAPPHIRE_HELMET.get());
                    output.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                    output.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                    output.accept(ModItems.SAPPHIRE_BOOTS.get());

                    output.accept(ModItems.TOPAZ.get());
                    output.accept(ModItems.CHARGED_TOPAZ.get());
                    output.accept(ModItems.TOPAZ_AMULET.get());
                    output.accept(ModItems.TOPAZ_SWORD.get());
                    output.accept(ModItems.TOPAZ_PICKAXE.get());
                    output.accept(ModItems.TOPAZ_AXE.get());
                    output.accept(ModItems.TOPAZ_SHOVEL.get());
                    output.accept(ModItems.TOPAZ_HOE.get());
                    output.accept(ModItems.TOPAZ_HELMET.get());
                    output.accept(ModItems.TOPAZ_CHESTPLATE.get());
                    output.accept(ModItems.TOPAZ_LEGGINGS.get());
                    output.accept(ModItems.TOPAZ_BOOTS.get());

                    output.accept(ModItems.CRYSTAL.get());
                    output.accept(ModItems.CHARGED_CRYSTAL.get());
                    output.accept(ModItems.CRYSTAL_AMULET.get());
                    output.accept(ModItems.CRYSTAL_SWORD.get());
                    output.accept(ModItems.CRYSTAL_PICKAXE.get());
                    output.accept(ModItems.CRYSTAL_AXE.get());
                    output.accept(ModItems.CRYSTAL_SHOVEL.get());
                    output.accept(ModItems.CRYSTAL_HOE.get());
                    output.accept(ModItems.CRYSTAL_HELMET.get());
                    output.accept(ModItems.CRYSTAL_CHESTPLATE.get());
                    output.accept(ModItems.CRYSTAL_LEGGINGS.get());
                    output.accept(ModItems.CRYSTAL_BOOTS.get());

                    output.accept(ModItems.CHARGED_CRYSTAL.get());
                    output.accept(ModItems.EMERALD_AMULET.get());
                    output.accept(ModItems.EMERALD_SWORD.get());
                    output.accept(ModItems.EMERALD_PICKAXE.get());
                    output.accept(ModItems.EMERALD_AXE.get());
                    output.accept(ModItems.EMERALD_SHOVEL.get());
                    output.accept(ModItems.EMERALD_HOE.get());
                    output.accept(ModItems.EMERALD_HELMET.get());
                    output.accept(ModItems.EMERALD_CHESTPLATE.get());
                    output.accept(ModItems.EMERALD_LEGGINGS.get());
                    output.accept(ModItems.EMERALD_BOOTS.get());

                    output.accept(ModBlocks.GEM_CHARGER.get());
                    output.accept(ModBlocks.AMETHYST_BLOCK.get());
                    output.accept(ModBlocks.CHARGED_AMETHYST_BLOCK.get());
                    output.accept(ModBlocks.RUBY_BLOCK.get());
                    output.accept(ModBlocks.CHARGED_RUBY_BLOCK.get());
                    output.accept(ModBlocks.RUBY_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                    output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    output.accept(ModBlocks.CHARGED_SAPPHIRE_BLOCK.get());
                    output.accept(ModBlocks.SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.TOPAZ_BLOCK.get());
                    output.accept(ModBlocks.CHARGED_TOPAZ_BLOCK.get());
                    output.accept(ModBlocks.TOPAZ_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE.get());
                    output.accept(ModBlocks.CRYSTAL_BLOCK.get());
                    output.accept(ModBlocks.CHARGED_CRYSTAL_BLOCK.get());
                    output.accept(ModBlocks.CRYSTAL_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_CRYSTAL_ORE.get());
                    output.accept(ModBlocks.CHARGED_EMERALD_BLOCK.get());
                })
        );
    }
}