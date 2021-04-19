package quiz;

import java.util.Scanner;

public class B11_Palindrome {

	/*
		사용자로부터 단어를 하나 입력받고
		해당 단어가 회문이라면 "PALINDROME"을 출력
		회문이 아니라면 "NOT PALINDROME"을 출력해보세요
		
	 */

	public static void main(String[] args) {
		
		/*
		System.out.print("문자열 입력하세요 > ");
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
		
		System.out.print("단어 >> ");
		String word = sc.next();
		
		String result = "PALINDROME";
		
		for (int i = 0; i < word.length() / 2; ++i) {
			
			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() - i - 1);
			
			/*
			System.out.println("------------------------");
			System.out.println("이번에 검사할 문자: " + ch);
			System.out.println("비교하게 되는 문자: " + ch2);
			*/
			
			if (ch != ch2) {
				result = "NOT PALINDROME";
				break;
			}
		}
		System.out.printf("[%s]의 결과는 %s 입니다.", word, result);	
	}
}	