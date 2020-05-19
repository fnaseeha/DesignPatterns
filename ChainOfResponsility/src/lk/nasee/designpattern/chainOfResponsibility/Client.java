package lk.nasee.designpattern.chainOfResponsibility;

public class Client {

	public static void main(String[] args) {
		
		Handler h1 = new Director();
		Handler h2 = new CFO();
		Handler h3 = new President();
		Handler h4 = new CEO();
		
		h1.setSuccesor(h2);
		h2.setSuccesor(h3);
		h3.setSuccesor(h4);
		
		System.out.println(h1.getPublicationCost(new Book("Director",1000)));
		
		System.out.println(h1.getPublicationCost(new Book("CFO",1000)));
		
		System.out.println(h1.getPublicationCost(new Book("President",1000)));
		
		System.out.println(h1.getPublicationCost(new Book("CEO",1000)));
		
	}

}
