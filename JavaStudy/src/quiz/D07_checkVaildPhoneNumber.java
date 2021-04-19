package quiz;

public class D07_checkVaildPhoneNumber {
	
	/*
		사용자로부터 핸드폰 번호를 입력받으면
		율바른 전화번호인지 구분하는 프로그램을 만들어보세요
		
		앞의 세 자리가 숫자
		두 번째 숫자는 세 자리 혹은 네 자리
		세 번째 숫자는 네 자리
		네 번째 또는 여덟 번째 또는 아홉 번째 문자는 '-'
	
	*/
	
	private static boolean checkNumeric (char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkVaildPhoneNumber (String phoneNumber) {
		int len = phoneNumber.length();
		if (len != 12 && len != 13) {
			System.out.println("[invalid] 길이가 올바르지 않음");
			return false;
		}
		
		for (int i = 0 ; i < len; ++i) {
			
			char ch = phoneNumber.charAt(i);
			
			if(i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] 앞의 세 자리에 숫자 아닌 것이 있음");
				return false;
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
				System.out.println("[invalid] 하이픈 자리가 올바르지 않음");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
				System.out.println("[invalid] 가운데 자리에 숫자 아닌 것이 있음");
				return false;
			} else if (i > 7 && (len == 12) || (i > 8 && (len == 13)) && !checkNumeric(ch)) {
				System.out.println("[invalid] 마지막 네 자리에 숫자 아닌 것이 있음");
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		if (checkVaildPhoneNumber("123-112-123a")) {
		}
	}
}
