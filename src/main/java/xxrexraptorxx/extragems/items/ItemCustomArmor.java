package xxrexraptorxx.extragems.items;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class ItemCustomArmor extends ArmorItem {

    public ItemCustomArmor(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }


    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }


    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return true;
    }

}
