package lk.nasee.designpattern.factoryMethod.paperType;

import lk.nasee.designpattern.factoryMethod.NewsPaper;
import lk.nasee.designpattern.factoryMethod.papers.Kesari;

public class MonthlyNewsPaper extends NewsPaper{

	@Override
	protected void setByType() {
		myNewsPapers.add(new Kesari());
		
	}

}
