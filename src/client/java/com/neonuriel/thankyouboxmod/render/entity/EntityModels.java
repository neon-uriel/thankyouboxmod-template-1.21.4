package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.render.entity.model.FlyerEntityModel;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class EntityModels {
        public static void init() {
        EntityModelLayerRegistry.registerModelLayer(FlyerEntityModel.LAYER_LOCATION, FlyerEntityModel::getTexturedModelData);
    }
}
