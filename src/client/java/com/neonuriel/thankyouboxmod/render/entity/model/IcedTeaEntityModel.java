package com.neonuriel.thankyouboxmod.render.entity.model;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;
import com.neonuriel.thankyouboxmod.render.entity.animation.IcedTeaEntityAnimations;
import com.neonuriel.thankyouboxmod.render.entity.animation.InfpEntityAnimations;
import com.neonuriel.thankyouboxmod.render.entity.state.IcedTeaEntityRendererState;
import com.neonuriel.thankyouboxmod.render.entity.state.InfpEntityRenderState;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class IcedTeaEntityModel extends EntityModel<IcedTeaEntityRendererState> {
	public static final EntityModelLayer LAYER_LOCATION =new EntityModelLayer(ThankyouBoxMOD.id("iced_tea_mob"), "main");
	public static final Identifier TEXTURE_LOCATION = ThankyouBoxMOD.id("textures/entity/iced_tea/iced_tea.png");

	private final ModelPart bone6;
	private final ModelPart bone5;
	private final ModelPart bone4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone;
	public IcedTeaEntityModel(ModelPart root) {
		super(root.getChild("root"));
		this.bone6 = this.root.getChild("bone6");
		this.bone5 = this.bone6.getChild("bone5");
		this.bone4 = this.bone6.getChild("bone4");
		this.bone2 = this.bone6.getChild("bone2");
		this.bone3 = this.bone6.getChild("bone3");
		this.bone = this.bone6.getChild("bone");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData modelPartData2 = modelPartData.addChild("root", ModelPartBuilder.create(),
				ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone6 = modelPartData2.addChild("bone6", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bone5 = bone6.addChild("bone5", ModelPartBuilder.create().uv(13, 71).cuboid(-1.0F, 5.0F, -3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(37, 71).cuboid(0.0F, 1.0F, -2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -6.0F, -2.0F));

		ModelPartData cube_r1 = bone5.addChild("cube_r1", ModelPartBuilder.create().uv(65, 67).cuboid(-0.6F, 1.0F, -2.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		ModelPartData bone4 = bone6.addChild("bone4", ModelPartBuilder.create().uv(63, 70).cuboid(-3.0F, 5.0F, -2.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(22, 71).cuboid(-2.0F, 1.0F, -2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -6.0F, 5.0F));

		ModelPartData cube_r2 = bone4.addChild("cube_r2", ModelPartBuilder.create().uv(54, 67).cuboid(-0.6F, 1.0F, -2.5F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		ModelPartData bone2 = bone6.addChild("bone2", ModelPartBuilder.create().uv(69, 63).cuboid(-1.0F, 5.0F, -3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(27, 71).cuboid(-1.0F, 1.0F, -2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -6.0F, -2.0F));

		ModelPartData cube_r3 = bone2.addChild("cube_r3", ModelPartBuilder.create().uv(67, 22).cuboid(-3.4F, 1.0F, -2.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.5672F, 0.0F));

		ModelPartData bone3 = bone6.addChild("bone3", ModelPartBuilder.create().uv(54, 70).cuboid(1.0F, 5.0F, -2.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(32, 71).cuboid(1.0F, 1.0F, -2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -6.0F, 5.0F));

		ModelPartData cube_r4 = bone3.addChild("cube_r4", ModelPartBuilder.create().uv(67, 19).cuboid(-3.4F, 1.0F, -2.5F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, 0.0F));

		ModelPartData bone = bone6.addChild("bone", ModelPartBuilder.create().uv(60, 4).cuboid(-6.0F, 8.0F, 2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(66, 47).cuboid(-6.0F, 6.0F, 1.0F, 5.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 62).cuboid(-7.0F, 6.0F, 1.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(65, 42).cuboid(-7.0F, 6.0F, 6.0F, 5.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(61, 26).cuboid(-2.0F, 6.0F, 2.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(51, 50).cuboid(-1.0F, 4.0F, 1.0F, 1.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 58).cuboid(-8.0F, 4.0F, 1.0F, 1.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(46, 11).cuboid(-8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(54, 63).cuboid(-7.0F, 4.0F, 7.0F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 38).cuboid(-7.0F, 4.0F, 0.0F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(63, 10).cuboid(-8.0F, 3.0F, 0.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 49).cuboid(-1.0F, 3.0F, 0.0F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(61, 35).cuboid(-7.0F, 3.0F, 7.0F, 7.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 0).cuboid(-8.0F, 1.0F, 8.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 27).cuboid(0.0F, 1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(57, 59).cuboid(-8.0F, 1.0F, -1.0F, 8.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 0).cuboid(-9.0F, 1.0F, 0.0F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(42, 44).cuboid(-9.0F, -4.0F, -2.0F, 10.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 12).cuboid(1.0F, -4.0F, -1.0F, 1.0F, 4.0F, 10.0F, new Dilation(0.0F))
		.uv(42, 38).cuboid(-9.0F, -4.0F, 9.0F, 10.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-10.0F, -4.0F, -1.0F, 1.0F, 4.0F, 10.0F, new Dilation(0.0F))
		.uv(46, 23).cuboid(-8.0F, 0.0F, -1.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(21, 27).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 27).cuboid(-9.0F, 0.0F, -1.0F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(46, 20).cuboid(-9.0F, 0.0F, 8.0F, 9.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-9.0F, -1.0F, -1.0F, 10.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -12.0F, -4.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(IcedTeaEntityRendererState state) {
		super.setAngles(state);
		this.setBodyAngles(state.bodyYaw, state.pitch);
		this.animateWalking(IcedTeaEntityAnimations.WALK, state.limbFrequency, state.limbAmplitudeMultiplier, 1f, 2f);
	}

	private void setBodyAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.bone6.yaw = headYaw * 0.017453292F;
		this.bone6.pitch = headPitch * 0.017453292F;
	}
}