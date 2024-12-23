package com.neonuriel.thankyouboxmod.render.entity.renderer;

import com.neonuriel.thankyouboxmod.entities.ThankYouBoxEntity;
import com.neonuriel.thankyouboxmod.render.entity.model.ThankYouBoxEntityModel;

import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;

public class ThankYouBoxEntityBER implements BlockEntityRenderer<ThankYouBoxEntity> {
    private final ThankYouBoxEntityModel model;

    public ThankYouBoxEntityBER(BlockEntityRendererFactory.Context ctx) {
        this.model = new ThankYouBoxEntityModel(ctx.getLayerModelPart(ThankYouBoxEntityModel.LAYER_LOCATION));
    }
    
    @Override
    public void render(ThankYouBoxEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        this.model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntitySolid(ThankYouBoxEntityModel.TEXTURE_LOCATION)), light, overlay);
        matrices.pop();
    }
}
