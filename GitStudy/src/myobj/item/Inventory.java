package myobj.item;

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
		
		// �� Item�� �־�� �ϴ� �ڸ��� Item�� ��ӹ��� ��� �͵��� �� �� �ִ�
		inven1.put(new Candy("���ݶ�", 3000));
		inven1.put(new Candy("���ݶ�", 3000));
		inven1.put(new Candy("���ݶ�", 3000));
		
		inven1.useAllItems();
	}
}











