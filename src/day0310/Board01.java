package day0310;
// 게시판 프로그램

// 게시글에는 제목, 작성자, 내용 의 내용이 있다.
// 이 프로그램은 총 6개의 게시글을 관리할 수 있다.
// 단, 중복된 제목의 글은 작성할 수 없다.
// 또한 입력과 출력은 분리되어있다.
// 2시 50분까지

import java.util.Scanner;

public class Board01 {
    static final int NUMBER = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titleArray[] = new String[NUMBER];
        String writerArray[] = new String[NUMBER];
        String contentArray[] = new String[NUMBER];

        int idx = 0;

        while (true) {

            System.out.println("1. 게시글 작성 2. 게시글 관리 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {

                if (idx < NUMBER) {
                    // 제목 작성
                    System.out.println("제목을 작성하세요.");
                    System.out.print("> ");
                    titleArray[idx] = scanner.nextLine();

                // 작성자 작성
                    scanner.nextLine();
                    System.out.println("작성자를 작성하세요.");
                    System.out.print("> ");
                    writerArray[idx] = scanner.nextLine();

                    // 내용 작성
                    System.out.println("내용을 작성하세요.");
                    System.out.print("> ");
                    contentArray[idx] = scanner.nextLine();

                    idx++;
                } else {
                    System.out.println("더이상 입력하실 수 없습니다");
                }

            } else if (userChoice == 2) {

                if (idx > 0) {
                    for (int i = 0; i < idx; i++) {
                        System.out.println();
                        System.out.println("제목: " + titleArray[i]);
                        System.out.println("작성자:" + writerArray[i]);
                        System.out.println("내용:" + contentArray[i]);
                        System.out.println("================================ ");
                        System.out.println();

                    }
                } else {
                    System.out.println();
                    System.out.println(" 입력된 글이 존재하지 않습니다.");
                    System.out.println();
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        scanner.close();
    }
}
