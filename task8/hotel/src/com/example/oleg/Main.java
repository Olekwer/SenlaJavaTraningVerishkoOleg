package com.example.oleg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.tools.Diagnostic;

import com.example.oleg.base.DataBase;
import com.example.oleg.controller.Facade;
import com.example.oleg.controller.IFacade;
import com.example.oleg.controller.RoomsService;
import com.example.oleg.controller.iservice.IGuestService;
import com.example.oleg.controller.iservice.IRoomSrvice;
import com.example.oleg.di.DI;
import com.example.oleg.model.Room;
import com.example.oleg.model.StatusRoom;

public class Main {

	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException, InstantiationException, IllegalAccessException {
		IFacade facadea=(IFacade) DI.inject(IFacade.class);
		System.out.println("---"+facadea.getClass());
		
		IGuestService guestService=(IGuestService) DI.inject(IGuestService.class);
		System.out.println("---"+guestService.getClass());

		IRoomSrvice r=new RoomsService();
		
		DI di=new DI();
		IRoomSrvice nr ;
		System.out.println();
		IRoomSrvice n = (IRoomSrvice) di.inject(IRoomSrvice.class);
		System.out.println(n.getClass().getName());
		
		//di.injection(n);
		
		//System.out.println(args[0]);
	
		IFacade facade = Facade.getFacade();
		facade.init();
		
		
		for (int i = 0; i < facade.getServiceOptions().getOptionsList().size(); i++) {
			System.out.println(facade.getServiceOptions().getOptionsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().getRoomsList().size(); i++) {
			System.out.println(facade.getServiceRooms().getRoomsList().get(i));
		}
		System.out.println("-----------------------------------------------------");		
		for (int i = 0; i < facade.getServiceOrder().optionGuest(1).size(); i++) {
			System.out.println(facade.getServiceOrder().optionGuest(1).get(i));
		}
		System.out.println("-----------------------------------------------------"+facade.detailRoom(2));
	//	Room r=facade.cloneRoom(1);
		
	//	System.out.println(r);
		System.out.println("-----------------------------------------------------");
		Room rooms=facade.detailRoom(1);
		for(int i=0;i<facade.historyGuestRoom(rooms, 2).size();i++){
			System.out.println(facade.historyGuestRoom(rooms, 2).get(i));
		}
		System.out.println("-----------------------------------------------------");
		//facade.importCsvRoom("/home/user/3.csv");
		facade.exportCsvRoom("3.csv");
		
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().getRoomsList().size(); i++) {
			System.out.println(facade.getServiceRooms().getRoomsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
	/*	
		SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");

		facade.getServiceGuests().putGuestRoom("kira",1, format.parse("19.10.2016"), format.parse("30.10.2016"));
		facade.getServiceGuests().saverGuest("guest.txt");;
		facade.init(dateBase);
		
		
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		
		System.out.println(facade.detailRoom(1));
		System.out.println(facade.detailRoom(r.getNumber()));
		
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceOptions().getOptionsList().size(); i++) {
			System.out.println(facade.getServiceOptions().getOptionsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().sortedByName().size(); i++) {
			System.out.println(facade.getServiceGuests().sortedByName().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceGuests().sortedByName().size(); i++) {
			System.out.println(facade.getServiceGuests().sortedByDateOut().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().allFreeRoom(new Date()).size(); i++) {
			System.out.println("asd " + facade.getServiceRooms().allFreeRoom(new Date()).get(i));
		}
		System.out.println("-----------------------------------------------------");
		SimpleDateFormat format=new SimpleDateFormat("dd.MM.yyyy");

		facade.getServiceGuests().putGuestRoom("kira",1, format.parse("19.10.2016"), format.parse("30.10.2016"));
		facade.getServiceGuests().saveGuest(args[1]);
		dateBase = new DataBase(args[0], args[1], args[2],args[3]);
		facade.init(dateBase);
		for (int i = 0; i < facade.getServiceGuests().getGuestsList().size(); i++) {
			System.out.println(facade.getServiceGuests().getGuestsList().get(i));
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < facade.getServiceRooms().allFreeRoom(new Date()).size(); i++) {
			System.out.println("asd " + facade.getServiceRooms().allFreeRoom(new Date()).get(i));
		}
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<facade.getServiceRooms().threeLostGuest(4).length;i++){
			System.out.println(facade.getServiceRooms().threeLostGuest(2)[i]);
		}
		System.out.println("-----------------------------------------------------");		
		System.out.println(facade.getServiceRooms().detailRoom(4));
		System.out.println("-----------------------------------------------------");		
		System.out.println(facade.getServiceRooms().paymentGuest(4));
		
		*/
	}

	

}
