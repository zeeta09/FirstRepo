import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D12_SimpleDateFormat {
	
	/*
		# SimpleDateFormat
		
		- �����ϰ� ��¥ �ν��Ͻ��� ���ڷ� ��ȯ�� �� �ִ� Ŭ����
		
		# ��¥ ����
		
		y : ��
		M : ��
		d : ��
		D : �� ���� ���� ��(1 ~ 365)
		H : 24��
		h : 12��
		m : ��
		s : ��
		
		E : ����
		a : ���� / ����
		
		w : day of week in year
		W : day of week in month
		
	*/
	public static void main(String[] args) {
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/mm/dd (DDD) �� HH:mm:ss.SSS");
		
		f1.format(Calendar.getInstance().getTime());
	}
}
