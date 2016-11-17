package com.example.oleg.prop;

public class Main {

	public static void main(String[] args) {
		/*PropHolder propHolder=new PropHolder("config/config.properties");
		System.out.println(Boolean.parseBoolean(propHolder.getPropInit().getMapConfig().get("statusOn")));
		*/
		PropInit propInit=new PropInit();
		propInit.propInit("config/config.properties");
		System.out.println(propInit.getProperties("config/config.properties", "statusOn"));

		
	}

}
