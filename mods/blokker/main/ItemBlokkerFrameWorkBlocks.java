package mods.blokker.main;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

	public class ItemBlokkerFrameWorkBlocks extends ItemBlock
	{
		public ItemBlokkerFrameWorkBlocks(int par1)
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
			{
				name = "BlokkerFrameWork_0";
				break;
			}
			case 1:
			{
				name = "BlokkerFrameWork_1";
				break;
			}
			case 2:
			{
				name = "BlokkerFrameWork_2";
				break;
			}
			case 3:
			{
				name = "BlokkerFrameWork_3";
				break;
			}
			case 4:
			{
				name = "BlokkerFrameWork_4";
				break;
			}
			case 5:
			{
				name = "BlokkerFrameWork_5";
				break;
			}
			case 6:
			{
				name = "BlokkerFrameWork_6";
				break;
			}
			default: name = "broken";
			}
			return getUnlocalizedName() + ":" + name;
		}

		public int getMetadata(int par1)
    {
        return par1;
    }
}