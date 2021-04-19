
public class B04_Operator2 {

	public static void main(String[] args) {
		
		/*
		 	# �� ������
		 	
			- �� ������ ����� �� �Ǵ� �����̴� (boolean Ÿ���̴�)
			- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
		*/ 
		int a = 6, b = 5;
		
		System.out.printf("a = %d, b = %d �� ��\n", a, b);
		System.out.println("a > b\t: " + (a > b));
		System.out.println("a < b\t: " + (a < b));
		System.out.println("a >= b\t: " + (a >= b));
		System.out.println("a <= b\t: " + (a <= b));		
		System.out.println("a == b\t: " + (a == b)); // �� ���� ������ true
		System.out.println("a != b\t: " + (a != b)); // �� ���� �ٸ��� true
		
		/*		
			# �� ������
			
			- boolean Ÿ�� ������ �ϴ� ����
			- && : �� ���� ���� ��� true�� ���� true (AND)
			- || : �� ���� �� �� �ϳ��� true���� true (OR)
			- !  : true�� false, false�� true (NOT)
		*/		
		System.out.println("\n#### AND ####");
		System.out.println(true && true);	// T
		System.out.println(true && false);	// F
		System.out.println(false && true);	// F
		System.out.println(false && false);	// F		
		
		System.out.println("\n#### OR ####");
		System.out.println(true || true);	// T
		System.out.println(true || false);	// T
		System.out.println(false || true);	// T
		System.out.println(false || false);	// F
		
		System.out.println("\n#### NOT ####");
		System.out.println(!true);	// F
		System.out.println(!false);	// T
		
		int x = 3, y = 6, z = 10;
		
		System.out.println("x�� 10���� �۰� 3�� ����� ���: " + (x < 10 && x % 3 == 0));
		System.out.println("3���� ��� 3�� ����� ���: " 
				+ (x % 3 == 0 && y % 3 == 0 && z % 3 == 0));
		
		// �������� : x, y, z�� ��� 3�� ����� �ƴ� �� true�� ������ �񱳿����� ��������
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0);
		
		System.out.println(!(x % 3 == 0 || y % 3 == 0 || z % 3 == 0));		
 
	}
	
}













