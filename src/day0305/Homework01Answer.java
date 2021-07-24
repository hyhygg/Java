package day0305;

//사용자로부터 키와 몸무게를 입력 받아서

//사용자의 bmi 수치를 소숫점 2번째 자리까지 출력하고
//사용자의 체형이 어디에 속하는지도 출력하세요
//bmi 공식: 몸무게(kg) / 키(m) / 키(m)
//체형 기준
//~18.5 미만: 저체중
//~23 미만: 정상체중
//~25 미만: 과체중
//그외: 비만

//기네스북에 따르면 세상에서 가장 키가 컸던 사람의 키는 2.82m였습니다.
//기네스북에 따르면 세상에서 가장 몸무게가 많이 나갔던 사람의 무게는 635킬로그램이었습니다.

//Bmi Checker를
//입력과 출력을 나눈 메뉴 버전으로 고치시오.

import java.util.Scanner;

public class Homework01Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 키, 몸무게, 입력스위치 변수 선언 및 초기화
        double height = 0;
        double weight = 0;
        boolean inputSwitch = false;

        while (true) {
            System.out.println("1. 키 몸무게 입력");
            System.out.println("2. 결과 확인");
            System.out.println("3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 키 몸무게 입력 코드 구현

                // 1. 키 입력
                System.out.println("키를 m단위로 입력해주세요.");
                System.out.print("> ");
                height = scanner.nextDouble();

                // 2. 키 검증
                while (!(height > 0 && height <= 2.82)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("키를 m단위로 입력해주세요.");
                    System.out.print("> ");
                    height = scanner.nextDouble();
                }

                // 3. 몸무게 입력
                System.out.println("몸무게를 입력해주세요.");
                System.out.print("> ");
                weight = scanner.nextDouble();

                // 4. 몸무게 검증
                while (!(weight > 0 && weight <= 635)) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("몸무게를 입력해주세요.");
                    System.out.print("> ");
                    weight = scanner.nextDouble();
                }

                // 5. 입력스위치 true로 변경
                inputSwitch = true;

            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (inputSwitch) {
                    double bmi = weight / height / height;

                    if (bmi < 18.5) {
                        System.out.println("저체중입니다.");
                    } else if (bmi < 23) {
                        System.out.println("정상체중입니다.");
                    } else if (bmi < 25) {
                        System.out.println("과체중입니다.");
                    } else {
                        System.out.println("비만입니다.");
                    }

                } else {
                    System.out.println("아직 입력된 내용이 없습니다.");
                }

            } else if (userChoice == 3) {
                // 메세지 출력 후 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }
}
