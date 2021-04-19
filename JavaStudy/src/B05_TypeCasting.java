
public class B05_TypeCasting {

	public static void main(String[] args) {
		/*
		 	# Type Casting
			
			- Ÿ���� �ڿ������� ���ϴ� ���(Ÿ���� ���ϴ��� ������ ���� ��)
			- Ÿ���� ������ ��ȯ���Ѿ� �ϴ� ���(Ÿ���� ���ϸ� ������ ���� ��)
			
			# Ÿ���� ũ��
			
			- ���� Ÿ��: byte(1) < char, short(2) < int(4) < long(8)
			- �Ǽ� Ÿ��: float(4) < double(8)
			
			- ���� Ÿ���� ������ �Ǽ� Ÿ�� ���� ǥ�� ������ �۴�.
		*/
		
		// 1. �ڿ������� Ÿ�� ĳ����
		
		byte _byte = 127;
		short _short;
		int _int;
		long _long;
		float _float;
		
		_int = _byte;
		_int = 2100000000;
		_long = _int;
		_float = _long;
		
		System.out.println(_float);
		
		// 2. ���� �ջ�� ������ �ִ� Ÿ�� ĳ����
		_int = 50000;
		_short = (short)_int;	// ���� �ջ�� ���� �����Ƿ� ��� ���ش�.
	
		System.out.println(_short);
		
		// 3. ���� ���̴��� �ٸ��� �ؼ��� �� �ִ� Ÿ���� ��� Ÿ�� ĳ������ �ʿ��ϴ�.
		int a = 80;
		char ch = 'z';
		
		System.out.println((char) a);
		System.out.println(a);
		
		System.out.println((int) ch);
		System.out.println(ch);
		
		// �ڵ�ǥ�� �ܿ� �ʿ䰡 ���� (char Ÿ�Կ� ���ڸ� ����� ������ ����)
		ch = 'M';
		
		System.out.println(ch > 'A');
		System.out.println(ch < 'Z');
		
		ch = '��';
		
		System.out.println(ch > '��');
		System.out.println(ch < '��');
		
		System.out.println((int)'��');
	}
}
