package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
	
		/*
		[ �˸��� ���ǽ��� �������� ]

		1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
		2. char�� ���� b�� �����̳� ���� �ƴ� �� true
		3. char�� ���� c�� ����('0' ~ '9')�� �� true
		4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
		5. char�� ���� e�� �ѱ��� �� true
		6. char�� ���� f�� �Ϻ����� �� true        
		7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
		*/   
		
		Scanner sc = new Scanner(System.in);
		
		
		char a = 'Q';
		char b = '	';
		char c = '9';
		char d = 'A';
		char e = '��';
		char f = '��';
		String user_input;
		
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		System.out.println("2. " + (b != ' ' && b != '\t'));
		System.out.println("3. " + (c >= '0' || c <= '9'));
		System.out.println("4. " + ((d >= 'A' && d <='Z') || (d >='a' && d <= 'z')));
		System.out.println("5. " + (e > 0xAC00 && e <= 0xD7A3));
		System.out.println("5. " + (e >= '��' && e <= '�R'));
		
		System.out.printf("%X\n", (int)'�R');
		
		System.out.println("6. " + ((f >= 0x3040 && f <= 0x309F) || (f >= 0x30A0 && f <= 0x30FF)));

		System.out.print("���ڿ��� �Է��ϼ��� > ");
		user_input = sc.next();
		
		System.out.println(user_input.equals("exit"));
		
	}
}


     