package lk.nasee.designpattern.builder;

public class MyShop {

	public static void main(String[] args) {
		Product p = new Product.ProductBuilder("WaterMelon").setCategory("Fruit").getProduct();
		System.out.println(p);
	}

}
