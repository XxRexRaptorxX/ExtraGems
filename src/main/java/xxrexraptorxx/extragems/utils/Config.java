package xxrexraptorxx.extragems.utils;

import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_BLOCKS = "blocks";
    public static final String CATEGORY_ITEMS = "gems";
    public static final String CATEGORY_WORLD = "world";

    public static ModConfigSpec SERVER_CONFIG;
    public static ModConfigSpec CLIENT_CONFIG;
    public static ModConfigSpec COMMON_CONFIG;

    public static ModConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ModConfigSpec.BooleanValue PATREON_REWARDS;

    public static ModConfigSpec.IntValue CHARGED_BLOCK_EFFECT_DURATION;
    public static ModConfigSpec.IntValue CHARGED_BLOCK_EFFECT_AMPLIFIER;
    public static ModConfigSpec.BooleanValue AMULET_DESTROYABLE;
    public static ModConfigSpec.IntValue AMULET_EFFECT_DURATION;
    public static ModConfigSpec.IntValue AMULET_EFFECT_AMPLIFIER;
    public static ModConfigSpec.IntValue AMULET_EFFECT_RADIUS;
    public static ModConfigSpec.IntValue AMULET_EFFECT_COOLDOWN;
    public static ModConfigSpec.IntValue AMULET_MAX_USAGES;
    public static ModConfigSpec.BooleanValue GENERATE_STONE_ORE_VARIANTS;
    public static ModConfigSpec.BooleanValue GENERATE_DEEPSLATE_ORE_VARIANTS;
    public static ModConfigSpec.BooleanValue RUBY_ORE_GENERATION;
    public static ModConfigSpec.BooleanValue SAPPHIRE_ORE_GENERATION;
    public static ModConfigSpec.BooleanValue TOPAZ_ORE_GENERATION;
    public static ModConfigSpec.BooleanValue CRYSTAL_ORE_GENERATION;
    public static ModConfigSpec.IntValue ORE_RARITY;
    public static ModConfigSpec.IntValue DEEPSLATE_ORE_RARITY;
    public static ModConfigSpec.IntValue CHARGING_COST;
    public static ModConfigSpec.BooleanValue LOOT_GENERATOR;
    public static ModConfigSpec.IntValue MINING_LEVEL;

    public static void init() {
        initServer();
        initClient();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }


    public static void initClient() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General settings").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        builder.pop();

        CLIENT_CONFIG = builder.build();
    }


    public static void initServer() {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.comment("General settings").push(CATEGORY_GENERAL);
        PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons").define("patreon_rewards", true);
        builder.pop();

        builder.comment("Blocks").push(CATEGORY_BLOCKS);
        CHARGED_BLOCK_EFFECT_DURATION = builder.comment("Change the effect duration of the charged gem blocks").defineInRange("charged_block_effect_duration", 300, 10, 10000);
        CHARGED_BLOCK_EFFECT_AMPLIFIER = builder.comment("Change the effect amplifier of the charged gem blocks").defineInRange("charged_block_effect_amplifier", 0, 0, 5);
        builder.pop();

        builder.comment("Items").push(CATEGORY_ITEMS);
        AMULET_DESTROYABLE = builder.comment("Enable or disable if the amulets should get a durability").define("is_amulet_destroyable", false);
        AMULET_EFFECT_DURATION = builder.comment("Change the effect duration of the amulets").defineInRange("amulet_effect_duration", 200, 10, 10000);
        AMULET_EFFECT_AMPLIFIER = builder.comment("Change the effect amplifier of the amulets").defineInRange("amulet_effect_amplifier", 0, 0, 5);
        AMULET_EFFECT_RADIUS = builder.comment("Change the effect radius of the amulets").defineInRange("amulet_effect_radius", 3, 1, 10);
        AMULET_EFFECT_COOLDOWN = builder.comment("Change the effect cooldown after the usage").defineInRange("amulet_effect_cooldown", 600, 0, 10000);
        AMULET_MAX_USAGES = builder.comment("Change the maximum usages of the amulets").defineInRange("amulet_max_usages", 100, 1, 1000);
        CHARGING_COST = builder.comment("Change the amount of experience levels you need to charge a gem on the gem charger").defineInRange("charging_cost", 25, 1, 50);
        MINING_LEVEL = builder.comment("Should the pickaxes have a mining level of diamond or iron? 1 = diamond, 0 = iron").defineInRange("mining_level", 1, 0, 1);
        builder.pop();

        builder.comment("World").push(CATEGORY_WORLD);
        LOOT_GENERATOR = builder.comment("Enable or disable the dungeon loot generator").define("loot_generator", true);
        builder.pop();

        SERVER_CONFIG = builder.build();
    }

}