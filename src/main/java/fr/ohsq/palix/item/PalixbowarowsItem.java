
package fr.ohsq.palix.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import fr.ohsq.palix.itemgroup.PalixongletItemGroup;
import fr.ohsq.palix.PalixModElements;

@PalixModElements.ModElement.Tag
public class PalixbowarowsItem extends PalixModElements.ModElement {
	@ObjectHolder("palix:palix_arows")
	public static final Item block = null;

	public PalixbowarowsItem(PalixModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PalixongletItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("palix_arows");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
