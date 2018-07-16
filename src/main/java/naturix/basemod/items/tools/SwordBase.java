package naturix.basemod.items.tools;

import naturix.basemod.BaseMod;
import net.minecraft.item.ItemSword;

public class SwordBase extends ItemSword {
	protected String name;

	public SwordBase(ToolMaterial material, String name, int damage, int harvestLevel) {
		super(material);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(BaseMod.TAB);
		setMaxStackSize(1);
	    setMaxDamage(damage);
	    setHarvestLevel("sword", harvestLevel);
	    getItemEnchantability();
	}

	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}
}