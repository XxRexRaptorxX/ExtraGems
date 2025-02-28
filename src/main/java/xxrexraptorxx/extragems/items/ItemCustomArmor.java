package xxrexraptorxx.extragems.items;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

public class ItemCustomArmor extends ArmorItem {

    public ItemCustomArmor(ArmorMaterial material, ArmorType type, Properties properties) {
        super(material, type, properties);
    }


    @Override
    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        return true;
    }

}
