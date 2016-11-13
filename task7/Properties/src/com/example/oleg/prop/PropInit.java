package com.example.oleg.prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropInit {
	
	private static final String CONFIG_CONFIG_PROPERTIES_PATH = "config/config.properties";
	private Properties properties;	
	private Map<String,String> mapConfig;
    protected PropInit(String configPath){
    	try {
    		setProperties(new Properties());
			geProperties().load(new FileInputStream(configPath));
			
			mapConfig=new HashMap<String,String>();
			for (Object object: geProperties().keySet()) {
				mapConfig.put((String)object, geProperties().getProperty((String) object));
			}
		}  catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public Properties geProperties(){
		return properties;
	}
	
	public void setProperties(Properties properties){
		this.properties=properties;
	}
	
	public Map<String, String> getMapConfig() {
		return mapConfig;
	}
	

}
