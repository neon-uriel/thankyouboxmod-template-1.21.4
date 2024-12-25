package com.neonuriel.thankyouboxmod.render.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.BlockDisplayEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class ThankYouBoxModel extends EntityModel<BlockDisplayEntityRenderState> {
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;

	public ThankYouBoxModel(ModelPart root) {
		super(root, RenderLayer::getEntitySolid);
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bone = modelPartData.addChild("bone",
				ModelPartBuilder.create().uv(32, 28).cuboid(6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
						.uv(36, 28).cuboid(-7.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
						.uv(40, 28).cuboid(-7.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
						.uv(44, 28).cuboid(6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bone2 = modelPartData.addChild("bone2",
				ModelPartBuilder.create().uv(0, 37).cuboid(6.0F, -14.0F, -5.0F, 1.0F, 5.0F, 8.0F, new Dilation(0.0F))
						.uv(18, 37).cuboid(-7.0F, -14.0F, -5.0F, 1.0F, 5.0F, 8.0F, new Dilation(0.0F))
						.uv(26, 31).cuboid(-6.0F, -14.0F, -5.0F, 12.0F, 5.0F, 1.0F, new Dilation(0.0F))
						.uv(0, 0).cuboid(-7.0F, -9.0F, -5.0F, 14.0F, 8.0F, 10.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bone3 = modelPartData.addChild("bone3", ModelPartBuilder.create(),
				ModelTransform.pivot(0.0F, 10.0F, 4.0F));

		ModelPartData cube_r1 = bone3.addChild("cube_r1",
				ModelPartBuilder.create().uv(1, 32).cuboid(-6.0F, -17.0F, 3.0F, 12.0F, 5.0F, 0.0F, new Dilation(0.0F)),
				ModelTransform.of(0.0F, 16.8637F, 0.0353F, 0.2618F, 0.0F, 0.0F));

		ModelPartData bone4 = modelPartData.addChild("bone4",
				ModelPartBuilder.create().uv(0, 28).cuboid(-7.0F, -10.0F, 3.0F, 14.0F, 1.0F, 2.0F, new Dilation(0.0F))
						.uv(0, 18).cuboid(-7.0F, -15.0F, -5.0F, 14.0F, 1.0F, 9.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bone5 = modelPartData.addChild("bone5", ModelPartBuilder.create(),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r2 = bone5.addChild("cube_r2",
				ModelPartBuilder.create().uv(36, 44).cuboid(-1.0F, -17.0F, 3.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
						.uv(46, 18).cuboid(-7.0F, -17.0F, 3.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
						.uv(44, 44).cuboid(6.0F, -17.0F, 3.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)),
				ModelTransform.of(0.0F, 3.0F, 3.0F, 0.2618F, 0.0F, 0.0F));

		ModelPartData bone6 = modelPartData.addChild("bone6",
				ModelPartBuilder.create().uv(36, 37).cuboid(2.0F, -18.0F, -1.0F, 4.0F, 3.0F, 4.0F, new Dilation(0.0F)),
				ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	
    
}