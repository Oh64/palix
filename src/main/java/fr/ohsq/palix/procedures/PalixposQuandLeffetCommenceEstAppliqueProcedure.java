package fr.ohsq.palix.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

import fr.ohsq.palix.PalixMod;

public class PalixposQuandLeffetCommenceEstAppliqueProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PalixMod.LOGGER.warn("Failed to load dependency entity for procedure PalixposQuandLeffetCommenceEstApplique!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			final ItemStack _setstack = new ItemStack(Blocks.DIRT);
			final int _sltid = (int) (1);
			_setstack.setCount((int) 1);
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable) {
					((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
				}
			});
		}
	}
}
