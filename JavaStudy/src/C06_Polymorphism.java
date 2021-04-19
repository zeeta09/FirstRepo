import java.util.Scanner;

public class C06_Polymorphism {
	
	/*
		# 객체의 다형성
		
		- 객체는 다양한 형태를 지닐 수 있다.
		- 사과는 사과이기도 하고 과일이기도 하다.
		- 과일은 과일이지만, 사과는 아니다.
		
		# 자식 클래스는 부모 클래스가 될 수 있다 (업 캐스팅)
		
		- 자식 클래스 타입이 부모 클래스 타입이 되는 것을 업캐스팅이라고 한다.
		- 업캐스팅된 객체는 자식 클래스에만 존재하던 것들을 모두 잊어버린다.
		- 오버라이드 된 메서드는 자식 클래스의 것을 유지한다.
		
		# 부모 클래스는 자식 클래스가 될 수 없다 (다운 캐스팅)
		
		- 하지만 업 캐스팅 되었던 인스턴스는 다시 원래 타입으로의 다운 캐스팅이 가능하다.		
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
        police.arrest("김강도");
        
        // Person으로 업캐스팅 된 Police는 체포를 할 수 없다.
        Person person = police;
        Person person2 = new Person("전우치", 20, 30);
        // person.arrest();
        person.sayHi();
        
        // 다운 캐스팅을 활용해 원래 기능 다시 사용하기
		// 원래 경찰이었던 인스턴스는 다운 캐스팅이 가능
        ((Police) person).arrest("김소매");
        
        // 경찰이 아니였던 인스턴스는 다운 캐스팅이 불가능
        // ((Police) person2).arrest("김도적");
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

// 제일 높은 부모 클래스 (주재료, 부재료, 소스)
class MainMaterial {}
class SubMaterial {}
class sauce {}

// 주재료를 상속받은 클래스들
class Fish extends MainMaterial {}
class Meat extends MainMaterial {}

// 주재료를 상속받은 클래스를 상속받은 클래스
class PigMeat extends Meat {}

// 부재료를 상속받은 클래스들
class Vege extends SubMaterial {}
class Fruit extends SubMaterial {}

// 소스를 상속받은 클래스들
class Salsa extends sauce {}
class Balsamic extends sauce {}

