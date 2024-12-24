package com.neonuriel.thankyouboxmod.render.entity.renderer;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.ThankYouBoxEntity;
import com.neonuriel.thankyouboxmod.render.entity.EntityRenderers;
import com.neonuriel.thankyouboxmod.render.entity.model.ThankYouBoxEntityModel;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class ThankYouBoxEntityBER extends MobEntityRenderer<ThankYouBoxEntity, LivingEntityRenderState, ThankYouBoxEntityModel> {
    public ThankYouBoxEntityBER(EntityRendererFactory.Context context) {
        super(context, new ThankYouBoxEntityModel(context.getPart(EntityRenderers.MODEL_THANK_YOU_BOX_LAYER)), 0.5f);
    }
    
    @Override
    public LivingEntityRenderState createRenderState() {
        return new LivingEntityRenderState();
    }


    @Override
    public Identifier getTexture(LivingEntityRenderState state) {
        return ThankyouBoxMOD.id("textures/entity/thank_you_box/thank_you_box.png");
    }
}
