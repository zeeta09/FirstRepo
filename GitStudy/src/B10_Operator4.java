
public class B10_Operator4 {

	public static void main(String[] args) {
		
		/*
		  	# ���� ������
		  	
		  	  = : ������ ������ �������� ���� �����Ѵ�		  
		*/
		int num = 10;
		num = num + 20;
		num = num + 5;		
		System.out.println(num);
		
		/*
		  	# ���� ���� ������ 
		
			  - ������ ����� ������Ű�� ������		  
		*/
		num = 10;
		System.out.println(num += 15); // num = num + 5
		System.out.println(num -= 3);  // num = num - 3
		System.out.println(num *= 2);  // num = num * 2
		System.out.println(num /= 4);  // num = num / 4
		System.out.println(num %= 3);  // num = num % 3
		
		/*
		  	# ���� ������ 
		  	
		  	  - ������ ����� 1�� ������Ű�� ������		
		  	  - ++, --�� ��ġ�� ���� ����� �޶�����  
		*/
		num = 10;
		
		num++; // num = num + 1
		
		System.out.println(num);
		
		num--; // num = num - 1  
		
		System.out.println(num);
		
		
		// ++, --�� �ڿ� ���̸� �ش� ���� ��� ����� ������ �Ŀ� ���� ���Ѵ�
		// ++, --�� �տ� ���̸� �ش� ���� ����� �����ϱ� ���� ���� ���Ѵ�
		num = 3;
		
		System.out.println(num++);
		System.out.println(num);
	}
	
}
















