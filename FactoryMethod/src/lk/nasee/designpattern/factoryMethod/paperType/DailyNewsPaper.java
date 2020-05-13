package lk.nasee.designpattern.factoryMethod.paperType;

import lk.nasee.designpattern.factoryMethod.NewsPaper;
import lk.nasee.designpattern.factoryMethod.papers.DailyMirror;
import lk.nasee.designpattern.factoryMethod.papers.Thinakaran;

public class DailyNewsPaper extends NewsPaper {

	@Override
	protected void setByType() {
		myNewsPapers.add(new Thinakaran());
		myNewsPapers.add(new DailyMirror());
	}


}
