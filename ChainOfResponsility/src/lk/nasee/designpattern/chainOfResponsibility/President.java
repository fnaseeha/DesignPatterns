package lk.nasee.designpattern.chainOfResponsibility;

public class President implements Handler {

	private Handler nextHandler;
	@Override
	public void setSuccesor(Handler h) {
		this.nextHandler = h;
		
	}

	@Override
	public double getPublicationCost(Book p) {
		p.setPublicationCost(p.getPublicationCost()+p.getBookPrice()*0.04);
		
		if(p.getPositionName()=="President"){	
			System.out.println("President method called");
			return p.getPublicationCost();
		}else{
			return nextHandler.getPublicationCost(p);
		}
	}

	

}
