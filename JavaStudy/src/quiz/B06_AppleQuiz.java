package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("�����ϰ� ���� ����� ������ �Է��ϼ��� > ");
		int apple = sc.nextInt();
		int basket = apple / 10;
		
		if ( 0 > basket ) {
			System.out.println("������ �Է��� �� �����ϴ�.");
		} else if (apple % 10 == 0) {
			System.out.printf("�ٱ����� ����: %d", basket);
		} else {
			System.out.printf("�ٱ����� ����: %d", basket + 1);
		}
		*/
		
		int apple;
		int size = 10;
		
		System.out.print("�����ϰ� ���� ����� ���� >> ");
		apple = sc.nextInt();
		
		if (apple < 0) {
			System.out.println("������ �Է��� �� �����ϴ�.");
		} else if (apple % size != 0) {
			System.out.println("�ʿ��� �ٱ����� ���� : " + (apple / size + 1));
		} else {
			System.out.println("�ʿ��� �ٱ����� ���� : " + apple / size);
		}
		
		/*
		if (apple < 0) {
			System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
		} else {
			System.out.println("�ʿ��� �ٱ����� ���� : " + (int)Math.ceil(apple / (double) size));
		}
		*/
	}
}