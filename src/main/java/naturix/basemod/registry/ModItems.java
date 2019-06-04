package naturix.basemod.registry;


import java.util.ArrayList;
import java.util.List;

import naturix.basemod.utils.GenerateJSON;
import net.minecraft.item.Item;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //howto add items
//    public static Item basicItem = new ItemBase("basic_item");
    public static void init() {
    }

    public static void CreateJSONs() {
        GenerateJSON.generateItemModelJSONs();
    }
}
