package com.example.oleg.manager;

import com.example.oleg.component.IComponent;
import com.example.oleg.event.IEvent;

public interface IManager {
	void addComponent(IComponent component);
	void removeComponrnt(IComponent component);
	void notuffyComponent(IEvent event);
}
