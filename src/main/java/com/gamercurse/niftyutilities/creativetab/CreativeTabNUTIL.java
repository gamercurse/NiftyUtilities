package com.gamercurse.niftyutilities.creativetab;


import com.gamercurse.niftyutilities.init.ModItems;
import com.gamercurse.niftyutilities.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNUTIL
{
    public static final CreativeTabs NUTIL = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.Wrench;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Nifty Utilities";
        }
    };
}