package lk.nasee.designpattern.builder;

public class Product {
	
	//mandatory
	private String title;
	
	//optional
	private String price;
	private String category;
	private String imageUrl;
	
	public Product(String title, String price, String category, String imageUrl) {
		this.title = title;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
	}
			

	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + ", category=" + category + ", imageUrl="
				+ imageUrl + "]";
	}
	
	public static class ProductBuilder {

		//mandatory
		private String title;
		
		//optional
		private String price;
		private String category;
		private String imageUrl;
		
		
		public ProductBuilder(String title) {
			this.title = title;
		}

		public ProductBuilder setPrice(String price) {
			this.price = price;
			return this;
		}
		
		public ProductBuilder setCategory(String category) {
			this.category = category;
			return this;
		}
		
		public ProductBuilder setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
			return this;
		}
		
		public Product getProduct(){
			return new Product(title,price,category,imageUrl);
		}
	}

}
