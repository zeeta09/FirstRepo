package myobj.Item;

public class Coffee extends Item {
	
	int caffeine;
	
	public Coffee(String name, int price) {
		super(name, price);
		caffeine = 5000;
	}
	
	public void use() {
		System.out.println(name + "�� �Ծ " + caffeine + "��ŭ �ῡ�� �������ϴ�.");
	}
}
