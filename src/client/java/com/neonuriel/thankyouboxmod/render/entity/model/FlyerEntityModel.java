package com.neonuriel.thankyouboxmod.render.entity.model;

import com.neonuriel.thankyouboxmod.ThankyouBoxMOD;

import net.minecraft.client.model.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class FlyerEntityModel extends Model {
	public static final EntityModelLayer LAYER_LOCATION =new EntityModelLayer(ThankyouBoxMOD.id("flyer_entity"), "main");
	public static final Identifier TEXTURE_LOCATION = ThankyouBoxMOD.id("textures/entity/flyer/flyer.png");
	private final ModelPart bone;
	private final ModelPart bone2;
	public FlyerEntityModel(ModelPart root) {
		super(root, RenderLayer::getEntitySolid);

		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(90, 110).cuboid(-13.0F, -16.0F, -7.0F, 12.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-15.0F, -16.0F, -1.0F, 2.0F, 16.0F, 28.0F, new Dilation(0.0F))
		.uv(0, 44).cuboid(-1.0F, -16.0F, -1.0F, 2.0F, 16.0F, 28.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 24.0F, -5.0F));

		ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(0, 88).cuboid(-1.0F, -22.0F, -1.0F, 2.0F, 22.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 28.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(28, 88).cuboid(-1.0F, -16.0F, -1.0F, 2.0F, 16.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(60, 40).cuboid(-2.0F, -13.0F, -1.0F, 2.0F, 12.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(-14.0F, -8.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(60, 0).cuboid(-2.0F, -13.0F, -1.0F, 2.0F, 12.0F, 28.0F, new Dilation(0.0F)), ModelTransform.of(-14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		ModelPartData bone2 = modelPartData.addChild("bone2", ModelPartBuilder.create().uv(60, 80).cuboid(-6.0F, -1.0F, 15.0F, 12.0F, 8.0F, 22.0F, new Dilation(0.0F))
		.uv(56, 110).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 7.0F, -16.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
}
