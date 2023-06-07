package com.awesomeninja.grounded.datagen.loot;

import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.CRIMSON_MUD.get());
        this.dropSelf(ModBlocks.POLISHED_CRIMSON_MUD.get());

        this.dropSelf(ModBlocks.WARPED_LOAM.get());
        this.dropSelf(ModBlocks.LOAM_WARPED_NYLIUM.get());
        this.dropSelf(ModBlocks.WARPED_LOAM_BRICKS.get());

        this.add(ModBlocks.ENTRAILITE.get(), (p_124187_) -> {
            return createSingleItemTableWithSilkTouch(p_124187_, ModBlocks.COBBLED_ENTRAILITE.get());
         });
        this.dropSelf(ModBlocks.ENTRAILITE_CRIMSON_NYLIUM.get());
        this.dropSelf(ModBlocks.ENTRAILITE_WARPED_NYLIUM.get());
        this.dropSelf(ModBlocks.COBBLED_ENTRAILITE.get());
        this.dropSelf(ModBlocks.SMOOTH_ENTRAILITE.get());
        this.dropSelf(ModBlocks.LAYERED_ENTRAILITE.get());
        this.dropSelf(ModBlocks.POLISHED_ENTRAILITE.get());

        this.add(ModBlocks.CLAY_GRASS_BLOCK.get(), (p_124187_) -> {
            return createSingleItemTableWithSilkTouch(p_124187_, Blocks.CLAY);
         });
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
