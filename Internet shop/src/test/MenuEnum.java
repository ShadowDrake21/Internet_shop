package test;

public enum MenuEnum {
	ENTER("����� � �������"), 
	CATALOG("����������� ������ ��������� �������"), 
	PRODUCT("����������� ������ ������� ������������� ��������"),
	BASKET("����� ������ � �������"),
	BUYING("������� �������, ����������� � �������");
	
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
