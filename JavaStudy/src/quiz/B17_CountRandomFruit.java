package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	/*
		1. 사용자로부터 배열의 크기를 입력받는다.
		2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다.
			(랜덤으로 등장하는 과일:
			 apple, banana, kiwi, orange, peach, strawberry, pineapple)
		3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다.
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");
		int size = sc.nextInt();
		
		
		String[] fruit = {"apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple"};
		String[] user_arrays = new String[size];
		
		for (int i = 0; i < size; ++i) {
			int random_fruit = (int)(Math.random() * fruit.length);
			System.out.println(fruit[random_fruit]);
		}		
	}
}

