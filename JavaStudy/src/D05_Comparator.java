import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class D05_Comparator {

        /*
                 # Comparator
                 
                  - �����ϸ� �� ��ü�� ũ�⸦ ���� �� ����ϴ� Ŭ������ �Ǵ� �������̽� 
                  - ��ü���� ũ�⸦ ���� �� ���ȴ�          
        */
        public static void main(String[] args) {
                String str1 = "yes";
                String str2 = new String("yes");
                
                System.out.println("str == str2: " + (str1 == str2));
                System.out.println("str.equals(): " + str1.equals(str2));
                
                Grape podo1 = new Grape().setGno("PODO1588");
                Grape podo2 = new Grape().setGno("PODO1588");
                
                System.out.println(podo1 == podo2);
                System.out.println(podo1.equals(podo2));
                
                LinkedList<Grape> grapes = new LinkedList<>();
                                                
                for (int i = 0; i < 10; ++i) {
                        grapes.addLast(new Grape()
                                        .setGno(String.format("PODO%04d", (int)(Math.random() * 10000)))
                                        .setLocation((int)(Math.random() * Grape.LOCATIONS))
                                        .setFruit((int)(Math.random() * 11 + 30)));                        
                        System.out.println(grapes.getLast());                        
                }                
                
                // ������ ������ ���ػ�� ���ĵɱ�
                Collections.sort(grapes, new �����з���_�����˸���_��������());
                
                System.out.println("\n#### ���� �� ####");
                for (Grape grape : grapes) {
                        System.out.println(grape);                        
                }
                
                // ����1: ���� �˸��� ���� �������� �����غ���
                Collections.sort(grapes, new �����з���_�˸��̱���_��������());
                
                System.out.println("\n#### �˸��� ���� �������� ####");
                for (Grape grape : grapes) {
                        System.out.println(grape);                        
                }
                
                // ����2: ���� gno ���� �������� �����غ���
                Collections.sort(grapes, new �����з���_GNO����_��������());
                
                System.out.println("\n#### GNO ���� �������� ####");
                for (Grape grape : grapes) {
                        System.out.println(grape);                        
                }
        }
}

class �����з���_GNO����_�������� implements Comparator<Grape> {

        @Override
        public int compare(Grape o1, Grape o2) {
                
                // ���ڿ��� ũ�� �񱳴� �̹� StringŬ������ compareTo�޼��忡 �����Ǿ� �ִ�.
                return o1.gno.compareTo(o2.gno) * -1;
                
//                String gno1 = o1.gno;
//                String gno2 = o2.gno;
//                
//                int min_len = Math.min(gno1.length(), gno2.length());
//                
//                for (int i = 0; i < min_len; ++i) {
//                        if (gno1.charAt(i) > gno2.charAt(i)) {
//                                return -1;
//                        } else if (gno1.charAt(i) < gno2.charAt(i)) {
//                                return 1;
//                        }
//                }
//                
//                if (gno1.length() == gno2.length()) {
//                        return 0;
//                } else if (gno1.length() > gno2.length()) {
//                        return -1;
//                } else {
//                        return 1;
//                }
        }
        
}

class �����з���_�˸��̱���_�������� implements Comparator<Grape> {

        @Override
        public int compare(Grape o1, Grape o2) {        
                if (o1.fruit < o2.fruit) {
                        return 1;
                } else if (o1.fruit == o2.fruit) {
                        return 0;
                } else {
                        return -1;
                }
        }
}

class �����з���_�����˸���_�������� implements Comparator<Grape> {
        /*
                 # Comparator�� ��Ģ
                 
                  - compare �޼����� ���� ���� ����� o1�� o2�� ������ �ٲ۴�
                  - compare �޼����� ���� ���� 0�̸� ���� ũ��� ����Ѵ�
                  - compare �޼����� ���� ���� ������ o1�� o2�� ������ �״�� �����Ѵ� 
        */
        @Override
        public int compare(Grape o1, Grape o2) {
                if (o1.fruit < o2.fruit) {
                        return -1;
                } else if (o1.fruit == o2.fruit) {
                        return 0;
                } else {
                        return 1;
                }
        }        
}

class Grape {
        private static String[] locationNames = {"�����̽þ�", "ĥ��", "�̰�����", "�����", "ȣ��"};
        public static int LOCATIONS = locationNames.length;
        
        String gno;
        int location;
        int fruit;
        
        Grape setGno(String gno) {
                this.gno = gno;
                return this;
        }
        
        Grape setLocation(int location_id) {
                location = location_id;
                return this;
        }
        
        Grape setFruit(int fruit) {
                this.fruit = fruit;
                return this;
        }
        
        /*
                  # equals()
                   
                   - Object �޼���
                   - ���� ��ü���� ���� �� � �������� �����ؾ� �ϴ����� �����س��� �޼���
                   - �⺻ ������ �ּҰ� ��
        */
        @Override
        public boolean equals(Object obj) {
                return this.gno == ((Grape) obj).gno;
        }
        
        public boolean equals(Grape grape) {
                return this.gno == grape.gno;
        }
        
        /*
                 # toString()
                 
                  - ��� ��ü�� ���ԵǾ� �ִ� �޼��� (Object �޼���)
                  - �� �ν��Ͻ��� ���ڿ��� ǥ���Ѵٸ�? �� �����س��� �޼���         
                  - System.out.println()�� ��� ������ �ν��Ͻ��� toString() 
                    �޼����� ����� �ֿܼ� ����ϴ� �޼����̴� 
                  - Object Ŭ������ �����Ǿ� �ִ� toString() �޼����� �⺻ ������ 
                    "Ŭ������@�ּҰ�" �̴�         
        */
        @Override
        public String toString() {                
                return gno + "/" + fruit + "/" + locationNames[location] + "(" + location + ")";
        }
}






