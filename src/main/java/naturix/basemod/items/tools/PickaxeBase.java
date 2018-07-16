package naturix.basemod.items.tools;

import naturix.basemod.BaseMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class PickaxeBase extends ItemPickaxe {
	protected String name;

	public PickaxeBase(ToolMaterial material, String name, int damage, int harvestLevel) {
		super(material);
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(BaseMod.TAB);
		setMaxStackSize(1);
	    setMaxDamage(damage);
	    setHarvestLevel("pickaxe", harvestLevel);
	    getItemEnchantability();
	}

	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}
}