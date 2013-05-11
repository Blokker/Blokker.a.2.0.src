package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

	public class ItemGeneralBlokker extends Item
	{
		public ItemGeneralBlokker(int id)
		{
			super(id);
			this.setCreativeTab(CreativeTabs.tabMaterials);
		}

		public void registerIcons(IconRegister par1IconRegister)
		{
        this.itemIcon = par1IconRegister.registerIcon(Blokker.modid + ":" + (this.getUnlocalizedName().substring(5)));
		}
	}