package org.example.oleg;

import java.util.Scanner;

import org.example.oleg.display.Display;
import org.example.oleg.menu.MenuFactory;
import org.example.oleg.menu.OneMenu;
import org.example.oleg.menu.StartMenu;
import org.example.oleg.menu.TwoMenu;
import org.example.oleg.menu.onemenu.LeftSubMenu;
import org.example.oleg.menu.onemenu.RightSubMenu;
import org.example.oleg.menu.twomenu.CloseSubMenu;
import org.example.oleg.navigator.Navigator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFactory startMenu=new StartMenu();
		MenuFactory oneMenu=new OneMenu();
		MenuFactory twoMenu=new TwoMenu();
		
		MenuFactory leftSubMenu=new LeftSubMenu();
		MenuFactory rightSubMenu=new RightSubMenu();
		
		MenuFactory closeSubmenu=new CloseSubMenu();
		
		
		MenuFactory[]subMenus1={oneMenu,twoMenu};
		startMenu.setSubMenus(subMenus1);
		oneMenu.setRootMenu(startMenu);
		twoMenu.setRootMenu(startMenu);		
		
		
		
		MenuFactory[]subMenus2={leftSubMenu, rightSubMenu};
		leftSubMenu.setRootMenu(oneMenu);
		rightSubMenu.setRootMenu(oneMenu);		
		oneMenu.setSubMenus(subMenus2);
		
		MenuFactory[]subMenus3={closeSubmenu};
		closeSubmenu.setRootMenu(twoMenu);
		twoMenu.setSubMenus(subMenus3);
		
		Navigator navigator=new Navigator();
		navigator.setCurrentMenu(startMenu);
		
		Display display=new Display(navigator);
		display.draw();
		Scanner sc=new Scanner(System.in);
		while (true) {
			int a=sc.nextInt();
			navigator.selectMenu(a);
			display.draw();
		}
	}

}
