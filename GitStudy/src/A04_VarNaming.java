
public class A04_VarNaming {

	public static void main(String[] args) {
		
		/*
			# �츮�� ������ ����ؾ� �ϴ� ����
				
			1. ���� �ѹ��� ������ �� �ִ�
			  	- ���� ������ ã�ƴٴϸ鼭 ������ �ʿ䰡 ��������
			
			2. ���� �ǹ̸� �ο��� �� �ִ�
				- ������ �̸��� ���� �ش� ���� �뵵�� ���� ������ �ľ��� �� �ִ�
				- ������ �̸��� �� ���°��� �ſ� �߿��ϴ� 		  
		 */
		
		int apple_count = 15;
		int apple_price = 493;
		final int APPLE_CALORIE = 110;
		int apple_gram = 50;
		
		System.out.println("����� ���� : " + apple_count);
		System.out.println("����� �� ���� : " + apple_count * apple_price + "��");
		System.out.println("����� ���� Į�θ� : " + APPLE_CALORIE + "kcal");
		System.out.println("����� �� Į�θ� : " + apple_count * APPLE_CALORIE + "kcal");
		System.out.println("����� ���� ���� : " + apple_gram + "g");
		System.out.println("����� �� ���� : " + apple_count * apple_gram + "g");
		
		/*
		  	# ���� �۸� ��Ģ (���� ����)
		  	
		  	(1) �� �ܾ� �̻��� �̾���� �������� ����� �� _�� Ȱ���Ѵ� (snake_case)
		  		ex: apple_count, minsu_age, sujin_grade
		  		
		  	(2) �� �ܾ� �̻��� �̾���� �������� ����� �� �빮�ڸ� Ȱ���Ѵ� (camelCase)
		  		ex: appleCount, minsuAge, sujinGrade
		  	
		  	(3) ������ ù ���ڴ� �ҹ��ڸ� ����Ѵ� 
		  	
		  	(4) Ŭ������ ù ���ڴ� �빮�ڸ� ����Ѵ� 
		  	
		  	(5) ���α׷� ������ ���� ������ ���� ����(���)�� ��� �빮�ڸ� ����Ѵ� 
		  		ex: APPLE_PRICE, APPLE_GRAM
		  	
		  	(6) ������ ����ִ� ���� ������ �� �ִ� ������ �ܾ ������� 
		  
		  
		  	# ���� �۸� ��Ģ (�ʼ�)

		  	(1) ������ ù ��° ���ڴ� ���ڰ� �� �� ����
		  		ex: 1st, 2nd, 4pple
		  		
		  	(2) ������ ���̿��� ������ ����� �� ���� 
		  	
		  	(3) Ư�����ڴ� _�� $�� ����� �� �ִ�
		  	
		  	(4) �̹� �ڹٿ��� ����ϰ� �ִ� Ű����� ���������� ����� �� ����
		  		(Eclipse������ �̹� ����ϰ� �ִ� Ű���带 ��������� �����ش�)
		  		
		  		ex: byte, float, double, int, final, public, static, void ... 		  	
		 */
		
	}
	
}




















