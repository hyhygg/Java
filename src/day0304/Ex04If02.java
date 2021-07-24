package day0304;

import java.util.Scanner;

// 1. 사용자로부터 숫자를 입력받아서 자연수이면 자연수입니다 가 출력되게 만드시오
// 2. 사용자로부터 나이를 입력받아서 미성년자이면 미성년자입니다 가 출력되게 만드시오
// 3. 사용자로부터 숫자를 입력받아서 홀수이면 홀수입니다 가 출력되게 만드시오
// 4. 사용자로부터 아이디와 비밀번호를 입력받아서 아이디가 "admin", 비밀번호가 "111"이면 로그인 성공을 출력되게 만드시오
// 5. 사용자로부터 숫자를 입력받아서 0이상 100 미만일 경우, "두자리 자연수입니다" 가 출력되게 만드시오
public class Ex04If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========1번========");
        System.out.println("숫자를 입력해주세요.");
        System.out.print("> ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("자연수입니다.");
        } else {
            System.out.println("음의 정수입니다.");
        }

        System.out.println("------------------");

        System.out.println("========2번========");
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();

        if (age < 19) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
        System.out.println("------------------");

        System.out.println("========3번========");
        System.out.println("숫자를 입력해주세요.");
        System.out.print("> ");
        number = scanner.nextInt();

        if (number % 2 == 1) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }

        System.out.println("------------------");

        System.out.println("========4번========");
        scanner.nextLine();
        System.out.println("ID");
        System.out.print("> ");
        String id = new String(scanner.nextLine());

        System.out.println("PW");
        System.out.print("> ");
        String pw = new String(scanner.nextLine());

        if (id.equals("admin") && pw.equals("111")) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

        System.out.println("------------------");

        System.out.println("========5번========");
        System.out.println("숫자를 입력해주세요.");
        System.out.print("> ");
        number = scanner.nextInt();

        if (number >= 0 && number < 100) {
            System.out.println("두자리 이하 자연수입니다.");
        } else {
            System.out.println("두자리 이하의 자연수가 아닙니다.");
        }

        System.out.println("프로그램 종료");
        scanner.close();

    }
}