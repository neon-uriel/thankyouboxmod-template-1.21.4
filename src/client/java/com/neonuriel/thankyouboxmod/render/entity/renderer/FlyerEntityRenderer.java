package com.neonuriel.thankyouboxmod.render.entity.renderer;

import org.joml.Quaternionf;

import com.neonuriel.thankyouboxmod.entities.FlyerEntity;
import com.neonuriel.thankyouboxmod.render.entity.model.FlyerEntityModel;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class FlyerEntityRenderer implements BlockEntityRenderer<FlyerEntity> {
    private final FlyerEntityModel model;

    public FlyerEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.model = new FlyerEntityModel(ctx.getLayerModelPart(FlyerEntityModel.LAYER_LOCATION));
    }

    @Override
    public void render(FlyerEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        matrices.translate(0.5f, 1.6f, 0.5f);
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180));
        this.model.render(matrices, vertexConsumers.getBuffer(RenderLayer.getEntitySolid(FlyerEntityModel.TEXTURE_LOCATION)), light, overlay);
        matrices.pop();
    }
}
