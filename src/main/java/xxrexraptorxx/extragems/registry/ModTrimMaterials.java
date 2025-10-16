package xxrexraptorxx.extragems.registry;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import xxrexraptorxx.extragems.main.References;


public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> RUBY = registerKey("ruby");
    public static final ResourceKey<TrimMaterial> SAPPHIRE = registerKey("sapphire");
    public static final ResourceKey<TrimMaterial> TOPAZ = registerKey("topaz");
    public static final ResourceKey<TrimMaterial> AMETHYST = registerKey("amethyst");
    public static final ResourceKey<TrimMaterial> CRYSTAL = registerKey("crystal");

    public static final MaterialAssetGroup RUBY_ASSET_GROUP = MaterialAssetGroup.create("ruby");
    public static final MaterialAssetGroup SAPPHIRE_ASSET_GROUP = MaterialAssetGroup.create("sapphire");
    public static final MaterialAssetGroup TOPAZ_ASSET_GROUP = MaterialAssetGroup.create("topaz");
    public static final MaterialAssetGroup AMETHYST_ASSET_GROUP = MaterialAssetGroup.create("amethyst");
    public static final MaterialAssetGroup CRYSTAL_ASSET_GROUP = MaterialAssetGroup.create("crystal");


    private static ResourceKey<TrimMaterial> registerKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(References.MODID, name));
    }


    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, RUBY, Style.EMPTY.withColor(TextColor.parseColor("#d11313").getOrThrow()), RUBY_ASSET_GROUP);
        register(context, SAPPHIRE, Style.EMPTY.withColor(TextColor.parseColor("#003891").getOrThrow()), SAPPHIRE_ASSET_GROUP);
        register(context, TOPAZ, Style.EMPTY.withColor(TextColor.parseColor("#031cfc").getOrThrow()), TOPAZ_ASSET_GROUP);
        // register(context, AMETHYST, Style.EMPTY.withColor(TextColor.parseColor("#9A5CC6").getOrThrow()), AMETHYST_ASSET_GROUP);
        register(context, CRYSTAL, Style.EMPTY.withColor(TextColor.parseColor("#8fd9db").getOrThrow()), CRYSTAL_ASSET_GROUP);
    }


    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> resourceKey, Style style, MaterialAssetGroup group) {
        Component component = Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location())).withStyle(style);
        context.register(resourceKey, new TrimMaterial(group, component));
    }

}
