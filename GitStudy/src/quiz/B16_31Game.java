package quiz;

import java.util.Scanner;

public class B16_31Game {

	/*
	  	31 ������ ����� ������
	  	
	  	1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�. 
	  	   (1, 2, 3 �ۿ� ������ �� ����)
	  	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	  	3. ������ �������� �����Ѵ�
	  	4. �������� 31 �̻��� ���ڸ� ���� �÷��̾ �й��Ѵ�  
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int PLAYER = 0, COMPUTER = 1;
		
		int num = 0;
		int turn = (int)(Math.random() * 2);
		
		while (true) {
			
			if (turn == PLAYER) {
				
				int user = -1;
				
				while (true) {
					System.out.print("����� �� > ");
					user = sc.nextInt();
					
					if (user > 0 && user <= 3) {
						break;
					} else {
						System.out.println("�߸��� ���Դϴ�. [1, 2, 3] �߿� �������ּ���");
					}	
				}
				
				num += user;
				
				System.out.printf("����� %d�� ���� [%d]\n", user, num);
				turn = COMPUTER;				
			} else if (turn == COMPUTER) {	
				int com;
				
				if (num % 4 == 0) {
					com = 2;  
				} else if (num % 4 == 1) {
					com = 1;
				} else if (num % 4 == 2) {
					com = (int)(Math.random() * 3 + 1);
				} else {
					com = 3;
				} 				
				 
				num += com;
				
				System.out.println("��ǻ���� ���� > " + com);				
				System.out.printf("��ǻ�Ͱ� %d�� ���� [%d]\n", com, num);
				turn = PLAYER;
			}
			
			if (num >= 31) {
				String winner = turn == PLAYER ? "�÷��̾�" : "��ǻ��"; 
				System.out.printf("<< '%s'�� �¸� >>\n", winner);
				break;
			}
		}
		
		System.out.println("������ �������ϴ�!");
		
	}
	
}






