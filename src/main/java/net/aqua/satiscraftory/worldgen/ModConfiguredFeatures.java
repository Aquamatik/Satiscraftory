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
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ORE_KEY = registerKey("mod_end_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ORE_KEY = registerKey("mod_nether_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> netherOres = List.of(OreConfiguration.target(netherrackReplaceables,
                ModBlocks.limestone_ore.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplaceables, ModBlocks.caterium_ore.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplaceables, ModBlocks.sulfur_ore.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> endOres = List.of(OreConfiguration.target(endReplaceables,
                ModBlocks.bauxite_ore.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, ModBlocks.sam_ore.get().defaultBlockState()),
                OreConfiguration.target(endReplaceables, ModBlocks.uranium_ore.get().defaultBlockState()));

        register(context, NETHER_ORE_KEY, Feature.ORE, new OreConfiguration(netherOres, 1));
        register(context, END_ORE_KEY, Feature.ORE, new OreConfiguration(endOres, 1));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Satiscraftory.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
