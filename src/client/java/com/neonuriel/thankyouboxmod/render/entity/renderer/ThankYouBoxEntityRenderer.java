package com.neonuriel.thankyouboxmod.render.entity.renderer;

import com.neonuriel.thankyouboxmod.entities.ThankYouBoxEntity;
import com.neonuriel.thankyouboxmod.render.entity.model.ThankYouBoxEntityModel;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;

public class ThankYouBoxEntityRenderer implements BlockEntityRenderer<ThankYouBoxEntity> {
    private final ThankYouBoxEntityModel model;

    public ThankYouBoxEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.model = new ThankYouBoxEntityModel(ctx.getLayerModelPart(ThankYouBoxEntityModel.LAYER_LOCATION));
    }
    
    @Override
    public void render(ThankYouBoxEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        matrices.translate(0.5f, 1.6f, 0.5f);
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180));
        this.model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntitySolid(ThankYouBoxEntityModel.TEXTURE_LOCATION)), light, overlay);
        matrices.pop();
    }
}
