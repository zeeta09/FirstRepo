
public class B07_CharAt {

	public static void main(String[] args) {
		/*
		  	# "���ڿ�".charAt(index);
		  	
		  	 - �ش� ���ڿ����� ���ϴ� ��°�� ���ڸ� charŸ������ ������ �Լ�	
		  	 - ù ��° ���ڴ� 0�� �ε����� �ִ�
		  	 
		  	# "���ڿ�".length();
		  	 
		  	 - �Լ��� �����ϸ� �ش� ���ڿ��� ���̸� intŸ������ �˷��ش� 
		*/
		
		System.out.println("Hello, everyone!!!");
		System.out.println("Hello, everyone!!!".charAt(0));
		System.out.println("Hello, everyone!!!".charAt(1));
		System.out.println("Hello, everyone!!!".charAt(10));
				
		String str = "Hello, everyone!!!!";
		
		System.out.println(str.charAt(7));
		System.out.println("str�� �� ����¥�� ���ڿ��ΰ���? " + str.length());
		System.out.println(str.charAt(18));
		System.out.println(str.charAt(19));
	}
	
}











