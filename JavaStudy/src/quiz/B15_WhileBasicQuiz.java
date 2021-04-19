package quiz;

public class B15_WhileBasicQuiz {

	/*
		while 문을 이용하여
		
		1. 1부터 100까지의 3의 배수의 총합
		2. 200부터 1까지 출력
		3. continue를 이용하여 300부터 500사이의 7의 배수만 출력
		4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 */
	
	public static void main(String[] args) {
		
		// 1. 1부터 100까지의 3의 배수의 총합

		int i = 0;
		int total = 0;
		
		while (i <= 100) {
			++i;
			if(i % 3 == 0) { 
				System.out.println(i);
				total += i;
			}
		}
		System.out.println(total);
		
		// 2. 200부터 1까지 출력
		
		int j = 200;
		while (j > 0) {
			--j;
			System.out.println(j);
		}
		
		// 3. continue를 이용하여 300부터 500사이의 7의 배수만 출력
		
		int k = 299;
		while (k <= 500) {
			++k;
			if (k % 7 != 0) {
				continue;
			} else {
				System.out.println(k);
			}
		}
		
		// 4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
		
		int l = 0;
		int total2 = 0;
		
		while (l < 200) {
			++l;
			if (l % 2 != 0 && l % 3 != 0) {
				total2 +=l;
			}
		}
		System.out.println(total2);
	}
}
