package kaisercode.servercraft.items;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class items {
	

	public static final Item ingotTitanium = new kaisercode.servercraft.items.ingotTitanium(800);
	public static final Item dustTitanium  = new kaisercode.servercraft.items.dustTitanium(801);
	public static final Item grindstone = new kaisercode.servercraft.items.grindstone(802);
	public static final Item wheatFlour = new kaisercode.servercraft.items.wheatFlour(803);

	
	public static void registerNames()
	{
		//Register Item Names
        LanguageRegistry.addName(ingotTitanium, "Titanium Ingot");
        LanguageRegistry.addName(dustTitanium, "Titanium Dust");
        LanguageRegistry.addName(grindstone, "Grindstone");
        LanguageRegistry.addName(wheatFlour, "Wheat Flour");
	}
}
