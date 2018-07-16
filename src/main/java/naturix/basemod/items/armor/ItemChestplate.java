package naturix.basemod.items.armor;

import naturix.basemod.BaseMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemChestplate  extends ItemArmor 
{
	public ItemChestplate(String name, ArmorMaterial material)
	{
		super(material, 0, EntityEquipmentSlot.CHEST);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(BaseMod.TAB);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.RARE;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return BaseMod.MODID +":textures/models/armor/"+ name + ".png";
	}
	private String name;
	public void registerItemModel() {
		BaseMod.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public int getMaxDamage()
	{
		return 5010;
	}


	@Override
	public boolean isDamageable()
	{
		return true;
	}

} 