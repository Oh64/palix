package fr.ohsq.palix.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import java.util.Map;

import fr.ohsq.palix.PalixMod;

public class DestructblockRedstoneAllumeeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PalixMod.LOGGER.warn("Failed to load dependency world for procedure DestructblockRedstoneAllumee!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PalixMod.LOGGER.warn("Failed to load dependency x for procedure DestructblockRedstoneAllumee!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PalixMod.LOGGER.warn("Failed to load dependency y for procedure DestructblockRedstoneAllumee!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PalixMod.LOGGER.warn("Failed to load dependency z for procedure DestructblockRedstoneAllumee!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 6, Explosion.Mode.DESTROY);
		}
	}
}
