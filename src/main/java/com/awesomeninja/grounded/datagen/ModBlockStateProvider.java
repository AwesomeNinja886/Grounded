package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.core.Direction.Axis;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    ExistingFileHelper exFileHelper;
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Grounded.MODID, exFileHelper);
        this.exFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        /* Vanilla Textures used for models */
        ResourceLocation crimson_nylium = new ResourceLocation("block/crimson_nylium");
        ResourceLocation warped_nylium = new ResourceLocation("block/warped_nylium");
        ResourceLocation clay = new ResourceLocation("block/clay");
        ResourceLocation grass_block_top = new ResourceLocation("block/grass_block_top");
        ResourceLocation grass_block_overlay = new ResourceLocation("block/grass_block_overlay");

        /* Crimson Mud */
        ResourceLocation crimson_mud = new ResourceLocation(Grounded.MODID, "block/nether/crimson_mud/crimson_mud");
        ResourceLocation polished_crimson_mud = new ResourceLocation(Grounded.MODID, "block/nether/crimson_mud/polished_crimson_mud");
        
        simpleBlockItem(ModBlocks.CRIMSON_MUD.get(), models().cubeAll("crimson_mud", crimson_mud));
        getVariantBuilder(ModBlocks.CRIMSON_MUD.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/crimson_mud"), exFileHelper)));
        
        simpleBlockItem(ModBlocks.POLISHED_CRIMSON_MUD.get(), models().cubeAll("polished_crimson_mud", polished_crimson_mud));
        getVariantBuilder(ModBlocks.POLISHED_CRIMSON_MUD.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/polished_crimson_mud"), exFileHelper)));

        /* Warped Loam */
        ResourceLocation warped_loam = new ResourceLocation(Grounded.MODID, "block/nether/warped_loam/warped_loam");
        ResourceLocation loam_warped_nylium = new ResourceLocation(Grounded.MODID, "block/nether/warped_loam/loam_warped_nylium");
        ResourceLocation warped_loam_bricks = new ResourceLocation(Grounded.MODID, "block/nether/warped_loam/warped_loam_bricks");
        
        simpleBlockItem(ModBlocks.WARPED_LOAM.get(), models().cubeAll("warped_loam", warped_loam));
        getVariantBuilder(ModBlocks.WARPED_LOAM.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/warped_loam"), exFileHelper)));

        simpleBlockItem(ModBlocks.LOAM_WARPED_NYLIUM.get(), models().cubeBottomTop("loam_warped_nylium", loam_warped_nylium, warped_loam, warped_nylium));
        getVariantBuilder(ModBlocks.LOAM_WARPED_NYLIUM.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/loam_warped_nylium"), exFileHelper)));

        simpleBlockItem(ModBlocks.WARPED_LOAM_BRICKS.get(), models().cubeAll("warped_loam_bricks", warped_loam_bricks));
        getVariantBuilder(ModBlocks.WARPED_LOAM_BRICKS.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/warped_loam_bricks"), exFileHelper)));

        /* Entrailite */
        ResourceLocation entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite");
        ResourceLocation entrailite_top = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite_top");
        ResourceLocation entrailite_crimson_nylium = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite_crimson_nylium");
        ResourceLocation entrailite_warped_nylium = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/entrailite_warped_nylium");
        ResourceLocation cobbled_entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/cobbled_entrailite");
        ResourceLocation smooth_entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/smooth_entrailite");
        ResourceLocation polished_entrailite = new ResourceLocation(Grounded.MODID, "block/nether/entrailite/polished_entrailite");

        ModelFile entrailite_vertical = models().cubeColumn("entrailite", entrailite, entrailite_top);
        ModelFile entrailite_horizontal = models().cubeColumnHorizontal("entrailite_horizontal", entrailite, entrailite_top);
        
        //axisBlock((RotatedPillarBlock) ModBlocks.ENTRAILITE.get(), entrailite, entrailite_top);
        simpleBlockItem(ModBlocks.ENTRAILITE.get(), entrailite_vertical);
        getVariantBuilder(ModBlocks.ENTRAILITE.get())
            .partialState().with(RotatedPillarBlock.AXIS, Axis.Y)
                .modelForState().modelFile(entrailite_vertical).addModel()
            .partialState().with(RotatedPillarBlock.AXIS, Axis.Z)
                .modelForState().modelFile(entrailite_horizontal).rotationX(90).addModel()
            .partialState().with(RotatedPillarBlock.AXIS, Axis.X)
                .modelForState().modelFile(entrailite_horizontal).rotationX(90).rotationY(90).addModel();

        simpleBlockItem(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get(), models().cubeBottomTop("entrailite_crimson_nylium", entrailite_crimson_nylium, entrailite, crimson_nylium));
        getVariantBuilder(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/entrailite_crimson_nylium"), exFileHelper)));

        simpleBlockItem(ModBlocks.ENTRAILITE_WARPED_NYLIUM.get(), models().cubeBottomTop("entrailite_warped_nylium", entrailite_warped_nylium, entrailite, warped_nylium));
        getVariantBuilder(ModBlocks.ENTRAILITE_WARPED_NYLIUM.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/entrailite_warped_nylium"), exFileHelper)));

        simpleBlockItem(ModBlocks.COBBLED_ENTRAILITE.get(), models().cubeAll("cobbled_entrailite", cobbled_entrailite));
        getVariantBuilder(ModBlocks.COBBLED_ENTRAILITE.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/cobbled_entrailite"), exFileHelper)));

        simpleBlockItem(ModBlocks.SMOOTH_ENTRAILITE.get(), models().cubeAll("smooth_entrailite", smooth_entrailite));
        getVariantBuilder(ModBlocks.SMOOTH_ENTRAILITE.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/smooth_entrailite"), exFileHelper)));

        simpleBlockItem(ModBlocks.POLISHED_ENTRAILITE.get(), models().cubeAll("polished_entrailite", polished_entrailite));
        getVariantBuilder(ModBlocks.POLISHED_ENTRAILITE.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/polished_entrailite"), exFileHelper)));

        /* Clay Grass Block */
        simpleBlockItem(ModBlocks.CLAY_GRASS_BLOCK.get(), models().withExistingParent("clay_grass_block", new ResourceLocation("block/grass_block")).texture("bottom", clay).texture("side", clay).renderType("cutout"));
        getVariantBuilder(ModBlocks.CLAY_GRASS_BLOCK.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/clay_grass_block"), exFileHelper)));
    }
    
}