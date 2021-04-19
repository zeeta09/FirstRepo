import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class D11_Calendar {
	/*
		# Date, Calendar, Time
		
 		- �ڹٷ� ��¥�� �ð��� �ٷ�� Ŭ����
	 */
	public static void main(String[] args) {
		
		// �ý����� ���н� Ÿ���� �������� �޼���
		// �� ���н� Ÿ�� : 1970�� 1�� 1�� ���ķ� �ð��� �� �и��ʳ� �귶���� �� ��
		
		System.out.println("1980�� 1�� 1�� ���ķ�... " +
				System.currentTimeMillis() + "�и��� �귶���ϴ�.");
		
		System.out.println("1980�� 1�� 1�� ���ķ�... " +
				System.currentTimeMillis() / 1000 + "�� �귶���ϴ�.");
		
		System.out.println("1980�� 1�� 1�� ���ķ�... " +
				System.currentTimeMillis() / 1000 / 60 + "�� �귶���ϴ�.");
		
		System.out.println("1980�� 1�� 1�� ���ķ�... " +
				System.currentTimeMillis() / 1000 / 60 / 60 + "�ð� �귶���ϴ�.");

		System.out.println("1980�� 1�� 1�� ���ķ�... " +
				System.currentTimeMillis() / 1000 / 60 / 60 / 24 + "�� �귶���ϴ�.");
		System.out.println("1980�� 1�� 1�� ���ķ�... " +
				System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 + "�� �귶���ϴ�.");

		/*
			Date
			- Date Ŭ���� ������ �޼������ ���� ���������� ���� ������Ʈ�� �ߴܵǾ� �ִ�.
			- �ð��� ����� ���� �ٸ� Ŭ������ ����� ���� �����Ѵ�.
			- Date Ŭ������ �ַ� �ð� �ν��Ͻ��� �����ϴ� �뵵�θ� ����Ѵ�.
		*/
		
		Date now = new Date();
		System.out.println(now);
		
		/*
			Calendar
			
			- �޷��� ǥ���� Ŭ����
			- ��¥�� ���� ����� �� �ִ� ��ɵ��� ���ִ�.
			- �ð��� ������ �� �����ڰ� �ƴ� getInstance()��� static �޼��带 ����Ѵ�.
			- getInstance() �޼��忡 �浵�� ��Ÿ���� TimeZone�� ������ �� �ִ�.
		
			TimeZone
			
			- ���� ������ ������ �����ϰ� �ִ� Ŭ����
			- getAvailableIDs() static �޼��带 ���� ����� �� �ִ� Ÿ�������� �� �� �ִ�.
		*/
		
		for (String zoneId : TimeZone.getAvailableIDs()) {
			System.out.println(zoneId);
		}
		
		// Date Ÿ������ ��ȯ�ϸ� ������ �������.
		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println("�ѱ� ���� �ð�: " + korea.get(Calendar.HOUR));

		// Calendar�� ����� �ð� �� �ʿ��� ���� get() �޼��带 ���� ���� �� �ִ�.
		int year = korea.get(Calendar.YEAR);
		int month = korea.get(Calendar.MONTH);	// Calendar Ŭ������ month�� 0���� �����Ѵ�.
		int date = korea.get(Calendar.DATE);
		
		// Calendar�� ����� �ð��� set() �޼��带 ���� ������ �� �ִ�.
		korea.set(Calendar.HOUR_OF_DAY, 15);
		
		int hour = korea.get(Calendar.HOUR);
		int hourOfDay = korea.get(Calendar.HOUR_OF_DAY); 
		
		int minute = korea.get(Calendar.MINUTE);
		int second = korea.get(Calendar.SECOND);
		int millisec = korea.get(Calendar.MILLISECOND);
		
		korea.set(Calendar.YEAR, -50);
		
		// Calendar.ERA�� �ʵ� ����̰�, GregorianCalendar.AD�� BC�� ����̴�.
		int era = korea.get(Calendar.ERA);
		
		// Calendar.AM_PM�� �ʵ� ����̰�, Calendar.AM�� Calendar.PM�� ����̴�.
		int am = korea.get(Calendar.AM_PM);
		
		int doy = korea.get(Calendar.DAY_OF_YEAR);
		int dom = korea.get(Calendar.DAY_OF_MONTH);
		int dow = korea.get(Calendar.DAY_OF_WEEK);
		int dowim = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		System.out.println("DOY(���ذ� ���۵ǰ� ���� ��¥: " + doy);
		System.out.println("DOM(�̹� �� ���۵ǰ� ���� ��¥: " + dom);
		System.out.println("DOW(�̹� �� ���۵ǰ� ���� ��¥, ����): " + dow);
		System.out.println("DOWIM(�̹� ���� �� ��° �ش� �����ΰ�): " + dowim);
		
		System.out.println("Calendar.SUNDAY: " + Calendar.SUNDAY);
		System.out.println("Calendar.MONDAY: " + Calendar.MONDAY);
		System.out.println("Calendar.TUESDAY: " + Calendar.TUESDAY);
		System.out.println("Calendar.WEDNESDAY: " + Calendar.WEDNESDAY);
		System.out.println("Calendar.THURSDAY: " + Calendar.THURSDAY);
		System.out.println("Calendar.FRIDAY: " + Calendar.FRIDAY);
		System.out.println("Calendar.SATURDAY: " + Calendar.SATURDAY);
		
		System.out.printf("%s: %d/%d/%d\n", korea.getTimeZone().getID(), year, month + 1, date);
		System.out.printf("hour : %d, hourOfDay(24H): %d\n", hour, hourOfDay);
		System.out.printf("%d:%d.%03d\n", minute, second, millisec);
		
		System.out.println(era == GregorianCalendar.AD ? "AD" : "BC");
		System.out.println(era != GregorianCalendar.BC ? "AD" : "BC");
		System.out.println(am == Calendar.AM ? "AM" : "PM");
		System.out.println(am != Calendar.PM ? "AM" : "PM");
		
		Calendar hawaii = Calendar.getInstance(TimeZone.getTimeZone("US/Hawaii"));
		System.out.println("�Ͽ��� ���� �ð�: " + hawaii.get(Calendar.HOUR));
		
	}
}
