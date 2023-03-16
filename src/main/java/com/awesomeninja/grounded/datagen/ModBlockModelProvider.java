package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockModelProvider extends BlockModelProvider {

    public ModBlockModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        cubeAll(ModBlocks.CRIMSON_MUD.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/crimson_mud/crimson_mud"));
        cubeAll(ModBlocks.POLISHED_CRIMSON_MUD.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/crimson_mud/polished_crimson_mud"));

        cubeAll(ModBlocks.WARPED_LOAM.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/warped_loam/warped_loam"));
        // TODO: Loam Warped Nylium
        cubeAll(ModBlocks.WARPED_LOAM_BRICKS.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/warped_loam/warped_loam_bricks"));

        // TODO: Entrailite
        // TODO: Entrailite Crimson Nylium
        // TODO: Entrailite Warped Nylium
        cubeAll(ModBlocks.COBBLED_ENTRAILITE.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/entrailite/cobbled_entrailite"));
        cubeAll(ModBlocks.SMOOTH_ENTRAILITE.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/entrailite/entrailite_top"));
        cubeAll(ModBlocks.LAYERED_ENTRAILITE.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/entrailite/entrailite"));
        cubeAll(ModBlocks.POLISHED_ENTRAILITE.get().asItem().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/entrailite/polished_entrailite"));
    }
    
}
