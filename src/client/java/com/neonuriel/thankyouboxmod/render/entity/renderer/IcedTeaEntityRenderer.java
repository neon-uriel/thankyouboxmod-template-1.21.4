package com.neonuriel.thankyouboxmod.render.entity.renderer;

import com.neonuriel.thankyouboxmod.entities.IcedTeaEntity;
import com.neonuriel.thankyouboxmod.render.entity.model.IcedTeaEntityModel;
import com.neonuriel.thankyouboxmod.render.entity.state.IcedTeaEntityRendererState;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class IcedTeaEntityRenderer extends MobEntityRenderer<IcedTeaEntity, IcedTeaEntityRendererState, IcedTeaEntityModel> {
    public IcedTeaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new IcedTeaEntityModel(context.getPart(IcedTeaEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public IcedTeaEntityRendererState createRenderState() {
        return new IcedTeaEntityRendererState();
    }

    @Override
    public Identifier getTexture(IcedTeaEntityRendererState state) {
        return IcedTeaEntityModel.TEXTURE_LOCATION;
    }

    public void render(IcedTeaEntity entity, IcedTeaEntityRendererState icedTeaEntityRenderState, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.pop();
        super.render(icedTeaEntityRenderState, matrixStack, vertexConsumerProvider, i);
    }

}
