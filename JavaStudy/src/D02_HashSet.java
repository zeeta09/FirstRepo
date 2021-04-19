
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {

	/*
		# Set
		
		- ������ �����س��� Ŭ����
		- ��ҷ� ���� ���� ������ ���� ������� �ʴ´�.
		
		# Hash
		
		- � ���� �־��� �� ���� ������ �� ���� ���� �����Ǿ�� �ϴ� �˰���
		- ���� ���� �־��� ���� �׻� ������ ���� ���;� �Ѵ�.
		- ������ ���� �־��� �� �����ϱ� ���� ���� �ٸ� ���� ���´�.
		- ������ �ؽ������� ���� ���� ã�� ���� �Ұ����ؾ� �Ѵ�.
		- �ٽ� ���� ������ ���ư� ���� ���� �ܹ��⼺ �˰���
		- �ߺ� üũ�ÿ� �پ ������ ���δ�.
		
		�� �ؽ��� ����ϴ� �˰����� ����(�ε���)�� ����.

	*/

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
	
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		numbers.add(100);
		
		System.out.println(numbers);
		
		// ���� �÷��� �������̽��̱� ������ ArrayList�� �ִ� �޼������ �Բ� �����Ѵ�.
		if(numbers.remove(100)) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� ����");
		}
		System.out.println(numbers);
		
		// �� �̸��� �ؽ��� �� �˰������ ������ ����.
		HashSet<String> english = new HashSet<>();
		
		english.add("apple");
		english.add("airplane");
		english.add("bio");
		english.add("cat");
		english.add("drama");
		english.add("zebra");
		english.add("elephant");
		
		System.out.println(english);
		
		// �� Set�� �ε����� ���� ������ for-each�� ����� �� �ִ�.
		for (String word : english) {
			System.out.println(word);
		}
		
		// �� �÷��ǳ����� ��ȯ�� �����Ӵ�.
		// - Set�� ������ �����ؾ� �Ѵٸ� List�� ��ȯ�Ͽ� ����� �� �ִ�.
		// - List�� ����� �� �ߺ��� ������ ����� �ʿ��ϴٸ� Set���� ��ȯ�Ͽ� ����� �� �ִ�.
		ArrayList<String> english_List = new ArrayList<>(english);
		Collections.sort(english_List);
		System.out.println(english_List);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(1);
		numbers2.add(3);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(6);
		numbers2.add(13);
		
		System.out.println(numbers2);
		System.out.println(new HashSet<>(numbers2));
		
		// �� �÷��ǵ��� �迭�� ��ȯ�ϱ�
		Object[] arr1 = english.toArray();				// 1�� ���, Object[]�� ����
		
		String[] arr2 = new String[english.size()];		// 2�� ���, �̸� ������ �迭�� ����
		english.toArray(arr2);
		
		System.out.println("Object[]�� ��ȯ�� english: " + Arrays.toString(arr1));
		System.out.println("�迭�� ��ȯ�� english: " + Arrays.toString(arr2));
		
		// �� ���׸��� �䱸�ϴ� Ŭ������ ���׸��� ������� �ʴ� ��� ��� Ÿ���� ���� �� �ִ�.
		// - ��� Ÿ���� Object Ÿ������ ��ĳ���� �Ǿ� ����ȴ�.
		// - �ش� ���� �ٽ� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ؼ� ���ŷӴ�.
		ArrayList numbers3 = new ArrayList();
		
		numbers3.add("ȫ�浿");
		numbers3.add('A');
		numbers3.add(123.123);
		numbers3.add(333);
		
//		String str = (String) numbers3.get(3);		// �ڹ� ���������δ� �ƹ� ���� ����		
	
		// # contains(value) : �÷��ǿ� �ش� ��Ұ� ���ԵǾ� �ִ��� ���θ� ��ȯ
		System.out.println(english.contains("apple"));
		System.out.println(english.contains("banana"));
		
		System.out.println(english_List.contains("apple"));
		System.out.println(english_List.contains("banana"));
		
		// # containsAll(Collection) : ������ �÷����� ��� ���ԵǾ� �ִ����� �˻�
		Set<String> subset = new HashSet<>();
		List<String> sublist = new ArrayList<>();
		subset.add("zebra");
		subset.add("drama");
		subset.add("tiger");
		
		System.out.println("english���� subset�� ��� ������ ����ֳ���? "
				+ english.containsAll(subset));
		System.out.println("english���� sublist�� ��� ������ ����ֳ���? "
				+ english.containsAll(sublist));
		
		// # addAll(Collection) : ������ �÷����� ������ ��� �߰� (�߰� ���� ���θ� ��ȯ)
		// - ���� �߰��� ���� ������ true
		// - �̹� ��� ���Ե� ��쿡�� false�� ��ȯ�Ѵ�.
		System.out.println(english.addAll(subset));
		System.out.println(english.addAll(subset));
		
		// # removeAll(Collection) : ������ �÷��ǰ� ���� ������ ��� ����
		// - ������ �� ������ true, ������ false
		System.out.println(english_List.removeAll(subset));
		System.out.println(english_List);
		
		// # retainAll(Collection) : ������ �÷��ǰ� ��ġ�ϴ� ���븸 �����.
		// - ���Ѱ��� �ִٸ� true, ������ false
		english.retainAll(subset);
		System.out.println(english);
		
		// # isEmpty : �ش� �÷����� ��������� true
		System.out.println(english.isEmpty());
		}
}
