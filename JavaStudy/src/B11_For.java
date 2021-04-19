
public class B11_For {

	public static void main(String[] args) {
		
		/*
			# �ݺ��� (Loop)
			
			- for, while, do - while...
			- �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�. 
			
			for (�ʱ�ȭ; ����; ������) {
				��� �ִ� ������ true�� ���� �ݺ��� ��ɾ���� ���� ��
			}
		*/
		
		/*
			1. ���� �⺻���� ������ for��
		 	- ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		 	- �ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ������ �ȴ�.
		 	- ������ 1�� �Ѵ�.
		 */
		
		for (int i = 0; i < 100; ++i) {
			System.out.println("Hello, World! " + i);
		}
		
		/*
			2. �ݺ����� �ʱⰪ, ������, ������ ������� ������ �� �ִ�.  
		*/
		
		for (int i = 70; i <= 555; i += 10) {
			System.out.println(i);
		}
		
		for (int i = 9000; i >= 0; i -= 100) {
			System.out.println("2��° �ݺ���: " + i);
		}
		
		/*
			3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�. 
		 */
		
		int x = 0;
		
		for (; x < 10;) {
			System.out.println("3��° �ݺ���: " + x++ );
		}
		
		/*
		������ �����ֱ�: ������ �ڽ��� ���� �߰�ȣ�� ����� �״´�. 
		 */
		
		/*
			4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�. 
		 */
		
		for (int month = 1; month <=12; ++month) {
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
			System.out.printf("%2d���� [%s]�Դϴ�.\n", month, season);
		}
		
		/*
			5. for���� ������ ��������� �������� �ݺ��Ѵ�.
			- �ݺ����� ���ϴ� Ÿ�ֿ̹�  break���� ���� Ż���� �� �ִ�.
		*/
		
		int count = 0;
		
		for(;;) {
			System.out.println("Hello" + count++);
		
			if (count == 7) {
				break;
			}
		}
	
		/*
			6. �ݺ��� ���ο��� continue�� ������ �ٷ� ���� �� �ݺ����� �Ѿ��/ 
		*/
		
		for (int i = 1; i <= 50; ++i) {
			System.out.printf("%2d ", i);
			
			if (i % 10 != 0) {
				continue;
			}
			
			System.out.println();
		}
	
		for (int i = 5000; i >= 100; --i) {
			if (i % 2 == 0) {
				continue;
			} 
			System.out.println(i);
		}
		
		/* 
		¦���� ���� continue�� ������ ������ ����� ���� �ʴ´�.
		*/
		
		
		/*
			7. �ݺ������� ���� ���ϱ�
			
			(1) ������ ������ ������ �ϳ� �����ϰ� 0���� �ʱ�ȭ �صд�.
			(2) �ݺ����� �����ϸ鼭 �ش� ������ ���� ������Ų��.
			
		*/
		
		int sum = 0;
		
		for (int i = 80; i <= 333; ++i) {
			
			if (i % 3 == 0) {
				sum += i;
			}
		}
	
		System.out.println("80���� 333������ 3�� ��� �� ��: " + sum);
	}
}