package net.aqua.satiscraftory.worldgen;

import net.aqua.satiscraftory.Satiscraftory;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> NETHER_LIMESTONE_PLACED_KEY = registerKey("nether_limestone_placed");
    public static final ResourceKey<PlacedFeature> NETHER_CATERIUM_PLACED_KEY = registerKey("nether_caterium_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SULFUR_PLACED_KEY = registerKey("nether_sulfur_placed");
    public static final ResourceKey<PlacedFeature> END_BAUXITE_PLACED_KEY = registerKey("end_bauxite_placed");
    public static final ResourceKey<PlacedFeature> END_SAM_PLACED_KEY = registerKey("end_sam_placed");
    public static final ResourceKey<PlacedFeature> END_URANIUM_PLACED_KEY = registerKey("end_uranium_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, NETHER_LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_LIMESTONE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100))));
        register(context, NETHER_CATERIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_CATERIUM_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100))));
        register(context, NETHER_SULFUR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SULFUR_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100))));
        register(context, END_BAUXITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_BAUXITE_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100))));
        register(context, END_SAM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_SAM_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100))));
        register(context, END_URANIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_URANIUM_KEY),
                ModOrePlacement.commonOrePlacement(6,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(100))));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Satiscraftory.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
