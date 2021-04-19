package myobj.Item;

public class HP extends Item {
		
	int healthy;
		
	public HP(String name, int price) {
		super(name, price);
		healthy = 2000;
	}

	public void use() {
		System.out.println(name + "을 먹어서 " + healthy + "만큼 체력이 회복되었습니다.");
	}
}


