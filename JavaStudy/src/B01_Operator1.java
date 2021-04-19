
public class B01_Operator1 {

	public static void main(String[] args) {
		/*
		  	# ������ (Operator)
		  		- ����� �� ����ϴ� ��
		  		- +, -, *, / ...
		*/
		
		// # ��� ������ 
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("+ : " + (a + b));
		System.out.println("- : " + (a - b));
		System.out.println("* : " + a * b);
		
		// �������� ������ �� ���´�
		System.out.println("/ : " + a / b);
		// ������ �Ǽ��� ������ ��Ȯ�� ���� ����Ѵ� 
		System.out.println("/ : " + a / c);
		System.out.println("/(float) : " + a / (float)b);
		System.out.println("/(double) : " + a / (double)b);
		
		System.out.println("% : " + a % b); // ������
		
		System.out.println("���� : " + Math.pow(a, 3));
		System.out.println("����? : " + (a ^ b)); // ^�� ������ �ƴϴ�
		
		System.out.println("������ : " + Math.sqrt(52.33));
		System.out.println("���밪 : " + Math.abs(-25));
		System.out.println("�Ҽ� ù° �ڸ����� �ݿø� : " + Math.round(3.335));
		/*
		  	Math.round()�� �Ҽ� ù° �ڸ������� �ݿø� �� �� �ִ�.
		  	�ݿø��ϰ� ���� �ڸ��� �Ҽ� ù° �ڸ��� ���鸸ŭ ���� �� 
		  	�ٽ� ������ ����� ���� ���ϴ� �ڸ������� �ݿø� �� �� �ִ�. 		  
		 */
		System.out.println("�Ҽ� ��° �ڸ����� �ݿø� : " + Math.round(3.335 * 100) / 100.0);
		System.out.println("�Ҽ� ù° �ڸ����� �ݿø� : " + Math.round(3.666));
		
		System.out.println("�ø� : " + Math.ceil(1.001));
		System.out.println("���� : " + Math.floor(1.999));
		
		System.out.println("�� ū ���� ����� : " + Math.max(1900, 1500));
		System.out.println("�� ���� ���� ����� : " + Math.min(1900, 1500));
		
		
		// # ��Ʈ ����
		//	&, |, ^, >>, <<
		
		// a = 10, b = 7
		//	-> a = 1010, b = 0111
		
		// 1010
		// 0111
		// ---- &
		// 0010 -> 2
		System.out.println("a & b : " + (a & b)); // AND
		
		// 1010
		// 0111
		// ---- |
		// 1111
		System.out.println("a | b : " + (a | b)); // OR
		
		// 1010
		// 0111
		// ---- ^
		// 1101
		System.out.println("a ^ b : " + (a ^ b)); // XOR		
		
		// 0000001000 << 2
		// 0000100000
		System.out.println(8 << 2); // SHIFT
		
		// 0000001000 >> 2
		// 0000000010
		System.out.println(8 >> 2); // SHIFT 		
	}
	
}












