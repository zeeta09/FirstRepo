
public class B09_Operator3 {

	public static void main(String[] args) {
		
		/*
			# ���� ������
 			
 			- ������ if���� �� �ٷ� ǥ���� �� �ִ�.
 			- ���� ? �� : �ƴϿ�;
	
		 */
			int apple = 25;
			int size = 10;
			
			int needs = apple % size == 0 ? apple / size : apple / size + 1;
			
			boolean isEven = apple % 2 == 0;
			
			System.out.println("�ʿ��� �ٱ��� ������ " + needs + "�� �Դϴ�.");
			
			System.out.printf("����� ������ %s�Դϴ�.", isEven ? "¦��" : "Ȧ��");
	
	}
}
