import java.util.Scanner;

import myobj.Peach;

public class C03_Constructor {

	/*
	  	# Ŭ������ ������ (Constructor)
	  	
	  	 - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
	  	 - �޼������� ���� Ÿ���� �������� �ʴ´�
	  	 - �ν��Ͻ��� �����ϱ� ���ؼ��� new�� ���� �����ڸ� ȣ���ؾ� �Ѵ�
	  	 - �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� ������ �⺻ �����ڰ� �����Ѵ�
	  	 - �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ��� ��ȯ�ȴ�
	*/
	
	public static void main(String[] args) {
		
		// Ŭ���� �̸��� �Ȱ��� �̸��� �޼��带 ȣ���� �ν��Ͻ��� ������ �� �ִ�.

		// �� �����ڸ� ȣ���ϴ� ������ 
		Scanner sc = new Scanner(System.in);
		String s1 = new String("abc");
		Peach p1 = new Peach();
		
		Orange[] orange_box = new Orange[7];
		
		for (int i = 0; i < 5; ++i) {
			orange_box[i] = new Orange();
		}
		
		System.out.println(orange_box[0].sweet);
		System.out.println(orange_box[1].size);
		System.out.println(orange_box[2].color[0]);
		System.out.println(orange_box[3].color[1]);
		System.out.println(orange_box[4].color[2]);
		
		// �����ڸ� �����ε��� Ŭ������ �پ��� ���� ����� �����
		orange_box[5] = new Orange(8);		
		int[] a = new int[] { 255, 165, 0 };
		System.out.println(a);
		orange_box[6] = new Orange(9, 10, a);
		
		System.out.println(p1);
		System.out.println(sc);
		System.out.println(s1);
		
		Strawberry berry01 = new Strawberry(150);
		
		System.out.println(berry01.color);
		System.out.println(berry01.seed);
	}
	
}

class Orange {
	
	int sweet;
	int size;
	int[] color;
	
	// ������ - �� Ŭ������ �ν��Ͻ��� ������ �� ���� ���� ȣ��Ǵ� �޼��� 
	//          �����ڴ� ���� ���� ȣ��Ǳ� ������ �ַ� �ʱ�ȭ �뵵�� ���ȴ�.
	Orange() {
		System.out.println("�������� �ʱ�ȭ �Ǿ����ϴ�!");
		sweet = 5;
		size = (int)(Math.random() * 3 + 7);
		color = new int[] {255, 165, 0};
	}
	
	// �����ڵ� �޼����̱� ������ �����ε� �� �� �ִ� 
	Orange(int sweet) {
		// �ν��Ͻ� ���� sweet�� �Ѱܹ��� sweet�� ����
		this.sweet = sweet;
		
		// �� this: �� �ν��Ͻ����� �ڱ� �ڽ��� ����Ų��.
	}
	
	Orange(int sweet, int size, int[] color) {
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
	
}

class Strawberry {

	// Ŭ������ �ν��Ͻ� ������ �ʱ�ȭ�� ���� ������ �迭�� �Ȱ��� �ʱⰪ�� ���Ѵ�
	int seed;
	String color;
	
	// �ٸ� �����ε� Ÿ���� �����ڰ� �����Ҷ��� 
	// �⺻ �����ڸ� �ڵ����� ���������� �ʴ´�
	public Strawberry(int seed) {
		this.seed = seed;
	}	
}

// ��������: �Ʊ� myobj�� ������� Ŭ������ �˸��� �����ڸ� 2�� �̻� �߰��غ�����




















