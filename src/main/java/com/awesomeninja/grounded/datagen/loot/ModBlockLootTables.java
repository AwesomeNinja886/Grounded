package com.awesomeninja.grounded.datagen.loot;

import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.SMOOTH_NETHERRACK.get());
        this.dropSelf(ModBlocks.POLISHED_NETHERRACK.get());

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
        this.dropSelf(ModBlocks.POLISHED_ENTRAILITE.get());


         this.add(ModBlocks.CLAY_GRASS_BLOCK.get(), (p_124187_) -> {
            return createSingleItemTableWithSilkTouch(p_124187_, Items.CLAY_BALL, ConstantValue.exactly(4.0F));
         });
        
        this.dropSelf(ModBlocks.POLISHED_STONE.get());

        this.dropSelf(ModBlocks.SMOOTH_DEEPSLATE.get());
        
        this.dropSelf(ModBlocks.COBBLED_GRANITE.get());
        this.dropSelf(ModBlocks.SMOOTH_GRANITE.get());
        this.dropSelf(ModBlocks.GRANITE_BRICKS.get());

        this.dropSelf(ModBlocks.PRISMARINE_TILES.get());
        this.dropSelf(ModBlocks.PRISMARINE_PILLAR.get());

        this.dropSelf(ModBlocks.DARK_PRISMARINE_BRICKS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
