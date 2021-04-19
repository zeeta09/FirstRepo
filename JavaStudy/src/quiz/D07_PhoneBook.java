package quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class D07_PhoneBook {

	static class phoneInfo {
		String name;
		String phone_number;
		
		public phoneInfo(String name, String phone_number) {
			this.name = name;
			this.phone_number = phone_number;
		}
		@Override
		public String toString() {
			return name + phone_number;
		}
	}
	HashMap<String, HashMap<String, String>> phonebook;
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
		
		phonebook.put("�̺з�", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("����", new HashMap<>());
		phonebook.put("ģ��", new HashMap<>());
	
		phonebook.get("����").put("010-4154-7488", "����");
	}

	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�. : " + groupName);
			return false;
		} else {
			System.out.println("���������� �߰��Ǿ����ϴ�. : " + groupName);
			phonebook.put(groupName, new HashMap<>());
			return true;
		}
	}
	public void printGroupList() {
		for (String groupName : phonebook.keySet()) {
			System.out.printf("#### %s ####\n", groupName);
		}
	}
	
	public boolean addNumber(String groupName, String phoneNumber, String name) {
		
		// phonebook : ���� �׷��� ������ �� �ִ� ��ü ��ȭ��ȣ�� �ν��Ͻ�
		// phonebook.keySet() : �׷���
		// phonebook.values() : �׷� �̸��� Ű������ ��� ������ �� �ִ� �׷� �ؽ��� �ν��Ͻ�
		
		for (HashMap<String, String> group : phonebook.values()) {
			if (group.containsKey(phoneNumber)) {
				System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�.");
				return false;
			}
		}
		
		if (phonebook.containsKey(groupName)) { 
			phonebook.get(phoneNumber).put(phoneNumber, name);
		}else {
			phonebook.get("�̺з�").put(phoneNumber, name);
		}
		return true;
	}
	
	public void printPhoneBook() {
		for (String groupName : new TreeSet<>(phonebook.keySet())) {
		
			System.out.printf("---- %s ----\n", groupName);
			
			HashMap<String, String> group = phonebook.get(groupName);
			
			/*
				# TreeSet�� �� ���� ������
				
				1. ���� ������ ���ϸ鼭 �ν��Ͻ��� ����
				2. �÷����� ����(���� ������ �����ϴ� �÷����� ���׸� Ÿ���� Comparable�� ���)
			*/
			TreeSet<Entry<String, String>> sortedEntrySet =
			new TreeSet<>(new Comparator<Entry<String, String>>() {
				@Override
				public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				
					// �̸� �������� 1�� ���� ��, ��ȭ��ȣ �������� 2�� ����
					int value_diff = o1.getValue().compareTo(o2.getValue());
					
					if (value_diff == 0) {
					return o1.getValue().compareTo(o2.getValue());
					} else {
						return value_diff;
					}
				}
			});
			
			sortedEntrySet.addAll(group.entrySet());
			for (Entry<String, String> entry : sortedEntrySet) {
				System.out.printf("%s : %s\n", entry.getValue(), entry.getKey());
			}
			
		}
	}
	
	
	public void searchByNames(String keyword) {
		int count = 0;
		System.out.println(" - - �˻� ��� - - ");
		for (HashMap<String, String> group : phonebook.values()) {
			for (String phoneNumber : group.keySet()) {
				String name = group.get(phoneNumber);
				if (name.contains(keyword)) {
					System.out.printf("%s : %s\n", name, phoneNumber);
					count++;
				}
			}
//		for (HashMap<String, String> group : phonebook.values()) {
//			for (Entry<String, String> entry : group.entrySet()) {
//				if (entry.getValue().contains(keyword)) {
//					System.out.printf("%s : %S\n", entry.getValue(), entry.getKey());
//					count++;
//				}
//			}
		}
		System.out.printf("�˻���� %d��\n", count);
	}
	
	public void searchByPhoneNumber(String number_fragment) {
		int count = 0;
		System.out.println(" - - �˻� ��� - - ");
		for (HashMap<String, String> group : phonebook.values()) {
			for (String phoneNumber : group.keySet()) {
				if (phoneNumber.contains(number_fragment)) {
					System.out.printf("%s : %s\n", group.get(phoneNumber), phoneNumber);
					count++;
				}
			}
		}
		System.out.printf("�˻���� %d��\n", count);
	}
	
	public static void main(String[] args) {
		
		D07_PhoneBook book = new D07_PhoneBook();
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("�׷� �̸��� �Է� >> ");
//			book.addGroup(sc.nextLine());
//			
//			book.printGroupList();
//		}
		
		book.addGroup("����");
		book.addGroup("��ȣȸ");
		book.addGroup("�ʵ��б� ��â");
		book.addGroup("����б� ��â");
		book.addGroup("���е���");
		book.addGroup("�����");
	
		book.printGroupList();
		
		book.addNumber(null, "123-1234-1234", "�赿��");
		book.addNumber(null, "010-1234-1235", "�߼���");
		book.addNumber(null, "010-1234-1236", "�̴�ȣ");
		book.addNumber(null, "010-1234-1237", "�߽ż�");
		book.addNumber(null, "010-1234-1238", "��ȣ��");
		book.addNumber(null, "010-1234-2000", "��ȣ��");
		
		book.printPhoneBook();
		
		book.searchByNames("ȣ");
		book.searchByPhoneNumber("1234");
	}
}
	/*
		# HashMap�� �̿��� ��ȭ��ȣ�θ� ������ ������.
		
		 1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�.
		 2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�.
		 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�.
		 
		 # �����ؾ� �� �޼���
		 
		 1. ���ο� �׷��� �߰��ϴ� �޼���
		 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼��� (�׷��� ���ٸ� �̺з� �׷쿡 ����)
		 3. ��ϵ� ��� ��ȭ��ȣ�� ������ �̸����� ������������ �����ִ� �޼���
		 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
		 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
	 */
	
	/*
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(3, "hello!");
		map.put(99, "good night!");
		map.put(35, "see you later!!");
		
		System.out.println(map.get(3));
		System.out.println(map.get(99));
		System.out.println(map.get(35));
		
		// containsKey(key) : �ʿ� �ش� Ű�� ���ԵǾ� �ִ��� �˻��Ѵ�.
		System.out.println("Ű �߿� 15�� �ֳ���?" + map.containsKey(15));
		System.out.println("Ű �߿� 35�� �ֳ���?" + map.containsKey(35));
		
		// containsValue(value) : �ʿ� �ش� ���� ���ԵǾ� �ִ��� �˻��Ѵ�.
		System.out.println("�� �߿� Hello!�� �ֳ���?" + map.containsValue("Hello"));
		System.out.println("�� �߿� hello!�� �ֳ���?" + map.containsValue("hello"));
	}
	*/

