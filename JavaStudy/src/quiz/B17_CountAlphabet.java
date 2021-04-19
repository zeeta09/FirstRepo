package quiz;

import java.util.Scanner;

public class B17_CountAlphabet {

	/*
		����ڷκ��� ������ �ϳ� �Է¹ް�
		�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		(��ҹ��� ���о��� �� ��)
	 */
	
	public static void main(String[] args) {
		
		String text = "Evrything is alright";
		
		/*
			# ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
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

