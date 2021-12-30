package xxrexraptorxx.extragems.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import xxrexraptorxx.extragems.utils.CreativeTab;

public class ItemGemCharged extends Item {

    public ItemGemCharged() {
        super(new Properties()
            .tab(CreativeTab.GEM_TAB)
            .rarity(Rarity.UNCOMMON)
        );

    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
