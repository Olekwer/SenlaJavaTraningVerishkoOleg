package com.example.oleg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class ConfigPropertyProcessor {
	private static final String RECOURCE_PROP_PROPERTIES = "recource/prop.properties";

	public ConfigPropertyProcessor() {

	}

	public void proccesing(Object object) {
		Class<? extends Object> clazz = object.getClass();
		ValueGenerator valueGenerator = new ValueGenerator();
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
					propertyName = clazz.getSimpleName() + "." + field.getName();

				} else {
					propertyName = field.getAnnotation(ConfigProperty.class).propertyName();
				}

				if (field.getAnnotation(ConfigProperty.class).type().equals(Object.class)) {
					type = String.class;
				} else {
					type = field.getAnnotation(ConfigProperty.class).type();
				}

				Object newValue = valueGenerator.getValue(configName, propertyName, type);

				field.setAccessible(true);
				try {
					field.set(object, newValue);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} finally {
					field.setAccessible(false);
				}

			}
		}

	}

}
