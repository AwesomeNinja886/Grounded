package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }
    
    @Override
    protected void registerStatesAndModels() {
        /* Crimson Mud */
        simpleBlock(ModBlocks.CRIMSON_MUD.get());
        simpleBlock(ModBlocks.POLISHED_CRIMSON_MUD.get());

        /* Warped Loam */
        ResourceLocation warped_loam = new ResourceLocation(Grounded.MODID, "block/warped_loam/warped_loam");
        ResourceLocation loam_warped_nylium = new ResourceLocation(Grounded.MODID, "block/warped_loam/loam_warped_nylium");
        ResourceLocation warped_loam_bricks = new ResourceLocation(Grounded.MODID, "block/warped_loam/warped_loam_bricks");
        simpleBlock(ModBlocks.WARPED_LOAM.get(), cubeAll(ModBlocks.WARPED_LOAM.get().getDescriptionId(), warped_loam));
        simpleBlock(ModBlocks.LOAM_WARPED_NYLIUM.get());
        simpleBlock(ModBlocks.WARPED_LOAM_BRICKS.get());

        logBlock((RotatedPillarBlock) ModBlocks.ENTRAILITE.get());
        simpleBlock(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get());
    }
    
}