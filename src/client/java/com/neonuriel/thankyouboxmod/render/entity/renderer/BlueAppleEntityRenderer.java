package com.neonuriel.thankyouboxmod.render.entity.renderer;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.entities.BlueAppleEntity;

import com.neonuriel.thankyouboxmod.render.entity.EntityRenderers;
import com.neonuriel.thankyouboxmod.render.entity.model.BlueAppleEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class BlueAppleEntityRenderer
        extends MobEntityRenderer<BlueAppleEntity, LivingEntityRenderState, BlueAppleEntityModel> {
    public BlueAppleEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BlueAppleEntityModel(context.getPart(BlueAppleEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public LivingEntityRenderState createRenderState() {
        return new LivingEntityRenderState();
    }

    @Override
    public Identifier getTexture(LivingEntityRenderState state) {
        return ThankyouBoxMOD.id("textures/entity/blue_apple_mob/blue_apple_mob.png");
    }
}
