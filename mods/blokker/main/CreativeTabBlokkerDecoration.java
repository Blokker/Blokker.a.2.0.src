package mods.blokker.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBlokkerDecoration extends CreativeTabs{
	
	CreativeTabBlokkerDecoration(int par1, String par2Str){
		super(par1, par2Str);

	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Block.blockGold.blockID;
	}
	
	public String getTranslatedTabLabel(){
		return "Blokker Dekoration";
	}
	 
}
