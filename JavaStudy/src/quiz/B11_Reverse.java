package quiz;

import java.util.Scanner;

public class B11_Reverse {

	// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����.
	
	public static void main(String[] args) {
		
		/*
		System.out.print("���ڿ� �Է��ϼ��� > ");
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