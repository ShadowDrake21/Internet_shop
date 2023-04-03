package test;

import java.util.Scanner;

import entities.Basket;
import entities.Category;
import entities.Product;
import entities.User;

public class TestApp {
	public static String[] listCategories = new String[] {"Ноутбуки", "Смартфоны"};

	public static void main(String[] args) {

		startApp();
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

	public static void startApp() {
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

		System.out.println("Приветствую вас в интернет-магазине \"A New Way\".");
		while(true) {
			System.out.println("Меню:");
			int choice = goMenu();

			switch(choice) {
			case 0:
				return;
			case 1:
				goLogin();
				break;
			case 2:
				goLookCategories();
				break;
			case 3:
				int category = goLookProducts();
				if(category == 1) {
					printCategory(laptops);
				}
				else if(category == 2) {
					printCategory(smartphones);
				}
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}
	}

	public static int goMenu() {
		for(int i = 0; i < MenuEnum.values().length; i++) {
			System.out.println((i+1) + ". " + MenuEnum.values()[i].getString());
		}

		System.out.print("\nВаш выбор (0 - выход): ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		return choice;
	}

	public static void goLogin() { 
		Scanner scanner = new Scanner(System.in);
		String login, password;

		System.out.println("Введите свой логин и пароль, пожалуйста:");
		System.out.print("Логин: ");
		login = scanner.nextLine();

		System.out.print("Пароль: ");
		password = scanner.nextLine();

		System.out.println("Добро пожаловать, " + login);
		System.out.println();
	}

	public static void goLookCategories() {
		System.out.println("Каталоги товаров: ");

		for(int i = 0; i < listCategories.length; i++) {
			System.out.println((i + 1) + ". " + listCategories[i]);
		}
		System.out.println();
	}
	
	public static int goLookProducts() {
		System.out.println("Каталоги товаров: ");

		for(int i = 0; i < listCategories.length; i++) {
			System.out.println((i + 1) + ". " + listCategories[i]);
		}
		
		System.out.print("\nВаш выбор: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		return choice;
	}
}
