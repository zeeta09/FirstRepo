package myobj.Item;

public class MP extends Item {
	
	int mana;
	
	public MP(String name, int price) {
		super(name, price);
		mana = 3000;
	}
	
	public void use() {
		System.out.println(name + "을 먹어서 " + mana + "만큼 마나가 회복되었습니다.");
	}
}
