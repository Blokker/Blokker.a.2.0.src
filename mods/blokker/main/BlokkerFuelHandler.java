package mods.blokker.main;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class BlokkerFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == Blokker.CoalBrick.itemID){
		return 8000;
	}else if(fuel.itemID == Blokker.BlokkerCoal.blockID){
		return 72000;
	}else {
		return 0;
	}
	
		
	}
}


