
public class B04_Operator2 {

	public static void main(String[] args) {
		
		/*
			# 비교 연산자
		
			- 비교 연산자의 결과는 참 또는 거짓이다 (boolean 타입이다)
			- 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다.
		*/
		
		int a = 6, b = 5;
	
		System.out.printf("a = %d, b = %d 일 때\n", a, b);
		System.out.println("a > b\t: " + (a > b));
		System.out.println("a > b\t: " + (a < b));
		System.out.println("a >= b\t: " + (a >= b));
		System.out.println("a <= b\t: " + (a <= b));
		System.out.println("a == b\t: " + (a == b));	// 두 값이 같으면 true
		System.out.println("a != b\t: " + (a != b));	// 두 값이 다르면 true

		/*
			# 논리 연산자
		
			- boolean 타입 값으로 하는 연산
			- && : 양 옆의 값이 모두 true 일 때만 true (AND)
			- || : 양 옆의 값 중 하나만 true여도 true (OR)
			- !  : true면 false, false면 true (NOT)
		 */
		
		System.out.println("\n### AND ###");
		System.out.println(true && true);		// T
		System.out.println(true && false);		// F
		System.out.println(false && true);		// F
		System.out.println(false && false);		// F
		
		System.out.println("\n### OR ###");
		System.out.println(true || true);		// T
		System.out.println(true || false);		// T
		System.out.println(false || true);		// T
		System.out.println(false || false);		// F
		
		System.out.println("\n### NOT ###");
		System.out.println(!true);		// F
		System.out.println(!false);		// T
		
		System.out.println();
		
		int x = 3,  y = 1, z = 3;
		System.out.println("x가 10보다 작고 3의 배수면 통과: " + (x > 5 && x % 3 == 0));
		System.out.println("x, y, z가 모두 3의 배수면 통과: " + (x % 3 == 0 && y % 3 == 0 && z % 3 == 0));
	
		System.out.println("x, y, z가 모두 3의 배수가 아닐 때 통과: " + (x % 3 != 0 && y % 3 != 0 && z % 3 != 0));
		System.out.println("x, y, z가 모두 3의 배수가 아닐 때 통과: " + !(x % 3 == 0 || y % 3 == 0 || z % 3 == 0));
	}
	
}
