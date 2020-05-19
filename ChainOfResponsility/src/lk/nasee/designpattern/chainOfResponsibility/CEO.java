package lk.nasee.designpattern.chainOfResponsibility;

public class CEO implements Handler {

	private Handler nextHandler;
	@Override
	public void setSuccesor(Handler h) {
		this.nextHandler = h;
		
	}

	

	@Override
	public double getPublicationCost(Book p) {
		p.setPublicationCost(p.getPublicationCost()+p.getBookPrice()*0.05);
		
		if(p.getPositionName()=="CEO"){	
			System.out.println("CEO method called");
			return p.getPublicationCost();
		}else{
			System.out.println("INVALID Position");
			return 0;
		}
	}

}
