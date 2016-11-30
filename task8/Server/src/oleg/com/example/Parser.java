package oleg.com.example;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ListModel;

import com.example.api.Response;
import com.example.oleg.controller.Facade;
import com.example.oleg.controller.IFacade;
import com.example.oleg.model.Guest;
import com.example.oleg.model.Option;
import com.example.oleg.model.Room;
/*
 * команды для запросов
 */
public class Parser {
	private IFacade facade;
	public Parser(){
		facade=Facade.getFacade();
		facade.init();
	}
	
	public Object invoke(Response response){
		String header= response.getHeader();
		@SuppressWarnings("unchecked")
		List<Object>objects=(List<Object>) response.getObject();
		IFacade facade=Facade.getFacade();
		facade.init();
		Object result=null;
		
		try {
			Class<?>clazz=facade.getClass();
			Class[] argTypes = new Class[] { Object[].class };
			Object[] mainArgs = new Object[objects.size()];
			for(int i=0; i<objects.size();i++){
				mainArgs[i]=objects.get(i);
			}
			System.out.println(clazz.getDeclaredMethod(header));

			Method method=clazz.getDeclaredMethod(header, argTypes);
			result=method.invoke(null,(Object)mainArgs);
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String allRoom(){
		System.out.println("qwertyui");
		StringBuilder builder=new StringBuilder();
		List<Room> roomList	=facade.getRoomsList();
		for(Room r: roomList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
		
	}
	
	public String allGuest(){
		StringBuilder builder=new StringBuilder();
		List<Guest> guestList	=facade.getGuestsList();
		for(Guest r: guestList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
		
	}
	
	public String allOption(){
		StringBuilder builder=new StringBuilder();
		List<Option> optionList	=facade.getOptionsList();
		for(Option r: optionList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
		
	}
	
	public void addGuest(List list){
		String name=(String) list.get(1);
		int numberRoom=(int) list.get(2);
		Date dateChange=(Date) list.get(3);
		Date dateOut= (Date) list.get(4);
		facade.putGuestRoom(name, numberRoom, dateChange, dateOut);
		facade.saverGuest("guest.txt");
	}
	
	public String detailRoom(List list){
		System.out.println(list.get(1));
		
		int number= (int) list.get(1);
		System.out.println(number);

		String res=facade.detailRoom(number).toString();
		System.out.println(res);
		return res;
	}
	
	public String allFreeRoom(){
		StringBuilder builder=new StringBuilder();
		List<Room> roomList	=facade.allFreeRoom(new Date());
		for(Room r: roomList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
	}
	
	public String capacityRoomSorter(){
		StringBuilder builder=new StringBuilder();
		List<Room> roomList	=facade.sortByCapacityRoom();
		for(Room r: roomList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
	}
	public void cloneRoom(List list){
		int numberRoom=(int) list.get(1);
		facade.cloneRoom(numberRoom);
		facade.saverGuest("room.txt");
	}
	
	public String sortedByDateOutGuest(){
		StringBuilder builder=new StringBuilder();
		List<Guest> guestList	=facade.sortedByDateOutGuest();
		for(Guest r: guestList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
	}
	
	public String orderGuest(List list){
		StringBuilder builder=new StringBuilder();
		int idGuest=(int) list.get(1);
		List<Option> optionList	=facade.optionGuestOrder(idGuest);
		for(Option r: optionList){
			System.out.println(r.toString());
			builder.append(r.toString()+'\n');
		}
		return builder.toString();
	}
}
