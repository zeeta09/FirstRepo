package quiz;

import java.util.Scanner;

public class B11_is_contain_alpha {
	
	public static void main(String[] args) {
		
		System.out.print("���ڿ� �Է��ϼ��� > ");
		String input = new Scanner(System.in).next();
		
		boolean contain_alphabet = false;
		
		// �ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ�.
		
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
