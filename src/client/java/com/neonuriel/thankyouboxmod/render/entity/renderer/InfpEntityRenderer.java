package com.neonuriel.thankyouboxmod.render.entity.renderer;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.InfpEntity;

import com.neonuriel.thankyouboxmod.render.entity.EntityRenderers;
import com.neonuriel.thankyouboxmod.render.entity.state.InfpEntityRenderState;
import com.neonuriel.thankyouboxmod.render.entity.model.InfpEntityModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class InfpEntityRenderer extends MobEntityRenderer<InfpEntity, InfpEntityRenderState, InfpEntityModel> {
    public InfpEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new InfpEntityModel(context.getPart(InfpEntityModel.LAYER_LOCATION)), 0.5f);
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

    @Override
    public void render(InfpEntityRenderState state, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if (state.baby) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(2f, 2f, 2f);
        }
        super.render(state, matrixStack, vertexConsumerProvider, i);
    }

//    public void render(InfpEntity entity, InfpEntityRenderState infpEntityRenderState, MatrixStack matrixStack,
//            VertexConsumerProvider vertexConsumerProvider, int i) {
//        matrixStack.push();
//        if (entity.isBaby()) {
//            matrixStack.scale(0.5f, 0.5f, 0.5f);
//        } else {
//            matrixStack.scale(1f, 1f, 1f);
//        }
//        matrixStack.pop();
//        super.render(infpEntityRenderState, matrixStack, vertexConsumerProvider, i);
//    }
}
