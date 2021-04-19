import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;

public class D08_String {

	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/pineapple";
		
		// split(delimiter exp) : ���ڿ��� ���ϴ� �������� �ڸ� �� ���ڿ� �迭�� ��ȯ�Ѵ�.
		String[] splitted_fruits = fruits.split("/");
		
		System.out.println(Arrays.toString(splitted_fruits));
		
		for (String fruit : splitted_fruits) {
			System.out.println(fruit);
		}
		
		// join(delim, �̾���̰� ���� ��) : �ڿ� ������ ���ڿ��� ��� delim���� �̾���δ�.
		String join_result1 = String.join("... ", splitted_fruits);
		String join_result2 = String.join("-", "Java", "is", "cool");
		String join_result3 = String.join(", ", splitted_fruits);
		
		HashSet<StringBuilder> set = new HashSet();
		
		set.add(new StringBuilder("Hello"));
		set.add(new StringBuilder("my name is"));
		set.add(new StringBuilder("John Doe"));
		
		String join_result4 = String.join("--", set);
		
		System.out.println(join_result1);
		System.out.println(join_result2);
		System.out.println(join_result3);
		System.out.println(join_result4);
		
		// substring(start) : start���� ���������� ���ڿ��� �߶� ��ȯ
		// substring(start, end) : start���� end�̸����� ���ڿ��� �߶� ��ȯ
		System.out.println("Hello, Everyone!".substring(3));
		System.out.println("Hello, Everyone!".substring(0, 5));
		System.out.println("Hello, Everyone!".substring(5));
		
		// replace() : ���ڿ��� ġȯ�Ѵ�. 
		String emails = "abc123@naver.com, abc123@naver.com, abc123@naver.com"; 
		
		String replaced = emails.replace("@naver.com", "@gmail.com");
		
		System.out.println(replaced);
		
		// format(format, value) : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�.
		String text = String.format("������ %c���� �Դϴ�\n", '��');
		System.out.println(text);
		
		// contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�.
		System.out.println("pineapple".contains("apple"));
		
		// startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�.
		System.out.println("pineapple".startsWith("pine"));
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�.
		System.out.println("resource/image/���.jpeg".startsWith("resource/image/"));
		System.out.println("resource/image/���.jpeg".endsWith(".jpeg"));
		
		// getBytes(charset) : ���ڿ��� byte[]�� ��ȯ�Ѵ� (������ ���� �غ�)
		String data = "���õ� ���� �Ϸ� ��������";
		
		byte[] byte_arr = null;
		try {
			byte_arr = data.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("�������� �ʴ� ���ڵ� Ÿ�� �ͼ���");
			System.exit(0);
		}
		
		for (byte b : data.getBytes()) {
			System.out.printf("%d ", b);
		}
		System.out.println();
		
		// �����ڸ� �̿��� byte[]�� �ٽ� ���ڿ��� ��ĥ �� �ִ�(���޹��� �����͸� ��ȯ)
		// byte[]�� ���� ���� ���� ���ڵ� Ÿ���� ����ؾ� �Ѵ�.
		try {
			System.out.println(new String(byte_arr, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// trim() : ���ڿ� �ٱ����� ������ �������ش�.
		String str1 = " abc123";
		String str2 = "abc123 ";
		String str3 = " Hello Java ";
		
		System.out.println(str1.equals(str2));
		
		str1 = str1.trim();
		str2 = str2.trim();
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.trim());
		
		// toUpperCase() : ���ڿ��� ��� �빮�ڷ� ��ȯ�� ���ο� �ν��Ͻ� ��ȯ
		System.out.println(str3.toUpperCase().trim().substring(3, 5));
		
		// toLowerCase() : ���ڿ��� ��� �ҹ��ڷ� ��ȯ�� ���ο� �ν��Ͻ� ��ȯ
		System.out.println(str1.toLowerCase().trim());
		
		// �� ���� �빮�� �Ǵ� �ҹ��ڷ� ������ �� ���ϱ�
		str1 = "JAVA";
		str2 = "java";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase() : ��ҹ��� ������� equals
		
		str1 = "Hello Java";
		str2 = "hello JAVA";
		
		System.out.println("'" + str1 + "'" + "VS" + "'" + str2 + "'");
		System.out.println("equals: " + str1.equals(str2));
		System.out.println("equlas(i): " + str1.equalsIgnoreCase(str2));
		
		//getChars(start, end, ���� ��, ���� ����) : char[]�� ���ڿ��� ���ϴ� �κ��� ���� �� �ִ�.
		char[] buffer = new char[20];
		
		Arrays.fill(buffer, '#');
		
//		for (int i = 0; i < buffer.length; ++i) {
//			buffer[i] = '#';
//		}
		
		"Hello World!!".getChars(6, 11, buffer , 10);
		System.out.println(buffer);
	}
}
