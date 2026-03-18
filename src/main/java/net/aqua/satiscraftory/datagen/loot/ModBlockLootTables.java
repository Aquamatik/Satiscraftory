package net.aqua.satiscraftory.datagen.loot;

import net.aqua.satiscraftory.block.ModBlocks;
import net.aqua.satiscraftory.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.add(ModBlocks.limestone_ore.get(),
                block -> createOreDrop(ModBlocks.limestone_ore.get(), ModItems.limestone.get()));
        this.add(ModBlocks.caterium_ore.get(),
                block -> createOreDrop(ModBlocks.caterium_ore.get(), ModItems.caterium.get()));
        this.add(ModBlocks.bauxite_ore.get(),
                block -> createOreDrop(ModBlocks.bauxite_ore.get(), ModItems.bauxite.get()));
        this.add(ModBlocks.sulfur_ore.get(),
                block -> createOreDrop(ModBlocks.sulfur_ore.get(), ModItems.sulfur.get()));
        this.add(ModBlocks.sam_ore.get(),
                block -> createOreDrop(ModBlocks.sam_ore.get(), ModItems.sam.get()));
        this.add(ModBlocks.uranium_ore.get(),
                block -> createOreDrop(ModBlocks.uranium_ore.get(), ModItems.uranium.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}