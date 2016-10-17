package com.example.oleg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.oleg.controller.Facade;
import com.example.oleg.model.StatusRoom;

public class Main {

	public static void main(String[] args) throws ParseException {
		Facade facade = new Facade();
		facade.getServiceRoomList().insertStatusRoom(4, StatusRoom.maintained);
		facade.getServiceRoomList().allRoom();
		System.out.println("--------------------------------------");

		System.out.println(facade.getServiceRoomList().roomDetail(2));
		System.out.println("--------------------------------------");
		facade.getServiceRoomList().sortedByPrice();
		facade.getServiceRoomList().allRoom();
		facade.getServiceRoomList().insertStatusRoom(4, StatusRoom.maintained);
		System.out.println("----------------------------------------");
		
		
		System.out.println(facade.getServiceRoomList().roomDetail(4));
		
		System.out.println("----------------------------------------");
		facade.getServiceGuestList().allGuest();

		System.out.println("----------------------------------------");
		
		for(int i=0;i<facade.getServiceRoomList().getFreeRooms().size();i++){
					
					System.out.println(facade.getServiceRoomList().getFreeRooms().get(i));
		}
		System.out.println(facade.getServiceRoomList().getFreeRooms().size());
		/*String strd="10.10.2016";
		String stro="15.10.2016";
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date d1=format.parse(strd);
		Date d2=format.parse(stro);
		long dd1=d1.getTime();
		long dd2=d2.getTime();
		int res=(int) ((dd2-dd1)/(24*60*60*1000));
		System.out.println(res);*/
		
		
	}

}
