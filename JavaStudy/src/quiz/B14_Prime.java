package quiz;

import java.util.Scanner;

public class B14_Prime {

	/*
		����ڷκ��� ���ڸ� �Է¹�����
		1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
		
		�Ҽ� : 1�� �ڱ� �ڽ����θ� ������ �������� ��(2, 3, 5, 7, 11...)
	 			
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int input = sc.nextInt();
				
		for (int check = 2; check <= input; ++check) {
		
			int cnt = 0;
			
			// 1�� �ڱ��ڽ��� �����ϰ� �˻縦 �����ϸ� cnt�� �߻����ڸ��� �Ҽ��� �ƴ��� �� �� �ִ�.
			for (int div = 2; div <= Math.sqrt(check); ++div) {
				
				if (check % div == 0) {
					System.out.printf("�˻��ϴ� ���� [%d]�� [%d]�� ������ ���������ϴ�.\n", check, div);
					System.out.println("\t�Ҽ��� �ƴմϴ�.");
					cnt++;
					break;
				}
			}
			
			if (cnt == 0) {
				System.out.printf("\t[%d]�� �Ҽ��Դϴ�.\n", check);
			}
			
			System.out.println("--------------------------------------------");
		}
	}
}
