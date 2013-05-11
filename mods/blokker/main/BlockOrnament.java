package mods.blokker.main;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;


public class BlockOrnament extends Block{

	public BlockOrnament(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(Blokker.tabBlokkerBlocks);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
	        this.blockIcon = iconRegister.registerIcon("blokker:ornament");
	}

}
