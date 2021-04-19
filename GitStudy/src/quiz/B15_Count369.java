package quiz;

import java.util.Scanner;

public class B15_Count369 {

	/*
	 	사용자로부터 정수를 하나 입력받고
	 	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지 세어보세요
	 	
	 	3 6 9 13 16 19 23 26 29 30 31 32 33 ...
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 문자열로 풀기
		
		// 정수를 문자열로 바꾸는 방법들
//		System.out.println("hello : " + 123);
//		System.out.println("" + 123);
//		System.out.println(Integer.toString(123));		
		
		System.out.print("정수 >> ");
		int input = sc.nextInt();
		int cnt = 0;
				
		for (int i = 1; i <= input; ++i) {
			String num_str = "" + i;
			System.out.print(i + ": ");
			
			for (int j = 0; j < num_str.length(); ++j) {
				char num_ch = num_str.charAt(j);
				
				if (num_ch == '3' || num_ch == '6' || num_ch == '9') {
					cnt++;
					System.out.print("짝");					
				}					
			}			
			System.out.println();
		}
		
		System.out.println("총 박수 횟수는 : " + cnt + "회");
		
		
		
	}
	
}
















