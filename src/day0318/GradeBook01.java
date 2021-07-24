package day0318;
// 학생관리 프로그램을

// 인덱스가 아니라 학생 번호를 기준으로 하여
// 관리 되는 프로그램으로 만드시오.
// 중복 학생인지 아닌지는
// 번호로만 판단하도록 합니다.

import java.util.ArrayList;
import java.util.Scanner;

import day0316.Student;
import util.ScannerUtil;

public class GradeBook01 {
    private static ArrayList<Student> List = new ArrayList<>();
    private static final int SCORE_MIN = 0;
    private static final int SCORE_MAX = 100;
    private static Scanner scanner = new Scanner(System.in);
    private static int currentId = 1;

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        while (true) {

            System.out.println("=================================");
            System.out.println("            비트고등학교             ");
            System.out.println("         성적 관리 프로그램           ");
            System.out.println("=================================");
            String message = new String("1. 입력\n2. 목록 보기\n3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if (userChoice == 1) {
                // 입력 메소드 실행
                insert();

            } else if (userChoice == 2) {
                // 목록 보기 메소드 실행
                printAll();

            } else if (userChoice == 3) {
                // 종료 실행
                System.out.println("사용해주셔서 감사힙니다.");
                break;
            }
        }
    }

    // 입력
    private static void insert() {
        Student s = new Student();

        String message;

        s.setId(currentId++);

        message = new String("이름을 입력해주세요");
        s.setName(ScannerUtil.nextLine(scanner, message));
        message = new String("국어 점수를 입력해주세요");
        s.setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        message = new String("수학 점수를 입력해주세요");
        s.setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
        message = new String("영어 점수를 입력해주세요");
        s.setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));

        List.add(s);
    }

    // 출력 / 개별보기 / 뒤로가기
    private static void printAll() {
        while (true) {
            if (List.size() == (0)) {
                System.out.println();
                System.out.println("아직 입력된 학생의 정보가 존재하지 않습니다.");
                System.out.println();
                break;
            }

            System.out.println();
            for (int i = 0; i < List.size(); i++) {
                System.out.printf("%d, %s \n", List.get(i).getId(), List.get(i).getName());
            }
            String message = new String("개별 보기할 학생의 번호를 선택해주세요. 뒤로 가기는 0을 입력해주세요.");
            int userChoice = ScannerUtil.nextInt(scanner, message); // -1이 안으로 들어가면 0~2까지만 입력가능

            Student s = new Student();
            s.setId(userChoice);

            while (!(userChoice == 0 || List.contains(s))) {
                System.out.println("해당 학생 번호는 존재하지 않는 번호입니다.");
                userChoice = ScannerUtil.nextInt(scanner, message);
                s.setId(userChoice);
            }

            if (userChoice == 0) {
                System.out.println();
                System.out.println("메뉴로 돌아갑니다.");
                System.out.println();
                break;
            } else {
                printOne(userChoice);
            }
        }
    }

    // 중복
    private static int findIndex(int id) {

        Student s = new Student();
        s.setId(id);

        return List.indexOf(s);
    }

    // 개별보기 -> 수정 삭제
    private static void printOne(int id) {
        int index = findIndex(id);

        if (index == -1) {
            System.out.println();
            System.out.println("해당 학생 번호는 존재하지 않는 번호입니다.");
            System.out.println();

        } else {
            List.get(index).showInfo();
            String message = new String("1. 수정 2. 삭제 3. 뒤로가기");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                update(id);
                printOne(id);
            } else if (userChoice == 2) {
                delete(id);
            }
        }
    }

    // 수정
    private static void update(int id) {

        int index = findIndex(id);

        if (index == -1) {
            System.out.println();
            System.out.println("해당 학생 번호는 존재하지 않는 번호입니다.");
            System.out.println();
        } else {

            String message = new String("국어 점수를 입력해주세요");
            List.get(id).setKorean(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
            message = new String("영어 점수를 입력해주세요");
            List.get(id).setEnglish(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));
            message = new String("수학 점수를 입력해주세요");
            List.get(id).setMath(ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX));

        }
    }

    // 삭제
    private static void delete(int id) {

        int index = findIndex(id);

        if (index == -1) {
            System.out.println();
            System.out.println("해당 글 번호는 존재하지 않는 번호입니다.");
            System.out.println();
        } else {
            String message = new String("정말로 삭제하시겠습니까? 삭제하시려면 Y 혹은 y를 입력해주세요.");
            String yesNo = new String(ScannerUtil.nextLine(scanner, message));

            if (yesNo.equalsIgnoreCase("Y")) {
                List.remove(id);
            } else {
                printOne(id);
            }
        }
    }
}
