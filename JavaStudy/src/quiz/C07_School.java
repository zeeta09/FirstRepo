package quiz;

import myobj.school.MachineLearningStudent;
import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

public class C07_School {

	
	/*
		1. �� ���� ������ 30���̴�.
		
		2-1. ���α׷��� �� �л��� ������ ����, ����, ���� ���α׷��� ��� ������ �ִ�.
		
		2-2. ��Ʈ��ũ �� �л��� ������ ����, ����, ������, CCNA ������ �ִ�.
		
		2-3. �ӽŷ��� �� �л��� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�.
		
		3. ��� �л��� ������ �̸��� �������� �����Ѵ�. �й��� �ߺ����� ���������� �����ȴ�.
		
		4. ����ǥ �޼��带 ���� �� �л��� �̸� / ���� / ��������� �� �� �ִ�.
	 */
	
	int sno;
	
	public C07_School() {
		sno = 100000;
		
		Student[] program = new Student[30];
		Student[] network = new Student[30];
		Student[] machine_learning = new Student[30];

		for (int i = 0; i < program.length; ++i) {
			program[i] = new ProgrammingStudent(sno++);
			program[i].printCradeCard();
		}
		for (int i = 0; i < network.length; ++i) {
			program[i] = new NetworkStudent(sno++);
			program[i].printCradeCard();
		}
		for (int i = 0; i < machine_learning.length; ++i) {
			program[i] = new MachineLearningStudent(sno++);
			program[i].printCradeCard();
		}		
	}	
	
	public static void main(String[] args) {
		
		new C07_School();
	
	}
}