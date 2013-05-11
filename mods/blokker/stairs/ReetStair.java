package mods.blokker.stairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class ReetStair extends BlockStairs{

	public ReetStair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
		setStepSound(soundGrassFootstep);
		this.setHardness(1.5F);
		this.setResistance(3.0F);
		this.setLightOpacity(255);
		
	}
	

}