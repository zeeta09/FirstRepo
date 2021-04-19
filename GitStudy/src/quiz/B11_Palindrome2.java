package quiz;

public class B11_Palindrome2 {

	public static void main(String[] args) {
		
		String word = "ABABA";
		
		boolean palindrome = true;
		
		for (int i = 0, j = word.length() - 1; i < word.length() / 2; ++i, --j) {
			
			// System.out.printf("'%c' VS '%c'\n", word.charAt(i), word.charAt(j));
			
			if (word.charAt(i) != word.charAt(j)) {
				palindrome = false;
				break;
			}
			
		}
		
		System.out.println(palindrome ? "ȸ���Դϴ�." : "ȸ���� �ƴմϴ�.");
		
	}
	
}
