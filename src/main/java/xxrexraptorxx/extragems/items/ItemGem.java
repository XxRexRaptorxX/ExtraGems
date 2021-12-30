package xxrexraptorxx.extragems.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import xxrexraptorxx.extragems.utils.CreativeTab;

public class ItemGem extends Item {

    public ItemGem() {
        super(new Properties()
             .tab(CreativeTab.GEM_TAB)
        );

    }
}
