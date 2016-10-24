package com.example.oleg;

import java.util.Scanner;

import com.example.oleg.build.Builder;
import com.example.oleg.component.IComponent;
import com.example.oleg.component.Menu;
import com.example.oleg.component.Table;
import com.example.oleg.event.Click;
import com.example.oleg.event.Sorted;
import com.example.oleg.manager.ComponentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IComponent menu = new Menu();
		IComponent table = new Table();
		ComponentManager componentManager = new ComponentManager();
		componentManager.addComponent(menu);
		componentManager.addComponent(table);
		Builder builder=new Builder(menu, table);
		while (true) {
			Scanner sc = new Scanner(System.in);
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
		}
	}

}
