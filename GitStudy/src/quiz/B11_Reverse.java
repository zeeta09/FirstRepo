package quiz;

public class B11_Reverse {

	// ����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
	public static void main(String[] args) {
		
		String sentence = "I am iron man";
		
		for (int i = sentence.length() - 1; i >= 0; --i) {
			
			System.out.println(sentence.charAt(i));
			
		}
		
	}
}
