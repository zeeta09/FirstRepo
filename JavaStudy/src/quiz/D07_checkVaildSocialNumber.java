package quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_checkVaildSocialNumber {

	/*
		사용자가 주민등록번호를 입력하면
		그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
		
		맨 앞 2자리 숫자
		월 자리에 01 ~ 12 이내의 숫자
		일 자리에 01 ~ 31 이내의 숫자
		일곱 번째 자리에 '-'
		
		맨 앞자리 1 ~ 4

	*/

	private static HashSet<Integer> month31;
	private static HashSet<Integer> month30;
	private static HashSet<Integer> gender2000;
	
	// static을 생성자에서 초기화하면 낭비이므로 static 블록에서 초기화 한다.
	static {
		month31 = new HashSet<>();
		month30 = new HashSet<>();
		gender2000 = new HashSet<>();
		
		// T...elements : 가변인자
		Collections.addAll(month31, 1, 3, 5, 7, 8, 10, 12);
		Collections.addAll(month30, 4, 6, 9, 11);
		Collections.addAll(gender2000, 3, 4, 7, 8);
	}

	
	class InvalidMonthException extends Exception {
		public InvalidMonthException() {
			super("주민등록번호 3, 4에 올바르지 않은 값 입력됨");
		}
	}
	
	class InvalidDatdException extends Exception {
		public InvalidDatdException() {
			super("주민등록번호 5, 6에 올바르지 않은 값 입력됨");
		}
	}
	
	public boolean isValidSocialNumber (String socialNumber) 
			throws InvalidMonthException, InvalidMonthException {
		if (socialNumber.length() != 14 || socialNumber.charAt(6) != '-') {
			System.out.println("잘못된 주민등록 번호입니다.");
			return false;
		}
		
		try {
			int year = Integer.parseInt(socialNumber.substring(0, 2));
			int month = Integer.parseInt(socialNumber.substring(2, 4));
			int day = Integer.parseInt(socialNumber.substring(4, 6));
			int back_number = Integer.parseInt(socialNumber.substring(7));
			
			// 원래는 성별 번호를 보고 3, 4면 2000을 더해야 함
			int gender = socialNumber.charAt(7) - '0';
			year = year + (gender2000.contains(gender) ? 2000 : 1900);
			
			System.out.println();
			
			boolean day29 = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
			
			if (month > 12) {
				throw new InvalidMonthException();
			} else if (month31.contains(month) && day > 31) {
				throw new InvalidDatdException();
			} else if (month30.contains(month) && day > 30) {
				throw new InvalidDatdException();
			} else if (month == 2 && day29 && day > 28) {
				throw new InvalidDatdException();
			} else if (month == 2 && !day29 && day > 29) {
				throw new InvalidDatdException();
			}
		} catch (NumberFormatException e) {
			System.out.println("[Invalid] 숫자가 아닌 것이 있음");
			return false;
		} catch (InvalidMonthException e) {
			System.out.println("[invalid] " + e.getMessage());
			return false;
		} catch (InvalidDatdException e) {
			System.out.println("[invalid] " + e.getMessage());
		} 
		return false;
		
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		try {
			if (new D07_checkVaildSocialNumber().isValidSocialNumber("921119-2222125")) {
				System.out.println("올바른 주민등록번호");
			} else {
				System.out.println("안 올바른 주민등록번호");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}