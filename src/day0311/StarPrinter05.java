package day0311;

// 별찍기 5번
//     *                           (0.4)
//    ***                     (1.3)(1.4)(1.5) 
//   *****               (2.2)(2.3)(2.4)(2.5)(2.6)
//  *******         (3.1)(3.2)(3.3)(3.4)(3.5)(3.6)(3.7)  
// *********   (4.0)(4.1)(4.2)(4.3)(4.4)(4.5)(4.6)(4.7)(4.8)

import java.util.Scanner;

public class StarPrinter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 별찍기 5번 ");
        System.out.println(" 출력할 줄 수 ");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int max = 2 * userNumber - 1;

        char[][] stars = new char[userNumber][max];
        for (int i = 0; i < stars.length; i++) {
            // 별의 갯수 = (i+1) * 2 - 1
            // = 2 * i + 2 - 1
            // = 2 * i + 1
            int starWidth = 2 * i + 1;

            // 별이 찍히는 시작 시점: 4 - 3 - 2 - 1 - 0
            // = userNumbeer - (i + 1)
            int starStart = userNumber - (i + 1);

            // 별을 담당하는 j for 문
            for (int j = starStart; j < starStart + starWidth; j++) {
                stars[i][j] = '*';
            }
        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
