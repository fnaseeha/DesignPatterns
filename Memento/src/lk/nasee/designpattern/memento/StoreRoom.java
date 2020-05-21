package lk.nasee.designpattern.memento;

import java.util.Stack;

//careTaker
public class StoreRoom {
	
	Stack<Memento> ledTvHistory = new Stack<>();

	public void addMemento(Memento m){
		ledTvHistory.push(m);
	}
	public Memento getMemonto(){
		if(!ledTvHistory.isEmpty())
			return ledTvHistory.pop();
		else
			return null;
	}
}
