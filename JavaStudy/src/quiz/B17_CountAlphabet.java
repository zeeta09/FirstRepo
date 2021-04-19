package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	/*
		사용자로부터 문장을 하나 입력받고
		해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
		(대소문자 구분없이 셀 것)
	 */
	
	public static void main(String[] args) {
		
		String text = "Evrything is alright";
		
		/*
			# 문자열을 쉽게 대문자 또는 소문자로 변환하기
			text.toUpperCase()
			text.toLowerCase()
		*/
		text = text.toUpperCase();
		
		int[] count = new int[26];		
		
		for (int i = 0; i < text.length(); ++i) {
			
			char ch = text.charAt(i);
			
			System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 'A']++;
			}
			
		}
		
		for (int i = 0; i < 26; ++i) {
			
			if (count[i] !=0 ) {
				System.out.println((char)(i + 'A') + ": " + count[i]);
			}
		}
	}
}

