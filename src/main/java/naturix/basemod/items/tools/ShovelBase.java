package naturix.basemod.items.tools;

import naturix.basemod.BaseMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ShovelBase extends ItemSpade {
	protected String name;

	public ShovelBase(ToolMaterial material, String name, int damage, int harvestLevel) {
		super(material);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(BaseMod.TAB);
		setMaxStackSize(1);
	    setMaxDamage(damage);
	    setHarvestLevel("spade", harvestLevel);
	    getItemEnchantability();
	}

	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}
}