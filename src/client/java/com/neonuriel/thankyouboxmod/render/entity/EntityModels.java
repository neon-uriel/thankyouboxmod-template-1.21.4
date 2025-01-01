package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.render.entity.model.*;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class EntityModels {
    
    public static void init() {
        EntityModelLayerRegistry.registerModelLayer(ThankYouBoxEntityModel.LAYER_LOCATION, ThankYouBoxEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(FlyerEntityModel.LAYER_LOCATION, FlyerEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(BlueAppleEntityModel.LAYER_LOCATION, BlueAppleEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(InfpEntityModel.LAYER_LOCATION, InfpEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(IcedTeaEntityModel.LAYER_LOCATION, IcedTeaEntityModel::getTexturedModelData);
    }
}
