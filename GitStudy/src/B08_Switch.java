
public class B08_Switch {

	public static void main(String[] args) {
		
		/*
			# switch-case�� 
			
			 - ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
			 - ()�ȿ� booleanŸ���� �� �� ����		
			 - if������ �Ϻ��ϰ� ��ü �����ϴ� 
			 - break�� �� ���� break�� ���������� �������鼭 ��� case�� �����Ѵ�.
			 - default�� if���� else ������ �Ѵ�
		*/
		
		int a = 11;
		
		switch (a % 2) {
		case 0:
			System.out.println("a�� ¦���Դϴ�.");
			break;
		case 1:
			System.out.println("a�� Ȧ���Դϴ�.");
			break;
		}
		
		char grade = '��';
		
		switch (grade) {
		case 'E': case 'e':			
			System.out.println("��ü �������Դϴ�.");	
			break;
		case 'K': case 'k':
			System.out.println("12�� �̻� �������Դϴ�.");
			break;
		case 'Y': case 'y':
			System.out.println("15�� �̻� �������Դϴ�.");
			break;
		case 'A': case 'a':
			System.out.println("û�ҳ� �����Ұ��Դϴ�.");
			break;
		default:
			System.out.println("������ ����Դϴ�.");
			break;
		}
		
		int score = 100;
		
		switch (score / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		}
	}
	
}









