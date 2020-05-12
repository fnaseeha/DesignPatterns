package lk.nasee.designpattern.prototype;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		GroceryShop g = new GroceryShop();
		
		g.setShopName("ABC Shop");
		g.LoadData();
		g.getProducts().remove(1);
		
		GroceryShop g1 = (GroceryShop) g.clone();
		g1.setShopName("PQR Shop");
		
		
		System.out.println(g);
		System.out.println(g1);

	}

}
