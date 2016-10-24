package com.example.oleg.component;

import com.example.oleg.event.IEvent;

public class Table implements IComponent {
	private IEvent event;
	@Override
	public void handEvent(IEvent event) {
		// TODO Auto-generated method stub
		this.event=event;
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println("I "+this.getClass()+" run "+this.event.getClass().getName());

		
	}
}
