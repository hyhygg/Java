package day0311;
//char 2차원 배열을 사용한 별찍기 2번
//* * * * * (0.5)
//* * * * - (1.4)
//* * * - - (2.3)
//* * - - - (3.2)
//* - - - - (4.1)


import java.util.Scanner;

public class StarPrinter02A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 줄을 입력해주세요");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length - i; j++) {
                stars[i][j] = '*';
            }
        }

        // 출력
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);

            }
            System.out.println();
        }

        scanner.close();
    }
}
