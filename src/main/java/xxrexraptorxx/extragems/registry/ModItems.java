package xxrexraptorxx.extragems.registry;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.extragems.items.ItemAmulet;
import xxrexraptorxx.extragems.items.ItemGem;
import xxrexraptorxx.extragems.items.ItemGemCharged;
import xxrexraptorxx.extragems.main.References;
import xxrexraptorxx.extragems.utils.ArmorMaterials;
import xxrexraptorxx.extragems.utils.ToolMaterials;

public class ModItems {

    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(References.MODID);


    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(bus);
    }

    public static final DeferredItem<ItemGem> AMETHYST = ITEMS.register("amethyst", ItemGem::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_AMETHYST = ITEMS.register("amethyst_charged", ItemGemCharged::new);
    public static final DeferredItem<ItemGem> RUBY = ITEMS.register("ruby", ItemGem::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_RUBY = ITEMS.register("ruby_charged", ItemGemCharged::new);
    public static final DeferredItem<ItemGem> SAPPHIRE = ITEMS.register("sapphire", ItemGem::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_SAPPHIRE = ITEMS.register("sapphire_charged", ItemGemCharged::new);
    public static final DeferredItem<ItemGem> TOPAZ = ITEMS.register("topaz", ItemGem::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_TOPAZ = ITEMS.register("topaz_charged", ItemGemCharged::new);
    public static final DeferredItem<ItemGem> CRYSTAL = ITEMS.register("crystal", ItemGem::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_CRYSTAL = ITEMS.register("crystal_charged", ItemGemCharged::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_DIAMOND = ITEMS.register("diamond_charged", ItemGemCharged::new);
    public static final DeferredItem<ItemGemCharged> CHARGED_EMERALD = ITEMS.register("emerald_charged", ItemGemCharged::new);

    public static final DeferredItem<ItemAmulet> AMETHYST_AMULET = ITEMS.register("amethyst_amulet", ItemAmulet::new);
    public static final DeferredItem<ItemAmulet> RUBY_AMULET = ITEMS.register("ruby_amulet", ItemAmulet::new);
    public static final DeferredItem<ItemAmulet> SAPPHIRE_AMULET = ITEMS.register("sapphire_amulet", ItemAmulet::new);
    public static final DeferredItem<ItemAmulet> TOPAZ_AMULET = ITEMS.register("topaz_amulet", ItemAmulet::new);
    public static final DeferredItem<ItemAmulet> CRYSTAL_AMULET = ITEMS.register("crystal_amulet", ItemAmulet::new);
    public static final DeferredItem<ItemAmulet> DIAMOND_AMULET = ITEMS.register("diamond_amulet", ItemAmulet::new);
    public static final DeferredItem<ItemAmulet> EMERALD_AMULET = ITEMS.register("emerald_amulet", ItemAmulet::new);

    public static final DeferredItem<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () ->
            new SwordItem(ToolMaterials.AMETHYST, 3, -2.4f, new Item.Properties()));
    public static final DeferredItem<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ToolMaterials.AMETHYST, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ToolMaterials.AMETHYST, 6, -3.1F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ToolMaterials.AMETHYST, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ToolMaterials.AMETHYST,0, -1.0F, new Item.Properties()));

    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ToolMaterials.RUBY, 3, -2.4f, new Item.Properties()));
    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ToolMaterials.RUBY, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ToolMaterials.RUBY, 6, -3.1F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ToolMaterials.RUBY, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ToolMaterials.RUBY,0, -1.0F, new Item.Properties()));

    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ToolMaterials.SAPPHIRE, 3, -2.4f, new Item.Properties()));
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ToolMaterials.SAPPHIRE, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ToolMaterials.SAPPHIRE, 6, -3.1F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ToolMaterials.SAPPHIRE, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ToolMaterials.SAPPHIRE,0, -1.0F, new Item.Properties()));

    public static final DeferredItem<SwordItem> TOPAZ_SWORD = ITEMS.register("topaz_sword", () ->
            new SwordItem(ToolMaterials.TOPAZ, 3, -2.4f, new Item.Properties()));
    public static final DeferredItem<PickaxeItem> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ToolMaterials.TOPAZ, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<AxeItem> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(ToolMaterials.TOPAZ, 6, -3.1F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ToolMaterials.TOPAZ, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<HoeItem> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(ToolMaterials.TOPAZ,0, -1.0F, new Item.Properties()));

    public static final DeferredItem<SwordItem> CRYSTAL_SWORD = ITEMS.register("crystal_sword", () ->
            new SwordItem(ToolMaterials.CRYSTAL, 3, -2.4f, new Item.Properties()));
    public static final DeferredItem<PickaxeItem> CRYSTAL_PICKAXE = ITEMS.register("crystal_pickaxe",
            () -> new PickaxeItem(ToolMaterials.CRYSTAL, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<AxeItem> CRYSTAL_AXE = ITEMS.register("crystal_axe",
            () -> new AxeItem(ToolMaterials.CRYSTAL, 6, -3.1F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> CRYSTAL_SHOVEL = ITEMS.register("crystal_shovel",
            () -> new ShovelItem(ToolMaterials.CRYSTAL, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<HoeItem> CRYSTAL_HOE = ITEMS.register("crystal_hoe",
            () -> new HoeItem(ToolMaterials.CRYSTAL,0, -1.0F, new Item.Properties()){});

    public static final DeferredItem<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(ToolMaterials.EMERALD, 3, -2.4f, new Item.Properties()));
    public static final DeferredItem<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ToolMaterials.EMERALD, 1, -2.8F, new Item.Properties()));
    public static final DeferredItem<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ToolMaterials.EMERALD, 6, -3.1F, new Item.Properties()));
    public static final DeferredItem<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ToolMaterials.EMERALD, 1.5F, -3.0F, new Item.Properties()));
    public static final DeferredItem<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ToolMaterials.EMERALD,0, -1.0F, new Item.Properties()));

    public static final DeferredItem<ArmorItem> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () -> new ArmorItem(ArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () -> new ArmorItem(ArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () -> new ArmorItem(ArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () -> new ArmorItem(ArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> CRYSTAL_HELMET = ITEMS.register("crystal_helmet", () -> new ArmorItem(ArmorMaterials.CRYSTAL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> CRYSTAL_LEGGINGS = ITEMS.register("crystal_leggings", () -> new ArmorItem(ArmorMaterials.CRYSTAL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> CRYSTAL_CHESTPLATE = ITEMS.register("crystal_chestplate", () -> new ArmorItem(ArmorMaterials.CRYSTAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> CRYSTAL_BOOTS = ITEMS.register("crystal_boots", () -> new ArmorItem(ArmorMaterials.CRYSTAL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final DeferredItem<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));
}