package kaisercode.servercraft.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class serverGui extends GuiScreen {
	
	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 88;
	
	public serverGui(EntityPlayer player)
	{

	}
	
	@Override
	public void drawScreen(int x, int y, float f)
	{
		super.drawScreen(x, y, f);
		drawDefaultBackground();
		
		ResourceLocation boxMenu = new ResourceLocation("assets/servercraft/gui/boxMenu.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(boxMenu);

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;

		drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);
	}

}
