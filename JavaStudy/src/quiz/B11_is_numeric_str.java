package quiz;

import java.util.Scanner;

public class B11_is_numeric_str {

	public static void main(String []args) {
		
		System.out.print("문자열 입력하세요 > ");
		String input = new Scanner(System.in).next();
		
		int numeric_str = 1;
		
		for (int i = 0; i < input.length(); ++i) {
			
			char ch = input.charAt(i);
			
			if (ch < '0' || ch > '9') {
				numeric_str = 0;
				break;
			}
		}
		
		System.out.println("numeric_str: " + (numeric_str > 0 ? "true" : "false"));
	}
}
