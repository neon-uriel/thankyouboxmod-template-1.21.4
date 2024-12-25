package com.neonuriel.thankyouboxmod.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;

@Environment(EnvType.CLIENT)
public class InfpEntityRenderState extends LivingEntityRenderState {
    public final AnimationState idlingAnimationState = new AnimationState();
    public final AnimationState attackingAnimationState = new AnimationState();
    public final AnimationState walkingAnimationState = new AnimationState();

    public InfpEntityRenderState() {
    }
}
