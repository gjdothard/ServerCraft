package kaisercode.servercraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class grindstone extends Item{

	public grindstone(int id) {
		super(id);
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("grindstone");
		setTextureName("ServerCraft:grindstone");
	}

}
