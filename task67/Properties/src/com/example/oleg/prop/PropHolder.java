package com.example.oleg.prop;

import java.util.Map;

public class PropHolder {
	private PropInit propInit;
	private Map map;
	private String configPath;
	
	public PropHolder(String configPath) {
		this.configPath=configPath;
	}

	public  PropInit getPropInit() {

		if (propInit == null) {
			propInit=new PropInit(this.configPath);					
		} 

		return propInit;
	}

	
}
