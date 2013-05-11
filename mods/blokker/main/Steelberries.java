package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Steelberries extends Item{
	
	public Steelberries(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabFood);

	}
	
	public void registerIcons(IconRegister iconRegister) {
	this.itemIcon = iconRegister.registerIcon("blokker:steelberries"); }
	
}