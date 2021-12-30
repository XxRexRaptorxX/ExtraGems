package xxrexraptorxx.extragems.utils;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_BLOCKS = "blocks";
    public static final String CATEGORY_ITEMS = "gems";
    public static final String CATEGORY_WORLD = "world";

    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ForgeConfigSpec.IntValue CHARGED_BLOCK_EFFECT_DURATION;
    public static ForgeConfigSpec.IntValue CHARGED_BLOCK_EFFECT_AMPLIFIER;
    public static ForgeConfigSpec.BooleanValue AMULET_DESTROYABLE;
    public static ForgeConfigSpec.IntValue AMULET_DURABILITY;
    public static ForgeConfigSpec.IntValue AMULET_EFFECT_DURATION;
    public static ForgeConfigSpec.IntValue AMULET_EFFECT_AMPLIFIER;
    public static ForgeConfigSpec.IntValue AMULET_EFFECT_RADIUS;
    public static ForgeConfigSpec.IntValue AMULET_EFFECT_COOLDOWN;
    public static ForgeConfigSpec.IntValue AMULET_MAX_USAGES;
    public static ForgeConfigSpec.BooleanValue GENERATE_STONE_ORE_VARIANTS;
    public static ForgeConfigSpec.BooleanValue GENERATE_DEEPSLATE_ORE_VARIANTS;
    public static ForgeConfigSpec.BooleanValue RUBY_ORE_GENERATION;
    public static ForgeConfigSpec.BooleanValue SAPPHIRE_ORE_GENERATION;
    public static ForgeConfigSpec.BooleanValue TOPAZ_ORE_GENERATION;
    public static ForgeConfigSpec.BooleanValue CRYSTAL_ORE_GENERATION;
    public static ForgeConfigSpec.IntValue ORE_RARITY;
    public static ForgeConfigSpec.IntValue DEEPSLATE_ORE_RARITY;
    public static ForgeConfigSpec.IntValue CHARGING_COST;
    public static ForgeConfigSpec.BooleanValue LOOT_GENERATOR;

    public static void init() {
        initServer();
        initClient();
        initCommon();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_CONFIG);
    }


    public static void initClient() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("General settings").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        builder.pop();

        CLIENT_CONFIG = builder.build();
    }


    public static void initServer() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Blocks").push(CATEGORY_BLOCKS);
        CHARGED_BLOCK_EFFECT_DURATION = builder.comment("Change the effect duration of the charged gem blocks").defineInRange("charged_block_effect_duration", 300, 10, 10000);
        CHARGED_BLOCK_EFFECT_AMPLIFIER = builder.comment("Change the effect amplifier of the charged gem blocks").defineInRange("charged_block_effect_amplifier", 0, 0, 5);
        builder.pop();

        builder.comment("Items").push(CATEGORY_ITEMS);
        AMULET_DESTROYABLE = builder.comment("Enable or disable if the amulets should get a durability").define("is_amulet_destroyable", false);
        AMULET_DURABILITY = builder.comment("Change the durability of the amulets").defineInRange("amulet_durability", 200, 1, 1000);
        AMULET_EFFECT_DURATION = builder.comment("Change the effect duration of the amulets").defineInRange("amulet_effect_duration", 200, 10, 10000);
        AMULET_EFFECT_AMPLIFIER = builder.comment("Change the effect amplifier of the amulets").defineInRange("amulet_effect_amplifier", 0, 0, 5);
        AMULET_EFFECT_RADIUS = builder.comment("Change the effect radius of the amulets").defineInRange("amulet_effect_radius", 3, 1, 10);
        AMULET_EFFECT_COOLDOWN = builder.comment("Change the effect cooldown after the usage").defineInRange("amulet_effect_cooldown", 600, 0, 10000);
        AMULET_MAX_USAGES = builder.comment("Change the maximum usages of the amulets").defineInRange("amulet_max_usages", 100, 1, 1000);
        CHARGING_COST = builder.comment("Change the amount of experience levels you need to charge a gem on the gem charger").defineInRange("charging_cost", 25, 1, 50);
        builder.pop();

        SERVER_CONFIG = builder.build();
    }


    public static void initCommon() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("World").push(CATEGORY_WORLD);
        LOOT_GENERATOR = builder.comment("Enable or disable the dungeon loot generator").define("loot_generator", true);
        GENERATE_STONE_ORE_VARIANTS = builder.comment("Enable normal ore variants generation in the stone layers").define("stone_ore_generation", true);
        GENERATE_DEEPSLATE_ORE_VARIANTS = builder.comment("Enable ore variants generation in the deepslate layers").define("deepslate_ore_generation", true);
        RUBY_ORE_GENERATION = builder.comment("Enable or disable the ruby ore generation in your world").define("ruby_ore_generation", true);
        SAPPHIRE_ORE_GENERATION = builder.comment("Enable or disable the sapphire ore generation in your world").define("sapphire_ore_generation", true);
        TOPAZ_ORE_GENERATION = builder.comment("Enable or disable the topaz ore generation in your world").define("topaz_ore_generation", true);
        CRYSTAL_ORE_GENERATION = builder.comment("Enable or disable the crystal ore generation in your world").define("crystal_ore_generation", true);
        ORE_RARITY = builder.comment("Change the rarity of regular ores").defineInRange("ore_rarity", 10, 1, 100);
        DEEPSLATE_ORE_RARITY = builder.comment("Change the rarity of deepslate ores").defineInRange("deepslate_ore_rarity", 10, 1, 100);
        builder.pop();

        COMMON_CONFIG = builder.build();
    }


}