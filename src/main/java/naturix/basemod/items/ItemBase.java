package naturix.basemod.items;

import naturix.basemod.BaseMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BaseMod.TAB);
	}
	
	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}
	
}