package day0308;

// 별찍기 04
import java.util.Scanner;
public class StarPrinter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력하세요.");
        int userNumber = scanner.nextInt();

        for (int i = userNumber; i >= 1; i--) {

            for (int j = i; j < userNumber; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        scanner.close();
    }
}