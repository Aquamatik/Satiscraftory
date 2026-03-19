package net.aqua.satiscraftory.worldgen;

import net.aqua.satiscraftory.Satiscraftory;
import net.aqua.satiscraftory.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LIMESTONE_KEY = registerKey("nether_limestone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CATERIUM_KEY = registerKey("nether_caterium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SULFUR_KEY = registerKey("nether_sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_BAUXITE_KEY = registerKey("end_bauxite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_URANIUM_KEY = registerKey("end_uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAM_KEY = registerKey("end_sam_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);


        register(context, NETHER_LIMESTONE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.limestone_ore.get().defaultBlockState(), 3));
        register(context, NETHER_CATERIUM_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.caterium_ore.get().defaultBlockState(), 3));
        register(context, NETHER_SULFUR_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.sulfur_ore.get().defaultBlockState(), 3));
        register(context, END_URANIUM_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.uranium_ore.get().defaultBlockState(), 3));
        register(context, END_BAUXITE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.bauxite_ore.get().defaultBlockState(), 3));
        register(context, END_SAM_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.sam_ore.get().defaultBlockState(), 3));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Satiscraftory.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
