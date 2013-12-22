package kaisercode.servercraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import kaisercode.servercraft.ServerCraft;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class blocks {
	
		//Add Blocks
		public static Block oreTitaniumOxide = new oreTitaniumOxide(500, Material.rock);       	 
		public static Block machineServerFrame = new machineServerFrame(501, Material.iron);        	
		public static Block blockTitanium = new blockTitanium(502, Material.iron);
	
	public static void registerBlocks()
	{
		//Register Blocks
        GameRegistry.registerBlock(blocks.oreTitaniumOxide, "oreTitaniumOxide");
        GameRegistry.registerBlock(blocks.machineServerFrame, "machineServerFrame");
        GameRegistry.registerBlock(blocks.blockTitanium, "blockTitanium");
	}
	
	public static void registerNames()
	{
		//Register Block Names
        LanguageRegistry.addName(oreTitaniumOxide, "Titanium Oxide");
        LanguageRegistry.addName(machineServerFrame, "Server Frame");
        LanguageRegistry.addName(blockTitanium, "Titanium Block");
	}
}
