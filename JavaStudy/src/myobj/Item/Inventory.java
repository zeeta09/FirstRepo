package myobj.Item;

public class Inventory {

	Item[] inventory;
	int size;
	
	public Inventory(int size) {
		inventory = new Item[size];
	}
	
	public boolean put(Item item) {
		for (int i = 0; i < inventory.length; ++i) {
			if (inventory[i] == null) {
				inventory[i] = item;
				return true;
			}
		}
		
		System.out.println("������ �� á���ϴ�.");
		return false;
	}
	
	public void useAllItems() {
		for (Item item : inventory) {
			if (item != null) {
				item.use();
			}
		}
	}
	
	public static void main(String[] args) {
		Inventory inven1 = new Inventory(5);
		
		// Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�.
		
		inven1.put(new HP("ü������", 15000));
		inven1.put(new MP("��������", 15000));
		inven1.put(new Coffee("�Ƹ޸�ī��", 2500));
		
		inven1.useAllItems();
		
//		for (int i = 0; i < 4; ++i) {
//			if (inven1.put(new Candy("���ݶ�", 3000))) {
//				System.out.println("�������� �� ���� put()���� true�� ���ϵ�");
//			} else { 
//			System.out.println("�������� �� �ȵ��� put()���� false�� ���ϵ�");
//			}
//		}
	}
}