package quiz;

import java.util.Scanner;

public class B11_Reverse {

	// 사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요.
	
	public static void main(String[] args) {
		
		/*
		System.out.print("문자열 입력하세요 > ");
		String input = new Scanner(System.in).next();
		
		for (int i = 0; i < input.length(); ++i) {
			
			char ch = input.charAt(input.length() - i - 1);
		
			System.out.println(ch);
		}
		*/
		
		String sentence = "I am iron man";
		for (int i = sentence.length() - 1; i >= 0; --i) {
			
			System.out.println(sentence.charAt(i));
		}
	}
}