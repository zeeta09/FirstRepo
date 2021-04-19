package myobj;

public class Coffee {
	
	private static class CoffeeCode {
		int code;
		String name;
		
		private CoffeeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
	}
	
	// private static String[] coffee_names = {"�Ƹ޸�ī��", "ī���", "ī���ī", "ļ���� �����߶�"};
	// private static String[] origin_names = {"�ݷҺ��", "�����", "��Ƽ���Ǿ�", "�ɳ�", "�ε�"};
	
	public final static CoffeeCode AMERICANO = new CoffeeCode(0, "�Ƹ޸�ī��");
	public final static CoffeeCode CAFE_LATTE = new CoffeeCode(1, "ī���");
	public final static CoffeeCode CAFE_MOCHA = new CoffeeCode(2, "ī���ī");	
	
	CoffeeCode coffee;
	int price;
	int caffeine;
	int origin;
	
	boolean hot;
	
	public Coffee(CoffeeCode coffee, int price, int caffeine, int origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffeine;
		this.origin = origin;
		this.hot = true;
	}
	
	public String getCoffeeName() {
		return coffee.name;
	}
	
	public int getCoffeeCode() {
		return coffee.code;
	}
	
	public String getOriginName() {
		return null;
	}
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, 0);	
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, 0);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOCHA, 2500, 20, 0);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOCHA, 3500, 25, 0);
	}
}
















