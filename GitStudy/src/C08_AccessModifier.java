import myobj.Coffee;
import myobj.DiffPackage;

public class C08_AccessModifier {

	/*
	 	# ���� ������ (Access Modifier)
	 	
	 	 - �ٸ� Ŭ�������� �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	 	   ������ ��������� �����Ѵ� 
	 	   
	 	# ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
	 	
	 	 - ���� Ŭ���� ������ �ٸ� �ڿ� (���� ����� �Ÿ�)
	 	 - ���� ��Ű�� ������ �ٸ� �ڿ� 
	 	 - �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	 	 - �ٸ� ��Ű���� �ڿ� (���� �� �Ÿ�)
	 	   
	 	# ���� �������� ����
	 	
	 	 - private
	 	 	�տ� private�� ���� �ڿ��� ���� Ŭ���� ���ο����� ������ �� �ְ� �ȴ�
	 	 	 
	 	 - default (�ƹ��͵� �� ��)
	 	 	���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ� �ȴ�.
	 	 	�ٸ� ��Ű�������� ������ �� ����.
	 	 	
	 	 - protected
	 	 	�տ� protected�� ���� �ڿ��� 
 	 		���� ��Ű�� ���ο����� �����Ӱ� ������ �� �ְ�,
 	 		�ٸ� ��Ű�������� ��ӹ��� Ŭ������ ������ �� �ִ� �ڿ��� �ȴ�.
	 	 
	 	 - public 
	 	 	�ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�.
	 
	*/
	
	public static void main(String[] args) {
		C08_SamePackage instance = new C08_SamePackage();

		instance.protected_method();
		instance.default_method();
		instance.public_method();
		
		DiffPackage instance2 = new DiffPackage();
		
		instance2.public_method();
		
		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, 0);	
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, 0);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOCHA, 2500, 20, 0);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOCHA, 3500, 25, 0);
		
	}
	
}

class Snack {
	int size = 10;
	
	private void eat() {
		System.out.println(size - 1);
	}
}

class HoneyButterChip extends Snack {
	
	private void abc() {
		System.out.println(size);
	}
	
}

class Choco extends DiffPackage {
	
	public Choco() {
		// protected: ��ӹ����� �ٸ� ��Ű�������� ��� ����
		this.protected_method(); 
	}
	
	void abc() {
		Snack s = new Snack();
		System.out.println(s.size);
	}
	
}













