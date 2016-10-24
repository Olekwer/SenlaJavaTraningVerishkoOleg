package com.example.oleg.build;

import com.example.oleg.component.IComponent;
import com.example.oleg.component.Menu;
import com.example.oleg.component.Table;

public class Builder {
	private IComponent menu;
	private IComponent table;
	
	public Builder(IComponent menu, IComponent table) {
		this.menu=menu;
		this.table=table;
	}
	public void render(){
		this.menu.render();
		this.table.render();
	}
}	
