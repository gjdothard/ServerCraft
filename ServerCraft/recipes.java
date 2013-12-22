package kaisercode.servercraft;

import kaisercode.servercraft.blocks.blocks;
import kaisercode.servercraft.blocks.machineServerFrame;
import kaisercode.servercraft.blocks.oreTitaniumOxide;
import kaisercode.servercraft.items.items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class recipes {
	public static void registerRecipes()
	{
        GameRegistry.addShapelessRecipe(new ItemStack(items.dustTitanium, 2), new ItemStack(items.grindstone), new ItemStack(blocks.oreTitaniumOxide));
        GameRegistry.addShapelessRecipe(new ItemStack(items.wheatFlour), new ItemStack(items.grindstone), new ItemStack(Item.wheat));
        
        GameRegistry.addRecipe(new ItemStack(items.grindstone), " x ","xyx"," x ",'x', Item.flint, 'y', Block.stone);
        
        GameRegistry.addSmelting(blocks.oreTitaniumOxide.blockID, new ItemStack(items.ingotTitanium), 10f);
        GameRegistry.addSmelting(items.dustTitanium.itemID, new ItemStack(items.ingotTitanium), 10f);
        GameRegistry.addSmelting(items.wheatFlour.itemID, new ItemStack(Item.bread), 10f);
	}
}
