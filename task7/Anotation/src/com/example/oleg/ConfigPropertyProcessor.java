package com.example.oleg;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

import com.example.oleg.prop.PropHolder;
import com.example.oleg.prop.PropInit;
import com.example.test.Test;

public class ConfigPropertyProcessor {
	private static final String RECOURCE_PROP_PROPERTIES = "recource/prop.properties";
	


	public ConfigPropertyProcessor() {

	}

	public void proccesing(Object object) {
		Class<? extends Object> clazz = object.getClass();
		for (Field field : clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent((Class<? extends Annotation>) ConfigProperty.class)) {
				String configName;
				String propertyName;
				Class<?> type;

				if (field.getAnnotation(ConfigProperty.class).configName().equals("")) {
					configName = RECOURCE_PROP_PROPERTIES;
				} else {
					configName = field.getAnnotation(ConfigProperty.class).configName();
				}		
				

				if (field.getAnnotation(ConfigProperty.class).propertyName().equals("")) {
					propertyName=clazz.getSimpleName()+"."+field.getName();				
										
				} else {
					propertyName=field.getAnnotation(ConfigProperty.class).propertyName();
				}
				
				if (field.getAnnotation(ConfigProperty.class).type().equals(Object.class)) {
					type=String.class;
				}
				else{
					type=field.getAnnotation(ConfigProperty.class).type();
				}
				


				ValueGenerator valueGenerator=new ValueGenerator(configName, propertyName, type);
				field.setAccessible(true);
				try {
					field.set(object, valueGenerator.getValue());
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				finally{
					field.setAccessible(false);
				}

			}
		}

	}

}
