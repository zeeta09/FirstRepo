
public class B07_charAt {

	public static void main(String[] args) {
		/*
		 	# "문자열".charAt(index);
			 
			 - 해당 문자열에서 원하는 번재의 문자를 char 타입으로 꺼내는 함수 
			 - 첫 번째 문자는 0번 인덱스에 있다.
			
			# "문자열".length();
			
			- 함수를 실행하면 해당 문자열의 길이를 int타입으로 알려준다.
		 */
		
		System.out.println("Hello, Everyone!!!");
		System.out.println("Hello, Everyone!!!".charAt(0));
		System.out.println("Hello, Everyone!!!".charAt(1));
		System.out.println("Hello, Everyone!!!".charAt(10));
		
		String str = "Hello, Everyone!!!!";
		
		System.out.println(str.charAt(7));
		System.out.println("str은 몇 글자짜리 문자열인가요? " + str.length());
		System.out.println(str.charAt(18));
		System.out.println(str.charAt(19));
	}
}
