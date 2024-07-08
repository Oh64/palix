
package fr.ohsq.palix.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import fr.ohsq.palix.itemgroup.PalixongletItemGroup;
import fr.ohsq.palix.PalixModElements;

@PalixModElements.ModElement.Tag
public class PalixMusicItem extends PalixModElements.ModElement {
	@ObjectHolder("palix:palix_music")
	public static final Item block = null;

	public PalixMusicItem(PalixModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, PalixModElements.sounds.get(new ResourceLocation("palix:palix_music")),
					new Item.Properties().group(PalixongletItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("palix_music");
		}
	}
}
