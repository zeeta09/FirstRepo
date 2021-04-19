package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if (score < 100 || score < 0) {
			System.out.println("잘못된 입력입니다.");
		} else if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80) {
			System.out.println("B등급");
		} else if (score >= 70) {
			System.out.println("C등급");
		}  else if (score >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		*/
		
		System.out.print("점수를 입력하세요: ");
		int score = new Scanner(System.in).nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("잘못된 입력입니다.");
		} else {
			char grade = 'F';
			
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
			grade = 'B';		
			} else if (score >= 70) {
				grade = 'C';
			}  else if (score >= 60) {
				grade = 'D';
			}
			System.out.printf("당신의 점수는 %d점으로 [%c] 입니다.\n", score, grade);
		}
	}
}