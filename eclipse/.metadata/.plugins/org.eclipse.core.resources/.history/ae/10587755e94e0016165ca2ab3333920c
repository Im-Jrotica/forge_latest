package com.jroticag.handler;

import java.io.File;

import com.jroticag.reference.Ref;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {
	
	public static Configuration configuration;
	public static boolean testValue = false;
	
	
	public static void init(File configFile){
		//Create the configuration object from the configuration file
		if(configuration == null){
		configuration = new Configuration(configFile);
		}
		
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event){
			if(event.getModID().equalsIgnoreCase(Ref.MOD_ID)){
				loadConfiguration();
			}
	}
	public void loadConfiguration(){
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
	
		if(configuration.hasChanged()){
			configuration.save();
		}
	}
}