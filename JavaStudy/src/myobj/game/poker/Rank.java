package myobj.game.poker;

public class Rank {

	// private�� �̿��� �ʵ带 �Ժη� ������ �� ���� ����� (��û�� ���� �����ڰ�)
	private int value;
	private String name;
	
	public Rank(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	// getter : public���� private �ʵ带 �������⸸ �ϴ� �޼���
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
