package com.example.test;

import com.example.oleg.ConfigPropertyProcessor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test test=new Test();
		ConfigPropertyProcessor configPropertyProcessor=new ConfigPropertyProcessor();
		configPropertyProcessor.proccesing(test);
		System.out.println(test.getName());
		System.out.println(test.getAge());

	}

}
