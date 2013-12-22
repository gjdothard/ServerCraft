package kaisercode.servercraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class oreTitaniumOxide extends Block 
{

	        public oreTitaniumOxide (int id, Material material) 
	        {
	                super(id, material);
	        		setCreativeTab(CreativeTabs.tabBlock);
	        		setHardness(4F);
	             	setStepSound(Block.soundStoneFootstep);
	             	setUnlocalizedName("oreTitaniumOxide");
	             	setTextureName("servercraft:oreTitaniumOxide");
	        }

	}
