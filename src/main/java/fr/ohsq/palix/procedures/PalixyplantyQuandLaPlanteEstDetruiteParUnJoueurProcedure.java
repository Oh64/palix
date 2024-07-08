package fr.ohsq.palix.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Random;
import java.util.Map;

import fr.ohsq.palix.PalixMod;

public class PalixyplantyQuandLaPlanteEstDetruiteParUnJoueurProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PalixMod.LOGGER.warn("Failed to load dependency entity for procedure PalixyplantyQuandLaPlanteEstDetruiteParUnJoueur!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(Blocks.AIR.asItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem())) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		} else {
			{
				final ItemStack _setstack = new ItemStack(Blocks.AIR);
				final int _sltid = (int) ((MathHelper.nextDouble(new Random(), 1, 27)));
				_setstack.setCount((int) 1);
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 15);
	}
}
