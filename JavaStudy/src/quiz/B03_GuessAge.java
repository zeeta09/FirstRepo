package quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �ظ� �Է��� �ּ��� > ");
		int birth = sc.nextInt();
		
		System.out.print("���� > ");
		int year = sc.nextInt();
		
		System.out.printf("����� �ѱ� ���̴� %d�� �Դϴ�", year - birth + 1);
	}
}
