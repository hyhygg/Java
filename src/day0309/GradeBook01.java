package day0309;

// 학생 관리 프로그램
// 5명의 학생을 관리하는 프로그램을 작성하시오.
// 단, 모두 변수로 만드는 것이 아니라
// 번호 배열, 이름 배열, 국어점수 배열, 영어점수 배열, 수학점수 배열,
// 로 만들어서
// 각 배열이 같은 인덱스는 같은 학생의 정보가 될 수 있도록 하시오
// 또한 메뉴를 만들어
// 입력, 출력, 종료를 분리하고
// 입력시에는 0번 1번 2번 ... 순으로 들어갈 수 있게 만드시오.
// 입력시에 잘못된 점수는 입력되지 않도록 만들어 주세요.

// 심화단계: 출력시, 만약 입력 학생이 없으면 "입력된 학생이 없습니다" 라고 출력 되고
//         입력된 학생이 존재할 시에는 입력된 학생들만 출력 되고 아직 입력되지 않은 칸의 정보는
//         출력되지않도록 프로그램을 작성하시오.

import java.util.Scanner;

public class GradeBook01 {
    static final int MEMBER = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[MEMBER];
        String[] name = new String[MEMBER];
        int[] korean = new int[MEMBER];
        int[] english = new int[MEMBER];
        int[] math = new int[MEMBER];
        boolean inputChecker = false;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.println("> ");
            int userChoice = sc.nextInt();
            // 1. 입력
            if (userChoice == 1) {
                int userInput = 0;
                String Name = new String();

                System.out.println("번호를 입력하세요");
                System.out.println("> ");
                userInput = sc.nextInt();
                for (int i = 0; i < num.length; i++)
                    num[i] = userInput;

                System.out.println("이름을 입력하세요");
                System.out.println("> ");
                Name = sc.next();
                for (int i = 0; i < name.length; i++)
                    name[i] = Name;
                // 점수입력

                // 국어
                System.out.println("국어점수를 입력해주세요.");
                System.out.println("> ");
                userInput = sc.nextInt();
                while (!(userInput >= 0 && userInput <= 100)) {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("다시 입력해주세요.");
                    System.out.println("> ");
                    userInput = sc.nextInt();
                }
                System.out.println("입력성공");
                for (int i = 0; i < korean.length; i++) {
                    korean[i] = userInput;
                }
                // 영어
                System.out.println("영어점수를 입력해주세요.");
                System.out.println("> ");
                userInput = sc.nextInt();
                while (!(userInput >= 0 && userInput <= 100)) {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("다시 입력해주세요.");
                    System.out.println("> ");
                    userInput = sc.nextInt();
                }
                System.out.println("입력성공");
                for (int i = 0; i < english.length; i++) {
                    english[i] = userInput;
                }
                // 수학
                System.out.println("수학점수를 입력해주세요.");
                System.out.println("> ");
                userInput = sc.nextInt();
                while (!(userInput >= 0 && userInput <= 100)) {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("다시 입력해주세요.");
                    System.out.println("> ");
                    userInput = sc.nextInt();
                }
                System.out.println("입력성공");
                for (int i = 0; i < math.length; i++) {
                    math[i] = userInput;
                }
                inputChecker = true;
            }

            // 2. 출력
            else if (userChoice == 2) {
                if (inputChecker) {
                    for (int i = 0; i < MEMBER; i++) {

                        System.out.println("번호: " + num[i] + "이름: " + name[i] + "국어: " + korean[i] + "영어:" + english[i]
                                + "수학: " + math[i]);
                    }
                } else {
                    System.out.println("입력이나 하고 오십시오");
                }

            }
            // 3. 종료
            else if (userChoice == 3) {

                System.out.println("종료되었습니다.");
                break;
            }
        }
        sc.close();
    }

}
