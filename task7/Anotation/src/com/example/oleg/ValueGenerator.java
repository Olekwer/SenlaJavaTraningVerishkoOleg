package com.example.oleg;

import java.util.ArrayList;
import java.util.List;

import com.example.oleg.prop.PropInit;

public class ValueGenerator {
	private String configName;
	private String propertyName;
	private Class<?> type;
	private PropInit propInit = new PropInit();

	public ValueGenerator(String configName, String propertyName, Class<?> type) {
		this.configName = configName;
		this.propertyName = propertyName;
		this.type = type;
		propInit = new PropInit();
		propInit.propInit(configName);
	}

	public Object getValue() {
		Object value = null;
		String propsValue = propInit.getProperties(configName, propertyName);
		Class<?> et = type;

		if (this.type.equals(String.class)) {
			value = new String();
			value = propsValue;

		} else if (this.type.equals(Integer.class) || this.type.equals(int.class)) {

			try {
				value = new Integer(propsValue);
			} catch (Exception e) {

			}
		} else if (this.type.equals(Double.class) || this.type.equals(double.class)) {
			try {
				value = new Double(propsValue);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (this.type.equals(Float.class) || this.type.equals(float.class)) {
			try {
				value = new Float(propsValue);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else if (this.type.equals(Byte.class) || this.type.equals(byte.class)) {
			try {
				value = new Byte(propsValue);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return value;
	}
}
