package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	/*
		����ڷκ��� �ܾ �ϳ� �Է¹ް� 
		�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ����� 
		
		�� ȸ��? MOM, BOB, ABBA, MADAM ó�� �¿� ��Ī�� �ܾ�
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ� >> ");
		String word = sc.next();
		
		String result = "PALINDROME";
		
		for (int i = 0; i < word.length() / 2; ++i) {

			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() - i - 1);
			
			if (ch != ch2) {
				result = "NOT PALINDROME";
				break;				
			}
			
//			System.out.println("----------------------------");
//			System.out.println("�̹��� �˻��� ����: " + ch);
//			System.out.println("���ϰ� �Ǵ� ����: " + ch2);
		}
		
		System.out.printf("[%s]�� ����� %s�Դϴ�.\n", word, result);
		
	}
	
}










