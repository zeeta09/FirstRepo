package quiz;

import java.util.Scanner;

public class B03_wonToDollar {
	
	// �ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������  
	// (���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%) 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// final�� �Բ� ����� ������ ���߿� ���� ������ �� ����
		final double WON_TO_DOLLAR = 0.00089;		
		
		System.out.print("�ѱ� ���� �Է����ּ���. �޷��� �ٲ�帳�ϴ�. (������ 1.75%) > ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		double exchange_fee = usd * 0.0175;
		
		System.out.println(Math.round(usd * 0.9825 * 100) / 100.0 + "$");
		
		// System.out.printf("%d���� %.2fUSD�Դϴ�.\n", korMoney, usd * 0.9825);
	}
	
}











