package com.gamercurse.niftyutilities.configuration;


import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
    public static void  init(File configFile)
    {
       Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            configuration.load();

            configValue = configuration.get(configuration.CATEGORY_GENERAL, "configValue", true, "this is a test" ).getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
        configuration.save();
        }

        System.out.print(configValue);

        System.out.println("Configuration Test" + configValue);

    }

}
