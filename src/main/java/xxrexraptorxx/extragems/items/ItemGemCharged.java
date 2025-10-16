package xxrexraptorxx.extragems.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class ItemGemCharged extends Item {

    public ItemGemCharged(Properties properties) {
        super(properties.rarity(Rarity.UNCOMMON));

    }


    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
