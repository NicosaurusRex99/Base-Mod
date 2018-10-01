package naturix.basemod.registry;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Biomes;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModSpawns {
	public static void init() {
		EntityRegistry.addSpawn(EntityZombie.class, 50 , 1, 10, EnumCreatureType.MONSTER, Biomes.JUNGLE, Biomes.JUNGLE_EDGE);
	}
}
