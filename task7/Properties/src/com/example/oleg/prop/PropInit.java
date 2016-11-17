package com.example.oleg.prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropInit {

	private Map<String, Properties> mapProps=new HashMap<String,Properties>();
	public PropInit(){
	
	}
	
	public void propInit(String path){
		
		try {
			
			if(mapProps.get(path)==null){
				Properties properties=new Properties();
				properties.load(new FileInputStream(new File(path)));
				mapProps.put(path, properties);
			}
			
		} 
		 catch (IOException e) {
			 e.printStackTrace();
		}				
		
	}
	
	public String getProperties(String path, String key){
		return this.mapProps.get(path).getProperty(key);
	}
	
 
	

}
