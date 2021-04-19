package quiz;

import java.util.Scanner;

public class B14_GCD {

	/*
		�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����.
		�ִ����� : �� ������ ����� �� ���� ū �����
	*/
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1�� �Է��ϼ��� : ");
		int input1 = sc.nextInt();
		
		System.out.print("����2�� �Է��ϼ��� : ");
		int input2 = sc.nextInt();
		
		int GCD = 1;
		
		int min = Math.min(input1, input2);
		int max = Math.max(input1, input2);
		
		System.out.printf("%d, %d\n", input1, input2);
		
		for(int i = 1; i <= input1; ++i) {
			if(input1 % i == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= input2; ++i) {
			if(input2 % i == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = min; i >= 1; --i) {
			if (min % i == 0 && max % i == 0) {
				GCD = i;
				break;
			}
		}
		System.out.println("GCD: " + GCD);
	}
}
