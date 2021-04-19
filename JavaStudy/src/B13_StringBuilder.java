
public class B13_StringBuilder {

	// ���ڿ��� �ٽ� �����ϴ� ����� ���ִ� Ŭ����
	
	public static void main(String[] args) {
		/*
			���ڿ��� �Ųٷ� ����� �����غ���
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
			String Ŭ������ ���� ������ �ſ� ���� ���̴�.
			String Ŭ������ ���� ������ �ϴ� ���� ��ȿ�����̴�.
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
		System.out.println("���ۿ� �ɸ� �ð�: " + taken_time + " �и���");
		
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
		System.out.println("���ۿ� �ɸ� �ð�2: " + taken_time2 + " �и���");
		}
}
