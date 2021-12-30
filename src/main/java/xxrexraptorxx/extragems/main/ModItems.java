package xxrexraptorxx.extragems.main;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xxrexraptorxx.extragems.items.ItemAmulet;
import xxrexraptorxx.extragems.items.ItemGem;
import xxrexraptorxx.extragems.items.ItemGemCharged;
import xxrexraptorxx.extragems.utils.ArmorMaterials;
import xxrexraptorxx.extragems.utils.CreativeTab;
import xxrexraptorxx.extragems.utils.ToolMaterials;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final RegistryObject<ItemGem> AMETHYST = ITEMS.register("amethyst", ItemGem::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_AMETHYST = ITEMS.register("amethyst_charged", ItemGemCharged::new);
    public static final RegistryObject<ItemGem> RUBY = ITEMS.register("ruby", ItemGem::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_RUBY = ITEMS.register("ruby_charged", ItemGemCharged::new);
    public static final RegistryObject<ItemGem> SAPPHIRE = ITEMS.register("sapphire", ItemGem::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_SAPPHIRE = ITEMS.register("sapphire_charged", ItemGemCharged::new);
    public static final RegistryObject<ItemGem> TOPAZ = ITEMS.register("topaz", ItemGem::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_TOPAZ = ITEMS.register("topaz_charged", ItemGemCharged::new);
    public static final RegistryObject<ItemGem> CRYSTAL = ITEMS.register("crystal", ItemGem::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_CRYSTAL = ITEMS.register("crystal_charged", ItemGemCharged::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_DIAMOND = ITEMS.register("diamond_charged", ItemGemCharged::new);
    public static final RegistryObject<ItemGemCharged> CHARGED_EMERALD = ITEMS.register("emerald_charged", ItemGemCharged::new);

    public static final RegistryObject<ItemAmulet> AMETHYST_AMULET = ITEMS.register("amethyst_amulet", ItemAmulet::new);
    public static final RegistryObject<ItemAmulet> RUBY_AMULET = ITEMS.register("ruby_amulet", ItemAmulet::new);
    public static final RegistryObject<ItemAmulet> SAPPHIRE_AMULET = ITEMS.register("sapphire_amulet", ItemAmulet::new);
    public static final RegistryObject<ItemAmulet> TOPAZ_AMULET = ITEMS.register("topaz_amulet", ItemAmulet::new);
    public static final RegistryObject<ItemAmulet> CRYSTAL_AMULET = ITEMS.register("crystal_amulet", ItemAmulet::new);
    public static final RegistryObject<ItemAmulet> DIAMOND_AMULET = ITEMS.register("diamond_amulet", ItemAmulet::new);
    public static final RegistryObject<ItemAmulet> EMERALD_AMULET = ITEMS.register("emerald_amulet", ItemAmulet::new);

    public static final RegistryObject<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () ->
            new SwordItem(ToolMaterials.AMETHYST, 3, -2.4f, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ToolMaterials.AMETHYST, 1, -2.8F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ToolMaterials.AMETHYST, 7.0F, -3.2F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ToolMaterials.AMETHYST, 1.5F, -3.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ToolMaterials.AMETHYST,-2, -2.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)){});

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ToolMaterials.RUBY, 3, -2.4f, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ToolMaterials.RUBY, 1, -2.8F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ToolMaterials.RUBY, 7.0F, -3.2F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ToolMaterials.RUBY, 1.5F, -3.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ToolMaterials.RUBY,-2, -2.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)){});

    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ToolMaterials.SAPPHIRE, 3, -2.4f, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ToolMaterials.SAPPHIRE, 1, -2.8F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ToolMaterials.SAPPHIRE, 7.0F, -3.2F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ToolMaterials.SAPPHIRE, 1.5F, -3.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ToolMaterials.SAPPHIRE,-2, -2.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)){});

    public static final RegistryObject<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () ->
            new SwordItem(ToolMaterials.TOPAZ, 3, -2.4f, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ToolMaterials.TOPAZ, 1, -2.8F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(ToolMaterials.TOPAZ, 7.0F, -3.2F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ToolMaterials.TOPAZ, 1.5F, -3.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(ToolMaterials.TOPAZ,-2, -2.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)){});

    public static final RegistryObject<SwordItem> CRYSTAL_SWORD = ITEMS.register("crystal_sword", () ->
            new SwordItem(ToolMaterials.CRYSTAL, 3, -2.4f, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<PickaxeItem> CRYSTAL_PICKAXE = ITEMS.register("crystal_pickaxe",
            () -> new PickaxeItem(ToolMaterials.CRYSTAL, 1, -2.8F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<AxeItem> CRYSTAL_AXE = ITEMS.register("crystal_axe",
            () -> new AxeItem(ToolMaterials.CRYSTAL, 7.0F, -3.2F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ShovelItem> CRYSTAL_SHOVEL = ITEMS.register("crystal_shovel",
            () -> new ShovelItem(ToolMaterials.CRYSTAL, 1.5F, -3.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<HoeItem> CRYSTAL_HOE = ITEMS.register("crystal_hoe",
            () -> new HoeItem(ToolMaterials.CRYSTAL,-2, -2.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)){});

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ToolMaterials.EMERALD, 3, -2.4f, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ToolMaterials.EMERALD, 1, -2.8F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ToolMaterials.EMERALD, 7.0F, -3.2F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ToolMaterials.EMERALD, 1.5F, -3.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ToolMaterials.EMERALD,-2, -2.0F, new Item.Properties().tab(CreativeTab.GEM_TAB)){});

    public static final RegistryObject<ArmorItem> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ArmorMaterials.AMETHYST, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ArmorMaterials.TOPAZ, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<ArmorItem> CRYSTAL_HELMET = ITEMS.register("crystal_helmet", () -> new ArmorItem(ArmorMaterials.CRYSTAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> CRYSTAL_LEGGINGS = ITEMS.register("crystal_leggings", () -> new ArmorItem(ArmorMaterials.CRYSTAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> CRYSTAL_CHESTPLATE = ITEMS.register("crystal_chestplate", () -> new ArmorItem(ArmorMaterials.CRYSTAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> CRYSTAL_BOOTS = ITEMS.register("crystal_boots", () -> new ArmorItem(ArmorMaterials.CRYSTAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.GEM_TAB)));

    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTab.GEM_TAB)));
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ArmorMaterials.EMERALD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeTab.GEM_TAB)));
}