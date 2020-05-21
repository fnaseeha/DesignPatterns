package lk.nasee.designpattern.memento;

import java.util.ArrayList;

//orginator
public class Hall {

	private ArrayList<Item> items = new ArrayList<>();
	
	
	public ArrayList<Item> getItems() {
		return (ArrayList<Item>) items.clone();
	}
	
	
	public Memento createMemento(){
		return new Memento(getItems());
	}
	
	public void setMemento(Memento m){
		if(m==null){
			System.out.println("Can't undo");
			this.items = null;
		}else{
			this.items = m.getItems();
		}
		
	}

	@Override
	public String toString() {
		return "Hall [items=" + items + "]";
	}


	public void setItems(String name) {
		this.items.add(new Item(name));
		
	}

	
	
	
}
