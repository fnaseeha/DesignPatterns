package lk.nasee.designpattern.factoryMethod;

public class FactoryMethodMain {

	public static void main(String[] args) {
		NewsPaper n = NewsPaperFactory.getPaperByType(PaperType.DAILY);
		System.out.println(n);
		
		NewsPaper n2 = NewsPaperFactory.getPaperByType(PaperType.WEEKLY);
		System.out.println(n2);
		
		NewsPaper n3 = NewsPaperFactory.getPaperByType(PaperType.MONTHLY);
		System.out.println(n3);
	}

}
