package quiz;

import java.util.Scanner;

public class B08_MonthToSeason {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��� �ּ��� : ");
		int month = sc.nextInt();
		
		String season;
		
		switch (month) {
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "����";
			break;
		default:
			season = "�߸��� ����";
		}
		
		System.out.printf("%d���� [%s]�Դϴ�.\n", month, season);
		
		/*
		switch (month) {
		case "3��": case "4��": case "5��":
			System.out.println("�� �Դϴ�.");
			break;
		case "6��": case "7��": case "8��":
			System.out.println("���� �Դϴ�.");
			break;
		case "9��": case "10��": case "11��":
			System.out.println("���� �Դϴ�.");
			break;
		case "12��: case "1��": case "2��":
			System.out.println("�ܿ� �Դϴ�.);
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
			*/
	}
}