package mods.blokker.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCloth;
import net.minecraft.block.BlockCocoa;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockMushroom;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockStem;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import net.minecraftforge.common.FakePlayerFactory;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class BlokkerColorstringItem extends Item
{
    /** List of dye color names */
    public static final String[] ColorstringNames = new String[] {"black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", "lime", "yellow", "lightBlue", "magenta", "orange", "white"};
    public static final String[] ColorstrinIcon = new String[] {"Blokker:colorstring_0", "Blokker:colorstring_1", "Blokker:colorstring_2", "Blokker:colorstring_3", "Blokker:colorstring_4", "Blokker:colorstring_5", "Blokker:colorstring_6", "Blokker:colorstring_7", "Blokker:colorstring_8", "Blokker:colorstring_9", "Blokker:colorstring_10", "Blokker:colorstring_11", "Blokker:colorstring_12", "Blokker:colorstring_13", "Blokker:colorstring_14", "Blokker:colorstring_15"};
    @SideOnly(Side.CLIENT)
    private Icon[] Colorstrings;

    public BlokkerColorstringItem(int par1)
    {
        super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(Blokker.tabBlokkerDecoration);
    }

    @SideOnly(Side.CLIENT)

    /**
     * Gets an icon index based on an item's damage value
     */
    public Icon getIconFromDamage(int par1)
    {
        int j = MathHelper.clamp_int(par1, 0, 15);
        return this.Colorstrings[j];
    }
    
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
        return super.getUnlocalizedName() + "." + ColorstringNames[i];
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int j = 0; j < 16; ++j)
        {
            par3List.add(new ItemStack(par1, 1, j));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.Colorstrings = new Icon[ColorstrinIcon.length];

        for (int i = 0; i < ColorstrinIcon.length; ++i)
        {
            this.Colorstrings[i] = par1IconRegister.registerIcon(ColorstrinIcon[i]);
        }
    }
}