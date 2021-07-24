package Practice;

import java.util.Scanner;

import day0317.Board;
import util.ScannerUtil;
import java.util.ArrayList;

public class BoardPractice01 {

    private static ArrayList<Board> boardList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int currentId = 1;

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        while (true) {
            System.out.println();
            System.out.println("=======================");
            System.out.println("     게시판 관리 프로그램    ");
            System.out.println("=======================");
            System.out.println();
            String message = new String("1. 글 쓰기 2. 글 목록 보기 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {

            } else if (userChoice == 2) {

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 글 쓰기
    private static void writeBoard() {
        Board b = new Board();
        
        String message;
        
        message = new String("글의 제목을 입력해주세요");
        b.setTitle(ScannerUtil.nextLine(scanner, message));
        
        while (boardList.contains(b)) {
            System.out.println("중복된 글 제목은 사용하실 수 없습니다.");
            b.setTitle(ScannerUtil.nextLine(scanner, message));
        }
        
        b.setId(currentId++);
        
        message =  new String("글의 작성자를 입력해주세요");
        b.setWriter(ScannerUtil.nextLine(scanner, message));
        
        message = new String("글의 내용을 입력해주세요");
        b.setContent(ScannerUtil.nextLine(scanner, message));
        
        boardList.add(b);
   
    }
    
    // 글 목록보기
    private static void selectAll() {
        while (true) {
            if (boardList.size() == 0) {
                System.out.println();
                System.out.println("아직 등록된 글이 없습니다.");
                System.out.println();
                break;
            }
          
            System.out.println();
            for (int i = 0; i < boardList.size(); i++) {
                System.out.printf("%3d. %s \n", i+1, boardList.get(i).getTitle());
            }
            System.out.println();
            
            String message = new String("개별 보기할 글의 번호를 선택해주세요. 만약 메뉴로 가려면 0을 입력헤주세요.");
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, boardList.size()) -1;
            
            if (userChoice == -1) {
                break;
            }
            
            
            
        }       
    }
}
