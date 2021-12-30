package xxrexraptorxx.extragems.utils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.extragems.main.ModItems;

public class CreativeTab {

    public static CreativeModeTab GEM_TAB = new CreativeModeTab("gemTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHARGED_AMETHYST.get());
        }
    };
}
