package kaisercode.servercraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class wheatFlour extends Item {

	public wheatFlour(int id) {
		super(id);
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("wheatFlour");
		setTextureName("ServerCraft:wheatFlour");
	}

}
