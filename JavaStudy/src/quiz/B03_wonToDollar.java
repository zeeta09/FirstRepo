package quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// final�� �Բ� ����� ������ ���߿� ���� ������ �� ����.
		final double WON_TO_DOLLAR = 0.00089;
	
		System.out.print("ȯ���� ���ϴ� ��ȭ �ݾ��� �Է��� �ּ���. (������ 1.75%) > ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		
		System.out.println(Math.round(usd * 0.9825 * 100) / 100.0 + "USD");
		
		// System.out.printf("%d���� %.2fUSD�Դϴ�.\n", korMoney, usd * 0.9825);
		
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȯ���� ���ϴ� ��ȭ �ݾ��� �Է��ϼ��� > ");
		int won = sc.nextInt();
		
		double dollar = 0.00089;
		double fee = 0.0175;
		
		System.out.printf("ȯ�� �ݾ��� %.2f �Դϴ�.", won * dollar * (1-fee));
		
		*/
	
	}
}	
