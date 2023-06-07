package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Grounded.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /*
        withExistingParent(ModBlocks.CRIMSON_MUD.get().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/block.grounded.crimson_mud"));
        withExistingParent(ModBlocks.POLISHED_CRIMSON_MUD.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.polished_crimson_mud"));

        withExistingParent(ModBlocks.WARPED_LOAM.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.warped_loam"));
        withExistingParent(ModBlocks.LOAM_WARPED_NYLIUM.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.loam_warped_nylium"));
        withExistingParent(ModBlocks.WARPED_LOAM_BRICKS.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.warped_loam_bricks"));

        withExistingParent(ModBlocks.ENTRAILITE.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/entrailite"));
        withExistingParent(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.entrailite_crimson_nylium"));
        withExistingParent(ModBlocks.ENTRAILITE_WARPED_NYLIUM.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.entrailite_warped_nylium"));
        withExistingParent(ModBlocks.COBBLED_ENTRAILITE.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.cobbled_entrailite"));
        withExistingParent(ModBlocks.SMOOTH_ENTRAILITE.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.smooth_entrailite"));
        withExistingParent(ModBlocks.LAYERED_ENTRAILITE.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.layered_entrailite"));
        withExistingParent(ModBlocks.POLISHED_ENTRAILITE.get().getDescriptionId(), new ResourceLocation(Grounded.MODID,"block/block.grounded.polished_entrailite"));
        withExistingParent(ModBlocks.CLAY_GRASS_BLOCK.get().getDescriptionId(), new ResourceLocation(Grounded.MODID, "block/block.grounded.clay_grass_block"));
         */
    }
    
}
