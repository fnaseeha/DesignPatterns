package lk.nasee.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class GroceryShop implements Cloneable {
	
	private String shopName;
	List<Product> products = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void LoadData(){
		for(int i=1;i<8;i++){
			Product p = new Product(i,"Product "+i);
			getProducts().add(p);
		}
	}
	
	@Override
	public String toString() {
		return "GroceryShop [shopName=" + shopName + ", products=" + products + "]";
	}
	
	@Override
	protected GroceryShop clone() throws CloneNotSupportedException {
		
		GroceryShop myShop = new GroceryShop();
		
		//fetching object from old object
		
		for(Product p:this.getProducts()){
			myShop.getProducts().add(p);
		}
		
		return myShop;
	}
	
	

}
