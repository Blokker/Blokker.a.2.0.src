package mods.blokker.main;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

	public class ItemBlokkerRockBlocks extends ItemBlock
	{
		public ItemBlokkerRockBlocks(int par1)
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
				name = "Headstone";
				break;
			}
			case 1:
			{
				name = "Dirtwall";
				break;
			}
			case 2:
			{
				name = "Dirtbrick";
				break;
			}
			case 3:
			{
				name = "Dirtbrickfine";
				break;
			}
			case 4:
			{
				name = "darkblue smooth Bricks";
				break;
			}
			case 5:
			{
				name = "darkred smooth Bricks";
				break;
			}
			case 7:
			{
				name = "red smooth Bricks";
				break;
			}
			case 8:
			{
				name = "Roof";
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