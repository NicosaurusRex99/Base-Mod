package naturix.basemod.items;

import naturix.basemod.BaseMod;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood{
	protected String name;

	public FoodBase(String name, int healAmount, boolean isWolfsFood) {
		super(healAmount, isWolfsFood);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BaseMod.TAB);
	}
	
	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}
}
