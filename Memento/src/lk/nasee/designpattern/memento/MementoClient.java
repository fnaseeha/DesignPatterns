package lk.nasee.designpattern.memento;

public class MementoClient {

	public static void main(String[] args) {
		Hall hall = new Hall();
		hall.setItems("Sofa");
		
		hall.setItems("Table");
		
		StoreRoom storeRoom = new StoreRoom();
		storeRoom.addMemento(hall.createMemento());
		System.out.println("Hall state..."+hall);
		
		hall.setItems("TV");
		storeRoom.addMemento(hall.createMemento());
		
		System.out.println("Hall state..."+hall);
		
		hall.setItems("Calender");
		
		System.out.println("Hall state..."+hall);
		
		//restoring
		hall.setMemento(storeRoom.getMemonto());
		System.out.println("Hall state Restoring ..."+hall);
		
		hall.setMemento(storeRoom.getMemonto());
		System.out.println("Hall state Restoring ..."+hall);
		
		hall.setMemento(storeRoom.getMemonto());
		System.out.println("Hall state Restoring ..."+hall);
	}

}
