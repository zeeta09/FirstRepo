package quiz;

import java.util.Scanner;

public class B07_CheckWord {

	/*
	 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
	 	ù ��° ���ڿ� ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ���
	 	�ƴ϶�� "NOT OK"�� ����غ�����	 
	*/
	
	// next() : ���� �ܾ StringŸ������ �޾ƿ��� (����, \t ����)
	// nextLine() : ���� �� ���� StringŸ������ �޾ƿ��� (\n ����)	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
				
		System.out.print("�ƹ��ų� �Է��غ����� > ");
		String word = sc.next();
		
		int lastIndex = word.length() - 1;
		
		if (word.charAt(0) == word.charAt(lastIndex)) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}

	}
	
}









