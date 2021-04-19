
public class B13_StringBuilder {

	// 문자열을 다시 조립하는 기능이 모여있는 클래스
	
	public static void main(String[] args) {
		/*
			문자열을 거꾸로 뒤집어서 생성해보기
		*/
		
		String text = "Spring Framework";
		
		System.out.println(text);
		
		/*
		int a = 10;
		a += 5;
		a += 10;
		a += 30;
		
		String s = "";
		s += "Hello";
		s += ", World";
		s += "!!!";
		*/
		
		/*
			String 클래스는 누적 연산이 매우 느린 편이다.
			String 클래스로 잦은 연산을 하는 것은 비효율적이다.
		*/
		
		long start_time = System.currentTimeMillis();
		int test_freq = 1000000;
		
		for(int test= 0; test < test_freq; ++test) {
			String reversed_text = "";
			
			for (int i = 0; i < text.length(); ++i) {
				reversed_text += text.charAt(text.length() - 1 - i);
			}
		}
		
		long taken_time = System.currentTimeMillis() - start_time;
		System.out.println("제작에 걸린 시간: " + taken_time + " 밀리초");
		
		/**/
		
		long start_time2 = System.currentTimeMillis();
		
		
		for (int test = 0; test < test_freq; ++test) {
			StringBuilder reversed_text2 = new StringBuilder();
			
			for (int i = 0; i < text.length(); ++i)	{
			char ch = text.charAt(text.length() - 1 - i);
			reversed_text2.append(ch);
			}
		}	
		long taken_time2 = System.currentTimeMillis() - start_time2;
		System.out.println("제작에 걸린 시간2: " + taken_time2 + " 밀리초");
		}
}
