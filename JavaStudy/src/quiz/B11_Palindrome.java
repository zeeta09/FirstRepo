package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	/*
		����ڷκ��� �ܾ �ϳ� �Է¹ް�
		�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		ȸ���� �ƴ϶�� "NOT PALINDROME"�� ����غ�����
		
	 */

	public static void main(String[] args) {
		
		/*
		System.out.print("���ڿ� �Է��ϼ��� > ");
		String input = new Scanner(System.in).next();
		
		for (int i = 0; i < input.length(); ++i) {
			
			if(input.charAt(0) == input.charAt(input.length() - 1) && 
					input.charAt(1) == input.charAt(input.length() - 2)) {
				System.out.println("PALINDROME");
				break;
			} else {
				System.out.println("NOT PALINDROME");
				break;
			}
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ� >> ");
		String word = sc.next();
		
		String result = "PALINDROME";
		
		for (int i = 0; i < word.length() / 2; ++i) {
			
			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() - i - 1);
			
			/*
			System.out.println("------------------------");
			System.out.println("�̹��� �˻��� ����: " + ch);
			System.out.println("���ϰ� �Ǵ� ����: " + ch2);
			*/
			
			if (ch != ch2) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.printf("[%s]�� ����� %s �Դϴ�.", word, result);	
	}
}	