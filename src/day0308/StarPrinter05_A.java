package day0308;

// 별찍기 05
import java.util.Scanner;

public class StarPrinter05_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("별찍기 5번");
        System.out.println("출력할 줄 수");
        System.out.println("> ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();

            // 공백을 담당하는 j for 문
            for (int j = 1; j <= userNumber - i; j++) {

                stars = stars + " ";
                // userNumber가 5, i가 1일 경우
                // for (j = 1; j <= 5 - 1; j++)
                // stars -> "";
                // j: 1 -> stars = "" + " "; -> stars = " ";(공백 1개)
                // j: 2 -> stars = " " + " "; -> stars = "  ";(공백 2개)
                // j: 3 -> stars = "  " + " "; -> stars = "   ";(공백 3개)
                // j: 4 -> stars = "   " + " "; -> stars = "    ";(공백 4개)
            }

            // 별을 담당하는 j for 문
            for(int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";               
            }

            System.out.println(stars);
        }

        scanner.close();
    }
}
