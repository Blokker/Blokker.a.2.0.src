package mods.blokker.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabBlokkerBlocks extends CreativeTabs{
	
	CreativeTabBlokkerBlocks(int par1, String par2Str){
		super(par1, par2Str);

	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Block.blockEmerald.blockID;
	}
	
	public String getTranslatedTabLabel(){
		return "Blokker Blocks";
	}
	 
}
