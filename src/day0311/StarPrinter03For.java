package day0311;

// 별찍기 3번
// userNumber = 5
//- - - - * // i = 0 j =         4   // i = 0 j = 0,1,2,3 
//- - - * * // i = 1 j =       3,4   // i = 1 j = 0,1,2   
//- - * * * // i = 2 j =     2,3,4   // i = 2 j = 0,1     
//- * * * * // i = 3 j =   1,2,3,4   // i = 3 j = 0       
//* * * * * // i = 4 j = 0,1,2,3,4   // i = 4 j = 
import java.util.Scanner;

public class StarPrinter03For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별찍기 3번");
        System.out.println("출력할 줄 수");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        char[][] stars = new char[userNumber][userNumber];

        for (int i = 0; i < stars.length; i++) {
            // 공백을 담당하는 j for 문
            for (int j = 0; j < userNumber - (i + 1); j++) {
                stars[i][j] = ' ';
            }
            // 별을 담당하는 j for 문
            for (int j = userNumber - (i + 1); j < userNumber; j++) {
                stars[i][j] = '*';
            }
        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.println(stars[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
