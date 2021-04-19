package myobj.game.poker;

public class Suit {
	int value;
	char shape;
	String korName;
	String engName;
	
	public Suit(int value, char shape, String korName, String engName) {
		this.value = value;
		this.shape = shape;
		this.korName = korName;
		this.engName = engName;
	}
	
	public String getEngName() {
		return engName;
	}
	public String getKorName() {
		return korName;
	}
	public char getShape() {
		return shape;
	}
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return Character.toString(shape);
	}
}
