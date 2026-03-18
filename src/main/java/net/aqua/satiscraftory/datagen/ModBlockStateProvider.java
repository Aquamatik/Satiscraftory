package net.aqua.satiscraftory.datagen;

import net.aqua.satiscraftory.Satiscraftory;
import net.aqua.satiscraftory.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Satiscraftory.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.limestone_ore);
        blockWithItem(ModBlocks.caterium_ore);
        blockWithItem(ModBlocks.bauxite_ore);
        blockWithItem(ModBlocks.sulfur_ore);
        blockWithItem(ModBlocks.sam_ore);
        blockWithItem(ModBlocks.uranium_ore);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}