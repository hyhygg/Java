package day0310;
//char 2차원 배열을 사용한 별찍기 2번
//* * * * * // i = 0 j = 0,1,2,3,4  // i = 0 j = 
//* * * * - // i = 1 j = 0,1,2,3    // i = 1 j =         4
//* * * - - // i = 2 j = 0,1,2      // i = 2 j =       3,4
//* * - - - // i = 3 j = 0,1        // i = 3 j =     2,3,4
//* - - - - // i = 4 j = 0          // i = 4 j =   1,2,3,4

import java.util.Scanner;

public class StarPrinter02 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("출력할 줄 수를 입력해 주세요.");
      System.out.print("> ");
      int userNumber = scanner.nextInt();

      char[][] stars = new char[userNumber][userNumber];

      for (int i = 0; i < stars.length; i++) {
          for (int j = 0; j <= i; j++) {
              stars[i][j] = '*';
          }
      }

      for (int i = stars.length-1; i >= 0; i--) {
          for (int j = 0; j <= i; j++) {
              System.out.print(stars[i][j]);
          }

          for (int j = 0; j <= i; j++) {
              System.out.print(" ");
          }

          System.out.println();

      }

      scanner.close();
  }
}