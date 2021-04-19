package quiz;

import java.util.Scanner;

public class B14_GCD {

	/*
		두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요.
		최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수
	*/
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1을 입력하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.print("숫자2를 입력하세요 : ");
		int input2 = sc.nextInt();
		
		int GCD = 1;
		
		int min = Math.min(input1, input2);
		int max = Math.max(input1, input2);
		
		System.out.printf("%d, %d\n", input1, input2);
		
		for(int i = 1; i <= input1; ++i) {
			if(input1 % i == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= input2; ++i) {
			if(input2 % i == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = min; i >= 1; --i) {
			if (min % i == 0 && max % i == 0) {
				GCD = i;
				break;
			}
		}
		System.out.println("GCD: " + GCD);
	}
}
