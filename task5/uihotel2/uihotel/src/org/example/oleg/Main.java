package org.example.oleg;

import java.util.Scanner;

import org.example.oleg.display.Display;
import org.example.oleg.menu.MenuFactory;
import org.example.oleg.menu.StartMenu;
import org.example.oleg.menu.guest.GuestMenu;
import org.example.oleg.menu.guest.submenu.GuestAddMenu;
import org.example.oleg.menu.guest.submenu.GuestAmount;
import org.example.oleg.menu.guest.submenu.GuestOrderMenu;
import org.example.oleg.menu.guest.submenu.GuestPaymentMenu;
import org.example.oleg.menu.guest.submenu.GuestSortedMenu;
import org.example.oleg.menu.option.OptionMenu;
import org.example.oleg.menu.option.submenu.OptionAddMenu;
import org.example.oleg.menu.option.submenu.OptionSetPriceMenu;
import org.example.oleg.menu.option.submenu.OptionSortedMenu;
import org.example.oleg.menu.roommenu.RoomMenu;
import org.example.oleg.menu.roommenu.submenu.RoomAllFreeMenu;
import org.example.oleg.menu.roommenu.submenu.RoomDetailMenu;
import org.example.oleg.menu.roommenu.submenu.RoomLastThreeGuestMenu;
import org.example.oleg.menu.roommenu.submenu.RoomSortedMenu;
import org.example.oleg.menu.roommenu.submenu.RoomStatusMenu;
import org.example.oleg.navigator.Navigator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		MenuFactory startMenu = new StartMenu();
		
		MenuFactory roomMenu=new RoomMenu();
		roomMenu.setRootMenu(startMenu);
		MenuFactory roomAllFreeMenu=new RoomAllFreeMenu();
		roomAllFreeMenu.setRootMenu(roomMenu);
		MenuFactory roomDetailMenu=new RoomDetailMenu();
		roomDetailMenu.setRootMenu(roomMenu);
		MenuFactory roomLastThreeGuestMenu= new RoomLastThreeGuestMenu();
		roomLastThreeGuestMenu.setRootMenu(roomMenu);
		MenuFactory roomSortedMenu=new RoomSortedMenu();
		roomSortedMenu.setRootMenu(roomMenu);
		MenuFactory roomStatusMenu=new RoomStatusMenu();
		roomStatusMenu.setRootMenu(roomMenu);
		MenuFactory[] subMenus= {roomAllFreeMenu, roomDetailMenu, roomLastThreeGuestMenu, roomSortedMenu, roomStatusMenu};
		roomMenu.setSubMenus(subMenus);
		
		MenuFactory guestMenu=new GuestMenu();
		guestMenu.setRootMenu(startMenu);
		MenuFactory guestAddMenu=new GuestAddMenu();
		guestAddMenu.setRootMenu(guestMenu);
		MenuFactory guestAmountMenu=new GuestAmount();
		guestAmountMenu.setRootMenu(guestMenu);
		MenuFactory guestOrderMenu=new GuestOrderMenu();
		guestOrderMenu.setRootMenu(guestMenu);
		MenuFactory guestPaymentMenu=new GuestPaymentMenu();
		guestPaymentMenu.setRootMenu(guestMenu);
		MenuFactory guestSortedMenu=new GuestSortedMenu();
		guestSortedMenu.setRootMenu(guestMenu);
		
		MenuFactory[] subMenus1= {guestAddMenu, guestAmountMenu, guestOrderMenu, guestPaymentMenu, guestSortedMenu};
		guestMenu.setSubMenus(subMenus1);
		
		MenuFactory optionMenu= new OptionMenu();
		optionMenu.setRootMenu(startMenu);
		MenuFactory optionAddMenu=new OptionAddMenu();
		optionAddMenu.setRootMenu(optionMenu);
		MenuFactory optionSetPrice= new OptionSetPriceMenu();
		optionSetPrice.setRootMenu(optionMenu);
		MenuFactory optionSortedMenu=new OptionSortedMenu();
		MenuFactory[] subMenus2= {optionAddMenu,optionSetPrice,optionSortedMenu};
		optionMenu.setSubMenus(subMenus2);
		
		MenuFactory[] subMenus3={roomMenu, guestMenu, optionMenu};
		startMenu.setSubMenus(subMenus3);
		
		Navigator navigator=new Navigator();
		navigator.setCurrentMenu(startMenu);
		
		Display display = new Display(navigator);
		display.draw();
		Scanner sc=new Scanner(System.in);
		while (true) {
			int a=sc.nextInt();
			navigator.selectMenu(a);
			display.draw();
		}
		
		/*MenuFactory startMenu=new StartMenu();
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
		*/
		
		
	}

}
