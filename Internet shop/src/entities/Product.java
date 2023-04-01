package entities;

public class Product {
	private String name;
	private double price;
	private float rate;
	
	public Product() {}
	public Product(String name, double price, float rate) {
		this.name = name;
		this.price = price;
		this.rate = rate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public float getRate() {
		return rate;
	}
	
	@Override
	public String toString() {
		return "Продукт " + name + ", цена = " + price + ", рейтинг = " + rate + " звезды.";
	}
}
