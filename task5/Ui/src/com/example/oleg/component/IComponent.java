package com.example.oleg.component;


import com.example.oleg.event.IEvent;

public interface IComponent {
	void handEvent(IEvent event);
	void render();
}
