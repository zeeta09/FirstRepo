package quiz;

import java.util.Scanner;

public class B15_Count369 {

	/*
	 	����ڷκ��� ������ �ϳ� �Է¹ް�
	 	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
	 	
	 	3 6 9 13 16 19 23 26 29 30 31 32 33 ...
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. ���ڿ��� Ǯ��
		
		// ������ ���ڿ��� �ٲٴ� �����
//		System.out.println("hello : " + 123);
//		System.out.println("" + 123);
//		System.out.println(Integer.toString(123));		
		
		System.out.print("���� >> ");
		int input = sc.nextInt();
		int cnt = 0;
				
		for (int i = 1; i <= input; ++i) {
			String num_str = "" + i;
			System.out.print(i + ": ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if (num_ch == '3' || num_ch == '6' || num_ch == '9') {
					cnt++;
					System.out.print("¦");					
				}					
			}			
			System.out.println();
		}
		
		System.out.println("�� �ڼ� Ƚ���� : " + cnt + "ȸ");
		
		
		
	}
	
}
















