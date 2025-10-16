package xxrexraptorxx.extragems.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.extragems.items.ItemAmulet;
import xxrexraptorxx.extragems.items.ItemGemCharged;
import xxrexraptorxx.extragems.main.References;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final DeferredItem<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().setId(itemId("amethyst"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_AMETHYST = ITEMS.register("amethyst_charged",
            () -> new ItemGemCharged(new Item.Properties().setId(itemId("amethyst_charged"))));
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().setId(itemId("ruby"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_RUBY = ITEMS.register("ruby_charged", () -> new ItemGemCharged(new Item.Properties().setId(itemId("ruby_charged"))));
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().setId(itemId("sapphire"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_SAPPHIRE = ITEMS.register("sapphire_charged",
            () -> new ItemGemCharged(new Item.Properties().setId(itemId("sapphire_charged"))));
    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().setId(itemId("topaz"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_TOPAZ = ITEMS.register("topaz_charged",
            () -> new ItemGemCharged(new Item.Properties().setId(itemId("topaz_charged"))));
    public static final DeferredItem<Item> CRYSTAL = ITEMS.register("crystal", () -> new Item(new Item.Properties().setId(itemId("crystal"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_CRYSTAL = ITEMS.register("crystal_charged",
            () -> new ItemGemCharged(new Item.Properties().setId(itemId("crystal_charged"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_DIAMOND = ITEMS.register("diamond_charged",
            () -> new ItemGemCharged(new Item.Properties().setId(itemId("diamond_charged"))));
    public static final DeferredItem<ItemGemCharged> CHARGED_EMERALD = ITEMS.register("emerald_charged",
            () -> new ItemGemCharged(new Item.Properties().setId(itemId("emerald_charged"))));

    public static final DeferredItem<ItemAmulet> AMETHYST_AMULET = ITEMS.register("amethyst_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("amethyst_amulet"))));
    public static final DeferredItem<ItemAmulet> RUBY_AMULET = ITEMS.register("ruby_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("ruby_amulet"))));
    public static final DeferredItem<ItemAmulet> SAPPHIRE_AMULET = ITEMS.register("sapphire_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("sapphire_amulet"))));
    public static final DeferredItem<ItemAmulet> TOPAZ_AMULET = ITEMS.register("topaz_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("topaz_amulet"))));
    public static final DeferredItem<ItemAmulet> CRYSTAL_AMULET = ITEMS.register("crystal_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("crystal_amulet"))));
    public static final DeferredItem<ItemAmulet> DIAMOND_AMULET = ITEMS.register("diamond_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("diamond_amulet"))));
    public static final DeferredItem<ItemAmulet> EMERALD_AMULET = ITEMS.register("emerald_amulet", () -> new ItemAmulet(new Item.Properties().setId(itemId("emerald_amulet"))));


    public static final DeferredItem<Item> AMETHYST_SWORD = ITEMS.registerItem("amethyst_sword", props -> new Item(props.sword(ToolMaterials.AMETHYST, 3, -2.4f)));
    public static final DeferredItem<Item> AMETHYST_PICKAXE = ITEMS.registerItem("amethyst_pickaxe", props -> new Item(props.pickaxe(ToolMaterials.AMETHYST, 1, -2.8f)));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.registerItem("amethyst_axe", props -> new AxeItem(ToolMaterials.AMETHYST, 1.5f, -3.0f, props));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.registerItem("amethyst_shovel", props -> new ShovelItem(ToolMaterials.AMETHYST, 1.5f, -3.0f, props));
    public static final DeferredItem<HoeItem> AMETHYST_HOE = ITEMS.registerItem("amethyst_hoe", props -> new HoeItem(ToolMaterials.AMETHYST, 1, -0.0f, props));

    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerItem("ruby_sword", props -> new Item(props.sword(ToolMaterials.RUBY, 3, -2.4f)));
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe", props -> new Item(props.pickaxe(ToolMaterials.RUBY, 1, -2.8f)));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.registerItem("ruby_axe", props -> new AxeItem(ToolMaterials.RUBY, 6, -3.1f, props));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel", props -> new ShovelItem(ToolMaterials.RUBY, 1.5f, -3.0f, props));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.registerItem("ruby_hoe", props -> new HoeItem(ToolMaterials.RUBY, 1, -0.0f, props));

    public static final DeferredItem<Item> SAPPHIRE_SWORD = ITEMS.registerItem("sapphire_sword", props -> new Item(props.sword(ToolMaterials.SAPPHIRE, 3, -2.4f)));
    public static final DeferredItem<Item> SAPPHIRE_PICKAXE = ITEMS.registerItem("sapphire_pickaxe", props -> new Item(props.pickaxe(ToolMaterials.SAPPHIRE, 1, -2.8f)));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.registerItem("sapphire_axe", props -> new AxeItem(ToolMaterials.SAPPHIRE, 6, -3.1f, props));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.registerItem("sapphire_shovel", props -> new ShovelItem(ToolMaterials.SAPPHIRE, 1.5f, -3.0f, props));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.registerItem("sapphire_hoe", props -> new HoeItem(ToolMaterials.SAPPHIRE, 1, -0.0f, props));

    public static final DeferredItem<Item> TOPAZ_SWORD = ITEMS.registerItem("topaz_sword", props -> new Item(props.sword(ToolMaterials.TOPAZ, 3, -2.4f)));
    public static final DeferredItem<Item> TOPAZ_PICKAXE = ITEMS.registerItem("topaz_pickaxe", props -> new Item(props.pickaxe(ToolMaterials.TOPAZ, 1, -2.8f)));
    public static final DeferredItem<AxeItem> TOPAZ_AXE = ITEMS.registerItem("topaz_axe", props -> new AxeItem(ToolMaterials.TOPAZ, 6, -3.1f, props));
    public static final DeferredItem<ShovelItem> TOPAZ_SHOVEL = ITEMS.registerItem("topaz_shovel", props -> new ShovelItem(ToolMaterials.TOPAZ, 1.5f, -3.0f, props));
    public static final DeferredItem<HoeItem> TOPAZ_HOE = ITEMS.registerItem("topaz_hoe", props -> new HoeItem(ToolMaterials.TOPAZ, 1, -0.0f, props));

    public static final DeferredItem<Item> CRYSTAL_SWORD = ITEMS.registerItem("crystal_sword", props -> new Item(props.sword(ToolMaterials.CRYSTAL, 3, -2.4f)));
    public static final DeferredItem<Item> CRYSTAL_PICKAXE = ITEMS.registerItem("crystal_pickaxe", props -> new Item(props.pickaxe(ToolMaterials.CRYSTAL, 1, -2.8f)));
    public static final DeferredItem<AxeItem> CRYSTAL_AXE = ITEMS.registerItem("crystal_axe", props -> new AxeItem(ToolMaterials.CRYSTAL, 6, -3.1f, props));
    public static final DeferredItem<ShovelItem> CRYSTAL_SHOVEL = ITEMS.registerItem("crystal_shovel", props -> new ShovelItem(ToolMaterials.CRYSTAL, 1.5f, -3.0f, props));
    public static final DeferredItem<HoeItem> CRYSTAL_HOE = ITEMS.registerItem("crystal_hoe", props -> new HoeItem(ToolMaterials.CRYSTAL, 1, -0.0f, props));

    public static final DeferredItem<Item> EMERALD_SWORD = ITEMS.registerItem("emerald_sword", props -> new Item(props.sword(ToolMaterials.EMERALD, 3, -2.4f)));
    public static final DeferredItem<Item> EMERALD_PICKAXE = ITEMS.registerItem("emerald_pickaxe", props -> new Item(props.pickaxe(ToolMaterials.EMERALD, 1, -2.8f)));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.registerItem("emerald_axe", props -> new AxeItem(ToolMaterials.EMERALD, 6, -3.1f, props));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.registerItem("emerald_shovel", props -> new ShovelItem(ToolMaterials.EMERALD, 1.5f, -3.0f, props));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.registerItem("emerald_hoe", props -> new HoeItem(ToolMaterials.EMERALD, 1, -0.0f, props));

    public static final DeferredItem<Item> AMETHYST_HELMET = ITEMS.registerItem("amethyst_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> AMETHYST_LEGGINGS = ITEMS.registerItem("amethyst_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> AMETHYST_CHESTPLATE = ITEMS.registerItem("amethyst_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> AMETHYST_BOOTS = ITEMS.registerItem("amethyst_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerItem("ruby_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerItem("ruby_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> SAPPHIRE_HELMET = ITEMS.registerItem("sapphire_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> SAPPHIRE_LEGGINGS = ITEMS.registerItem("sapphire_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> SAPPHIRE_CHESTPLATE = ITEMS.registerItem("sapphire_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> SAPPHIRE_BOOTS = ITEMS.registerItem("sapphire_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> TOPAZ_HELMET = ITEMS.registerItem("topaz_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> TOPAZ_LEGGINGS = ITEMS.registerItem("topaz_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> TOPAZ_CHESTPLATE = ITEMS.registerItem("topaz_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> TOPAZ_BOOTS = ITEMS.registerItem("topaz_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.TOPAZ_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> CRYSTAL_HELMET = ITEMS.registerItem("crystal_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.CRYSTAL_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> CRYSTAL_LEGGINGS = ITEMS.registerItem("crystal_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.CRYSTAL_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> CRYSTAL_CHESTPLATE = ITEMS.registerItem("crystal_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.CRYSTAL_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> CRYSTAL_BOOTS = ITEMS.registerItem("crystal_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.CRYSTAL_ARMOR_MATERIAL, ArmorType.BOOTS)));

    public static final DeferredItem<Item> EMERALD_HELMET = ITEMS.registerItem("emerald_helmet",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> EMERALD_LEGGINGS = ITEMS.registerItem("emerald_leggings",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> EMERALD_CHESTPLATE = ITEMS.registerItem("emerald_chestplate",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> EMERALD_BOOTS = ITEMS.registerItem("emerald_boots",
            props -> new Item(props.humanoidArmor(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));


    public static ResourceKey<Item> itemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }

}
