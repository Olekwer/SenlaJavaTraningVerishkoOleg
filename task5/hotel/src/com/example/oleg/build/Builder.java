package com.example.oleg.build;

import com.example.oleg.component.IComponent;


public class Builder {
	private IComponent menu;
	private IComponent table;
	private IComponent console;
	
	public Builder(IComponent menu, IComponent table, IComponent console) {
		this.menu=menu;
		this.table=table;
		this.console=console;
	}
	public void render(){
	
		this.menu.render();
		this.table.render();
		this.console.render();
	}
}	
