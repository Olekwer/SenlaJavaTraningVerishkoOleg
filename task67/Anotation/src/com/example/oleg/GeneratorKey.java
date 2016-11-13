package com.example.oleg;

import java.lang.reflect.Field;

public class GeneratorKey {
	private static final String NULL = "";

	private static final String POINT = ".";

	private Class<? extends Object> clazz;
	private Field field;
	public GeneratorKey(Class<? extends Object> clazz, Field field){
		this.clazz=clazz;
		this.field=field;
	}
	public String getKey(){
		String key=null;
		if(!field.getAnnotation(ConfigProperty.class).propertyName().equals(NULL)){
			key=field.getAnnotation(ConfigProperty.class).propertyName().toString();
		}else{
			String className = clazz.getSimpleName();
			String fieldName = field.getName();
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(className).append(POINT).append(fieldName);
			key=stringBuffer.toString();
		}
		return key;
	}
}
