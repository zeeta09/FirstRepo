package myobj.school;

public class ProgrammingStudent extends Student {
	
	final static String[] subject_name = {"����", "����", "����", "PL"};
	
	int math;
	int pl;
	
	public ProgrammingStudent(int sno) {
		super(sno);
		math = getRandomScore();
		pl = getRandomScore();
	}

	@Override
	public void printCradeCard() {
		System.out.printf("�й�\t�̸�\t%s\t%s\t%s\t%s\t����\t���\n", 
				subject_name[0], subject_name[1], subject_name[2], subject_name[3]);
		
		System.out.printf("%X\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n", 
				sno, name, kor, eng, math, pl, kor + eng + math + pl, (kor + eng + math + pl) / 4.0);
		System.out.println("---------------------------------------------------------------");
	}
}
