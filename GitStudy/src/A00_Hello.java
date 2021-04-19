
/* 
 	# �ּ� (Comment)
 	
 	- ���α׷��Ӱ� �ϰ� ���� ���� ���� ��
 	- �ּ��� ���α׷� ���࿡ ������ ��ġ�� �ʴ´�
 	- �ַ� �� �ҽ��� ���� �� �ٸ� ���α׷��ӵ鿡�� �����ϴ� �뵵�� ����Ѵ�
 	- �츮�� ���ο����� ����Ѵ�
 	
 	# Eclipse ����Ű ����
 	
 	- Ctrl + [+,-] : ���� ũ�� ����
 	- Ctrl + F11 : �ҽ� �ڵ� ������ �� ���� (Run)
	- Alt + ����Ű : �� �ű��
	- Tab : �鿩���� 
	- Shift + Tab : �Ųٷ� �鿩����
	- Shift + End : Ŀ���� ���� ��ġ���� �� �� �ڱ��� ��� ����
	- Shift + Home : Ŀ���� ���� ��ġ���� �� �� �ձ��� ��� ����
	- Ctrl + C : �����ϱ�
	- Ctrl + X : �߶󳻱�
	- Ctrl + V : �ٿ��ֱ�
	- Ctrl + Z : �ǵ����� 
	- Ctrl + Y : ��� �ǵ��� ���� ���
 */

/** ����ȭ �ּ� (��ǳ���� �����ϰ� �Ǵ� �ּ�) */

/* ���� ���� ����� �� �ִ� �ּ� */

// �� �ٸ� ����� �� �ִ� �ּ�


// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ� 
public class A00_Hello {
// ���� ���� ������ ���� �װ��� Ŀ���� �ΰ� F2�� ������ 
// ������ ���� ������ �ذ�å�� �� �� �ִ�

	/*
		# main() �Լ�				
			- ���α׷��� ���� ����
			- ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ų��
			- main() �Լ��� ������ �߰�ȣ{}�� �����ȴ� 
		
		# �Լ���?
			- � �ܾ� �ڿ� ()�� �ִ� ���� ��� �Լ���� �θ���
		
	*/
	public static void main(String[] args) {
		// ���α׷� ����
		
		/*
			# System.out.println() �Լ�
			
				- ()�ȿ� ������ �����͸� �ֿܼ� ����ϴ� �Լ�
			
			# �ܼ�
				- ���ڸ� ������ ���� ȭ�� (���� ��ǻ�� ȭ��)
				- Eclipse������ �׽�Ʈ������ �Ͼ� ������ �ܼ��� �����Ѵ�
				- Ctrl + F11�� ������ �츮�� ���� ���α׷���
				  �׽�Ʈ�� �ܼ� �󿡼� �����غ� �� �ִ�
				- �츮�� ���� �ҽ� �ڵ�(.java)�� �����(.class)�� bin������ ����Ǿ� �ִ�
		*/
		System.out.println("Hello, world!");
		
		System.out.println("��������������������������������������������������");
		System.out.println("��    1. New Game        ��");
		System.out.println("��    2. Load Game       ��");
		System.out.println("��    3. Exit            ��");
		System.out.println("��������������������������������������������������");
		
		/*		 
		 	# �ڹ��� �����͵� (���ͷ�)
		  
		  	1. "" ���̿� ���� �͵� 	: ���ڿ�(String), ���ڸ� ������ �� �� �ִ� ������ Ÿ��
		  	2. '' ���̿� ���� �� 	: ����(Character), ���� �� �ϳ��� �� �� �ִ� ������ Ÿ��
		  	3. ���ڸ� ���� �� 	: ����(Integer)
		  	4. �Ҽ��� ���� ��	: �Ǽ�(Float, Double)
		  	5. true, false
		 */
		System.out.println("ABCDEFG �������");
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println('��');
		System.out.println(1000 + 500);
		System.out.println(123.45678 + 10.5);
		System.out.println(true);
		System.out.println(false);
		
		// # ���ڵ��� �����δ� ���ڰ��� ������ �ִ� 
		//	 �츮 ���� ���϶��� ���ڷ� ���̴� ���̴� 
		
		// ��, '' Ÿ���� ����Ÿ������ ��ȯ�� �� �ְ� ���� Ÿ�Ե� ''Ÿ������ ��ȯ�� �� �ִ�
		// ���ڿ� ������ �����δ� ���� ���� Ÿ���̸� ���� ��굵 �����ϴ�  
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'��');
		System.out.println((int)'��');	// (int)�� ���� - ���ڸ� ���ڷ� ���̰� ��
		System.out.println((char)54621);// (char)�� ���� - ���ڸ� ���ڷ� ���̰� ��
		System.out.println((char)54622);
		System.out.println((int)'��');
		
		System.out.println((char)('A' + 0));
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		
		// # ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ°��� �ƴ϶� �̾���δ�
		System.out.println("'A'�� �������� ��� : " + 'A');
		System.out.println("'A'�� �ڵ尪 : " + (int)'A');
		System.out.println("'1'�� �ڵ尪 : " + (int)'1');
		System.out.println("1" + 5); // ���ڿ� + ����
		System.out.println('1' + 5); // ����(�ڵ尪) + ����
		System.out.println(1 + 5);	 // ���� + ����
		
		// # ���� + �Ǽ��� �Ǽ��� �ȴ� 
		System.out.println(10 + 10.123);
		
		// # ���� + ���ڴ� ������ �ȴ� 
		System.out.println('a' + 10);
		System.out.println((char)('a' + 10));
		
		// ; (�����ݷ�)
		//	- �� ��ɾ �������� �˸���
		
		// ���α׷� ��
	}
	
}




