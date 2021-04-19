package myobj.Item;

public class Coffee extends Item {
	
	int caffeine;
	
	public Coffee(String name, int price) {
		super(name, price);
		caffeine = 5000;
	}
	
	public void use() {
		System.out.println(name + "을 먹어서 " + caffeine + "만큼 잠에서 깨었습니다.");
	}
}
