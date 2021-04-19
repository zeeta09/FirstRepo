package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {
	
	public static void main(String[] args) {
		
		System.out.print("문자열 입력하세요 > ");
		String input = new Scanner(System.in).next();
		
		boolean contain_alphabet = false;
		
		// 반복문을 이용해 문자열을 한 글자씩 분해하여 검사한다.
		
		for (int index = 0; index < input.length(); ++index) {

			char ch = input.charAt(index);
			
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				contain_alphabet = true;
				break;
			}
		}
		
		System.out.println("contain_alphabet: " + contain_alphabet);
	}
}
