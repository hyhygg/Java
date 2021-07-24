package day0304;
// 사용자로부터

// 번호, 이름, 국어, 영어, 수학 점수를 차례대로 입력을 받아서
// 다음과 같은 형식으로 출력되는 프로그램을 작성하시오(15분까지)

import java.util.Scanner;

//번호: ###번 이름: ###
//국어: 0##점 영어: 0##점 수학: 0##점
//총점: 0##점 평균: 0##.##점

public class GradeBook02 {
    // 프로그램 내부적으로 사용할 상수들
    // 1. 과목의 숫자
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정보 입력

        // 번호 입력
        System.out.println("번호");
        System.out.print("> ");
        int id = scanner.nextInt();

        // 이름 입력
        scanner.nextLine();
        System.out.println("이름");
        System.out.print("> ");
        String name = new String(scanner.nextLine());

        // 국어 입력
        System.out.println("국어");
        System.out.print("> ");
        int korean = scanner.nextInt();

        // 영어 입력
        System.out.println("영어");
        System.out.print("> ");
        int english = scanner.nextInt();

        // 수학 입력
        System.out.println("수학");
        System.out.print("> ");
        int math = scanner.nextInt();

        // 총점과 평균 계산
        int sum = korean + english + math;
        double average = sum / (double) SUBJECT_SIZE;

        // 정보 출력
        System.out.printf("번호: %03d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f", sum, average);

        scanner.close();

    }
}
