package day0319;

import java.util.ArrayList;
import java.util.Scanner;

import board.User;
import util.ScannerUtil;

//예제: 학생 관리 프로그램을 작성하시오
//
//클래스: 
//   학생 클래스(학생 번호, username, 비밀번호, 이름, 소속 반, 점수 입력 여부, 국어 점수, 영어 점수, 수학 점수)
//   교사 클래스(교사 번호, username, 비밀번호, 이름, 소속 반)
//   평가 클래스(평가 번호, 교사 번호, 학생 번호, 내용, 작성일)
//
//요구조건:
//   1. 학생이나 선생은 가입 시에 선택 가능하다.
//      가입시에는 각자의 번호를 제외한 정보를 입력하도록 한다.
//   2. 로그인 후에 메인 화면에서 학생 목록 보기와 교사 정보 보기가 있다.
//   3. 학생은 자신의 성적과 다른 학생의 성적을 볼 수만 있다.
//   4. 학생은 교사에 대한 평가를 남기거나 자기가 남긴 평가를 삭제할 수 있다.
//   5. 다른 학생이나 교사는 자신에 대한 평가를 볼 수만 있다.
//   6. 교사는 자신의 반에 속한 학생들 중 성적이 없으면 입력을, 
//      성적이 있으면 수정을 할수 있지만 삭제는 할 수 없다.

public class GradeBook01 {

    private final static ArrayList<Student> studentList = new ArrayList<>();

    private final static ArrayList<Teacher> teacherList = new ArrayList<>();

    private final static ArrayList<Test> testList = new ArrayList<>();

    private final static Scanner scanner = new Scanner(System.in);

    private static int studentId = 1;
    private static int teacherId = 1;
    private static int testId = 1;
    private static User logIn = null;

    public static void main(String[] args) {
        index();
    }

    // 로그인 & 회원가입
    private static void index() {
        while (true) {
            System.out.println("=================================");
            System.out.println("            비트고등학교             ");
            System.out.println("         학생 관리 프로그램           ");
            System.out.println("=================================");
            String message = new String("1. 로그인 2. 회원가입 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                if (studentList.isEmpty() && teacherList.isEmpty()) {
                    System.out.println();
                    System.out.println("아직 등록된 인원이 없습니다.");
                    System.out.println();
                } else {
                    logIn();

                    if (logIn != null) {
                        showMenu();
                    }
                }

            } else if (userChoice == 2) {
                // 회원가입
                register();

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
    }

    private static void logIn() {

        while (true) {
            String message = new String(" 학생과 교사 중 해당하는 항목을 선택해주세요. 1. 학생 2. 교사");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
            if (userChoice == 1) {
                Student s = new Student();
                message = new String("아이디를 입력해주세요.");
                s.setUserName(ScannerUtil.nextLine(scanner, message));
                message = new String("비밀번호를 입력해주세요.");
                s.setPassword(ScannerUtil.nextLine(scanner, message));

                while (logIn == null) {
                    System.out.println();
                    System.out.println("해당하는 정보와 일치하는 인원이 없습니다.");
                    System.out.println("다시 아이디와 비밀번호를 입력해주세요.");
                    System.out.println();

                    message = new String("아이디를 입력해주세요. 만약 뒤로 가시려면 X를 입력해주세요");
                    s.setUserName(ScannerUtil.nextLine(scanner, message));

                    if (s.getUserName().equalsIgnoreCase("x")) {
                        break;
                    }

                    message = new String("비밀번호를 입력해주세요.");
                    s.setPassword(ScannerUtil.nextLine(scanner, message));
                }

            } else {
                Teacher t = new Teacher();
                message = new String("아이디를 입력해주세요.");
                t.setUserName(ScannerUtil.nextLine(scanner, message));
                message = new String("비밀번호를 입력해주세요.");
                t.setPassword(ScannerUtil.nextLine(scanner, message));

                while (logIn == null) {
                    System.out.println();
                    System.out.println("해당하는 정보와 일치하는 인원이 없습니다.");
                    System.out.println("다시 아이디와 비밀번호를 입력해주세요.");
                    System.out.println();

                    message = new String("아이디를 입력해주세요. 만약 뒤로 가시려면 X를 입력해주세요");
                    t.setUserName(ScannerUtil.nextLine(scanner, message));

                    if (t.getUserName().equalsIgnoreCase("x")) {
                        break;
                    }

                    message = new String("비밀번호를 입력해주세요.");
                    t.setPassword(ScannerUtil.nextLine(scanner, message));
                }
            }
        }
    }

    private static void showMenu() {
        while (true) {
            System.out.println();
            System.out.println("===================================");
            System.out.println("            학생 & 교사 조회           ");
            System.out.println("===================================");
            System.out.println();
            String message = new String("1. 학생 목록 2. 교사 정보 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                

            } else if (userChoice == 2) {

            } else if (userChoice == 3) {
                System.out.println("인덱스 화면으로 돌아갑니다.");
                logIn = null;
                break;
            }
        }
    }
    
    // 회원가입 메소드 (학생 / 교사)
    public static void register() {
        System.out.println();
        System.out.println("회원 가입을 실행합니다.");
        String message = new String(" 학생과 교사 중 해당하는 항목을 선택해주세요. 1. 학생 2. 교사");
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
        if (userChoice == 1) {
            Student temp = new Student();

            temp.setId(studentId++);

            message = new String("사용하실 아이디를 입력해주세요.");
            temp.setUserName(ScannerUtil.nextLine(scanner, message));

            while (validateId(temp) || temp.getUserName().equalsIgnoreCase("X")) {
                System.out.println("해당 아이디는 사용하실 수 없습니다.");
                temp.setUserName(ScannerUtil.nextLine(scanner, message));
            }

            message = new String("사용하실 비밀번호를 입력해주세요.");
            temp.setPassword(ScannerUtil.nextLine(scanner, message));

            studentList.add(temp);

        } else {
            Teacher temp = new Teacher();

            temp.setId(teacherId++);

            message = new String("사용하실 아이디를 입력해주세요.");
            temp.setUserName(ScannerUtil.nextLine(scanner, message));

            while (validateId(temp) || temp.getUserName().equalsIgnoreCase("X")) {
                System.out.println("해당 아이디는 사용하실 수 없습니다.");
                temp.setUserName(ScannerUtil.nextLine(scanner, message));
            }

            message = new String("사용하실 비밀번호를 입력해주세요.");
            temp.setPassword(ScannerUtil.nextLine(scanner, message));

            teacherList.add(temp);
        }
    }

    // 회원 리스트 중에서 중복된 아이디가 있는지 체크하는
    // validateId() 메소드 (학생)
    private static boolean validateId(Student s) {
        for (int i = 0; i < studentList.size(); i++) {
            if (s.getUserName().equals(studentList.get(i).getUserName())) {
                return true;
            }
        }

        return false;
    }

    // 회원 리스트 중에서 중복된 아이디가 있는지 체크하는
    // validateId() 메소드 (교사)
    private static boolean validateId(Teacher t) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (t.getUserName().equals(teacherList.get(i).getUserName())) {
                return true;
            }
        }

        return false;
    }

    // id와 비밀번호가 모두 일치하는지 확인(학생)
    public static Student auth(Student s) {
        for (int i = 0; i < studentList.size(); i++) {
            if (s.logIn(studentList.get(i))) {
                return studentList.get(i);
            }
        }

        return null;
    }

    // id와 비밀번호가 모두 일치하는지 확인(교사)
    public static Teacher auth(Teacher t) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (t.logIn(teacherList.get(i))) {
                return teacherList.get(i);
            }
        }

        return null;
    }
}
