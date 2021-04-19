package quiz;

public class B04_ConditionQuiz {
	public static void main(String[] args) {
		
		int a = 15, b = 2, c = 7, d = 21, e = 51;
		
		int hour = 22;
		int year = 2021;
		
		int minsuAge = 10, cheolsuAge = 8;
		int minsuBirth = 1, cheolsuBirth = 4;
		
		boolean powerOn = false;
		
		String str = "yes";
		
		// �񱳸� �� �� ������ ���ʿ� �ִ� ���� ����
		
		System.out.println("1. ���� a�� 10���� ũ�� 20���� ���� �� " + (a > 10 && a < 20));
		System.out.println("2. ���� b�� ¦���� �� " + (b % 2 == 0));
		System.out.println("3. ���� c�� 7�� ����� �� " + (c % 7 == 0));
		System.out.println("4. ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� " + (hour > 0 && hour < 24 && hour >= 12));
//		System.out.println("4. ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� " + (!(hour < 0 || hour >= 24) && hour >= 12));
		
		System.out.println("5. ���� d�� e�� ���̰� 30�� �� " + (Math.abs(d - e) == 30));
//		System.out.println("5. ���� d�� e�� ���̰� 30�� �� " + (d - e == 30 || e - d == 30));
		
		
		
		System.out.println("6. ���� year�� 400���� ������ �������ų� �Ǵ� 4�� ������ �������� 100���� ������ �������� ���� �� " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		System.out.println("7. �μ��� ö������ 2�� ������ " + (cheolsuAge + 2 == minsuAge));
		
		System.out.println("8. �μ��� ö������ ������ 3�� ������ " + (cheolsuBirth - 3 == minsuBirth));
		
		System.out.println("9. boolean�� ���� powerOn�� false�� �� " + !powerOn);
		
		// ���ڿ�(������ Ÿ��)�� ==���� ���ϸ� �ȵȴ�
		// ������ Ÿ���� ���� ���� ���� �ش� Ŭ������ ���ǵǾ� �ִ� equals()��� �޼��带 �̿��ؾ� �Ѵ�.
		System.out.println("10. ���ڿ� �������� str�� yes�� �� " + (str == "yes"));
		System.out.println(str.equals("yes"));
		
		// # �⺻�� Ÿ�԰� ������ Ÿ���� ������
		//	- �⺻ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ���� (�������� ���̴� �޸𸮸� ����Ѵ�, Stack)
		//	- ������ Ÿ���� ���� �������� ũ�⸦ �����ϱ� ��ƴ� (�������� �� ���� �޸𸮸� ����Ѵ�, Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
	}
}
