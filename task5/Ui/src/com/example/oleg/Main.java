package com.example.oleg;

import java.text.ParseException;
import java.util.Scanner;

import com.example.oleg.base.DataBase;
import com.example.oleg.build.Builder;
import com.example.oleg.component.ControlLine;
import com.example.oleg.component.IComponent;
import com.example.oleg.component.Menu;
import com.example.oleg.component.Table;
import com.example.oleg.event.Click;
import com.example.oleg.event.Sorted;
import com.example.oleg.event.StartEvent;
import com.example.oleg.manager.ComponentManager;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DataBase dataBase=new DataBase("files/room.txt", "files/guest.txt", "files/option.txt", "files/order.txt");
		
		IComponent menu = new Menu();
		IComponent table = new Table();
		IComponent console= new ControlLine();
		ComponentManager componentManager = ComponentManager.getComponentManager();
		componentManager.addComponent(menu);
		componentManager.addComponent(table);	
		componentManager.addComponent(console);
		componentManager.notuffyComponent(new StartEvent());
	
		Builder builder=new Builder(menu, table, console);
		builder.render();
		while(true){
			builder.render();
		}
		
		
		/*while (true) {
			Scanner sc = new Scanner(System.in);
			
			builder.render();
			int vvod = sc.nextInt();
			if (vvod == 1) {
				componentManager.notuffyComponent(new Click());
				builder.render();
			} else if (vvod == 2) {
				componentManager.notuffyComponent(new Sorted());
				builder.render();
				
			}
			else {
				break;
			}
		}*/
	}

}
