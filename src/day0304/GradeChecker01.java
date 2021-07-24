package day0304;
// 사용자로부터 점수를 입력받아서
// A, B, C, D, F 가 출력되는 프로그램을 작성하세요

import java.util.Scanner;

// 90점이상: A
// 80점대: B
// 70점대: C
// 60점대: D
// 그외: F
public class GradeChecker01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("점수를 입력하세요");
        System.out.print("> ");
        int score = scanner.nextInt();
                
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        
        scanner.close();
    }
}
