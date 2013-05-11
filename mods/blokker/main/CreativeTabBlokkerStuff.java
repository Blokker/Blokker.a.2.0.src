package mods.blokker.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBlokkerStuff extends CreativeTabs{
	
	CreativeTabBlokkerStuff(int par1, String par2Str){
		super(par1, par2Str);

	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Block.blockNetherQuartz.blockID;
	}
	
	public String getTranslatedTabLabel(){
		return "Blokker Stuff";
	}
	 
}
