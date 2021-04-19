package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13_InputRightThing {

	/*
		����ڷκ��� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ��������.
		(�߸��� ���� �ԷµǾ �������� ���� �ʰ�, �ùٸ� ���� �ԷµǸ� ��� �� ���α׷� ����)
	*/
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			try {
//				System.out.println("���� > ");
//			int num = sc.nextInt();
//			System.out.println("�Է��Ͻ� ���� " + num + "�Դϴ�.");
//			break;
//			} catch (InputMismatchException e) {
//				System.out.println("�߸��� �Է��Դϴ�.");
//				String stuck = sc.nextLine();
//				System.out.println("�ɷ��ִ� �� ��: " + stuck);
//			}
//		}
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		int a = inputInt("���� > ");
		int b = inputInt("�� ��° ���� > ");
		
		System.out.println("Input �Լ��� �Է¹��� ��: " + a);
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
	}
	
	public static int inputInt(String message) {
		int num;
		
		while(true) {
			try {
				System.out.println(message);
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		return num;
	}
}