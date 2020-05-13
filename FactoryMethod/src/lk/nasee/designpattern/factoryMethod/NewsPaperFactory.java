package lk.nasee.designpattern.factoryMethod;

import lk.nasee.designpattern.factoryMethod.paperType.DailyNewsPaper;
import lk.nasee.designpattern.factoryMethod.paperType.MonthlyNewsPaper;
import lk.nasee.designpattern.factoryMethod.paperType.WeeklyNewsPaper;

public class NewsPaperFactory {
	
	public static NewsPaper getPaperByType(PaperType type){
		
		switch(type){
		
			case DAILY:
				return new DailyNewsPaper();
			case MONTHLY:
				return new MonthlyNewsPaper();
			case WEEKLY:
				return new WeeklyNewsPaper();
			default:
				return null;
		} 
	
	}

}
