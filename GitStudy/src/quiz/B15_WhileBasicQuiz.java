package quiz;

public class B15_WhileBasicQuiz {

	/*
	
		while���� �̿��Ͽ� ������ ���Ͻÿ�.
		
		1. 1���� 100������ 3�� ����� ���� 
		
		2. 200���� 1���� ���
	 
	 	3. continue�� �̿��Ͽ� 300���� 500������ 7�� ����� ���
	 
	 	4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 	
	*/
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while (i++ < 100) {
			if (i % 3 == 0) {
				sum += i;	
			}
		}
		System.out.println(sum);
		
		i = 200;
		
		while (i > 0) {
			System.out.println(i--);			
		}
		
		i = 299;
		
		while (i++ <= 500) {
			
			if (i % 7 != 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		i = 0;
		sum = 0;
		
		while (i++ < 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		
		System.out.println("4�� ��: " + sum);
	}
	
}











