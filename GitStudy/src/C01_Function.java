
public class C01_Function {

	/*
	 	# �Լ� (Function)
	 
	 	 - ����� �̸� �����صΰ� ���߿� ������ ���� ��
	 	 	 
	 	 - �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�
	 	  
	 	 - �����ص� �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ�
	 	   ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ�ȴ�
	 	   	 	 
	 	 - ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
	 	   �۾��� �ݺ��� ���� �� �ִ�
	 	    
	 	 - �Լ��� ������ �� �ش� �Լ��� ��ȯ�� ���� Ÿ���� �տ� ����д�
	 	 
	 	 - ���� Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� ��Ÿ����
	*/	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			print_rabbit();	
			print_rabbit();
			print_rabbit();
		}		
		
		System.out.println(apple_basket(155, 10));
	}
	
	// ex: ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�

	/*
		 public static : ���߿� ������ ��
		 int : �� �Լ��� ���� ����� Ÿ�� (���� Ÿ��, return type)
		 apple_basket : Ÿ�� �ڿ� �Լ����� ������ �� �ִ�
		 apple_basket(int apple, int size) 
		 	: �� �Լ��� ������ �� intŸ�� ���� �� �� ���� �޵��� ���� (�Ű� ����, argument)		 	
	*/
	public static String apple_basket(int apple, int size) {		
		int result;
		
		if (apple % size == 0) {
			result = apple / size;
		} else {
			result = apple / size + 1;
		}
		
		// return: �Լ��� ��� �����Ű��, �� �Լ��� ȣ���� ���� ���� �����ش�
		return "�ʿ��� �ٱ����� ������ " + result + "�� �Դϴ�.";		
	}	
	
	public static void print_rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >$");
	}
	
}







