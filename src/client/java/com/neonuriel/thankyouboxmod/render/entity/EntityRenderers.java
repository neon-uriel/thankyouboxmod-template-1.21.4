package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.Entities;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class EntityRenderers {

    public static EntityModelLayer MODEL_BLUE_APPLE_LAYER = new EntityModelLayer(ThankyouBoxMOD.id("blue_apple_mob"), "main");
    
    public static void init() {
        EntityRendererRegistry.register(Entities.BLUE_APPLE_MOB, BlueAppleEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_BLUE_APPLE_LAYER, BlueAppleEntityModel::getTexturedModelData);
    }
}
