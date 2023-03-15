package com.awesomeninja.grounded.datagen;

import java.util.function.Consumer;

import com.awesomeninja.grounded.block.ModBlocks;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
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
    }
}
