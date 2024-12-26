package com.neonuriel.thankyouboxmod.render.entity.animation;
// Save this class in your mod and generate all required imports

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

/**
 * Made with Blockbench 4.11.2
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * 
 * @author Author
 */

public class InfpEntityAnimations {
	public static final Animation IDLE = Animation.Builder.create(2.0F).looping()
			.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(1.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.875F, AnimationHelper.createTranslationalVector(0.0F, 2.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.8333F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.125F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.SCALE,
					new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.2083F, AnimationHelper.createScalingVector(1.0F, 0.7F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.375F, AnimationHelper.createScalingVector(1.0F, 0.8F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5833F, AnimationHelper.createScalingVector(1.0F, 0.7F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.4583F, AnimationHelper.createScalingVector(1.0F, 0.7F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.9583F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.2083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.8333F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.125F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.SCALE,
					new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.2083F, AnimationHelper.createScalingVector(1.0F, 0.7F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.375F, AnimationHelper.createScalingVector(1.0F, 0.8F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5833F, AnimationHelper.createScalingVector(1.0F, 0.7F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.4583F, AnimationHelper.createScalingVector(1.0F, 0.7F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.9583F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F),
							Transformation.Interpolations.LINEAR)))
			.build();

	public static final Animation ATTACK = Animation.Builder.create(2.0F)
			.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.7083F, AnimationHelper.createRotationalVector(15.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 30.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.875F, AnimationHelper.createRotationalVector(0.0F, -360.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.625F, AnimationHelper.createTranslationalVector(0.0F, 3.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg1", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg1", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.9583F, AnimationHelper.createTranslationalVector(-10.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg0", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg0", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.9583F, AnimationHelper.createTranslationalVector(10.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 360.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 360.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, -4.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.build();

	public static final Animation WALK = Animation.Builder.create(1.0F).looping()
			.addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, -15.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 15.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 1.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg1", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg1", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, -1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg0", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createRotationalVector(45.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createRotationalVector(-45.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("leg0", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, -0.5F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, -1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 2.5F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 2.5F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm0", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.ROTATE,
					new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createRotationalVector(-35.0F, 0.0F, 2.5F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createRotationalVector(35.0F, 0.0F, 2.5F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.addBoneAnimation("arm1", new Transformation(Transformation.Targets.TRANSLATE,
					new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, -1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F),
							Transformation.Interpolations.LINEAR),
					new Keyframe(1.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F),
							Transformation.Interpolations.LINEAR)))
			.build();
}