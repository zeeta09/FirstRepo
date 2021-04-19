package quiz;

import java.util.ArrayList;

import myobj.school.Student2;


public class D01_StudentList {

	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	  1. �� �л��� ������ �������� �����˴ϴ�
	 	  
	 	  2. ������ ��/��/�� �ۿ� �����ϴ�
	 	  
	 	  3. 30���� ����� ������ּ���
	 	  
	 	  4. 30���� ���� ������ ���� �л��� �̸��� ������ ������ּ���
	 	  
	 	  5. �̸��� ������ ���� �����˴ϴ�
	 	  
	 	  		�л�000000
	 	  		�л�000001
	 	  		�л�000002
	 	  		...
	*/
	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<>();
		
		for (int i = 0; i < 300; ++i) {
			Student2 stu = new Student2();
			students.add(stu);
			System.out.println(stu.getTranscript());
		}
		
		System.out.println("- - - - �ְ� ���� �л� - - - -");
		for (Student2 student : students) {			
			if (student.getTotal() == Student2.BEST_TOTAL) {
				System.out.println(student.getTranscript());
			} 			
		}
	}
	
}

















