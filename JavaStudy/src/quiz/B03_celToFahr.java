package quiz;

import java.util.Scanner;

public class B03_celToFahr {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double cel;
		double fahr;
		
		System.out.print("섭씨(℃) 온도를 입력하세요 > ");
		cel = sc.nextDouble();
		
		fahr = (cel * 9 / 5) + 32;
		
		System.out.printf("%.1f℃는 %.1f°F입니다.\n", cel, fahr);

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("섭씨 온도를 입력해 주세요 > ");
//		double cel = sc.nextInt();
//		double fahr = cel * 9 / 5 + 32;
//		
//		System.out.printf("현재 화씨 온도는 %.1f 입니다", fahr);

		
	}
}
