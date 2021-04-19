package quiz;

public class B14_GCD {

	/*	
		두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요 
		
		※ 최대공약수 : 두 숫자의 공약수 중 가장 큰 공약수 	  
	*/
	public static void main(String[] args) {		
		
		// 둘 중 더 작은 숫자의 모든 약수를 구하면서, 남은 숫자도 나눠지는지 확인
		int num1 = 30, num2 = 50;
		int gcd = 1;
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		for (int i = min; i >= 1; --i) {			
			if (min % i == 0 && max % i == 0) {
				gcd = i;
				break;
			}			
		}
		
		System.out.println("gcd: " + gcd);
	}	
	
}






