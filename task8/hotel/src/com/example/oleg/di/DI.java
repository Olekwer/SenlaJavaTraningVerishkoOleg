package com.example.oleg.di;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.example.oleg.controller.Facade;
import com.example.oleg.prop.PropInit;

public class DI {

	private static final String PROPERTIS_PROP_CONFIG = "propertis/prop.config";
	private static PropInit propInit;
	private static Map<String, Object> mapObjects;
	private static Logger log = Logger.getLogger(Facade.class.getName());


	public static Object inject(Class<?> type) throws InstantiationException, IllegalAccessException {
		Object object = null;
		try {
			if (mapObjects == null) {
				propInit = new PropInit();
				mapObjects = new HashMap<String, Object>();
			}
			String value = propInit.getProperties(PROPERTIS_PROP_CONFIG, type.getTypeName());
			if (mapObjects.get(value) == null) {
				Class<?> clazz = Class.forName(value);
				object = clazz.newInstance();
				mapObjects.put(value, object);
			} else {
				object=mapObjects.get(value);
			}

		} catch (ClassNotFoundException e) {
			log.info(e);;
		}

		return object;
	}

}
