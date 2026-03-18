package net.aqua.satiscraftory.datagen;

import net.aqua.satiscraftory.Satiscraftory;
import net.aqua.satiscraftory.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Satiscraftory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.limestone_ore.get(),
                        ModBlocks.caterium_ore.get(),
                        ModBlocks.sulfur_ore.get(),
                        ModBlocks.bauxite_ore.get(),
                        ModBlocks.sam_ore.get(),
                        ModBlocks.uranium_ore.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.limestone_ore.get(),
                        ModBlocks.bauxite_ore.get(),
                        ModBlocks.sulfur_ore.get(),
                        ModBlocks.caterium_ore.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.uranium_ore.get(),
                        ModBlocks.sam_ore.get());

    }
}