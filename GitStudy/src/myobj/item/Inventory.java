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
		
		// ※ Item을 넣어야 하는 자리에 Item을 상속받은 모든 것들이 들어갈 수 있다
		inven1.put(new Candy("리콜라", 3000));
		inven1.put(new Candy("리콜라", 3000));
		inven1.put(new Candy("리콜라", 3000));
		
		inven1.useAllItems();
	}
}











