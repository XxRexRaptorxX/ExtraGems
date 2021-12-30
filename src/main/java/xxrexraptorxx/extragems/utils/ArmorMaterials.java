package xxrexraptorxx.extragems.utils;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.Lazy;
import xxrexraptorxx.extragems.main.ModBlocks;
import xxrexraptorxx.extragems.main.ModItems;
import xxrexraptorxx.extragems.main.References;

import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {

    EMERALD(References.MODID + ":emerald", 20, new int[] {3, 6, 8, 3}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, ()-> { return Ingredient.of(Items.EMERALD);}),
    RUBY(References.MODID + ":ruby", 20, new int[] {3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, ()-> { return Ingredient.of(ModItems.RUBY.get());}),
    SAPPHIRE(References.MODID + ":sapphire", 20, new int[] {3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, ()-> { return Ingredient.of(ModItems.SAPPHIRE.get());}),
    TOPAZ(References.MODID + ":topaz", 20, new int[] {3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, ()-> { return Ingredient.of(ModItems.TOPAZ.get());}),
    CRYSTAL(References.MODID + ":crystal", 20, new int[] {3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F,  ()-> { return Ingredient.of(ModItems.CRYSTAL.get());}),
    AMETHYST(References.MODID + ":amethyst", 18, new int[] {3, 6, 8, 3}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F,  ()-> { return Ingredient.of(ModItems.AMETHYST.get());});


    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Lazy<Ingredient> repairMaterial;

    private ArmorMaterials(String nameIn, int maxDamageIn, int[] drAmtArray,
                                    int enchantabilityIn, SoundEvent soundIn,
                                    float toughnessIn,
                                    Supplier<Ingredient> repairMatIn)
    {
        name = nameIn;
        maxDamageFactor = maxDamageIn;
        damageReductionAmountArray = drAmtArray;
        enchantability = enchantabilityIn;
        soundEvent = soundIn;
        toughness = toughnessIn;
        repairMaterial = Lazy.of(repairMatIn);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}