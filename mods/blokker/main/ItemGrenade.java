package mods.blokker.main;

import mods.blokker.main.EntityGrenade;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrenade extends Item{

public ItemGrenade(int par1){
super(par1);
this.maxStackSize = 64; //maximum size in a stack
this.setUnlocalizedName("grenade"); //icon
}

public void registerIcons(IconRegister iconRegister) {

this.itemIcon = iconRegister.registerIcon("blokker:granade"); }


public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer){

if (!entityplayer.capabilities.isCreativeMode){
                         --itemstack.stackSize; //removes one when right clicked if not in creative
                 }

if (!world.isRemote){
world.spawnEntityInWorld(new EntityGrenade(world, entityplayer)); //spawns the grenade entity
}
        
         return itemstack;
}

}