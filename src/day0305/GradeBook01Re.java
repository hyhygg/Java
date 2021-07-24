package day0305;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 을 입력 받아

// 다음과 같은 양식으로 출력해주는 프로그램

// 번호: ###반 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

// 단, 입력 기능과 출력 기능을 분리하여
// 사용자가 입력을 선택했을 때에만 입력을 하게 되고
// 사용자가 출력을 선택했을 때에만 출력을 하게 하는 프로그램을 만드시오.
// 또한 사용자가 잘못된 점수를 입력했을 경우, 올바른 점수를 입력할 때까지 다시 입력을 받도록 하세요.

// 생각해볼것: 변수의 선언 위치.
// 심화문제: 만약 사용자가 아무런 정보를 입력 없이 출력을 누르면
//        " 아직 아무런 입력이 되지 않았습니다"
//        라는 메시지만 출력되게 프로그램을 작성하시오.

import java.util.Scanner;

public class GradeBook01Re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int id = 0;
        String name = new String ();
        int korean = 0;
        int english = 0;
        int math = 0;
                
        
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userchoice = scanner.nextInt();
            
            // 입력
            if (userchoice == 1) {
                System.out.println("번호를 입력하세요.");
                System.out.print("> ");
                id = scanner.nextInt();
                
                scanner.nextLine();
                System.out.println("이름를 입력하세요.");
                System.out.print("> ");
                name = scanner.nextLine();
                
                
                System.out.println("국어 성적를 입력하세요.");
                System.out.print("> ");
                korean = scanner.nextInt();
                
                System.out.println("영어 성적를 입력하세요.");
                System.out.print("> ");
                english = scanner.nextInt();
                
                System.out.println("수학 성적를 입력하세요.");
                System.out.print("> ");
                math = scanner.nextInt();
            
            // 출력
            } else if (userchoice == 2) {
                
                int sum = korean + english + math;
                double average = sum / 3.0;
                
                System.out.printf("번호: %03d반 이름: %s\n", id, name);
                System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", korean, english, math);
                System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
               
                
            } else if (userchoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;                                   
                
            }
               
            
        }
        
        
        scanner.close();
    }
}
