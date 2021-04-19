package quiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// final이 함께 선언된 변수는 나중에 값을 변경할 수 없다.
		final double WON_TO_DOLLAR = 0.00089;
	
		System.out.print("환전을 원하는 원화 금액을 입력해 주세요. (수수료 1.75%) > ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		
		System.out.println(Math.round(usd * 0.9825 * 100) / 100.0 + "USD");
		
		// System.out.printf("%d원은 %.2fUSD입니다.\n", korMoney, usd * 0.9825);
		
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전을 원하는 원화 금액을 입력하세요 > ");
		int won = sc.nextInt();
		
		double dollar = 0.00089;
		double fee = 0.0175;
		
		System.out.printf("환전 금액은 %.2f 입니다.", won * dollar * (1-fee));
		
		*/
	
	}
}	
