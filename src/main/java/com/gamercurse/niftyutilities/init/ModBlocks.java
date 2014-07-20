package com.gamercurse.niftyutilities.init;

import com.gamercurse.niftyutilities.block.*;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks
{
    public static final BlockNUTIL PortalFrame = new BlockPortalFrame();

    // colored stone bricks

    public static final BlockNUTIL BlackStoneBrick = new BlockBlackStoneBrick();
    public static final BlockNUTIL LimeStoneBrick = new BlockLimeStoneBrick();
    public static final BlockNUTIL BlueStoneBrick = new BlockBlueStoneBrick();
    public static final BlockNUTIL RedStoneBrick = new BlockRedStoneBrick();
    public static final BlockNUTIL YellowStoneBrick = new BlockYellowStoneBrick();
    public static final BlockNUTIL OrangeStoneBrick = new BlockOrangeStoneBrick();
    public static final BlockNUTIL GreenStoneBrick = new BlockGreenStoneBrick();
    public static final BlockNUTIL CyanStoneBrick = new BlockCyanStoneBrick();
    public static final BlockNUTIL MagentaStoneBrick = new BlockMagentaStoneBrick();
    public static final BlockNUTIL LightRedStoneBrick = new BlockLightRedStoneBrick();
    public static final BlockNUTIL BrownStoneBrick = new BlockBrownStoneBrick();
    public static final BlockNUTIL GrayStoneBrick = new BlockGrayStoneBrick();
    public static final BlockNUTIL PurpleStoneBrick = new BlockPurpleStoneBrick();
    public static final BlockNUTIL WhiteStoneBrick = new BlockWhiteStoneBrick();

    // colored planks

    public static final BlockNUTIL BluePlanks = new BlockBluePlanks();
    public static final BlockNUTIL RedPlanks = new BlockRedPanks();
    public static final BlockNUTIL YellowPlanks = new BlockYellowPlanks();
    public static final BlockNUTIL GreenPlanks = new BlockGreenPlanks();
    public static final BlockNUTIL PurplePlanks = new BlockPurplePlanks();
    public static final BlockNUTIL BlackPlanks = new BlockBlackPlanks();
    public static final BlockNUTIL WhitePlanks = new BlockWhitePlanks();



    public static void init()
    {
        GameRegistry.registerBlock(PortalFrame, "Portal Frame");

        // colored stone bricks

        GameRegistry.registerBlock(BlackStoneBrick, "Black Stone Brick");
        GameRegistry.registerBlock(LimeStoneBrick, "Lime Stone Brick");
        GameRegistry.registerBlock(BlueStoneBrick,"Blue Stone Brick");
        GameRegistry.registerBlock(RedStoneBrick,"Red Stone Brick");
        GameRegistry.registerBlock(YellowStoneBrick,"Yellow Stone Brick");
        GameRegistry.registerBlock(OrangeStoneBrick, "Orange Stone Brick");
        GameRegistry.registerBlock(GreenStoneBrick, "Green Stone Brick");
        GameRegistry.registerBlock(CyanStoneBrick, "Cyan Stone Brick");
        GameRegistry.registerBlock(MagentaStoneBrick, "Magenta Stone Brick");
        GameRegistry.registerBlock(LightRedStoneBrick, "Light Red Stone Brick");
        GameRegistry.registerBlock(BrownStoneBrick, "Brown Stone Brick");
        GameRegistry.registerBlock(GrayStoneBrick, "Gray Stone Brick");
        GameRegistry.registerBlock(PurpleStoneBrick, "Purple Stone Brick");
        GameRegistry.registerBlock(WhiteStoneBrick, "White Stone Brick");

        // colored Planks

        GameRegistry.registerBlock(BluePlanks, "Blue Planks");
        GameRegistry.registerBlock(RedPlanks, "Red Planks");
        GameRegistry.registerBlock(YellowPlanks, "Yellow Planks");
        GameRegistry.registerBlock(GreenPlanks, "Green Planks");
        GameRegistry.registerBlock(PurplePlanks, "Purple Planks");
        GameRegistry.registerBlock(WhitePlanks, "White Planks");
        GameRegistry.registerBlock(BlackPlanks, "Black Planks");

    }


}
