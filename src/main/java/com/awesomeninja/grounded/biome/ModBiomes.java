package com.awesomeninja.grounded.biome;

import com.awesomeninja.grounded.Grounded;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes {
    public static DeferredRegister<Biome> BIOMES = DeferredRegister.create(Registry.BIOME_REGISTRY, Grounded.MODID);

    

    /**
     * Creates the ResourceKey for a biome. This will be referenced in other files, but should not be confused with the biome itself.
     */
    public static ResourceKey<Biome> registerBiomeKey(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Grounded.MODID, name));
    }

    /**
     * Registers a biome given a ResourceKey and a Biome supplier.
     */
    public static RegistryObject<Biome> registerBiome(ResourceKey<Biome> key, Supplier<Biome> biomeSupplier)
    {
        return BIOMES.register(key.location().getPath(), biomeSupplier);
    }

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}
