
public class B12_SwapValue {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		int tmp;
		
		System.out.printf("a : %d, b : %d\n", a, b);
		
		// tmp�� a�� ��� ����
		tmp = a;

		// a�� b�� ����. (a�� �������)
		a = b;
		
		// �Ʊ� �����س��� a�� b�� ����
		b = tmp;
		
		System.out.printf("a : %d, b : %d\n", a, b);
	}
}
