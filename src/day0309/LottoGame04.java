package day0309;
// 로또 게임 (숙제)

// 사용자로부터 숫자 6개를 입력 받아서
// 정렬하여 출력하시오.

// 단, 사용자가 잘못된 숫자 혹은 중복된 숫자를 입력하면
// 올바른 숫자를 입력할 때까지 다시 입력을 받도록 하세요.(while)

import java.util.Scanner;
import java.util.Random;

public class LottoGame04 {
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 변수 선언
        int[] lottoNumbers = new int[6];
        int idx = 0;
        int randomNumber = random.nextInt(NUMBER_MAX) + 1;

        // 사용자 숫자 입력
        while (true) {
            System.out.println();
            System.out.println("1. 숫자 입력 2. 당첨 확인 3. 종료");
            System.out.print("> ");
            int userNumber = scanner.nextInt();

            if (userNumber == 1) {

                System.out.println("로또 숫자 6개를 입력하세요.");
                System.out.print("> ");
                int userChoice = scanner.nextInt();

                while (userChoice != randomNumber) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("숫자를 다시 입력해주세요.");
                    System.out.print("> ");
                    userNumber = scanner.nextInt();
                }

            } else if (userNumber == 2) {

                while (idx < lottoNumbers.length) {

                    boolean numberChecker = true;
                    for (int i = 0; i < lottoNumbers.length; i++) {
                        if (randomNumber == lottoNumbers[i]) {
                            numberChecker = false;
                            break;
                        }
                    }
                    if (numberChecker) {
                        lottoNumbers[idx] = randomNumber;
                        idx++;
                    }

                    for (int i = 0; i < lottoNumbers.length - 1; i++) {
                        if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                            int temp = lottoNumbers[i];
                            lottoNumbers[i] = lottoNumbers[i + 1];
                            lottoNumbers[i + 1] = temp;
                            i = -1;
                        }
                    }

                    for (int i = 0; i < lottoNumbers.length; i++) {
                        
                        System.out.printf("lottoNumbers[%d]: [%2d]\n", i, lottoNumbers[i]);
                    }
                }

                scanner.close();
            }
        }
    }
}