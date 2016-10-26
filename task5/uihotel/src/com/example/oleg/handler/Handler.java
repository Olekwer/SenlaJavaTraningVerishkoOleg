package com.example.oleg.handler;

import com.example.oleg.event.FreeRoomsAll;
import com.example.oleg.event.GuestAdd;
import com.example.oleg.event.GuestAll;
import com.example.oleg.event.IEvent;
import com.example.oleg.event.OptionsAll;
import com.example.oleg.event.OrdersAll;
import com.example.oleg.event.RomsAll;
import com.example.oleg.event.RoomDetail;
import com.example.oleg.event.RoomsSorted;
import com.example.oleg.event.StartEvent;

public class Handler {
	
	public IEvent runEvent(IEvent event, int target){
		IEvent newEvent=null;
		if(event instanceof StartEvent){
			
			if(target==1){
				newEvent= new RomsAll();
			}
			if(target==2){
				newEvent= new GuestAll();
			}
			if(target==3){
				newEvent= new OptionsAll();
			}
			if(target==4){
				newEvent=new OrdersAll();
			}
		}
		
		if(event instanceof RomsAll){
			
			if(target==1){
				newEvent= new RoomsSorted();
			}
			if(target==2){
				newEvent= new FreeRoomsAll();
			}
			if(target==3){
				newEvent=new RoomDetail();
			}
		}
		if(event instanceof GuestAll){
			if(target==1){
				newEvent= new GuestAdd();
			}		
		}
		if(target==0){
			newEvent=new StartEvent();
		}
		return newEvent;
	}
}
