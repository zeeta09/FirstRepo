package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B17_CountRandomFruit {

	/*
		1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�.
		2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�.
			(�������� �����ϴ� ����:
			 apple, banana, kiwi, orange, peach, strawberry, pineapple)
		3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���.
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� >> ");
		int size = sc.nextInt();
		
		
		String[] fruit = {"apple", "banana", "kiwi", "orange", "peach", "strawberry", "pineapple"};
		String[] user_arrays = new String[size];
		
		for (int i = 0; i < size; ++i) {
			int random_fruit = (int)(Math.random() * fruit.length);
			System.out.println(fruit[random_fruit]);
		}		
	}
}

