import myobj.Tobacco;

public class C04_Static {
	
	/*
		# static (���� ����, Ŭ���� ���� <=> �ν��Ͻ� ����)
		
		- static�� ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
		- �տ� static�� ���� Ŭ������ �ڿ��� ��� �ν��Ͻ����� ���� ���� ���ϰ� �ȴ�.
		- static ������ Ŭ������ �ϳ��ۿ� �������� �����Ƿ� �޸𸮰� ����ȴ�.
		- static ������ Ŭ������ �ϳ��̱� ������ Ŭ������ .�� ��� �����ϴ� ���� ����.
		- static ������ �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�.
		- �ν��Ͻ��� �������� ���� ���� static�� ���� ���ɼ��� �ֱ� ������ static �޼��忡���� �ν��Ͻ� �ڿ��� ����� �� ����.
	*/
	
	public static void main(String[] args) {
	
		// ���� ������ �ν��Ͻ��� ������ static �ڿ��� ����� �� �ִ�.
		// static �ڿ��� Ŭ������ .�� ��� ������ �� �ִ�.
		System.out.println(Lamp.width);
		System.out.println(Lamp.height);
		
		Lamp.changeWidth(500);
//		Lamp.turnOn();
		
		Lamp lamp01 = new Lamp();
		Lamp lamp02 = new Lamp();
		Lamp lamp03 = new Lamp();
		Lamp lamp04 = new Lamp();
	
		lamp03.width = 30;
		
		System.out.println(lamp01.width);
		System.out.println(lamp02.width);
		System.out.println(lamp03.width);
		System.out.println(lamp04.width);
		
		Tobacco tb = new Tobacco();
		
		System.out.println(tb.packOfCigarettes);
		System.out.println(tb.price);
		System.out.println(tb.taxOnCigarettes);
	}
}

class Lamp {
	
	// ������ ������ ��� �������� �ʺ�� ���̴� �����ϴ�.
	static int width = 50;
	static int height = 200;
	
	int[] position;
	double brightness;
	boolean powerOn;

	// static �޼��忡�� static ������ �����ϴ� ���� ����
	static void changeWidth(int width) {
		Lamp.width = width;
	}
	
//	static �������� instance �ڿ��� �����ϴ� ���� �Ұ���
//	static void turnOn() {
//		this.powerOn = true;
//	}
	
}
