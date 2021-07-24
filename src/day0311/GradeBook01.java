package day0311;
// 사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서

// 예쁘게 출력 하는 프로그램을 만드시오.
// 해당 프로그램은 총 6명의 학생의 정보를 입력할 수 있습니다.

// 단, 국어 영어 수학 점수는 2차원 배열을 사용하여
// 묶어서 관리가 가능하게 만드시오.

import java.util.Scanner;

public class GradeBook01 {
    static final int STUDENT_SIZE = 6;
    static final int SUBJECT_SIZE = 3;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idArray = new int[STUDENT_SIZE];
        String[] nameArray = new String[STUDENT_SIZE];
        int[] koreanArray = new int[STUDENT_SIZE];
        int[] englishArray = new int[STUDENT_SIZE];
        int[] mathArray = new int[STUDENT_SIZE];

        int idx = 0;

        while (true) {
            System.out.println();
            System.out.println("1.입력 2.출력 3.종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {

                if (idx < STUDENT_SIZE) {

                    System.out.println("번호");
                    System.out.print("> ");
                    idArray[idx] = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("이름");
                    System.out.print("> ");
                    nameArray[idx] = new String(scanner.nextLine());

                    System.out.println("국어");
                    System.out.print("> ");
                    koreanArray[idx] = scanner.nextInt();

                    while (!(koreanArray[idx] >= SCORE_MIN && koreanArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("국어점수");
                        System.out.print("> ");
                        koreanArray[idx] = scanner.nextInt();
                    }

                    System.out.println("영어");
                    System.out.print("> ");
                    englishArray[idx] = scanner.nextInt();

                    while (!(englishArray[idx] >= SCORE_MIN && englishArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("영어점수");
                        System.out.print("> ");
                        englishArray[idx] = scanner.nextInt();
                    }

                    System.out.println("수학");
                    System.out.print("> ");
                    mathArray[idx] = scanner.nextInt();

                    while (!(mathArray[idx] >= SCORE_MIN && mathArray[idx] <= SCORE_MAX)) {
                        System.out.println("잘못 입력하셨습니다.");
                        System.out.println("수학점수");
                        System.out.print("> ");
                        mathArray[idx] = scanner.nextInt();
                    }

                    idx++;

                } else {
                    System.out.println("더이상 입력하실 수 없습니다");
                }

            } else if (userChoice == 2) {

                if (idx > 0) {

                    char[][] korean = new char[idArray[idx]][koreanArray[idx]];

                    for (int i = 0; i < idx; i++) {
                        for (int j = 0; j < koreanArray[idx]; j++) {
                            System.out.printf("번호: %d번 국어: %03d점 \n", korean[i][j]);
                        }
                    }

                    char[][] english = new char[idArray[idx]][englishArray[idx]];

                    for (int i = 0; i < idx; i++) {
                        for (int j = 0; j < englishArray[idx]; j++) {
                            System.out.printf("번호: %d번 영어: %03d점 \n", english[i][j]);
                        }
                    }

                    char[][] math = new char[idArray[idx]][mathArray[idx]];

                    for (int i = 0; i < idx; i++) {
                        for (int j = 0; j < mathArray[idx]; j++) {
                            System.out.printf("번호: %d번 수학: %03d점 \n", math[i][j]);
                        }
                    }
                }

            } else if (userChoice == 3) {

                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

            
        }
    
     scanner.close();
    }
}
