package quiz;

import java.util.Scanner;

public class B03_GuessAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 해를 입력해 주세요 > ");
		int birth = sc.nextInt();
		
		System.out.print("올해 > ");
		int year = sc.nextInt();
		
		System.out.printf("당신의 한국 나이는 %d살 입니다", year - birth + 1);
	}
}
