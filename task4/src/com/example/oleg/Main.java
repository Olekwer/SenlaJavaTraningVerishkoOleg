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
		System.out.println("----------------------------------------");
		facade.getGuestRoom().paymentAmount(1);
		System.out.println("----------------------------------------");
		facade.getServiceRoomList().threeLastGuest(12);
		for(int i=0;i<facade.getServiceRoomList().threeLastGuest(12).length;i++){
			System.out.println(facade.getServiceRoomList().threeLastGuest(12)[i]);
		}
		System.out.println("----------------------------------------");
		facade.getServiceRoomList().changeRoomPrice(7, 999.99);
		System.out.println(facade.getServiceRoomList().roomDetail(7));
		
		
	}

}
