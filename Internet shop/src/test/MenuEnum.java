package test;

public enum MenuEnum {
	ENTER("Войти в систему"), 
	CATALOG("Просмотреть список каталогов товаров"), 
	PRODUCT("Просмотреть список товаров определенного каталога"),
	BASKET("Выбор товара в корзину"),
	BUYING("Покупка товаров, находящихся в корзине");
	
	private String string;
	
	MenuEnum(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	
}
