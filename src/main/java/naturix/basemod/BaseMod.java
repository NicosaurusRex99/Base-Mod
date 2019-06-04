package naturix.basemod;

import naturix.basemod.proxy.CommonProxy;
import naturix.basemod.registry.ModOreDict;
import naturix.basemod.registry.ModRecipes;
import naturix.basemod.utils.RegistrationHandler;
import naturix.basemod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = BaseMod.MODID, name = BaseMod.NAME, version = BaseMod.VERSION)
public class BaseMod {

	public static final String MODID = "basemod";
	public static final String NAME = "Base Mod";
	public static final String VERSION = "1.12.2.0";

	@Mod.Instance(MODID)
	public static BaseMod instance;
	public static org.apache.logging.log4j.Logger logger;
    
	@SidedProxy(clientSide = "naturix.basemod.proxy.ClientProxy", serverSide = "naturix.basemod.proxy.ServerProxy")
    public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FMLLog.getLogger().info(NAME + " is loading!");
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModOreDict.initOreDict();
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	public static final CreativeTabs TAB = new CreativeTabs("BaseCreativeTab")
    {

        @Override
		@SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Items.DIAMOND);
        }
		
    };

}
