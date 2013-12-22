package kaisercode.servercraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockTitanium extends Block 
{

	        public blockTitanium (int id, Material material) 
	        {
	                super(id, material);
	        		setCreativeTab(CreativeTabs.tabBlock);
	        		setHardness(4F);
	             	setStepSound(Block.soundMetalFootstep);
	             	setUnlocalizedName("blockTitanium");
	             	setTextureName("servercraft:blockTitanium");
	        }

	}