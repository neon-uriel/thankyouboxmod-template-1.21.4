package com.neonuriel.thankyouboxmod.fluid;

import com.google.common.collect.UnmodifiableIterator;
import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import net.minecraft.block.Block;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static FlowableFluid STILL_OIL_FLUID = register("oil_fluid", new OilFluid.Still());
    public static FlowableFluid FLOWING_OIL_FLUID = register("flowing_oil_fluid", new OilFluid.Flowing());
    public static final TagKey<Fluid> OIL = TagKey.of(RegistryKeys.FLUID, Identifier.of(ThankyouBoxMOD.MOD_ID, "oil"));

    private static <T extends Fluid> T register(String id, T value) {
        return (T) (Registry.register(Registries.FLUID, Identifier.of(ThankyouBoxMOD.MOD_ID, id), value));
    }

    public static void initialize() {
    }

    static {
        for (Fluid fluid : Registries.FLUID) {
            UnmodifiableIterator var2 = fluid.getStateManager().getStates().iterator();

            while (var2.hasNext()) {
                FluidState fluidState = (FluidState) var2.next();
                Fluid.STATE_IDS.add(fluidState);
            }
        }

    }
}
