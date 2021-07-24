package day0311;

// 별찍기 3번
// userNumber = 5
//- - - - * // i = 0 j =         4 (0.1)   // i = 0 j = 0,1,2,3 (0.4)
//- - - * * // i = 1 j =       3,4 (1.2)   // i = 1 j = 0,1,2   (1.3)
//- - * * * // i = 2 j =     2,3,4 (2.3)   // i = 2 j = 0,1     (2.2)
//- * * * * // i = 3 j =   1,2,3,4 (3.4)   // i = 3 j = 0       (3.1)
//* * * * * // i = 4 j = 0,1,2,3,4 (4.5)   // i = 4 j =         (4.0)
import java.util.Scanner;

public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별찍기 3번");
        System.out.println("출력할 줄 수");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {

                // 공백을 담당하는 if
                if (j < userNumber - (i + 1)) {
                    stars[i][j] = ' ';
                } else {
                    // 별을 담당하는 else
                    stars[i][j] = '*';
                }
            }
        }
        scanner.close();
    }
}
