package com.example.test;

import com.example.oleg.ConfigProperty;

public class Test {
	@ConfigProperty(type = String.class)
	private String name;
	@ConfigProperty(propertyName = "Test.age", type = int.class)
	private int age;
	@ConfigProperty
	private String family;

	public String getName() {
		return name;
	}
	public int getAge(){
		return age;
	}

}
