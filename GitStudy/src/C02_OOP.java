import myobj.Peach;

public class C02_OOP {
	
	/*
		# ��ü���� ���α׷��� (OOP: Object Oriented Programming)
		
		 - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
		 - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
		   ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
		 - ��ü (Object) : ���� �����ϴ� ��� ���� ���Ѵ� (�繰, ���� ... ���)
		 
		 
		ex: ���
		 - ����� ����: ũ��, ����, �絵, �������, ������ Į�θ� ...
		 - ����� �޼���
		 		-> ������ (ũ�� ��ŭ�� �������� ������)
		 		-> �Դ´� (���� ��ŭ Į�θ��� �پ��� ����� ũ�Ⱑ �پ���)
		 		-> �����Ѵ� (����� �����ϸ� ��������� ������ �����Ѵ�)
	
	
		�� Ŭ���� ���ο� �ִ� �Լ��� �޼����� �θ��� (��� JAVA���� �޼��� �ۿ� ����)
		
		
		# Ŭ���� (Class)
		
		 - ��ü�� ���α׷��� ���� ǥ���� �� 
		 - Ŭ������ ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
		 - Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
		 - Ŭ������ ������ ���� Ÿ���̴�
	*/
	
	// ���α׷� ���� �ÿ� public class�� �ִ� main�� ã�� �� �ִ�
	public static void main(String[] args) {
		
		// Apple Ŭ����(���赵)�� ���� �ν��Ͻ�(����ǰ) a1
		Apple a1 = new Apple();		
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		// �ٸ� ��Ű���� ������ public class�� ����� �� �ִ�
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();		
		
		a1.calorie = 100;
		a2.calorie = 120;
		a3.calorie = 115;
		
		a1.eat();
		a1.eat();
		
		System.out.println(a1.calorie);
		System.out.println(a2.calorie);
		System.out.println(a3.calorie);
		
		String str1 = "abc";
		String str2 = "ccc";
		String str3 = "bb";
		
		/*
		 	myobj ��Ű���� ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ ��
		 	�ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
		 	
		 	�� �ν��Ͻ� ���� 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
		*/
		
	}
	
}

// default class (public�� �� ���� class)
class Apple {	
	/*
		# �ν��Ͻ� ����
		 - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
		 - aka �ʵ�, �Ӽ�, ��� ����, ���� ...	
	*/
	int size;
	int calorie;
	long lifetime;
	double sweet;	
	String color;
	
	/*
	 	# �ν��Ͻ� �޼���
	 	 - �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���	 
	*/
	void eat() {
		size--;
		calorie -= 10;
	}
}











