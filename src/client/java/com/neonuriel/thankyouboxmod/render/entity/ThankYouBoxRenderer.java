package com.neonuriel.thankyouboxmod.render.entity;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.ThankYouBoxEntity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ThankYouBoxRenderer implements BlockEntityRenderer<ThankYouBoxEntity> {
    // private static final Identifier THANK_YOU_BOX_TEXTURE =
    // Identifier.of(ThankyouBoxMOD.MOD_ID,
    // "textures/entity/thank_you_box/thank_you_box.png");
    // public static final SpriteIdentifier THANK_YOU_BOX_TEXTURE = new
    // SpriteIdentifier(
    // SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE,
    // Identifier.of(ThankyouBoxMOD.MOD_ID,
    // "entity/thank_you_box/thank_you_box.png"));
    SpriteIdentifier THANK_YOU_BOX_TEXTURE = new SpriteIdentifier(
            Identifier.of(ThankyouBoxMOD.MOD_ID, "textures/atlas/blocks.png"), Identifier.of(ThankyouBoxMOD.MOD_ID,
                    "textures/entity/thank_you_box/thank_you_box.png"));
    // private final ThankYouBoxModel thankYouBoxBody;

    // public ThankYouBoxRenderer(BlockEntityRendererFactory.Context context) {
    // // this.thankYouBoxBody = new ThankYouBoxModel(
    // // context.getLayerModelPart(EntityRenderers.MODEL_THANK_YOU_BOX_LAYER));
    // }

    public void render(ThankYouBoxEntity thankYouBoxEntity, float f, MatrixStack matrixStack,
            VertexConsumerProvider vertexConsumerProvider, int i, int j) {

        // VertexConsumer vertexConsumer =
        // this.THANK_YOU_BOX_TEXTURE.getVertexConsumer(vertexConsumerProvider,
        // RenderLayer::getEntitySolid);
        // this.thankYouBoxBody.render(matrixStack, vertexConsumer, i, j);
        // }
    }
}
