package org.example.oleg.builder;

import org.example.oleg.event.AddGuest;
import org.example.oleg.event.AllFreeRoom;
import org.example.oleg.event.AllGuest;
import org.example.oleg.event.AllOption;
import org.example.oleg.event.AllRooms;
import org.example.oleg.event.AmountGuest;
import org.example.oleg.event.CapacityRoomSorter;
import org.example.oleg.event.CloneRoom;
import org.example.oleg.event.DateOutGuest;
import org.example.oleg.event.DetailRoom;
import org.example.oleg.event.LastThreeGuest;
import org.example.oleg.event.NameGuestSorter;
import org.example.oleg.event.NameOptionSorter;
import org.example.oleg.event.OptionAdd;
import org.example.oleg.event.OrderGuest;
import org.example.oleg.event.PaymentGuest;
import org.example.oleg.event.PriceOptionSorter;
import org.example.oleg.event.RoomSorterPrice;
import org.example.oleg.event.SetPriceOption;
import org.example.oleg.event.StarsRoomSorter;
import org.example.oleg.event.StatusRoom;
import org.example.oleg.menu.MenuFactory;

/*
 * создание меню
 */
public class Builder {
	
	private MenuFactory startMenu1;
	private MenuFactory roomMenu1;
	private MenuFactory roomAllFreeMenu1;
	private MenuFactory roomDetailMenu;
	private MenuFactory roomLastThreeGuestMenu1;
	private MenuFactory roomSortedMenu1;
	private MenuFactory roomStatusMenu1;
	private MenuFactory roomCloneMenu;
	private MenuFactory guestMenu1;
	private MenuFactory guestAddMenu1;
	private MenuFactory guestAmountMenu1;
	private MenuFactory guestOrderMenu1;
	private MenuFactory guestPaymentMenu1;
	private MenuFactory guestSortedMenu1;
	private MenuFactory optionMenu1;
	private MenuFactory optionAddMenu1;
	private MenuFactory optionSetPrice1;
	private MenuFactory optionSortedMenu1;
	
	private MenuFactory starsRoomSorter;
	private MenuFactory capacityRoomSorter;
	private MenuFactory priceRoomSorter;
	
	private MenuFactory nameGuestSorter;
	private MenuFactory dateGuestSorter;
	
	private MenuFactory priceOptionSorter;
	private MenuFactory nameOptionSorter;

	
	public Builder() {
		this.createMenu();
	}

	public void createMenu() {

		this.startMenu1 = new MenuFactory("Hello");
		

		this.roomMenu1=new MenuFactory("Room", this.startMenu1, new AllRooms());
		this.startMenu1.getSubMenyList().add(this.roomMenu1);

		this.roomAllFreeMenu1=new MenuFactory("Free rooms", this.roomMenu1, new AllFreeRoom());
		this.roomMenu1.getSubMenyList().add(roomAllFreeMenu1);

	
		
		this.roomDetailMenu=new MenuFactory("Room detail",this.roomMenu1, new DetailRoom());
		this.roomMenu1.getSubMenyList().add(this.roomDetailMenu);

		
		this.roomLastThreeGuestMenu1=new MenuFactory("room Last Guest",this.roomMenu1, new LastThreeGuest());
		this.roomMenu1.getSubMenyList().add(this.roomLastThreeGuestMenu1);


		this.roomSortedMenu1=new MenuFactory("Room Sorted",this.roomMenu1);
		this.roomMenu1.getSubMenyList().add(this.roomSortedMenu1);
		

		this.roomStatusMenu1= new MenuFactory("starus room", this.roomMenu1, new StatusRoom());
		this.roomMenu1.getSubMenyList().add(this.roomStatusMenu1);

	
		this.guestMenu1=new MenuFactory("Guest", this.startMenu1, new AllGuest());
		this.startMenu1.getSubMenyList().add(this.guestMenu1);
		

		this.guestAddMenu1=new MenuFactory("Add guest", this.guestMenu1, new AddGuest());
		guestMenu1.getSubMenyList().add(this.guestAddMenu1);
		

		this.guestAmountMenu1 = new MenuFactory("guest Amount", this.guestMenu1, new AmountGuest());
		guestMenu1.getSubMenyList().add(this.guestAmountMenu1);
		

		this.guestOrderMenu1= new MenuFactory("guest Order", this.guestMenu1, new OrderGuest());
		this.guestMenu1.getSubMenyList().add(this.guestOrderMenu1);
		

		this.guestPaymentMenu1= new MenuFactory("guest Payment",this.guestMenu1, new PaymentGuest());
		this.guestMenu1.getSubMenyList().add(this.guestPaymentMenu1);

		this.guestSortedMenu1=new MenuFactory("guest Sorted",this.guestMenu1);
		this.guestMenu1.getSubMenyList().add(this.guestSortedMenu1);
		
		
		this.optionMenu1=new MenuFactory("option", this.startMenu1, new AllOption());
		this.startMenu1.getSubMenyList().add(this.optionMenu1);		
		
		this.optionAddMenu1= new MenuFactory("option Add", this.optionMenu1, new OptionAdd());
		this.optionMenu1.getSubMenyList().add(this.optionAddMenu1);				
		
		this.optionSetPrice1= new MenuFactory("optionSetPrice", this.optionMenu1, new SetPriceOption());
		this.optionMenu1.getSubMenyList().add(this.optionSetPrice1);
	
		this.optionSortedMenu1=new MenuFactory("option Sorted", this.optionMenu1);
		this.optionMenu1.getSubMenyList().add(this.optionSortedMenu1);
		
		this.roomCloneMenu=new MenuFactory("Clone Room",this.roomMenu1,new CloneRoom());
		this.roomMenu1.getSubMenyList().add(this.roomCloneMenu);
		
		this.starsRoomSorter=new MenuFactory("stars Room Sorter",this.roomSortedMenu1, new StarsRoomSorter());
		this.roomSortedMenu1.getSubMenyList().add(this.starsRoomSorter);
		
		this.capacityRoomSorter=new MenuFactory("capacity Room Sorter",this.roomSortedMenu1, new CapacityRoomSorter());
		this.roomSortedMenu1.getSubMenyList().add(this.capacityRoomSorter);
		
		this.priceRoomSorter=new MenuFactory("price Room Sorter",this.roomSortedMenu1, new RoomSorterPrice());
		this.roomSortedMenu1.getSubMenyList().add(this.priceRoomSorter);
		
		this.nameGuestSorter=new MenuFactory("name Guest Sorter",this.guestSortedMenu1, new NameGuestSorter());
		this.guestSortedMenu1.getSubMenyList().add(this.nameGuestSorter);
		
		this.dateGuestSorter=new MenuFactory("date Guest Sorter",this.guestSortedMenu1, new DateOutGuest());
		this.guestSortedMenu1.getSubMenyList().add(this.dateGuestSorter);
		
		this.nameOptionSorter=new MenuFactory("name Option Sorter",this.optionSortedMenu1, new NameOptionSorter());
		this.optionSortedMenu1.getSubMenyList().add(this.nameOptionSorter);
		
		this.priceOptionSorter=new MenuFactory("name Option Sorter",this.optionSortedMenu1, new PriceOptionSorter());
		this.optionSortedMenu1.getSubMenyList().add(this.priceOptionSorter);
		
		
		this.startMenu1.setHelp();
		this.guestMenu1.setHelp();
		this.roomMenu1.setHelp();
		this.optionMenu1.setHelp();
		this.roomSortedMenu1.setHelp();
		this.guestSortedMenu1.setHelp();
		this.optionSortedMenu1.setHelp();
		
		
				
		
	}
	
	public MenuFactory getStartMenu(){
		return this.startMenu1;
	}
	public MenuFactory getGuestAddMenu1() {
		return guestAddMenu1;
	}
	public MenuFactory getGuestAmountMenu1() {
		return guestAmountMenu1;
	}
	public MenuFactory getGuestMenu1() {
		return guestMenu1;
	}
	public MenuFactory getGuestOrderMenu1() {
		return guestOrderMenu1;
	}
	public MenuFactory getGuestPaymentMenu1() {
		return guestPaymentMenu1;
	}
	public MenuFactory getGuestSortedMenu1() {
		return guestSortedMenu1;
	}
	public MenuFactory getOptionAddMenu1() {
		return optionAddMenu1;
	}
	public MenuFactory getOptionMenu1() {
		return optionMenu1;
	}
	public MenuFactory getOptionSetPrice1() {
		return optionSetPrice1;
	}
	public MenuFactory getOptionSortedMenu1() {
		return optionSortedMenu1;
	}
	public MenuFactory getRoomAllFreeMenu1() {
		return roomAllFreeMenu1;
	}
	public MenuFactory getRoomDetailMenu() {
		return roomDetailMenu;
	}
	public MenuFactory getRoomLastThreeGuestMenu1() {
		return roomLastThreeGuestMenu1;
	}
	public MenuFactory getRoomMenu1() {
		return roomMenu1;
	}
	public MenuFactory getRoomSortedMenu1() {
		return roomSortedMenu1;
	}
	public MenuFactory getRoomStatusMenu1() {
		return roomStatusMenu1;
	}
	public MenuFactory getStartMenu1() {
		return startMenu1;
	}
}
