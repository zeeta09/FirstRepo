import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {

	/*
		#Map
	
		- Key�� Value�� �� ���� �̷�� �ڷᱸ��
		- Key���� ���� value�� ������ �� �ִ�.
		- Key�� �ߺ��� ������� �ʴ´�.
		
	*/
	
	public static void main(String[] args) {
		HashMap<String, Integer> record = new HashMap<>();
		
		// put(key, value)
		// - map�� ������ �߰�
		// - ������ ����ִ� ���� ������ �� ���� ����, ������ null�� ����
		
		record.put("ȫ�浿", 50000);
		record.put("��浿", 35000);
		record.put("�ڱ浿", 90000);
		record.put("ȫ�浿", 5000);		
		
		// �̹� �����ϴ� Ű���� put�ϸ� ���� ����
		Integer previous_value = record.put("ȫ�浿", 3500);
		
		System.out.println("������ ����ִ� ��: " + previous_value);
		System.out.println("���� ����ִ� ��: " + record.get("ȫ�浿"));
		
		// ��������: "ȫ�浿"�� ����Ǿ� �ִ� ���ڸ� 3000 �������� ������.
		record.put("ȫ�浿", record.get("ȫ�浿") + 3000);
		
		System.out.println(record);
		
		// get(key) : key�� �̿��� value�� ����
		System.out.println(record.get("�ڱ浿"));
		
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ� ��", new String[] {"���", "���ڱ�", "�Ա�"});
		person.put("�Ⱦ��ϴ� ��", new HashSet<>());
		
		// ��������: "�Ⱦ��ϴ� ��"�� �����͸� �߰��غ�����.
		HashSet<String> dislike = ((HashSet<String>)person.get("�Ⱦ��ϴ� ��"));
		dislike.add("�߱�");
		dislike.add("Ư��");
		dislike.add("���");
		
		System.out.println(person.get("����"));
		System.out.println(((String[]) person.get("�����ϴ� ��"))[0]);
		System.out.println(person.get("�Ⱦ��ϴ� ��"));
		
		/* 
			# �ݺ������� Map�� Ȱ���ϱ�
		 	
		 	- keySet() : key��θ� �̷���� Set�� ��ȯ�Ѵ�.
		 	- values() : value��θ� �̷���� Set�� ��ȯ�Ѵ�.
		 	- entrySet() : Entry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�.
		*/
		
		
		for (String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B ������ : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ�. ��ĳ���� ���¿����� �Ǻ��ȴ�.
			if (value instanceof String[]) {
				String[] arr = (String[]) value;
				System.out.println("[");
								
				for (int i = 0; i < arr.length; ++i) {
					System.out.println(arr[i] + ", ");
				}
				System.out.println("]");
			} else {
				System.out.println(key + ": " + value);
			}
		}
		
		// # values()
		System.out.println("values: " + person.values());
		
		// # entrySet()
		System.out.println("EntrySet() �׳� ���: " + person.entrySet());
		for (Entry<String, Object> entry : person.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
			
		}

	}
}
