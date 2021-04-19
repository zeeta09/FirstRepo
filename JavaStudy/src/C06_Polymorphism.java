import java.util.Scanner;

public class C06_Polymorphism {
	
	/*
		# ��ü�� ������
		
		- ��ü�� �پ��� ���¸� ���� �� �ִ�.
		- ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�.
		- ������ ����������, ����� �ƴϴ�.
		
		# �ڽ� Ŭ������ �θ� Ŭ������ �� �� �ִ� (�� ĳ����)
		
		- �ڽ� Ŭ���� Ÿ���� �θ� Ŭ���� Ÿ���� �Ǵ� ���� ��ĳ�����̶�� �Ѵ�.
		- ��ĳ���õ� ��ü�� �ڽ� Ŭ�������� �����ϴ� �͵��� ��� �ؾ������.
		- �������̵� �� �޼���� �ڽ� Ŭ������ ���� �����Ѵ�.
		
		# �θ� Ŭ������ �ڽ� Ŭ������ �� �� ���� (�ٿ� ĳ����)
		
		- ������ �� ĳ���� �Ǿ��� �ν��Ͻ��� �ٽ� ���� Ÿ�������� �ٿ� ĳ������ �����ϴ�.		
	*/

	public static void main(String[] args) {
		new Food(new PigMeat(), new Vege(), new Balsamic());
	
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str1 = new String();
		
		MainMaterial main_mat = new MainMaterial();
		MainMaterial main_mat2 = new Meat();
		
		Meat meat = new Meat();
		
		doSomethingMainMaterial(new MainMaterial());
		doSomethingMainMaterial(new Meat());
		doSomethingMainMaterial(new Fish());
		doSomethingMainMaterial(new PigMeat());
        
		new Car(new Tire());
        new Car(new TireVer1());
        new Car(new TireVer2());
	
        Police police = new Police();
        police.sayHi();
        police.arrest("�谭��");
        
        // Person���� ��ĳ���� �� Police�� ü���� �� �� ����.
        Person person = police;
        Person person2 = new Person("����ġ", 20, 30);
        // person.arrest();
        person.sayHi();
        
        // �ٿ� ĳ������ Ȱ���� ���� ��� �ٽ� ����ϱ�
		// ���� �����̾��� �ν��Ͻ��� �ٿ� ĳ������ ����
        ((Police) person).arrest("��Ҹ�");
        
        // ������ �ƴϿ��� �ν��Ͻ��� �ٿ� ĳ������ �Ұ���
        // ((Police) person2).arrest("�赵��");
	}
	
	public static void doSomethingMainMaterial(MainMaterial mat) {
		
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
	sauce sauce;
	
	
	public Food(MainMaterial mainMat, Vege vege, Balsamic balsamic) {
		this.mainMat = mainMat;
		this.subMat = vege;
		this.sauce = balsamic;
	}
}

class PorkCutlet {
	public PorkCutlet(PigMeat pig, SubMaterial subMat, sauce sauce) {
		
	}
}

// ���� ���� �θ� Ŭ���� (�����, �����, �ҽ�)
class MainMaterial {}
class SubMaterial {}
class sauce {}

// ����Ḧ ��ӹ��� Ŭ������
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// ����Ḧ ��ӹ��� Ŭ������ ��ӹ��� Ŭ����
class PigMeat extends Meat {}

// ����Ḧ ��ӹ��� Ŭ������
class Vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// �ҽ��� ��ӹ��� Ŭ������
class Salsa extends sauce {}
class Balsamic extends sauce {}

