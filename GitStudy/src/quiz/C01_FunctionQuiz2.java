package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {

	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2	 	
	 	    
	 	 1. �ִ밪�� �Ű������� ���� ������
	 	    0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	    range �Լ��� �������� (�ִ밪 �̸�)
	 	    
	 	    ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	    
	 	 2. �ּҰ��� �ִ밪�� �Ű������� ������ 
	 	    �� ���̿� �����ϴ� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ� 
	 	    range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	 	    
	 	    ex: range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	 	    
	 	 3. �ּҰ��� �ִ밪�� �������� �Ű������� ������ 
	 	    �ּҰ����� �����Ͽ� �ִ밪���� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	    range �Լ��� �������� (�ּҰ� �̻�, �ִ밪 �̸�)
	 	    
	 	    ex: range(50, 56, 5)�� ��� -> [50, 55]
	 	    	range(50, 55, 5)�� ��� -> [50]	 
	*/
	public static int[] range(int end) {
		int[] bound = new int[end];
		
		for (int i = 0; i < end; ++i) {
			bound[i] = i;
		}
		
		return bound;
	}
	
	// �Ű������� ���� Ȥ�� Ÿ���� �ٸ��� ���� �Լ����� ����� �� �ִ� 
	// (�Լ��� �����ε�, function overloading) 
	public static int[] range(int start, int end) {
		if (start >= end) {
			return null;  // �߸��� ���� �� return���� �Լ��� ������ �����Ű��  
		}
		
		int[] bound = new int[end - start];
		
		for (int i = 0, num = start; i < bound.length; ++i, ++num) {
			bound[i] = num;
		}
		
		return bound;
	}
	
	public static int[] range(int start, int end, int increment) {
		int len = (int)Math.ceil((end - start) / (double)increment);
		
		int[] bound = new int[len];
		
		for (int i = 0; i < bound.length; ++i) {
			bound[i] = start;
			start += increment;
		}
		
		return bound;
	}
	
	public static void main(String[] args) {		
		System.out.println(Arrays.toString(range(10)));
		System.out.println(range(10)[3]);
	
		System.out.println(Arrays.toString(range(10, 25)));
		System.out.println(Arrays.toString(range(25, 10)));
		
		System.out.println(Arrays.toString(range(50, 56, 5)));
	}
	
}








