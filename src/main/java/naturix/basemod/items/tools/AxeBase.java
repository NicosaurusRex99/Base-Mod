package naturix.basemod.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import naturix.basemod.BaseMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;

public class AxeBase extends ItemAxe {
	protected String name;
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.COCOA, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
    
	public AxeBase(ToolMaterial material, String name, int harvestLevel, int damage) {
		super(material);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(BaseMod.TAB);
		setMaxStackSize(1);
	    setMaxDamage(damage);
	    setHarvestLevel("axe", harvestLevel);
	    getItemEnchantability();
	}

	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}
}