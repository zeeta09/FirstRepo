package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ���׸��� ������ �� Ŭ������ �ν��Ͻ� ������ ���ϴ� Ÿ���� �� �� �ְ� �ȴ�.
// ���� ������ Object�� �����ȴ�.
public class D02_JiphapQuiz<T> {
	/*
		1. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
		2. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
		3. �� �÷����� �Ű������� ���޹����� �� �÷����� �������� SetŸ������ ��ȯ�ϴ� �޼���
	*/
	
	public Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> union_set = new HashSet<>(a);
		union_set.addAll(b);
		return union_set;
	}

	public Set<T> intersection(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> inter_set = new HashSet<>(a);
		inter_set.retainAll(b);
		return inter_set;
	}
	
	public Set<T> diff(Collection<? extends T> a, Collection<? extends T> b) {
		Set<T> diff_set = new HashSet<>(a);
		diff_set.removeAll(b);
		return diff_set;
	}
	
	public static int plus(int a, int b) {
		a += b;
		return a;
	}

	public static void main(String[] args) {
		// �ҹ��ڷ� �����ϴ� Ÿ�Ե�(�⺻��)�� �Ű������� ������ �� ���� �����Ͽ� �����Ѵ�.
		int int_a = 20;
		int int_b = 30;
		
		System.out.println(plus(int_a, int_b));
		System.out.println("plus �� int_a�� ��: " + int_a);
		
		// �빮�ڷ� �����ϴ� Ÿ�Ե�(������)�� �Ű������� ������ �� �ּҸ� �����Ͽ� �����Ѵ�.
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		Set<String> c = new HashSet<>();
		
		a.add("abc");
		a.add("application");
		a.add("advertise");
		a.add("apple");
		
		b.add("banana");
		b.add("balloon");
		b.add("bike");
		b.add("apple");
		
		c.add("cow");
		c.add("cat");
		c.add("crack");
		c.add("apple");
		
		D02_JiphapQuiz<String> jiphap_tools = new D02_JiphapQuiz<String>();
		D02_JiphapQuiz<Integer> jiphap_tools2 = new D02_JiphapQuiz<Integer>();
 
		
		System.out.println("union�� �����ϱ� ���� a: " + a);
		System.out.println(jiphap_tools.union(a, b));
		System.out.println();
		System.out.println("union�� ������ ���� a: " + a);
		System.out.println(jiphap_tools.union(a, c));
		System.out.println();
		System.out.println(jiphap_tools.intersection(a, b));
		System.out.println(jiphap_tools.intersection(a, c));
		System.out.println(jiphap_tools.intersection(jiphap_tools.intersection(a, b), c)); 
		
		
	}
}
