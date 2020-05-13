package lk.nasee.designpattern.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsPaper {

	
    public NewsPaper() {
    	setByType();
	}

	protected List<Paper> myNewsPapers = new ArrayList<>();
	
	protected abstract void setByType();

	@Override
	public String toString() {
		return "NewsPaper [myNewsPapers=" + myNewsPapers + "]";
	}
	
	
}
