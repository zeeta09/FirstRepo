package quiz;

public class B16_TempPassword {

	/*
		4�ڸ��� ���� �ӽú�й�ȣ�� �����ϴ� ���α׷��� ��������.
		(��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�)	 
	*/
	public static void main(String[] args) {
		
		StringBuilder tempPassword = new StringBuilder();
		int size = 4;
		
		for (int i = 0; i < size; ++i) {			
			switch ((int)(Math.random() * 2)) {
			case 0:
				tempPassword.append((char)(Math.random() * 26 + 'A'));
				break;
			case 1:
				tempPassword.append((char)(Math.random() * 10 + '0'));
				break;				
			}
		}
		
		System.out.println("�ӽ� ��й�ȣ: " + tempPassword.toString());
		
	}
}


