package myobj.Item;

public class HP extends Item {
		
	int healthy;
		
	public HP(String name, int price) {
		super(name, price);
		healthy = 2000;
	}

	public void use() {
		System.out.println(name + "�� �Ծ " + healthy + "��ŭ ü���� ȸ���Ǿ����ϴ�.");
	}
}


