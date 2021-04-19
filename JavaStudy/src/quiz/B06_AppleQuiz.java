package quiz;

import java.util.Scanner;

public class B06_AppleQuiz {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("구매하고 싶은 사과의 개수를 입력하세요 > ");
		int apple = sc.nextInt();
		int basket = apple / 10;
		
		if ( 0 > basket ) {
			System.out.println("음수는 입력할 수 없습니다.");
		} else if (apple % 10 == 0) {
			System.out.printf("바구니의 개수: %d", basket);
		} else {
			System.out.printf("바구니의 개수: %d", basket + 1);
		}
		*/
		
		int apple;
		int size = 10;
		
		System.out.print("구매하고 싶은 사과의 개수 >> ");
		apple = sc.nextInt();
		
		if (apple < 0) {
			System.out.println("음수는 입력할 수 없습니다.");
		} else if (apple % size != 0) {
			System.out.println("필요한 바구니의 개수 : " + (apple / size + 1));
		} else {
			System.out.println("필요한 바구니의 개수 : " + apple / size);
		}
		
		/*
		if (apple < 0) {
			System.out.println("잘못된 개수를 입력하셨습니다.");
		} else {
			System.out.println("필요한 바구니의 개수 : " + (int)Math.ceil(apple / (double) size));
		}
		*/
	}
}