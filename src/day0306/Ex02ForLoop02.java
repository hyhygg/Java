package day0306;
// 1. 1~10까지 차례대로 출력하시오.

// 2. 15~3까지 차례대로 출력하시오.
// 3. 1~20까지 짝수만 출력하시오.
// 4. 사용자로부터 숫자를 입력 받아서 1부터 그수까지 출력하시오.
// 5. 사용자로부터 2개의 숫자를 입력받아서 더 작은 숫자부터 더 큰 숫자까지를 차례대로 출력하시오.
// 6. 사용자로부터 숫자를 입력 받아서 1부터 그수까지의 합을 출력하시오.
// 7. 사용자로부터 숫자를 입력 받아서 1부터 그수까지의 곱을 출력하시오.

import java.util.Scanner;

public class Ex02ForLoop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 1~10까지 차례대로 출력하시오.
        System.out.println();
        System.out.println("1번");
        // i의 초기화 변수와 종료조건식에서 쓸 변수를 만들어서 사용해보자
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // 2. 15~3까지 차례대로 출력하시오.
        System.out.println();
        System.out.println("2번");
        start = 15;
        end = 3;
        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }

        // 3. 1~20까지 짝수만 출력하시오.
        System.out.println();
        System.out.println("3번");
        start = 1;
        end = 20;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }    
        
        // 4. 사용자로부터 숫자를 입력 받아서 1부터 그수까지 출력하시오.
        System.out.println();
        System.out.println("4번");
        System.out.println("숫자를 입력하세요.");
        System.out.printf("> ");
        int userNumber = scanner.nextInt();

        start = 1;
        end = userNumber;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // 5. 사용자로부터 2개의 숫자를 입력받아서 더 작은 숫자부터 더 큰 숫자까지를 차례대로 출력하시오.
        System.out.println();
        System.out.println("5번");
        System.out.println("첫번째 숫자를 입력하세요.");
        System.out.printf("> ");
        userNumber = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요.");
        System.out.printf("> ");
        int userNumber2 = scanner.nextInt();

        if (userNumber <= userNumber2) {
            start = userNumber;
            end = userNumber2;
        } else {
            start = userNumber2;
            end = userNumber;
        }

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // 6. 사용자로부터 숫자를 입력 받아서 1부터 그수까지의 합을 출력하시오.
        System.out.println();
        System.out.println("6번");

        // 합을 저장할 int 변수
        int result = 0;

        System.out.println("숫자를 입력하세요.");
        System.out.printf("> ");
        userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            result += i;
        }
            
        System.out.printf("1부터 [%d]까지의 합: [%d]\n", userNumber, result);

        // 7. 사용자로부터 숫자를 입력 받아서 1부터 그수까지의 곱을 출력하시오.
        System.out.println();
        System.out.println("7번");
        
        // 합을 저장할 result를 1로 초기화 한다.
        result = 1; // 0곱하면 뭘 곱하든 결과로 0이 나옴.

        System.out.println("숫자를 입력하세요.");
        System.out.printf("> ");
        userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            result *= i;
        }
        
        System.out.printf("1부터 [%d]까지의 곱: [%d]\n", userNumber, result);

        scanner.close();
    }
}
