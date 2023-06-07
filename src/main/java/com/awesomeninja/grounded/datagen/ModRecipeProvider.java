package com.awesomeninja.grounded.datagen;

import java.util.function.Consumer;

import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }
    
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.POLISHED_CRIMSON_MUD.get())
            .define('M', ModBlocks.CRIMSON_MUD.get())
            .pattern("MM")
            .pattern("MM")
            .unlockedBy("has_crimson_mud", inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.CRIMSON_MUD.get()).build()))
            .save(pFinishedRecipeConsumer);
        
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBBLED_ENTRAILITE.get()), ModBlocks.ENTRAILITE.get().asItem(), 0.1f, 200).unlockedBy("has_cobbled_entrailite", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.COBBLED_ENTRAILITE.get())).save(pFinishedRecipeConsumer);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ENTRAILITE.get()), ModBlocks.SMOOTH_ENTRAILITE.get().asItem(), 0.1f, 200).unlockedBy("has_entrailite", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ENTRAILITE.get())).save(pFinishedRecipeConsumer);
    }
}
