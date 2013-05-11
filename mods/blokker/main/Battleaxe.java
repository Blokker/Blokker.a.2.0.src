package mods.blokker.main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StringTranslate;
import net.minecraft.world.World;

public class Battleaxe extends ItemAxe{

	public Battleaxe(int i, EnumToolMaterial enumToolMaterial) {
		super(i, enumToolMaterial);

	}


	public void registerIcons(IconRegister iconRegister) {

	this.itemIcon = iconRegister.registerIcon("blokker:battleaxe"); }
	

	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        entityliving.setFire(300);
          return true;
    }
	
	 public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
	    {
	        return par2Block.blockID != Block.web.blockID ? 1.5F : 55F;
	    }
	 

	    public boolean onBlockDestroyed(ItemStack par1ItemStack, int par2, int par3, int par4, int par5, EntityLiving par6EntityLiving)
	    {
	        par1ItemStack.damageItem(2, par6EntityLiving);
	        return true;
	    }

	    
	    /**
	     * Returns True is the item is renderer in full 3D when hold.
	     */
	    public boolean isFull3D()
	    {
	        return true;
	    }
	    
	    public String getItemDisplayName(ItemStack par1ItemStack)
	    {
	        String var2 = ("\u00a7b" + StringTranslate.getInstance().translateNamedKey(this.getLocalizedName(par1ItemStack))).trim();
	        return var2;
	    }

	    /**
	     * returns the action that specifies what animation to play when the items is being used
	     */
	    public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.block;
	    }

	    /**
	     * How long it takes to use or consume an item
	     */
	    public int getMaxItemUseDuration(ItemStack par1ItemStack)
	    {
	        return 0x11940;
	    }

	    /**
	     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	     */
	    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
	        return par1ItemStack;
	    }
	    /**
	     * Returns if the item (tool) can harvest results from the block type.
	     */
	    public boolean canHarvestBlock(Block par1Block)
	    {
	        return par1Block.blockID == Block.web.blockID;
	    }

	    /**
	     * Return the enchantability factor of the item, most of the time is based on material.
	     */
	    public int getItemEnchantability()
	    {
	        return toolMaterial.getEnchantability();
	    }
	    
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return true;
	    }
	    public EnumRarity getRarity(ItemStack par1ItemStack)
	    {
	        return EnumRarity.epic;
	    }
	    
}
