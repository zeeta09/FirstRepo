package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// next(): 다음 단어를 String 타입으로 받아오기 (꽁백, \t 기준)
		// nextLine() : 다음 한 줄을 String 타입으로 받아오기(\n 기준)
		
		/*
		System.out.println("단어를 입력하세요: ");
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
		
		System.out.print("아무거나 입력해 보세요 > ");
		String word = sc.next();
		
		int lastIndex = word.length() - 1;
		
		if (word.charAt(0) == word.charAt(lastIndex)) {
		 System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}
	}
}

