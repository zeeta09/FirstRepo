package quiz;

import java.util.Scanner;

public class B16_GuessNumberGame {

        /*
                 ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
                 
                 1. �÷��̾�� 8���� �õ��� �� �� �ִ�
                 
                 2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
                         
                         ���ڿ� ��ġ�� �� ������� - Strike
                          ���ڸ� ������� - Ball
                          
                 ex: ������ 3456�϶�
                 
                         >> 5634                4 Ball
                         >> 3789                1 Strike
                         >> 3654                1 Strike 3 Ball
                         
                 �� ���߰� ���� �� ������ ������� �˷��ֱ� 
        */
        public static void main(String[] args) {
                final boolean DEBUGMODE = true;
                
                StringBuilder answer_builer = new StringBuilder();
                Scanner input_scanner = new Scanner(System.in);
                
                for (int i = 0; i < 4; ++i) {
                        answer_builer.append((int)(Math.random() * 10));                        
                }                
                String answer = answer_builer.toString();
                
                if (DEBUGMODE) {
                        System.out.printf("�̹� ���� [%s]\n", answer);
                }
                
                // �⺻ Ÿ�� ������ 0���� �ʱ�ȭ
                int strike = 0, ball = 0;
                int tryCount = 0;
                
                // ������ ������ null�� �ʱ�ȭ
                String input = null;
                
                while (strike != 4 && tryCount != 8) {
                        strike = 0;
                        ball = 0;
                        
                        while (true) {
                                System.out.printf("�õ� %d >> ", tryCount + 1);
                                input = input_scanner.nextLine();
                                
                                boolean valid = true;
                                
                                if (input.length() != 4) {
                                        valid = false;
                                }                                
                                
                                for (int i = 0; valid && i < 4; ++i) {
                                        if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                                                valid = false;
                                        }
                                }
                                
                                if (valid) {
                                        break;
                                } else {
                                        System.out.println("4�ڸ� ���ڸ� �Է��ϼž� �մϴ�.");
                                }
                        } 
                        
                        // strike, ball üũ
                        if (answer.equals(input)) {
                                strike = 4;
                        } else {
                                for (int i = 0; i < 4; ++i) {                                        
                                        
                                        for (int j = 0; j < 4; ++j) {                                                
                                                if (answer.charAt(i) == input.charAt(i)) {                                                        
                                                	strike++;
                                                	break;
                                                } else if(answer.charAt(i) == input.charAt(j)) {
                                                	ball++;
                                                	break;
                                                }
                                        }     
                                }
                        }
                        
                        System.out.printf("%d strike, %d ball!\n", strike, ball);
                        
                        tryCount++;
                }
                
                System.out.println("���� ����!");
        }
        
        
}











