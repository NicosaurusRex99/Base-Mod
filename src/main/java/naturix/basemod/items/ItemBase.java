package naturix.basemod.items;

import naturix.basemod.BaseMod;
import naturix.basemod.registry.ModItems;
import naturix.basemod.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    protected int healAmount = 0;
    protected String name;

    public ItemBase(String name) {
        this(name, BaseMod.TAB);
    }

    public ItemBase(String name, CreativeTabs tab) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        this.setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        BaseMod.proxy.registerItemRenderer(this, 0, name);
    }


}