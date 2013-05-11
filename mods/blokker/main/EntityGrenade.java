package mods.blokker.main;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGrenade extends EntityThrowable{

public EntityGrenade(World par1World){
         super(par1World);
}
public EntityGrenade(World par1World, EntityLiving par2EntityLiving){
         super(par1World, par2EntityLiving);
}
public EntityGrenade(World par1World, double par2, double par4, double par6){
         super(par1World, par2, par4, par6);
}

protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
         if (par1MovingObjectPosition.entityHit != null){
                 par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0);
         }
         if (!this.worldObj.isRemote){
                 explode(); //explodes the grenade
         }
         if (!this.worldObj.isRemote){
                 this.setDead();
         }
}

private void explode(){
         if(!exploded){
         exploded = true;
                 worldObj.createExplosion(this, posX, posY, posZ, 2.0F, true); //spawns explosion
         }
}

boolean exploded;
}