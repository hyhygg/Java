package day0315;

// 2. Student 클래스의 배열을 사용한 GradeBook 프로그램을 구현하시오.

import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s = new Student();
        int[] idArray = new int[0];
        String[] nameArray = new String[0];
        int[][] scoreArray = new int[3][0];

        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, "1. 입력 2. 출력 3. 종료");
            if (userChoice == 1) {

                s.id = ScannerUtil.nextInt(scanner, "번호를 입력해주세요");
                s.name = new String(ScannerUtil.nextLine(scanner, "이름을 입력해주세요."));
                s.korean = ScannerUtil.nextInt(scanner, "국어 점수를 입력해주세요.", 0, 100);
                s.english = ScannerUtil.nextInt(scanner, "영어 점수를 입력해주세요.", 0, 100);
                s.math = ScannerUtil.nextInt(scanner, "수학 점수를 입력해주세요.", 0, 100);

                idArray = ArrayUtil.add(idArray, s.id);
                nameArray = ArrayUtil.add(nameArray, s.name);
                scoreArray[0] = ArrayUtil.add(scoreArray[0], s.korean);
                scoreArray[1] = ArrayUtil.add(scoreArray[1], s.english);
                scoreArray[2] = ArrayUtil.add(scoreArray[2], s.math);

            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (ArrayUtil.size(idArray) == 0) {
                    System.out.println("아직 입력된 정보가 없습니다.");
                } else {
                    for (int i = 0; i < ArrayUtil.size(idArray); i++) {
                        s.showInfo();
                    }
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }

    int id;
    String name;
    int korean;
    int english;
    int math;

    public int calculateSum() {
        return korean + english + math;
    }

    public double calculateAverage() {
        return calculateSum() / 3.0;
    }

    public void showInfo() {
        System.out.printf("번호: %02d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", calculateSum(), calculateAverage());
    }

}
