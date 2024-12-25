package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.InfpEntity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.util.Identifier;

public class InfpEntityRenderer extends MobEntityRenderer<InfpEntity, InfpEntityRenderState, InfpEntityModel> {
    public InfpEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new InfpEntityModel(context.getPart(EntityRenderers.MODEL_INFP_LAYER)), 0.5f);
    }

    @Override
    public InfpEntityRenderState createRenderState() {
        return new InfpEntityRenderState();
    }

    @Override
    public Identifier getTexture(InfpEntityRenderState state) {
        return ThankyouBoxMOD.id("textures/entity/infp/infp.png");
    }

    public void updateRenderState(InfpEntity infpEntity, InfpEntityRenderState infpEntityRenderState, float f) {
        super.updateRenderState(infpEntity, infpEntityRenderState, f);
        infpEntityRenderState.idlingAnimationState.copyFrom(infpEntity.idlingAnimationState);
        infpEntityRenderState.attackingAnimationState.copyFrom(infpEntity.attackingAnimationState);
        infpEntityRenderState.walkingAnimationState.copyFrom(infpEntity.walkingAnimationState);

    }

    public void render(InfpEntity entity, InfpEntityRenderState infpEntityRenderState, MatrixStack matrixStack,
            VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        if (entity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        matrixStack.pop();
        super.render(infpEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }
}
