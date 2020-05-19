package lk.nasee.designpattern.chainOfResponsibility;

public class CFO implements Handler {

	private Handler nextHandler;
	@Override
	public void setSuccesor(Handler h) {
		this.nextHandler = h;
		
	}

	
	@Override
	public double getPublicationCost(Book p) {
		p.setPublicationCost(p.getPublicationCost()+p.getBookPrice()*0.03);
		
		if(p.getPositionName()=="CFO"){	
			System.out.println("CFO method called");
			return p.getPublicationCost();
		}else{
			return nextHandler.getPublicationCost(p);
		}
	}


}
