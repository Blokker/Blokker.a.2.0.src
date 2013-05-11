package mods.blokker.main;
/**
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class HalfBlockWoodSlab extends BlockHalfSlab
{
    // The list of the types of step blocks. 
    public static final String[] blockStepTypes = new String[] {"Headstone", "Dirt", "Dirtwall", "Dirtbrick", "Dirtbrickfine", "reet", "Roof", "BrickMossy", "CobbleMossy", "CoalBlock", "Steel_0", "Steel_1", "Glass"};
    @SideOnly(Side.CLIENT)
    private Icon theIcon;

    public HalfBlockWoodSlab(int par1, boolean par2)
    {
        super(par1, par2, Material.rock);
        
    }

    @SideOnly(Side.CLIENT)

     //
     //From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     //
    public Icon getIcon(int par1, int par2)
    {
        int k = par2 & 7;

        if (this.isDoubleSlab && (par2 & 13) != 0)
        {
            par1 = 1;
        }

        return k == 0 ? (par1 != 1 && par1 != 0 ? this.theIcon : this.blockIcon) : 
        	(k == 1 ? Blokker.BlokkerRockBlocks.getIcon(par1, 0) : 
        		(k == 2 ? Block.dirt.getBlockTextureFromSide(1) : 
        			(k == 3 ? Blokker.BlokkerRockBlocks.getIcon(par1, 2) : 
        				(k == 4 ? Blokker.BlokkerRockBlocks.getIcon(par1, 3) : 
        					(k == 5 ? Blokker.Reet.getBlockTextureFromSide(1) : 
        						(k == 6 ? Blokker.BlokkerRockBlocks.getIcon(par1, 7) : 
        							(k == 7 ? Blokker.BlokkerGhostBlocks.getIcon(par1, 6) : 
        								(k == 8 ? Blokker.BlokkerGhostBlocks.getIcon(par1, 7) : 
        									(k == 9 ? Blokker.BlokkerCoal.getBlockTextureFromSide(1) : 
        										(k == 10 ? Blokker.CorrugatedSheetdark.getBlockTextureFromSide(1) : 
        											(k == 11 ? Blokker.CorrugatedSheetlight.getBlockTextureFromSide(1) : 
        												(k == 12 ? Block.glass.getBlockTextureFromSide(1) : 
        								this.blockIcon))))))))))));
    }

    @SideOnly(Side.CLIENT)

     //
     //When this method is called, your block should register all the icons it needs with the given IconRegister. This
     // is the only chance you get to register icons.
     //
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("stoneslab_top");
        this.theIcon = par1IconRegister.registerIcon("stoneslab_side");
    }

     //
     //Returns the ID of the items to drop on destruction.
     //
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Blokker.BlokkerSingleSlab.blockID;
    }

     //
     //Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     //and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     //
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(Blokker.BlokkerSingleSlab.blockID, 2, par1 & 7);
    }

     //k,lmmmmm
     //Returns the slab block name with step type.
     //
    public String getFullSlabName(int par1)
    {
        if (par1 < 0 || par1 >= blockStepTypes.length)
        {
            par1 = 0;
        }

        return super.getUnlocalizedName() + "." + blockStepTypes[par1];
    }

    @SideOnly(Side.CLIENT)

     //
     // returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     //
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        if (par1 != Blokker.BlokkerSingleSlab.blockID)
        {
            for (int j = 0; j <= 12; ++j)
            {
                if (j != 2)
                {
                    par3List.add(new ItemStack(par1, 1, j));

                }
            }
        }
    }
}
*/