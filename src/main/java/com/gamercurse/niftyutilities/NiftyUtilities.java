package com.gamercurse.niftyutilities;

import com.gamercurse.niftyutilities.Proxy.IProxy;
import com.gamercurse.niftyutilities.handler.ConfigurationHandler;
import com.gamercurse.niftyutilities.init.ModItems;
import com.gamercurse.niftyutilities.reference.Reference;
import com.gamercurse.niftyutilities.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_Factory_Class)
public class NiftyUtilities
{
    @Mod.Instance(Reference.MOD_ID)
    public static NiftyUtilities instance;

    @SidedProxy(clientSide = Reference.Client_Proxy_Class, serverSide = Reference.Server_Proxy_Class)
    public static IProxy Proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
