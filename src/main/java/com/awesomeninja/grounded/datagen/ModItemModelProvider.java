package com.awesomeninja.grounded.datagen;

import com.awesomeninja.grounded.item.ModItems;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> entry : ModItems.ITEMS.getEntries()) {
            if (entry.get() instanceof BlockItem blockItem) {
                block(blockItem);
            }
        }
    }

    protected ItemModelBuilder block(BlockItem blockItem) {
        return withExistingParent(blockItem.getDescriptionId(),modid + ":block/" + blockItem.getBlock().getDescriptionId());
    }
    
}
