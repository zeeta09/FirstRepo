package quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double cel;
		double fahr;
		
		System.out.print("����(��) �µ��� �Է��ϼ��� > ");
		cel = sc.nextDouble();
		
		fahr = (cel * 9 / 5) + 32;
		
		System.out.printf("%.1f�ɴ� %.1f��F�Դϴ�.\n", cel, fahr);

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� �µ��� �Է��� �ּ��� > ");
//		double cel = sc.nextInt();
//		double fahr = cel * 9 / 5 + 32;
//		
//		System.out.printf("���� ȭ�� �µ��� %.1f �Դϴ�", fahr);

		
	}
}
