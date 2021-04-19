import java.util.Scanner;

public class B15_While {

	public static void main(String[] args) {
		
		/*
			# while
			
			- for���� ������ �ణ �ٸ� �ݺ���
			- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�.
			- ()���� ������ ���� ���� {}���� ������ �ݺ��Ѵ�.
		 */
		
		/*
			# while���� ���� �⺻���� ����
		*/
		
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		/*
			# while���� �������� ��ġ�� ���� ����� �޶��� �� �ִ�. 
		 */
		
		i = 0;
		
		while (i++ < 10) {
			System.out.println(i);	
		}
		
		/*
			# while���� ����ϱ� ���Բ� ����� Ŭ�������� �ִ�.
			
			- has, next ���� ���ľ ���� �Լ�(�ż���)�� ������ �ִ�.
			- Scanner ��
		*/
		
		Scanner sc1 = new Scanner("apple banana orange");
		Scanner sc2 = new Scanner("1234 1588 1541 111 222 333 444 555");
		
		// Scanner.hasNext() : ���� ���� ������ true, ������ false
		while (sc1.hasNext()) {
		// Scanner.next() : ���� �ϳ��� ���� String Ÿ������ ������.
			System.out.println(sc1.next());
		}
		
		while (sc2.hasNextInt()) {
			System.out.println(sc2.nextInt());
		}
	}
}
