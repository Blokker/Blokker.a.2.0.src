package mods.blokker.main;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;



public class WorldGeneratorBlokker implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);	
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
	
		
	}
	private void generateSurface(World world, Random random, int i, int j) {
		for(int k = 0; k < 8; k++){
			int xCoord = i + random.nextInt(16);
			int yCoord = random.nextInt(25);
			int zCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(Blokker.MithrilOre.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
			
		for(int f = 0; f < 10; f++){
			int xCoord1 = i + random.nextInt(16);
			int yCoord1 = random.nextInt(80);
			int zCoord1 = j + random.nextInt(16);
				
				(new WorldGenMinable(Blokker.BoneOre.blockID, 4)).generate(world, random, xCoord1, yCoord1, zCoord1);
				
		}
	  }
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		
		
	}
	
	
}