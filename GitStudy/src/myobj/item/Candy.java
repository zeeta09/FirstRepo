package myobj.item;

public class Candy extends Item {

	int healthy;
	
	public Candy(String name, int price) {
		super(name, price);
		healthy = 10;
	}
	
	public void use() {
		System.out.println(name + "�� �Ծ " + healthy + "��ŭ �� �ǰ��� ���������ϴ�.");
	}	
	
	public static void main(String[] args) {
		new Candy("��ĵ��", 1500).info();		
	}
	
}





