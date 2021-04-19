package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		
		if (score < 100 || score < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else if (score >= 90) {
			System.out.println("A���");
		} else if (score >= 80) {
			System.out.println("B���");
		} else if (score >= 70) {
			System.out.println("C���");
		}  else if (score >= 60) {
			System.out.println("D���");
		} else {
			System.out.println("F���");
		}
		*/
		
		System.out.print("������ �Է��ϼ���: ");
		int score = new Scanner(System.in).nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("�߸��� �Է��Դϴ�.");
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
			System.out.printf("����� ������ %d������ [%c] �Դϴ�.\n", score, grade);
		}
	}
}