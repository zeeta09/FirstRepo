package quiz;

import java.util.Scanner;

public class B08_ConvertSecond {

	/*
	   	초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
	   	
	   	※ 필요없는 단위는 출력하지 말것
	   	ex: 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함	   	
	   	
	   	3601초 -> 1시간 0분 1초
	*/
	
	public static void main(String[] args) {
		
		System.out.print("초 > ");
		int second = new Scanner(System.in).nextInt();
		
		final int SECOND_PER_YEAR = 31536000;
		final int SECOND_PER_DAY = 86400;
		final int SECOND_PER_HOUR = 3600;
		final int SECOND_PER_MINUTE = 60;
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;		
		int original = second;
		
		y = second / SECOND_PER_YEAR;
		second %= SECOND_PER_YEAR;		
		
		d = second / SECOND_PER_DAY;
		second %= SECOND_PER_DAY;	
		
		h = second / SECOND_PER_HOUR;
		second %= SECOND_PER_HOUR;
		
		m = second / SECOND_PER_MINUTE;
		second %= SECOND_PER_MINUTE;
		
		s = second;
		
//		System.out.printf("'%d'초는 변환하면 '%d년 %d일 %d시간 %d분 %d초'입니다.\n"
//				, original, y, d, h, m, s);
		
		System.out.printf("'%d'초는 변환하면 ", original);		
		
		boolean exist = false;
		
		if (y != 0) {
			System.out.print(y + "년 ");
			exist = true;
		} 
		if (exist || d != 0) {
			System.out.print(d + "일 ");
			exist = true;
		}
		if (exist || h != 0) {
			System.out.print(h + "시간 ");
			exist = true;
		}
		if (exist || m != 0) {
			System.out.print(m + "분 ");
		}
		
		System.out.println(s + "초 입니다.");
	}
	
}













