package lk.nasee.designpattern.factoryMethod.paperType;

import lk.nasee.designpattern.factoryMethod.NewsPaper;
import lk.nasee.designpattern.factoryMethod.papers.SundayObserver;
import lk.nasee.designpattern.factoryMethod.papers.TheSundayLeader;

public class WeeklyNewsPaper extends NewsPaper {

	@Override
	protected void setByType() {
		myNewsPapers.add(new SundayObserver());
		myNewsPapers.add(new TheSundayLeader());
	}

}
