package quiz;

public class B15_WhileBasicQuiz {

	/*
		while ���� �̿��Ͽ�
		
		1. 1���� 100������ 3�� ����� ����
		2. 200���� 1���� ���
		3. continue�� �̿��Ͽ� 300���� 500������ 7�� ����� ���
		4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 */
	
	public static void main(String[] args) {
		
		// 1. 1���� 100������ 3�� ����� ����

		int i = 0;
		int total = 0;
		
		while (i <= 100) {
			++i;
			if(i % 3 == 0) { 
				System.out.println(i);
				total += i;
			}
		}
		System.out.println(total);
		
		// 2. 200���� 1���� ���
		
		int j = 200;
		while (j > 0) {
			--j;
			System.out.println(j);
		}
		
		// 3. continue�� �̿��Ͽ� 300���� 500������ 7�� ����� ���
		
		int k = 299;
		while (k <= 500) {
			++k;
			if (k % 7 != 0) {
				continue;
			} else {
				System.out.println(k);
			}
		}
		
		// 4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		
		int l = 0;
		int total2 = 0;
		
		while (l < 200) {
			++l;
			if (l % 2 != 0 && l % 3 != 0) {
				total2 +=l;
			}
		}
		System.out.println(total2);
	}
}
