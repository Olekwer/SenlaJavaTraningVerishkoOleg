package oleg.org;


public class Main {

	public static void main(String[] args) {
		
		BaseList baseList=new BaseList();
		
		for(int i=0;i<baseList.getGuests().size();i++){
			System.out.println(baseList.getGuests().get(i).toString());
		}
		
		for (int i = 0; i < baseList.getRooms().size(); i++) {
			System.out.println(baseList.getRooms().get(i).toString());
		}

	}

}
