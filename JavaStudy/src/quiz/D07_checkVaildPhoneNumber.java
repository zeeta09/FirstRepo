package quiz;

public class D07_checkVaildPhoneNumber {
	
	/*
		����ڷκ��� �ڵ��� ��ȣ�� �Է¹�����
		���ٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������
		
		���� �� �ڸ��� ����
		�� ��° ���ڴ� �� �ڸ� Ȥ�� �� �ڸ�
		�� ��° ���ڴ� �� �ڸ�
		�� ��° �Ǵ� ���� ��° �Ǵ� ��ȩ ��° ���ڴ� '-'
	
	*/
	
	private static boolean checkNumeric (char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkVaildPhoneNumber (String phoneNumber) {
		int len = phoneNumber.length();
		if (len != 12 && len != 13) {
			System.out.println("[invalid] ���̰� �ùٸ��� ����");
			return false;
		}
		
		for (int i = 0 ; i < len; ++i) {
			
			char ch = phoneNumber.charAt(i);
			
			if(i < 3 && !checkNumeric(ch)) {
				System.out.println("[invalid] ���� �� �ڸ��� ���� �ƴ� ���� ����");
				return false;
			} else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
				System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
				return false;
			} else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
				System.out.println("[invalid] ��� �ڸ��� ���� �ƴ� ���� ����");
				return false;
			} else if (i > 7 && (len == 12) || (i > 8 && (len == 13)) && !checkNumeric(ch)) {
				System.out.println("[invalid] ������ �� �ڸ��� ���� �ƴ� ���� ����");
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		if (checkVaildPhoneNumber("123-112-123a")) {
		}
	}
}
