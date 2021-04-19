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
		
		System.out.println("가방이 꽉 찼습니다.");
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
		
		// Item을 넣어야 하는 자리에 Item을 상속받은 모든 것들이 들어갈 수 있다.
		
		inven1.put(new HP("체력포션", 15000));
		inven1.put(new MP("마나포션", 15000));
		inven1.put(new Coffee("아메리카노", 2500));
		
		inven1.useAllItems();
		
//		for (int i = 0; i < 4; ++i) {
//			if (inven1.put(new Candy("리콜라", 3000))) {
//				System.out.println("아이템이 잘 들어가면 put()에서 true가 리턴됨");
//			} else { 
//			System.out.println("아이템이 잘 안들어가면 put()에서 false가 리턴됨");
//			}
//		}
	}
}