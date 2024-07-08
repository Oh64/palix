
package fr.ohsq.palix.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import fr.ohsq.palix.entity.TanglerEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TanglerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TanglerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelTangler(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("palix:textures/tangler.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelTangler extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;

		public ModelTangler() {
			textureWidth = 128;
			textureHeight = 128;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-8.0F, -24.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(40, 45).addBox(-20.0F, -19.0F, -8.0F, 12.0F, 13.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 32).addBox(8.0F, -19.0F, -8.0F, 12.0F, 13.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(22, 74).addBox(-11.0F, -22.0F, -8.0F, 3.0F, 3.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 61).addBox(8.0F, -22.0F, -8.0F, 3.0F, 3.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 80).addBox(8.0F, -23.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(78, 75).addBox(11.0F, -20.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(60, 74).addBox(-12.0F, -20.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(64, 0).addBox(-9.0F, -23.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			bb_main.setTextureOffset(31, 94).addBox(9.0F, -14.0F, 8.0F, 10.0F, 9.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(82, 0).addBox(10.0F, -13.0F, 11.0F, 8.0F, 11.0F, 5.0F, 0.0F, false);
			bb_main.setTextureOffset(80, 43).addBox(-18.0F, -13.0F, 11.0F, 8.0F, 11.0F, 5.0F, 0.0F, false);
			bb_main.setTextureOffset(83, 92).addBox(-19.0F, -14.0F, 8.0F, 10.0F, 9.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(50, 18).addBox(-28.0F, -25.0F, -7.0F, 14.0F, 11.0F, 14.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, -3.1416F, 0.0F, 3.1416F);
			cube_r1.setTextureOffset(48, 0).addBox(-18.0F, -13.0F, 11.0F, 8.0F, 11.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(92, 17).addBox(-19.0F, -14.0F, 8.0F, 10.0F, 9.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(57, 92).addBox(9.0F, -14.0F, 8.0F, 10.0F, 9.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(44, 74).addBox(10.0F, -13.0F, 11.0F, 8.0F, 11.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
