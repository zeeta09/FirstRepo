package quiz;

public class B14_Gugudan {

	/*	  
	  	1. �������� ������ ���� ���η� ����غ����� 
	  	
	  	2��: 2x1=2 2x2=4 2x3=6 ...
	  	3��: 3x1=3 3x2=6 3x3=9 ...
	  	4��: ...
	  	
	  	2. �������� ������ ���� ���η� ����غ����� 
	  	
	  	2��		3��		4��		...
	  	2x1=2	3x1=3	4x1=4	...
	  	2x2=4	3x2=6	4x2=8	...
	  	...			 
	*/
	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {			
			System.out.print(dan + "��: ");
			
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			
			System.out.println();			
		}
		
		System.out.println("====================================================================");
		
		for (int line = 0; line <= 9; ++line) {
			
			for (int dan = 2; dan <= 9; ++dan) {
				
				if (line == 0) {
					System.out.print(dan + "��\t");
				} else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}				
			}
		
			System.out.println();
		}
	}
	
}












