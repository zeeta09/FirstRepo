package quiz;

import java.util.Scanner;

public class B14_Prime {

	/*
		사용자로부터 숫자를 입력받으면
		1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		
		소수 : 1과 자기 자신으로만 나누어 떨어지는 수(2, 3, 5, 7, 11...)
	 			
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
		int input = sc.nextInt();
				
		for (int check = 2; check <= input; ++check) {
		
			int cnt = 0;
			
			// 1과 자기자신을 제외하고 검사를 진행하면 cnt가 발생하자마자 소수가 아님을 알 수 있다.
			for (int div = 2; div <= Math.sqrt(check); ++div) {
				
				if (check % div == 0) {
					System.out.printf("검사하는 숫자 [%d]는 [%d]로 나누어 떨어졌습니다.\n", check, div);
					System.out.println("\t소수가 아닙니다.");
					cnt++;
					break;
				}
			}
			
			if (cnt == 0) {
				System.out.printf("\t[%d]는 소수입니다.\n", check);
			}
			
			System.out.println("--------------------------------------------");
		}
	}
}
