package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.entities.BlueAppleEntity;

import net.minecraft.client.data.Model;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class BlueAppleEntityModel extends EntityModel<LivingEntityRenderState> {

    private final ModelPart base;

    public BlueAppleEntityModel(ModelPart base) {
        super(base, RenderLayer::getEntityCutoutNoCull);
        this.base = base;
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData rootPart = modelData.getRoot();

        rootPart.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create()
                .uv(0, 0)
                .cuboid(-4.0F, 12.0F, -4.0F, 8.0F, 10.0F, 8.0F), ModelTransform.NONE);

        rootPart.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create()
                .uv(0, 20)
                .cuboid(-4.0F, 12.0F, -3.0F, 8.0F, 12.0F, 6.0F), ModelTransform.NONE);

        return TexturedModelData.of(modelData, 64, 32);
    }
}
