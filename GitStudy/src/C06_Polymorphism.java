import java.util.Scanner;

public class C06_Polymorphism {

	/*
	  	# ��ü�� ������ 
	  	
	  	 - ��ü�� ������ ���¸� ���� �� �ִ� 
	  	 - ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�
	  	 - ������ ���������� ����� �ƴϴ� 
	  
	  	# �ڽ� Ŭ������ �θ� Ŭ������ �� �� �ִ� (�� ĳ����)
	  	
	  	 - �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ� ���� ��ĳ�����̶�� �Ѵ�
	  	 - ��ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �͵��� ��� �ؾ������
	  	 - �������̵�� �޼���� �ڽ� Ŭ�������� ������ ������ ����ȴ�
	  	
	  	# �θ� Ŭ������ �ڽ� Ŭ������ �� �� ���� (�ٿ� ĳ����)
	  	
	  	 - ������ ���������� ��ĳ���õǾ��� �ν��Ͻ��� �ٽ� ���� Ÿ�������� 
	  	   �ٿ� ĳ������ �����ϴ� 
	  	 
	*/	
	public static void main(String[] args) {
		
		new Food(new PigMeat(), new Vege(), new Balsamic());
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str1 = new String();
		
		MainMaterial main_mat = new MainMaterial();				
		MainMaterial main_mat2 = new Tuna();		
						
		doSomethingWithMainMaterial(new MainMaterial());
		doSomethingWithMainMaterial(new Meat());
		doSomethingWithMainMaterial(new Fish());
		doSomethingWithMainMaterial(new PigMeat());
		
		System.out.println(new Fish());
		
		new Car(new Tire());
		new Car(new TireVer1());
		new Car(new TireVer2());
		
		
		Police police = new Police();		
		police.sayHi();
		police.arrest("�谭��");
		
		// Person���� ��ĳ���� �� Police�� ü���� �� �� ���� 
		Person person = police;
		Person person2 = new Person("����ġ", 20, 30);
		// person.arrest();
		person.sayHi(); 
		
		// �ٿ� ĳ������ Ȱ���� ���� ��� �ٽ� ����ϱ�
		
		// ���� �����̾��� �ν��Ͻ��� �ٿ�ĳ������ ����
		((Police) person).arrest("��Ҹ�"); 
		
		// ������ �ƴϾ��� �ν��Ͻ��� �ٿ�ĳ������ �Ұ���
		// ((Police) person2).arrest("�赵��");
	}
	
	public static void doSomethingWithMainMaterial(MainMaterial mat) {
		
	}
}

class Car {		
	Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}
}

class Tire {}
class Tire2 {}

class TireVer1 extends Tire {}
class TireVer2 extends Tire {}

class Food {

	MainMaterial mainMat;
	SubMaterial subMat;
	Sauce sauce;
	
	public Food(MainMaterial mainMat, SubMaterial subMat, Sauce sauce) {
		this.mainMat = mainMat;
		this.subMat = subMat;
		this.sauce = sauce;
	}
	
}

class PorkCutlet extends Food {
	
	public PorkCutlet(PigMeat pig, SubMaterial subMat, Sauce sauce) {
		super(pig, subMat, sauce);
	}
	
}

// ���� ���� �θ� Ŭ���� (�����, �����, �ҽ�)
class MainMaterial {}
class SubMaterial {}
class Sauce {}

// ����Ḧ ��ӹ��� Ŭ������ 
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// ����Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ����
class PigMeat extends Meat {}
class Tuna extends Fish {}

// ����Ḧ ��ӹ��� Ŭ������
class Vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// �ҽ��� ��ӹ��� Ŭ������
class Salsa extends Sauce {}
class Balsamic extends Sauce {}


















