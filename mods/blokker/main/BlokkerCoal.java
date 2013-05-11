package mods.blokker.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlokkerCoal extends Block{

	public BlokkerCoal(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(Blokker.tabBlokkerBlocks);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
	        this.blockIcon = iconRegister.registerIcon("blokker:blockCoal");
	}

}
