package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diamondform extends Item{
	
	public Diamondform(int par1) {
		super(par1);
		setMaxStackSize(32);
		setCreativeTab(CreativeTabs.tabMaterials);

	}
	
	public void registerIcons(IconRegister iconRegister) {

	this.itemIcon = iconRegister.registerIcon("blokker:diamondform"); }
	
	
	
}