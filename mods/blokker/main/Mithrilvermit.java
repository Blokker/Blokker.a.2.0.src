package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Mithrilvermit extends Item{
	
	public Mithrilvermit(int par1) {
		super(par1);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);

	}
	
	public void registerIcons(IconRegister iconRegister) {

	this.itemIcon = iconRegister.registerIcon("blokker:Mithrilvermit"); }

}
