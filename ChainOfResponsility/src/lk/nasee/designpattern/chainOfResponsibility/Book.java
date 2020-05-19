package lk.nasee.designpattern.chainOfResponsibility;

public class Book {
	
	private String positionName;
	private double bookPrice;
	private double publicationCost;

	
	public Book(String positionName, double bookPrice) {
		this.positionName = positionName;
		this.bookPrice = bookPrice;
	}

	public String getPositionName() {
		return positionName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public double getPublicationCost() {
		return publicationCost;
	}

	public void setPublicationCost(double publicationCost) {
		this.publicationCost = publicationCost;
	}

	
	

}
