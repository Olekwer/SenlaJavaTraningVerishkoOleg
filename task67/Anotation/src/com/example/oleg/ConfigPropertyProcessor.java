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
import com.example.test.Test;

public class ConfigPropertyProcessor {
	private PropHolder propHolder;

	public ConfigPropertyProcessor() {
		this.propHolder = new PropHolder("recource/prop.properties");
		this.propHolder.getPropInit();

	}

	public void proccesing(Object object) {
		Class<? extends Object> clazz = object.getClass();
		for (Field field : clazz.getDeclaredFields()) {
			if (field.isAnnotationPresent((Class<? extends Annotation>) ConfigProperty.class)) {
			
				
				GeneratorKey generatorKey=new GeneratorKey(clazz, field);
				
				String value = getProperty(generatorKey.getKey());

				ValueParser valueParser=new ValueParser(field);							
				field.setAccessible(true);
				try {
					field.set(object, valueParser.parsing(value));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}

			}
		}


	}

	private String getProperty(String key) {
		return this.propHolder.getPropInit().getMapConfig().get(key);
	}

}
