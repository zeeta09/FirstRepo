
public class B07_charAt {

	public static void main(String[] args) {
		/*
		 	# "���ڿ�".charAt(index);
			 
			 - �ش� ���ڿ����� ���ϴ� ������ ���ڸ� char Ÿ������ ������ �Լ� 
			 - ù ��° ���ڴ� 0�� �ε����� �ִ�.
			
			# "���ڿ�".length();
			
			- �Լ��� �����ϸ� �ش� ���ڿ��� ���̸� intŸ������ �˷��ش�.
		 */
		
		System.out.println("Hello, Everyone!!!");
		System.out.println("Hello, Everyone!!!".charAt(0));
		System.out.println("Hello, Everyone!!!".charAt(1));
		System.out.println("Hello, Everyone!!!".charAt(10));
		
		String str = "Hello, Everyone!!!!";
		
		System.out.println(str.charAt(7));
		System.out.println("str�� �� ����¥�� ���ڿ��ΰ���? " + str.length());
		System.out.println(str.charAt(18));
		System.out.println(str.charAt(19));
	}
}
