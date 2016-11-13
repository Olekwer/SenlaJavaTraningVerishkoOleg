package com.example.oleg;

import java.lang.reflect.Field;

public class ValueParser {
	private static final String STRING = "String";
	private static final String DOUBLE = "double";
	private static final String INT = "int";
	private static final String OBJECT = "Object";
	private Field field;

	public ValueParser(Field field) {
		this.field = field;
	}

	public Object parsing(String value) {
		Object param = null;
		if (field.getAnnotation(ConfigProperty.class).type().getSimpleName().equals(OBJECT)) {
			param = value;
		} else if (field.getType().getSimpleName().equals(INT)) {
			param = Integer.parseInt(value);

		} else {
			if (field.getType().getSimpleName().equals(DOUBLE)) {
				param = Double.parseDouble(value);
			}

			else {
				if (field.getType().getSimpleName().equals(STRING)) {
					param = value;
				}
			}
		}

		return param;
	}
}
