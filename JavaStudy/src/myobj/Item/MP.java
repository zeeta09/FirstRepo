package myobj.Item;

public class MP extends Item {
	
	int mana;
	
	public MP(String name, int price) {
		super(name, price);
		mana = 3000;
	}
	
	public void use() {
		System.out.println(name + "�� �Ծ " + mana + "��ŭ ������ ȸ���Ǿ����ϴ�.");
	}
}
