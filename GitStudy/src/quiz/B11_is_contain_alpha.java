package quiz;

public class B11_is_contain_alpha {

	/*
	 	����ڰ� �Է��� ���ڿ��� 
	 	���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���  
	*/	
	public static void main(String[] args) {
		
		String word = "I have a dream";
		String word2 = "���� ���� �־��";
		
		// word = word2;
		
		boolean contain_alphabet = false;
		
		// �ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ� 
		for (int index = 0; index < word.length(); ++index) {
			
			char ch = word.charAt(index);
			
			// ex: "1234abc567"
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				// �ϳ��� �и��� ���� ch�� ���ĺ��� ��� �����ϴ� ��
				contain_alphabet = true;
				break; // �ϳ��� ã���� �� �̻� �ݺ����� ������ ������ ����.
			}
			
		}
		
		System.out.println("contain_alphabet: " + contain_alphabet);
	}
	
}





