package com.example.oleg.component;

import java.util.Scanner;

import com.example.oleg.event.Click;
import com.example.oleg.event.IEvent;
import com.example.oleg.event.Sorted;
import com.example.oleg.event.StartEvent;
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
		IEvent event = null;

		System.out.println(this.event.getClass());
		int target=sc.nextInt();
		
		if(this.event instanceof StartEvent){
			
			if(target==1){
				event= new Click();
			}
			if(target==2){
				event= new Sorted();
			}
			//ComponentManager.getComponentManager().notuffyComponent(event);
		}
		
		if(this.event instanceof Sorted){
			
			if(target==1){
				event= new StartEvent();
			}
			if(target==2){
				event= new Click();
			}
		//	ComponentManager.getComponentManager().notuffyComponent(event);
		}
		if(this.event instanceof Click){
			if(target==1){
				event= new StartEvent();
			}
			if(target==2){
				event= new Sorted();
			}
			
		}
		ComponentManager.getComponentManager().notuffyComponent(event);
		
	}

}
