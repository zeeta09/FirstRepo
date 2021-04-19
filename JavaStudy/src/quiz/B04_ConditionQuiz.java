package quiz;

public class B04_ConditionQuiz {
	public static void main(String[] args) {
		
		int a = 15, b = 2, c = 7, d = 21, e = 51;
		
		int hour = 22;
		int year = 2021;
		
		int minsuAge = 10, cheolsuAge = 8;
		int minsuBirth = 1, cheolsuBirth = 4;
		
		boolean powerOn = false;
		
		String str = "yes";
		
		// 비교를 할 때 변수가 왼쪽에 있는 것이 좋다
		
		System.out.println("1. 변수 a가 10보다 크고 20보다 작을 때 " + (a > 10 && a < 20));
		System.out.println("2. 변수 b가 짝수일 때 " + (b % 2 == 0));
		System.out.println("3. 변수 c가 7의 배수일 때 " + (c % 7 == 0));
		System.out.println("4. 변수 hour가 0미만 24이상이 아니고, 12이상일 때 " + (hour > 0 && hour < 24 && hour >= 12));
//		System.out.println("4. 변수 hour가 0미만 24이상이 아니고, 12이상일 때 " + (!(hour < 0 || hour >= 24) && hour >= 12));
		
		System.out.println("5. 변수 d와 e의 차이가 30일 때 " + (Math.abs(d - e) == 30));
//		System.out.println("5. 변수 d와 e의 차이가 30일 때 " + (d - e == 30 || e - d == 30));
		
		
		
		System.out.println("6. 변수 year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		System.out.println("7. 민수가 철수보다 2살 많으면 " + (cheolsuAge + 2 == minsuAge));
		
		System.out.println("8. 민수가 철수보다 생일이 3달 빠르면 " + (cheolsuBirth - 3 == minsuBirth));
		
		System.out.println("9. boolean형 변수 powerOn이 false일 때 " + !powerOn);
		
		// 문자열(참조형 타입)은 ==으로 비교하면 안된다
		// 참조형 타입의 값을 비교할 때는 해당 클래스에 정의되어 있는 equals()라는 메서드를 이용해야 한다.
		System.out.println("10. 문자열 참조변수 str이 yes일 때 " + (str == "yes"));
		System.out.println(str.equals("yes"));
		
		// # 기본형 타입과 참조형 타입의 차이점
		//	- 기본 타입은 내부 데이터의 크기를 예측하기 쉽다 (차곡차곡 쌓이는 메모리를 사용한다, Stack)
		//	- 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다 (여기저기 막 쓰는 메모리를 사용한다, Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
	}
}
