package kaisercode.servercraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class dustTitanium extends Item {
	public dustTitanium(int id) {
		super(id);
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("dustTitanium");
		setTextureName("ServerCraft:dustTitanium");
	}
}
