package com.example.oleg.manager;

import java.util.ArrayList;
import java.util.List;
import com.example.oleg.component.IComponent;
import com.example.oleg.event.IEvent;

public class ComponentManager implements IManager {
	private List<IComponent>components=new ArrayList<IComponent>();

	@Override
	public void addComponent(IComponent component) {
		components.add(component);		
	}
	
	@Override
	public void removeComponrnt(IComponent component) {
		components.remove(component);
		
	}
	@Override
	public void notuffyComponent(IEvent event) {
		// TODO Auto-generated method stub
		for(int i=0;i<components.size();i++){
			components.get(i).handEvent(event);
		}
		
	}
	
	public List<IComponent> getComponents() {
		return components;
	}

	public void setComponents(List<IComponent> components) {
		this.components = components;
	}
}
