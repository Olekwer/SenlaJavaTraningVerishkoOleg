package com.example.oleg.di;

import java.lang.reflect.Type;

import com.example.oleg.controller.RoomsService;
import com.example.oleg.prop.PropInit;


public class DI {
	
	private static final String PROPERTIS_PROP_CONFIG = "propertis/prop.config";
	private PropInit propInit;
	public DI(){
		propInit=new PropInit();
		propInit.propInit(PROPERTIS_PROP_CONFIG);
	}
	

	
	
	public Object inject(Type t) throws InstantiationException, IllegalAccessException{
		String value=propInit.getProperties(PROPERTIS_PROP_CONFIG, t.getTypeName());
		Object object=null;
		try {
			Class<?> clazz=Class.forName(value);
			object= clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return object;
	}
	
	
}
