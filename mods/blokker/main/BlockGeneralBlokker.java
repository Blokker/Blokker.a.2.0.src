package mods.blokker.main;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

	public class BlockGeneralBlokker extends Block
	{
		public BlockGeneralBlokker(int id, Material par2Material)
		{
			super(id, par2Material);
			
			
				
		}

		public void registerIcons(IconRegister par1IconRegister)
		{
        this.blockIcon = par1IconRegister.registerIcon(Blokker.modid + ":" + (this.getUnlocalizedName().substring(5)));
		} 
	    
		
	}

