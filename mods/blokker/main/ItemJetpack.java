package mods.blokker.main;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemJetpack extends Item{

public ItemJetpack(int par1){
super(par1);
this.maxStackSize = 1;
this.setCreativeTab(CreativeTabs.tabTools);
}

public void registerIcons(IconRegister iconRegister) {

this.itemIcon = iconRegister.registerIcon("blokker:jetpack"); }



public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer){
entityplayer.motionY += 0.65; //fling the player up in the air

return itemstack;
}
}