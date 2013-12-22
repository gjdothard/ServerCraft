package kaisercode.servercraft;

import kaisercode.servercraft.items.items;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class SSCH implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		if(item.itemID == items.dustTitanium.itemID){
			player.inventory.addItemStackToInventory(new ItemStack(items.grindstone));
		}
		if(item.itemID == items.wheatFlour.itemID){
			player.inventory.addItemStackToInventory(new ItemStack(items.grindstone));
		}
		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub
		
	}

}
