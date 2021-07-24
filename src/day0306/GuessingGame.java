package day0306;
// 숫자 맞추기 게임

// 1. 플레이 기능
//    플레이 기능에서는 컴퓨터가 1~100 사이의 랜덤한 숫자를 하나 뽑고
//    사용자가 그 숫자를 맞추는 기능이 구현되어 있다.
//    사용자가 컴퓨터가 뽑은 숫자를 맞출 때까지 계속 입력을 하되
//    사용자의 숫자가 더 클 경우에는 DOWN 이라는 메시지가 출력이 되고
//    사용자의 숫자가 더 작을 경우에는 UP 이라는 메시지가 출력이 된다.
//    사용자가 입력하는 숫자는 1~100을 벗어날 수 없다.
//    또한, 사용자가 입력 할때마다 점수가 1씩 추가 되서
//    결국 몇번만에 맞췄는지 점수가 나오고
//    해당 점수가 최고기록보다 작으면, 그 점수가 새로운 최고 기록이 된다.

// 2. 최고기록 보기 기능
//    현재까지 플레이한 기록 중 가장 최고 기록을 보여준다.
//    단, 사용자가 플레이 했던 기록이 없을 경우, " 아직 플레이 기록이 없습니다." 라는 간단한 메시지만 출력해 준다.

// 3. 종료 기능
//    프로그램을 종료시킨다.

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int userchoicenumber = 0;
        int max = 0;

        Boolean inputSwitch = false;

        while (true) {
            System.out.println("1. 플레이 2. 최고기록 보기 3. 종료");
            System.out.print("> ");
            int userchoice = scanner.nextInt();
            
            // 플레이 출력
            if (userchoice == 1) {
                System.out.println("0~100 사이의 숫자를 입력해주세요.");
                System.out.print("> ");
                userchoicenumber = scanner.nextInt();

                while (userchoicenumber == number) {
                    System.out.println("숫자를 맞혔습니다.");
                    number = scanner.nextInt();
                }

                while (!(userchoicenumber >= 1)) {
                    System.out.println("UP");
                    System.out.println("숫자를 다시 입력해주세요.");
                    System.out.print("> ");
                    number = scanner.nextInt();
                }

                while (!(userchoicenumber <= 100)) {
                    System.out.println("Down");
                    System.out.println("숫자를 다시 입력해주세요.");
                    System.out.print("> ");
                    number = scanner.nextInt();
                }

                inputSwitch = true;

            } else if (userchoice == 2) {

                if (inputSwitch) {
                    if (max > number) {
                        System.out.println("최고 기록: " + max);
                    } else {
                        System.out.println("최고 기록: " + number);
                    }
                } else {
                    System.out.println("아직 플레이 기록이 없습니다.");
                }

                // 종료
            } else if (userchoice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }
        }

        scanner.close();
    }
}
