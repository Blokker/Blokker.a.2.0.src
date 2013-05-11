package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;

public class Mithrilshovel extends ItemSpade{

	public Mithrilshovel(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);

	}

	
	public void registerIcons(IconRegister iconRegister) {

	this.itemIcon = iconRegister.registerIcon("blokker:mithrilshovel"); }

	
	
}
