package com.awesomeninja.grounded.datagen;

import java.util.function.Consumer;

import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.POLISHED_NETHERRACK.get()), ModBlocks.SMOOTH_NETHERRACK.get().asItem(), 0.1f, 200).unlockedBy("has_polished_netherrack", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.POLISHED_NETHERRACK.get())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_NETHERRACK.get(), 4)
            .define('#', Blocks.NETHERRACK)
            .pattern("##")
            .pattern("##")
            .unlockedBy("has_netherrack", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.NETHERRACK).build()))
            .save(pFinishedRecipeConsumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_CRIMSON_MUD.get(), 4)
            .define('#', ModBlocks.CRIMSON_MUD.get())
            .pattern("##")
            .pattern("##")
            .unlockedBy("has_crimson_mud", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_MUD.get()).build()))
            .save(pFinishedRecipeConsumer);
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_ENTRAILITE.get()), ModBlocks.ENTRAILITE.get().asItem(), 0.1f, 200).unlockedBy("has_cobbled_entrailite", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.COBBLED_ENTRAILITE.get())).save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ENTRAILITE.get()), ModBlocks.SMOOTH_ENTRAILITE.get().asItem(), 0.1f, 200).unlockedBy("has_entrailite", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENTRAILITE.get())).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_STONE.get(), 4)
            .define('#', Blocks.STONE)
            .pattern("##")
            .pattern("##")
            .unlockedBy("has_stone", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.STONE).build()))
            .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.DEEPSLATE), ModBlocks.SMOOTH_DEEPSLATE.get().asItem(), 0.1f, 200).unlockedBy("has_deepslate", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.DEEPSLATE)).save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.GRANITE_BRICKS.get(), 4)
            .define('#', Blocks.POLISHED_GRANITE)
            .pattern("##")
            .pattern("##")
            .unlockedBy("has_granite", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.GRANITE).build()))
            .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.PRISMARINE_TILES.get(), 4)
            .define('#', Blocks.PRISMARINE_BRICKS)
            .pattern("##")
            .pattern("##")
            .unlockedBy("has_prismarine_bricks", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.PRISMARINE_BRICKS).build()))
            .save(pFinishedRecipeConsumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.PRISMARINE_PILLAR.get(), 2)
            .define('#', Blocks.PRISMARINE_BRICKS)
            .pattern("#")
            .pattern("#")
            .unlockedBy("has_prismarine_bricks", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.PRISMARINE_BRICKS).build()))
            .save(pFinishedRecipeConsumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.DARK_PRISMARINE_BRICKS.get())
            .define('#', Blocks.DARK_PRISMARINE)
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_dark_prismarine", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DARK_PRISMARINE).build()))
            .save(pFinishedRecipeConsumer);
    }
}
