package mods.blokker.main;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

	public class ItemBlokkerGhostBlocks extends ItemBlock
	{
		public ItemBlokkerGhostBlocks(int par1)
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
				name = "BlokkerGhost_0";
				break;
			}
			case 1:
			{
				name = "BlokkerGhost_1";
				break;
			}
			case 2:
			{
				name = "BlokkerGhost_2";
				break;
			}
			case 3:
			{
				name = "BlokkerGhost_3";
				break;
			}
			case 4:
			{
				name = "BlokkerGhost_4";
				break;
			}
			case 5:
			{
				name = "BlokkerGhost_5";
				break;
			}
			case 6:
			{
				name = "BlokkerGhost_6";
				break;
			}
			case 7:
			{
				name = "BlokkerGhost_7";
				break;
			}
			case 8:
			{
				name = "BlokkerGhost_8";
				break;
			}
			case 9:
			{
				name = "BlokkerGhost_9";
				break;
			}
			case 10:
			{
				name = "BlokkerGhost_10";
				break;
			}
			case 11:
			{
				name = "BlokkerGhost_11";
				break;
			}
			case 12:
			{
				name = "BlokkerGhost_12";
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