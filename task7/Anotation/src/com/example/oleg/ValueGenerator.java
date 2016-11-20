package com.example.oleg;

import com.example.oleg.prop.PropInit;

public class ValueGenerator {
	
	private PropInit propInit;

	public ValueGenerator() {
		
		propInit = new PropInit();
		
	}

	public Object getValue(String configName, String propertyName, Class<?> type) {
		Object value = null;
		String propsValue = propInit.getProperties(configName, propertyName);
		//Class<?> et = type;

		if (type.equals(String.class)) {
			value = new String();
			value = propsValue;

		} else if (type.equals(Integer.class) || type.equals(int.class)) {

			try {
				value = new Integer(propsValue);
			} catch (Exception e) {

			}
		} else if (type.equals(Double.class) || type.equals(double.class)) {
			try {
				value = new Double(propsValue);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} else if (type.equals(Float.class) || type.equals(float.class)) {
			try {
				value = new Float(propsValue);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else if (type.equals(Byte.class) || type.equals(byte.class)) {
			try {
				value = new Byte(propsValue);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return value;
	}
}
