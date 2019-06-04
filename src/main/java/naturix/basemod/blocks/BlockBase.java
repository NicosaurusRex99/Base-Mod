package naturix.basemod.blocks;

import naturix.basemod.BaseMod;
import naturix.basemod.registry.ModBlocks;
import naturix.basemod.registry.ModItems;
import naturix.basemod.utils.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    protected String name;

    public BlockBase(String name, Material material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }



    @Override
    public void registerModels() {
        BaseMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}