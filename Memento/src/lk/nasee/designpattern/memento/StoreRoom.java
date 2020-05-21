package lk.nasee.designpattern.memento;

import java.util.Stack;

//careTaker
public class StoreRoom {
	
	Stack<Memento> hallHistory = new Stack<>();

	public void addMemento(Memento m){
		hallHistory.push(m);
	}
	public Memento getMemonto(){
		if(!hallHistory.isEmpty())
			return hallHistory.pop();
		else
			return null;
	}
}
