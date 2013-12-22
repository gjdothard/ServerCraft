package kaisercode.servercraft;
 
import kaisercode.servercraft.blocks.machineServerFrame;
import kaisercode.servercraft.blocks.oreTitaniumOxide;
import kaisercode.servercraft.tileentities.TE_Info;
import kaisercode.servercraft.tileentities.TE_Server;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid="ServerCraft", name="Server Craft", version="1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ServerCraft {
 
        // The instance of your mod that Forge uses.
        @Instance("ServerCraft")
        public static ServerCraft instance;
        
        public static Item ingotTitanium;
        public static Block oreTitaniumOxide;
        public static Block machineServerFrame;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="kaisercode.servercraft.ClientProxy", serverSide="kaisercode.servercraft.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	 ingotTitanium = new kaisercode.servercraft.items.ingotTitanium(800)
        	 	.setMaxStackSize(64)
                .setUnlocalizedName("ingotTitanium")
                .setTextureName("servercraft:ingotTitanium");
        	 
        	 oreTitaniumOxide = new oreTitaniumOxide(500, Material.iron);
        	 
        	machineServerFrame = new machineServerFrame(501, Material.iron);
          	
        	
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                GameRegistry.registerBlock(oreTitaniumOxide, "oreTitaniumOxide");
                GameRegistry.registerBlock(machineServerFrame, "machineServerFrame");
                
                GameRegistry.registerTileEntity(TE_Server.class, TE_Info.TE_Server_Key);
                
                LanguageRegistry.addName(ingotTitanium, "Titanium Ingot");
                LanguageRegistry.addName(oreTitaniumOxide, "Titanium Oxide");
                LanguageRegistry.addName(machineServerFrame, "Server Frame");
                
                GameRegistry.addShapelessRecipe(new ItemStack(Block.oreIron), new ItemStack(Item.ingotIron) );
                GameRegistry.addSmelting(oreTitaniumOxide.blockID, new ItemStack(ingotTitanium), 10f);
        }
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}

