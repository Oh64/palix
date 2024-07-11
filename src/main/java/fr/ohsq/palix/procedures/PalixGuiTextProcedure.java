package fr.ohsq.palix.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import fr.ohsq.palix.PalixMod;

public class PalixGuiTextProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PalixMod.LOGGER.warn("Failed to load dependency entity for procedure PalixGuiText!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				PalixMod.LOGGER.warn("Failed to load dependency guistate for procedure PalixGuiText!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		String TextF = "";
		TextF = "Place Palix Ore";
		if (11 >= new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (1))) {
			TextF = "The Palix slot is full";
		} else if (5 >= ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0)) {
			TextF = "You need 5 xp level";
		}
		{
			TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:TextG");
			if (_tf != null) {
				_tf.setText(TextF);
			}
		}
	}
}
