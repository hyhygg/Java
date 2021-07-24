package viewer;

import java.util.Scanner;

import controller.TeacherController;
import model.TeacherDTO;
import util.ScannerUtil;

public class TeacherViewer {

    TeacherController controller;
    Scanner scanner;

    // 1. 생성자-필드 초기화
    public TeacherViewer() {
        controller = new TeacherController();
        scanner = new Scanner(System.in);        
    }

    // 2. 로그인
    public int logIn() {
        // 출력할 메세지를 담는 String 객체 message
        String message;

        // 사용자가 입력할 정보를 담을 TeancherDTO 객체 t
        TeacherDTO t = new TeacherDTO();

        // 아이디 입력
        message = new String("아이디를 입력해주세요.");
        t.setUsername(ScannerUtil.nextLine(scanner, message));

        // 비밀번호 입력
        message = new String("비밀번호를 입력해주세요.");
        t.setPassword(ScannerUtil.nextLine(scanner, message));

        // 결과값을 TeacherDTO 객체 result에 넣는다.
        TeacherDTO result = controller.auth(t);

        // result가 널인지 확인하여
        // 널일 경우 다시 묻는다.
        while (result == null) {
            System.out.println("쟐못 입력하셨습니다.");
            message = new String("종료 하시겠습니끼? y/n");
            String agree = ScannerUtil.nextLine(scanner, message);
            if (agree.equalsIgnoreCase("y")) {
                return -1;
            }

            message = new String("아이디를 입력해주세요.");
            t.setUsername(ScannerUtil.nextLine(scanner, message));

            message = new String("비밀번호를 입력해주세요.");
            t.setPassword(ScannerUtil.nextLine(scanner, message));

            result = controller.auth(t);
        }

        // result가 널이 아닐 경우
        // result.getGroup()를 return 한다.

        return result.getGroup();
    }

    // 3. 교사용 회원 가입
    public void register() {
        // 출력할 내용을 담는 String 객체 message;
        String message;

        // 사용자가 입력한 정보를 담을 TeacherDTO 객체 t
        TeacherDTO t = new TeacherDTO();

        // 아이디 입력
        message = new String("사용하실 아이디를 입력해주세요.");
        t.setUsername(ScannerUtil.nextLine(scanner, message));

        // 아이디가 유효한 아이디인지 체크
        while (controller.validateUsername(t)) {
            System.out.println("중복된 아이디 입니다.");
            t.setUsername(ScannerUtil.nextLine(scanner, message));
        }

        // 비밀번호 입력
        message = new String("사용하실 비밀번호를 입력해주세요.");
        t.setPassword(ScannerUtil.nextLine(scanner, message));

        // 이름 입력
        message = new String("이름을 입력해주세요.");
        t.setName(ScannerUtil.nextLine(scanner, message));

        // 반 입력
        message = new String("담당 반을 입력해주세요.");
        t.setGroup(ScannerUtil.nextInt(scanner, message));

        // 유효한 반인지 체크
        while (controller.validateGroup(t)) {
            System.out.println("이미 담당 교사가 존재하는 반입니다.");
            t.setGroup(ScannerUtil.nextInt(scanner, message));

        }    
            // 컨트롤러의 add 메소드 호출
            controller.add(t);        
    }
    
    // 파라미터와 group의 값이 같은 TeacherDTO 객체를 리턴해주는 메소드
    public TeacherDTO selectOneByGroup(int group) {
        return controller.selectOneByGroup(group);
    }
}