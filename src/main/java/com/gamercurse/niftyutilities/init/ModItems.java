package com.gamercurse.niftyutilities.init;

import com.gamercurse.niftyutilities.item.ItemGoldPowder;
import com.gamercurse.niftyutilities.item.ItemIronPowder;
import com.gamercurse.niftyutilities.item.ItemNU;
import com.gamercurse.niftyutilities.item.ItemWrench;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemNU Wrench = new ItemWrench();
    public  static final ItemNU GoldPowder = new ItemGoldPowder();
    public  static final ItemNU IronPowder = new ItemIronPowder();

    public static void init()
    {
        GameRegistry.registerItem(Wrench, "Wrench");
        GameRegistry.registerItem(GoldPowder,"GoldPowder");
        GameRegistry.registerItem(IronPowder,"IronPowder");
    }
}
