package Practice;
//ArrayList를 활용한 로또게임

//인티저(Integer) 사용

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import util.ScannerUtil;

public class LottoGamePractice0317 {
    private static final int NUMBER_MAX = 45;
    private static final int NUMBER_MIN = 1;
    private static final int NUMBER_SIZE = 6;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> computerList = new ArrayList();
        ArrayList<ArrayList<Integer>> userList = new ArrayList();

    }

    private static void insertRandomNumber(ArrayList<Integer> list) {
        Random random = new Random();
        while (list.size() < NUMBER_SIZE) {
            Integer randomNumber = random.nextInt(NUMBER_MAX) + 1;
            if (!list.contains(randomNumber)) {
                list.add(randomNumber);
            }
        }
    }

    private static void insertUserNumber(ArrayList<Integer> list) {
        while (list.size() < NUMBER_SIZE) {
            int currentPosition = list.size() + 1;
            String message = new String(currentPosition + "번 숫자를 입력해주세요");
            int userNumber = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);
            if (!list.contains(userNumber)) {
                list.add(userNumber);
            } else {
                System.out.println("중복된 숫자입니다.");
            }
        }
    }
    
    private static void decideUserGame(ArrayList<ArrayList<Integer>> list) {
        
        
        
    }

}
