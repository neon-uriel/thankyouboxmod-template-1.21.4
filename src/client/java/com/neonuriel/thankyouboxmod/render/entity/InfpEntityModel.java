package com.neonuriel.thankyouboxmod.render.entity;
// Made with Blockbench 4.11.2

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.util.math.MathHelper;


// EntityModel<LivingEntityRenderState>

@Environment(EnvType.CLIENT)
public class InfpEntityModel extends EntityModel<InfpEntityRenderState>{
	private final ModelPart body;
	private final ModelPart arm0;
	private final ModelPart arm1;
	private final ModelPart leg0;
	private final ModelPart leg1;

	public InfpEntityModel(ModelPart root) {
		super(root.getChild("root"));
		this.body = this.root.getChild("body");
		this.arm0 = this.body.getChild("arm0");
		this.arm1 = this.body.getChild("arm1");
		this.leg0 = this.body.getChild("leg0");
		this.leg1 = this.body.getChild("leg1");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData modelPartData2 = modelPartData.addChild("root", ModelPartBuilder.create(),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		ModelPartData body = modelPartData2.addChild("body",
				ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, -16.0F, -1.0F, 14.0F, 15.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData arm0 = body.addChild("arm0",
				ModelPartBuilder.create().uv(6, 1).cuboid(-2.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)),
				ModelTransform.pivot(-7.0F, -14.0F, 0.0F));

		ModelPartData arm1 = body.addChild("arm1",
				ModelPartBuilder.create().uv(6, 1).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F)),
				ModelTransform.pivot(7.0F, -14.0F, 0.0F));

		ModelPartData leg0 = body.addChild("leg0",
				ModelPartBuilder.create().uv(8, 17).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.pivot(-5.0F, -1.0F, 0.0F));

		ModelPartData leg1 = body.addChild("leg1",
				ModelPartBuilder.create().uv(0, 17).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.pivot(5.0F, -1.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	public void setAngles(InfpEntityRenderState state) {
		super.setAngles(state);
		this.setBodyAngles(state.bodyYaw, state.pitch);
		this.animateWalking(InfpEntityAnimations.WALK, state.limbFrequency, state.limbAmplitudeMultiplier, 1f, 2f);
		this.animate(state.idlingAnimationState, InfpEntityAnimations.IDLE, state.age);
	}

	private void setBodyAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.body.yaw = headYaw * 0.017453292F;
		this.body.pitch = headPitch * 0.017453292F;
	}

}