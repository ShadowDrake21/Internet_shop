package test;

import entities.Basket;
import entities.Category;
import entities.Product;
import entities.User;

public class TestApp {
	public static void main(String[] args) {
		Category laptops = new Category("Ноутбуки", new Product[] 
				{
						new Product("Acer Aspire 7 A715-42G-R3EZ", 30999.0, 4.71f), 
						new Product("Apple MacBook Air 13\" M1 256GB 2020", 44499.0, 4.51f),
						new Product("ASUS E410 (R410MA-212.BK128)", 9999.0, 3.6f)
				}
				);

		Category smartphones = new Category("Смартфоны", new Product[]
				{
						new Product("Samsung Galaxy M33 5G 6/128GB Brown", 8499.50, 4.1f), 
						new Product("Samsung Galaxy S23 Ultra 12/256GB Phantom Black", 57999.0, 4.19f),
						new Product("Apple iPhone 14 Pro Max 256GB Space Black", 59999.0, 5f),
						new Product("Infinix Note 12 (X663D) 6/128GB Jewel Blue", 7699.0, 4.9f)
				}
				);

		User user1 = new User("Anonimus123","SlavaUkraine_2023", new Basket(new Product[] {
				new Product("Samsung Galaxy M33 5G 6/128GB Brown", 8499.50, 4.1f), 
				new Product("ASUS E410 (R410MA-212.BK128)", 9999.0, 3.6f)}
				)
				);
		
		User user2 = new User("HeroOfTheSun15","Good123_4321", new Basket(new Product[] {
				new Product("Infinix Note 12 (X663D) 6/128GB Jewel Blue", 7699.0, 4.9f), 
				new Product("ASUS E410 (R410MA-212.BK128)", 9999.0, 3.6f),
				new Product("Apple MacBook Air 13\" M1 256GB 2020", 44499.0, 4.51f)}
				)
				);
		
		printCategory(laptops);
		printCategory(smartphones);
		
		printBasket(user1);
		printBasket(user2);
	}
	
	public static void printCategory(Category category) {
		System.out.println("Название категории: " + category.getName());
		
		System.out.println("Товары:");
		for(Product product : category.getProducts()) {
			System.out.println(product.toString());
		}
		System.out.println();
	}
	
	public static void printBasket(User user) {
		System.out.println("Совершенные покупки пользователем " + user.getLogin() + ": ");
		for(Product product : user.getBasket().getBoughtProducts()) {
			System.out.println(product.toString());
		}
		System.out.println();
	}
}
