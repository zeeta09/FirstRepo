package myobj.school;

import java.util.Random;

public abstract class Student {
	
	final static String[] lastNameList = {"��", "��", "��", "��", "��", "��", "��", "��", "��", "����", "����", "��", "��", "��", "����", "��", "��", "��", "��"};
	
	final static String[] firstNameList = {"����", "��ȯ", "�¿�", "�¿�", "��ȣ", "����", "����", "�缱", "����", "����", "����", "����", "����", "�¹�", "����", "���", "�¿�"};
	
	String name;
	int sno;
	int kor;
	int eng;
	
	Random ran;
	
	public Student (int sno) {
		this.sno = sno;
		
		ran = new Random();
		
		kor = getRandomScore();
		eng = getRandomScore();
		name = getRandomName();
	}
	
	public abstract void printCradeCard();
	
	protected int getRandomScore() {
		return ran.nextInt(101);
	}
	
	String getRandomName() {
		return lastNameList[ran.nextInt(lastNameList.length)] + firstNameList[ran.nextInt(firstNameList.length)];
	}
}
