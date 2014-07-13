package com.gamercurse.niftyutilities.init;

import com.gamercurse.niftyutilities.block.BlockNUTIL;
import com.gamercurse.niftyutilities.block.BlockPortalFrame;
import com.gamercurse.niftyutilities.block.BlockSmokedStone;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockNUTIL SmokedStone = new BlockSmokedStone();
    public static final BlockNUTIL PortalFrame = new BlockPortalFrame();

    public static void init()
    {
        GameRegistry.registerBlock(SmokedStone, "Smoked Stone");
        GameRegistry.registerBlock(PortalFrame, "Portal Frame");
    }
}
