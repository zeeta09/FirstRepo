package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// next(): ���� �ܾ String Ÿ������ �޾ƿ��� (�ǹ�, \t ����)
		// nextLine() : ���� �� ���� String Ÿ������ �޾ƿ���(\n ����)
		
		/*
		System.out.println("�ܾ �Է��ϼ���: ");
		String user_word = sc.nextLine();
		
		int word_lenght = user_word.length();
		
		System.out.println(user_word.charAt(0));
		System.out.println(user_word.charAt(word_lenght - 1));
		
		if (user_word.charAt(0) == (user_word.charAt(word_lenght - 1))) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
		 */
		
		System.out.print("�ƹ��ų� �Է��� ������ > ");
		String word = sc.next();
		
		int lastIndex = word.length() - 1;
		
		if (word.charAt(0) == word.charAt(lastIndex)) {
		 System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}
}

