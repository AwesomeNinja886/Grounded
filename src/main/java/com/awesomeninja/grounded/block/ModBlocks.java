package com.awesomeninja.grounded.block;

import java.util.function.Supplier;

import com.awesomeninja.grounded.Grounded;
import com.awesomeninja.grounded.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Grounded.MODID);

    /* NETHER BLOCKS */

    // Crimson Mud
    public static final RegistryObject<Block> CRIMSON_MUD = registerBlock("crimson_mud", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Polished Crimson Mud
    public static final RegistryObject<Block> POLISHED_CRIMSON_MUD = registerBlock("polished_crimson_mud", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );


    // Warped Loam
    public static final RegistryObject<Block> WARPED_LOAM = registerBlock("warped_loam", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Loam Warped Nylium
    public static final RegistryObject<Block> LOAM_WARPED_NYLIUM = registerBlock("loam_warped_nylium", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Warped Loam Bricks
    public static final RegistryObject<Block> WARPED_LOAM_BRICKS = registerBlock("warped_loam_bricks", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );


    // Entrailite
    public static final RegistryObject<Block> ENTRAILITE = registerBlock("entrailite", 
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Entrailite Crimson Nylium
    public static final RegistryObject<Block> CRIMSON_ENTRAILITE_NYLIUM = registerBlock("crimson_entrailite_nylium", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Entrailite Warped Nylium
    public static final RegistryObject<Block> CRIMSON_WARPED_NYLIUM = registerBlock("crimson_warped_nylium", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Cobbled Entrailite
    public static final RegistryObject<Block> COBBLED_ENTRAILITE = registerBlock("cobbled_entrailite", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Smooth Entrailite
    public static final RegistryObject<Block> SMOOTH_ENTRAILITE = registerBlock("smooth_entrailite", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Layered Entrailite
    public static final RegistryObject<Block> LAYERED_ENTRAILITE = registerBlock("layered_entrailite", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );

    // Layered Entrailite
    public static final RegistryObject<Block> POLISHED_ENTRAILITE = registerBlock("polished_entrailite", 
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)), 
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
    );


    // Creates a new Block with the id "grounded:id". This version of the method creates no item.
    public static final <T extends Block> RegistryObject<T> registerBlock(String id, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(id, block);
        return toReturn;
    }
    // Creates a new Block with the id "grounded:id". This version of the method creates am item and registers it to the creative inventory.
    public static final <T extends Block> RegistryObject<T> registerBlock(String id, Supplier<T> block, Item.Properties pProperties) {
        RegistryObject<T> toReturn = BLOCKS.register(id, block);
        RegistryObject<BlockItem> blockItem = ModItems.ITEMS.register(id, () -> new BlockItem(toReturn.get(), pProperties));
        return toReturn;
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
