package mods.blokker.main;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

	public class ItemWoodBlocks extends ItemBlock
	{
		public ItemWoodBlocks(int par1)
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
				name = "Oak Parquet";
				break;
			}
			case 1:
			{
				name = "Birch Parquet";
				break;
			}
			case 2:
			{
				name = "Spruce Parquet";
				break;
			}
			case 3:
			{
				name = "Jungel Parquet";
				break;
			}
			case 4:
			{
				name = "black Planks";
				break;
			}
			case 5:
			{
				name = "green Planks";
				break;
			}
			case 7:
			{
				name = "faded Wreck";
				break;
			}
			case 8:
			{
				name = "colored Wreck";
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