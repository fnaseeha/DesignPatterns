package lk.nasee.designpattern.chainOfResponsibility;

public interface Handler {

	public abstract void setSuccesor(Handler h);
	
	public abstract double getPublicationCost(Book p);
}
