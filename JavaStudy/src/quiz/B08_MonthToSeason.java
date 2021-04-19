package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력해 주세요 : ");
		int month = sc.nextInt();
		
		String season;
		
		switch (month) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "잘못된 계절";
		}
		
		System.out.printf("%d월은 [%s]입니다.\n", month, season);
		
		/*
		switch (month) {
		case "3월": case "4월": case "5월":
			System.out.println("봄 입니다.");
			break;
		case "6월": case "7월": case "8월":
			System.out.println("여름 입니다.");
			break;
		case "9월": case "10월": case "11월":
			System.out.println("가을 입니다.");
			break;
		case "12월: case "1월": case "2월":
			System.out.println("겨울 입니다.);
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
			*/
	}
}