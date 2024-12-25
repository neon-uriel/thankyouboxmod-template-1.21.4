package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.Entities;
import com.neonuriel.thankyouboxmod.render.entity.renderer.FlyerEntityRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class EntityRenderers {

    public static EntityModelLayer MODEL_BLUE_APPLE_LAYER = new EntityModelLayer(ThankyouBoxMOD.id("blue_apple_mob"),
            "main");
    // public static EntityModelLayer MODEL_THANK_YOU_BOX_LAYER = new
    // EntityModelLayer(ThankyouBoxMOD.id("thank_you_box"),"main");
    public static EntityModelLayer MODEL_FLYER_LAYER = new EntityModelLayer(ThankyouBoxMOD.id("flyer_entity"), "main");

    public static void init() {
        EntityRendererRegistry.register(Entities.BLUE_APPLE_MOB, BlueAppleEntityRenderer::new);
        BlockEntityRendererFactories.register(Entities.THANK_YOU_BOX_ENTITY,
                BlockEntityRendererFactory -> new ThankYouBoxRenderer());
        EntityModelLayerRegistry.registerModelLayer(MODEL_BLUE_APPLE_LAYER, BlueAppleEntityModel::getTexturedModelData);
        BlockEntityRendererFactories.register(Entities.FLYER_ENTITY, FlyerEntityRenderer::new);
    }
}
