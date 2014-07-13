package com.gamercurse.niftyutilities.handler;


import java.io.File;

import com.gamercurse.niftyutilities.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;


public class ConfigurationHandler

 {

    public static Configuration configuration;
    public static boolean testvalue = false;

    public static void  init(File configFile)
    {
        if (configuration == null)

        configuration = new Configuration(configFile);

    }
     @SubscribeEvent
     public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
     {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
         {
            loadConfiguration();
         }
     }

     public void loadConfiguration()
     {
        testvalue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "test value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
     }
 }
