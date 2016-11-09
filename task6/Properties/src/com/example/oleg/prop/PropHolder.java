package com.example.oleg.prop;


import java.util.Properties;

public class PropHolder {
	private static Properties properties;
	private static PropHolder holder;
	
	private PropHolder(){
		
	}
		
	
	public static PropHolder holder(){
		if(holder==null){
			holder=new PropHolder();
			PropInit propInit=new PropInit();
			properties =propInit.init();
		}
		return holder;
	}	
	
	public Boolean satusOf(){
		Boolean bool=Boolean.valueOf(properties.getProperty("statusOf"));
		return bool;
	}
	public Boolean satusOn(){
		Boolean bool=Boolean.valueOf(properties.getProperty("statusOn"));
		return bool;
	}
	public int amountHistory(){
		
		return Integer.parseInt(properties.getProperty("amountHistory"));
	}
	
	

}
