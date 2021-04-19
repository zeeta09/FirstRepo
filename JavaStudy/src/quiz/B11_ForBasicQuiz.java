package quiz;

public class B11_ForBasicQuiz {

        /*          
                  사용자가 숫자를 입력했을 때
                  
                  1. 10부터 입력한 숫자까지의 총 합을 구해보세요 
                  2. 1부터 입력한 숫자 사이의 5의 배수만 모두 출력해보세요         
        */
	
        public static void main(String[] args) {
                
                // 1번 문제의 시작 숫자는 10, 2번 문제의 시작 숫자는 1
                int start1 = 10, start2 = 1;
                
                int end = 50;
                int sum = 0;
                
                for (int i = Math.min(start1, end); i <= Math.max(start1, end); ++i) {
                        sum += i;                
                }                
                
                System.out.println("10부터 user가 입력한 숫자까지의 총합: " + sum);
                
                System.out.println();
                System.out.printf("#### %d ~ %d 사이의 5의 배수만 출력 ####\n", start2, end);
                for (int i = Math.min(start2, end); i <= Math.max(start2, end); ++i) {
                        if (i % 5 == 0) {
                                System.out.println(i);
                        }                        
                }
        }
        
}