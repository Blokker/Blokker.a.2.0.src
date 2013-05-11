package mods.blokker.stairs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class glassStair extends BlockStairs{

	public glassStair(int par1, Block par2Block, int par3) {
		super(par1, par2Block, par3);
	setStepSound(soundGlassFootstep);
	
	}
	
	public int quantityDropped(Random par1Random)
    {
        return 0;
    }
	 
    public int getRenderBlockPass()
    {
        return 0;
    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }
}