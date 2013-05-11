package mods.blokker.main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

	public class ItemBlokkerColorstring extends Item
	{
		public ItemBlokkerColorstring(int par1)
		{
			super(par1);
			setHasSubtypes(true);
		}

		public String getUnlocalizedName(ItemStack itemstack)
		{
			String name = "";
			switch(itemstack.getItemDamage())
			{
			case 0:
			{name = "white"; break;}
			case 1:
			{name = "orangered"; break;}
			case 2:
			{name = "magenter"; break;}
			case 3:
			{name = "light blue"; break;}
			case 4:
			{name = "yellow"; break;}
			case 5:
			{name = "light green"; break;}
			case 6:
			{name = "rosa"; break;}
			case 7:
			{name = "dark grey"; break;}
			case 8:
			{name = "light grey"; break;}
			case 9:
			{name = "cyan"; break;}
			case 10:
			{name = "purple"; break;}
			case 11:
			{name = "dark blue"; break;}
			case 12:
			{name = "brown"; break;}
			case 13:
			{name = "dark green"; break;}
			case 14:
			{name = "red"; break;}
			case 15:
			{name = "black"; break;}
			default: name = "broken";}
			return getUnlocalizedName() + ":" + name;
		}

		public int getMetadata(int par1)
    {
        return par1;
    }
}