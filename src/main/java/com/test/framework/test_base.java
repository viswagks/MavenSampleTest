package com.test.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Properties;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;


public class test_base 
{
	protected HashMap<String, String> runConfig = new HashMap<>();	
	protected static Logger log = Logger.getLogger(test_base.class);
		
	public test_base()
	{
		String strConfigFilePath = System.getProperty("user.dir") + "\\runconfig.properties";
//		Layout layout = new PatternLayout("%d ---- %p ---- %M ---- %m %n");
//		Appender appender = new ConsoleAppender(layout);
//		log.addAppender(appender);
		
		try
		{
			PropertyConfigurator.configure("log4j.properties");
			
			Properties objProperties = new Properties();
			objProperties.load(new FileInputStream(strConfigFilePath));
			
			for(Entry<Object, Object> objEntry : objProperties.entrySet())
			{
				runConfig.put(objEntry.getKey().toString(), objEntry.getValue().toString());
			}
			
			for(Entry<Object, Object> objEntry : objProperties.entrySet())
			{
				log.error("Property: " + objEntry.getKey() + " -- " + objEntry.getValue());
			}
			
		}
		catch(IOException IOE)
		{
			log.error("Run config file not found. " + strConfigFilePath);
		}
	}
	
}
