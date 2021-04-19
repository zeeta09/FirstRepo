package quiz;

import java.util.Scanner;

public class B14_Prime {

	/*
	 	����ڷκ��� ���ڸ� �Է¹����� 
	 	1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ����� 
	 	
	 	�� �Ҽ�: 1�� �ڱ� �ڽ����θ� ������ �������� ��
	 	 ex: 7, 11, 13, 17 ... 	 
	*/
	public static void main(String[] args) {
		
		System.out.print("�Ҽ� ã�� > ");
		int input = new Scanner(System.in).nextInt();
		

		// 10 : 1, 2, 5, 10
		// 13 : 1, 13
		// 30 : 1, 2, 3, 5, 6, .. 30
		
		for (int check = 2; check <= input; ++check) {
			
			int cnt = 0;
			
			// 1�� �ڱ��ڽ��� �����ϰ� �˻縦 �����ϸ� 
			// cnt�� �߻����ڸ��� �Ҽ��� �ƴ��� �� �� �ִ�
			for (int div = 2; div <= Math.sqrt(check); ++div) {
				
				if (check % div == 0) {
					System.out.printf("�˻��ϴ� ����[%d]�� [%d]�� ������ ���������ϴ�.\n", check, div);
					System.out.println("\t�Ҽ��� �ƴմϴ�.");
					cnt++;
					break; // �˻縦 �� ������ �ʿ䰡 ����
				}				
				
			}			
			
			if (cnt == 0) {
				System.out.printf("\t[%d]�� �Ҽ��Դϴ�.\n", check);
			}
			
			System.out.println("------------------------------------------");
			
		}
		
	}
	
}














