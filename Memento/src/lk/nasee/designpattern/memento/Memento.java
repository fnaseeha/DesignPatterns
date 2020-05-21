package lk.nasee.designpattern.memento;

import java.util.ArrayList;

public class Memento {

	private ArrayList<Item> items;

	public Memento(ArrayList<Item> items) {
		this.items = items;
	}


	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Memento [items=" + items + "]";
	}


	
	
}
