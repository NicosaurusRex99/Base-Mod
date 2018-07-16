package naturix.basemod.world;

import java.util.Random;

import com.google.common.base.Predicate;

import naturix.basemod.BaseMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;


public class ModWorldGen implements IWorldGenerator {

	public static ModWorldGen instance = new ModWorldGen();
	
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case -1:
                genNether(world, random, chunkX, chunkZ);
                break;
            case 0:
                genSurface(world, random, chunkX, chunkZ);
                break;
            case 1:
            	
            	break;
        }
    }
	 private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn){
		  int diffMinMaxY = maxY - minY;
		  for(int x = 0; x < chance; x++){
		   int posX = blockXPos + random.nextInt(maxX);
		   int posY = minY + random.nextInt(diffMinMaxY);
		   if(diffMinMaxY < minY) {diffMinMaxY = maxY;}
		   int posZ = blockZPos + random.nextInt(maxZ);

		   WorldGenMinable gen = new WorldGenMinable(block, maxVeinSize, blockToSpawnIn);
			
			if(minY > maxY || minY < 0 || maxY > 256) throw new IllegalArgumentException("Ore Generated Out of Bounds");
			int heighDiff = maxY - minY + 1;
			
			for(int i = 0; i < chance; i++) {
				int b = blockXPos * 16 + random.nextInt(16);
				int y = minY + random.nextInt(heighDiff);
				int z = blockZPos * 16 + random.nextInt(16);
				
				gen.generate(world, random, new BlockPos(b, y, z));
			}
		
		  }
	 }
	 private void genSurface(World world, Random random, int chunkX, int chunkZ){
		 //block, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, chance, minY, maxY, blockToSpawnIn
		 //addOreSpawn(ModBlocks.ore_amber.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 3, 2, 1, 16, BlockMatcher.forBlock(Blocks.STONE));
		 }
	 private void genNether(World world, Random random, int chunkX, int chunkZ){
		 //block, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, chance, minY, maxY, blockToSpawnIn
		 //addOreSpawn(ModBlocks.ore_cobalt.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cobaltSpawnTries, Config.cobaltMin, Config.cobaltMax, BlockMatcher.forBlock(Blocks.NETHERRACK));
	 }
	 private void genEnd(World world, Random random, int chunkX, int chunkZ){
		 //block, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, chance, minY, maxY, blockToSpawnIn
		 //addOreSpawn(ModBlocks.ore_cobalt.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, Config.cobaltSpawnTries, Config.cobaltMin, Config.cobaltMax, BlockMatcher.forBlock(Blocks.NETHERRACK));
	 }
	 
}