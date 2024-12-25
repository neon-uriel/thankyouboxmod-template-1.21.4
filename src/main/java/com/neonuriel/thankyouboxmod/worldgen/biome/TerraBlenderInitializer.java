package com.neonuriel.thankyouboxmod.worldgen.biome;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class TerraBlenderInitializer implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        // code to run when TerraBlender is initialized
        Regions.register(new UuumBiome(Identifier.of(ThankyouBoxMOD.MOD_ID, "uuum_biome"), 2));
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, ThankyouBoxMOD.MOD_ID,
                ModSurfaceRuleData.makeRules());
    }
}
