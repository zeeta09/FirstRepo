package myobj;

import myobj.item.*;

public class Peach {
	
	public int size;
	int calorie;
	long lifetime;
	double sweet;	
	String color;
	
	// public Peach() {}	
	
	// �ٸ� ��Ű������ ������ ���� �������� public�� �ٿ��� �Ѵ�
	public void eat() {
		size--;
		calorie -= 10;		
	}
	
	public static void main(String[] args) {
		Candy candy = new Candy("Ȧ��", 1500);
		Inventory inven = new Inventory(5);
		
	}
	
}



