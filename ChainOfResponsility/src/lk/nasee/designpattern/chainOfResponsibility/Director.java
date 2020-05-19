package lk.nasee.designpattern.chainOfResponsibility;

public class Director implements Handler {

	private Handler nextHandler;
	@Override
	public void setSuccesor(Handler h) {
		this.nextHandler = h;
		
	}

	
	@Override
	public double getPublicationCost(Book p) {
		p.setPublicationCost(p.getPublicationCost()+p.getBookPrice()*0.02);
		
		if(p.getPositionName()=="Director"){	
			System.out.println("Director method called");
			return p.getPublicationCost();
		}else{
			return nextHandler.getPublicationCost(p);
		}
	}


}
