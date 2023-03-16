package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Grounded.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /* Vanilla Textures used for models */
        ResourceLocation crimson_nylium = new ResourceLocation("block/crimson_nylium");
        ResourceLocation warped_nylium = new ResourceLocation("block/warped_nylium");

        /* Crimson Mud */
        ResourceLocation crimson_mud = new ResourceLocation(Grounded.MODID, "block/nether/crimson_mud/crimson_mud");
        ResourceLocation polished_crimson_mud = new ResourceLocation(Grounded.MODID, "block/nether/crimson_mud/polished_crimson_mud");
        simpleBlock(ModBlocks.CRIMSON_MUD.get(), models().cubeAll(ModBlocks.CRIMSON_MUD.get().getDescriptionId(), crimson_mud));
        simpleBlock(ModBlocks.POLISHED_CRIMSON_MUD.get(), models().cubeAll(ModBlocks.POLISHED_CRIMSON_MUD.get().getDescriptionId(), polished_crimson_mud));

        /* Warped Loam */
        ResourceLocation warped_loam = new ResourceLocation(Grounded.MODID, "block/nether/warped_loam/warped_loam");
        ResourceLocation loam_warped_nylium = new ResourceLocation(Grounded.MODID, "block/nether/warped_loam/loam_warped_nylium");
        ResourceLocation warped_loam_bricks = new ResourceLocation(Grounded.MODID, "block/nether/warped_loam/warped_loam_bricks");
        simpleBlock(ModBlocks.WARPED_LOAM.get(), models().cubeAll(ModBlocks.WARPED_LOAM.get().getDescriptionId(), warped_loam));
        simpleBlock(ModBlocks.LOAM_WARPED_NYLIUM.get(), models().cubeBottomTop(ModBlocks.LOAM_WARPED_NYLIUM.get().getDescriptionId(), loam_warped_nylium, warped_loam, warped_nylium));
        simpleBlock(ModBlocks.WARPED_LOAM_BRICKS.get(), models().cubeAll(ModBlocks.WARPED_LOAM_BRICKS.get().getDescriptionId(), warped_loam_bricks));

        /* Entrailite */
        ResourceLocation entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite");
        ResourceLocation entrailite_top = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite_top");
        ResourceLocation entrailite_crimson_nylium = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite_crimson_nylium");
        ResourceLocation entrailite_warped_nylium = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite_warped_nylium");
        ResourceLocation cobbled_entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/cobbled_entrailite");
        ResourceLocation polished_entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/polished_entrailite");
        axisBlock((RotatedPillarBlock) ModBlocks.ENTRAILITE.get(), entrailite, entrailite_top);
        simpleBlock(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get(), models().cubeBottomTop(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get().getDescriptionId(), entrailite_crimson_nylium, entrailite, crimson_nylium));
        simpleBlock(ModBlocks.ENTRAILITE_WARPED_NYLIUM.get(), models().cubeBottomTop(ModBlocks.ENTRAILITE_WARPED_NYLIUM.get().getDescriptionId(), entrailite_warped_nylium, entrailite, warped_nylium));
        simpleBlock(ModBlocks.COBBLED_ENTRAILITE.get(), models().cubeAll(ModBlocks.COBBLED_ENTRAILITE.get().getDescriptionId(), cobbled_entrailite));
        simpleBlock(ModBlocks.SMOOTH_ENTRAILITE.get(), models().cubeAll(ModBlocks.SMOOTH_ENTRAILITE.get().getDescriptionId(), entrailite_top));
        simpleBlock(ModBlocks.LAYERED_ENTRAILITE.get(), models().cubeAll(ModBlocks.LAYERED_ENTRAILITE.get().getDescriptionId(), entrailite));
        simpleBlock(ModBlocks.POLISHED_ENTRAILITE.get(), models().cubeAll(ModBlocks.POLISHED_ENTRAILITE.get().getDescriptionId(), polished_entrailite));
    }
    
}