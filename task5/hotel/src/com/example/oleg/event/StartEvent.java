package com.example.oleg.event;

public class StartEvent implements IEvent {
	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("1. Room");
		System.out.println("2. Guest");
		System.out.println("3. Option");
		System.out.println("4. Order Guest");
	}
}
