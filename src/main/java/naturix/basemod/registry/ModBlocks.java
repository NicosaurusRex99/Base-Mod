package naturix.basemod.registry;

import java.util.ArrayList;
import java.util.List;

import naturix.basemod.blocks.BlockBase;
import naturix.basemod.utils.GenerateJSON;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    //How to register a new block
//    public static Block rock = new BlockBase(Material.ROCK, "rock");

    
    public static void init() {
    }

    public static void CreateJSONs() {
        GenerateJSON.generateBlockstateJSONs();
        GenerateJSON.generateModelBlockJSONs();
    }
}