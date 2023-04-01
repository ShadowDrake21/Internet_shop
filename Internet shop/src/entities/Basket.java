package entities;

public class Basket {
	private Product[] boughtProducts;
	
	public Basket() {};
	public Basket(Product[] boughtProducts) {
		this.boughtProducts = boughtProducts;
	}
	
	public void setBoughtProducts(Product[] boughtProducts) {
		this.boughtProducts = boughtProducts;
	}
	
	public Product[] getBoughtProducts() {
		return boughtProducts;
	}
}
