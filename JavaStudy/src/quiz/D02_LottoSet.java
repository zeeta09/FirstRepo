package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class D02_LottoSet {
	
	/*
		1���� 45������ �ߺ� ���� ���� ���� 7���� �̷���� HashSet�� �����Ͽ�
		��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���
	*/
	public HashSet<Integer> getLottoSet() {
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 7) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		
		return lotto;
	}
	
	/*
		1���� 45������ �ߺ� ���� ���� ���� 7���� �̷���� ArrayList�� �����Ͽ�
		��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���
	*/
	
	public ArrayList<Integer> getLottoList() {
		return new ArrayList<>(getLottoSet());
	}
	
	/*
		1���� 45������ �ߺ� ���� ���� ���� 7���� �̷���� int[]�� �����Ͽ�
		��ȯ�ϴ� �޼��带 �ۼ� �� �׽�Ʈ�غ���
	*/
	
	public Integer[] getLottoArray() {
		return getLottoList().toArray(new Integer[7]);
	}
	
	public int[] getLottoArray2() {
		Integer[] lotto = getLottoArray();
		int[] result = new int[7];
		
		for(int i = 0; i < 7; ++i) {
			result[i] = lotto[i];
		}
		return result;
	}
		
	public static void main(String[] args) {
		
//		HashSet<Integer> lotto = new D02_LottoSet().getLottoSet();
//		System.out.println(lotto);
		
		ArrayList<Integer> lotto = new D02_LottoSet().getLottoList();
		System.out.println(lotto);
	}
}