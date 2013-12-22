package kaisercode.servercraft;
 
import kaisercode.servercraft.blocks.blockTitanium;
import kaisercode.servercraft.blocks.blocks;
import kaisercode.servercraft.blocks.machineServerFrame;
import kaisercode.servercraft.blocks.oreTitaniumOxide;
import kaisercode.servercraft.items.items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
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
        
          
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="kaisercode.servercraft.ClientProxy", serverSide="kaisercode.servercraft.CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	
        }
       
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                // Register the Crafting Handler
                ICraftingHandler scch = new SSCH();
                GameRegistry.registerCraftingHandler(scch);              
                
                blocks.registerBlocks();
                blocks.registerNames();
                items.registerNames();               
                recipes.registerRecipes();
        }

		@EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}

