package quiz;

public class B11_ForBasicQuiz {

        /*          
                  ����ڰ� ���ڸ� �Է����� ��
                  
                  1. 10���� �Է��� ���ڱ����� �� ���� ���غ����� 
                  2. 1���� �Է��� ���� ������ 5�� ����� ��� ����غ�����         
        */
	
        public static void main(String[] args) {
                
                // 1�� ������ ���� ���ڴ� 10, 2�� ������ ���� ���ڴ� 1
                int start1 = 10, start2 = 1;
                
                int end = 50;
                int sum = 0;
                
                for (int i = Math.min(start1, end); i <= Math.max(start1, end); ++i) {
                        sum += i;                
                }                
                
                System.out.println("10���� user�� �Է��� ���ڱ����� ����: " + sum);
                
                System.out.println();
                System.out.printf("#### %d ~ %d ������ 5�� ����� ��� ####\n", start2, end);
                for (int i = Math.min(start2, end); i <= Math.max(start2, end); ++i) {
                        if (i % 5 == 0) {
                                System.out.println(i);
                        }                        
                }
        }
        
}