package com.example.oleg.component;

import java.util.Scanner;

import com.example.oleg.event.IEvent;
import com.example.oleg.handler.Handler;
import com.example.oleg.manager.ComponentManager;

public class ControlLine implements IComponent {
	
	private IEvent event;
	@Override
	public void handEvent(IEvent event) {
		// TODO Auto-generated method stub
		this.event=event;
	}

	@Override
	public void render() {	
		Scanner sc=new Scanner(System.in);		
		int target=sc.nextInt();		
		Handler handler=new Handler();		
		ComponentManager.getComponentManager().notuffyComponent(handler.runEvent(this.event, target));
		
	}

}
