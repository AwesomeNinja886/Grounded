package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.core.Direction.Axis;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.RotatedPillarBlock;
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

        /* Netherrack */
        ResourceLocation polished_netherrack = new ResourceLocation(Grounded.MODID, "block/nether/netherrack/polished_netherrack");

        simpleBlockItem(ModBlocks.POLISHED_NETHERRACK.get(), models().cubeAll("polished_netherrack", polished_netherrack));
        getVariantBuilder(ModBlocks.POLISHED_NETHERRACK.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/polished_netherrack"), exFileHelper)));

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

        /* Stone */
        ResourceLocation polished_stone = new ResourceLocation(Grounded.MODID, "block/overworld/stone/polished_stone");

        simpleBlockItem(ModBlocks.POLISHED_STONE.get(), models().cubeAll("polished_stone", polished_stone));
        getVariantBuilder(ModBlocks.POLISHED_STONE.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/polished_stone"), exFileHelper)));

        /* Deepslate */
        ResourceLocation smooth_deepslate = new ResourceLocation(Grounded.MODID, "block/overworld/deepslate/smooth_deepslate");

        simpleBlockItem(ModBlocks.SMOOTH_DEEPSLATE.get(), models().cubeAll("smooth_deepslate", smooth_deepslate));
        getVariantBuilder(ModBlocks.SMOOTH_DEEPSLATE.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/smooth_deepslate"), exFileHelper)));

        /* Granite */
        ResourceLocation granite_bricks = new ResourceLocation(Grounded.MODID, "block/overworld/granite/granite_bricks");

        simpleBlockItem(ModBlocks.GRANITE_BRICKS.get(), models().cubeAll("granite_bricks", granite_bricks));
        getVariantBuilder(ModBlocks.GRANITE_BRICKS.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/granite_bricks"), exFileHelper)));

        /* Prismarine */
        ResourceLocation prismarine_tiles = new ResourceLocation(Grounded.MODID, "block/overworld/prismarine/prismarine_tiles");
        ResourceLocation prismarine_pillar_side = new ResourceLocation(Grounded.MODID, "block/overworld/prismarine/prismarine_pillar_side");
        ResourceLocation prismarine_pillar_top = new ResourceLocation(Grounded.MODID, "block/overworld/prismarine/prismarine_pillar_top");

        ModelFile prismarine_pillar_vertical = models().cubeColumn("prismarine_pillar", prismarine_pillar_side, prismarine_pillar_top);
        ModelFile prismarine_pillar_horizontal = models().cubeColumnHorizontal("prismarine_pillar_horizontal", prismarine_pillar_side, prismarine_pillar_top);

        simpleBlockItem(ModBlocks.PRISMARINE_TILES.get(), models().cubeAll("prismarine_tiles", prismarine_tiles));
        getVariantBuilder(ModBlocks.PRISMARINE_TILES.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/prismarine_tiles"), exFileHelper)));

        simpleBlockItem(ModBlocks.PRISMARINE_PILLAR.get(), prismarine_pillar_vertical);
        getVariantBuilder(ModBlocks.PRISMARINE_PILLAR.get())
            .partialState().with(RotatedPillarBlock.AXIS, Axis.Y)
                .modelForState().modelFile(prismarine_pillar_vertical).addModel()
            .partialState().with(RotatedPillarBlock.AXIS, Axis.Z)
                .modelForState().modelFile(prismarine_pillar_horizontal).rotationX(90).addModel()
            .partialState().with(RotatedPillarBlock.AXIS, Axis.X)
                .modelForState().modelFile(prismarine_pillar_horizontal).rotationX(90).rotationY(90).addModel();

        /* Granite */
        ResourceLocation dark_prismarine_bricks = new ResourceLocation(Grounded.MODID, "block/overworld/prismarine/dark_prismarine_bricks");

        simpleBlockItem(ModBlocks.DARK_PRISMARINE_BRICKS.get(), models().cubeAll("dark_prismarine_bricks", dark_prismarine_bricks));
        getVariantBuilder(ModBlocks.DARK_PRISMARINE_BRICKS.get()).partialState().setModels(new ConfiguredModel(new ModelFile.ExistingModelFile(new ResourceLocation(Grounded.MODID, "block/dark_prismarine_bricks"), exFileHelper)));
    }
    
}