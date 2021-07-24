package day0308;

// 별찍기 2번
import java.util.Scanner;

public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 2번");
        
        System.out.println("출력할 줄 수를 입력하세요.");
        int userNumber = scanner.nextInt();
      
        
        for (int i = userNumber; i >= 1; i--) {
            String stars = new String();

            for (int j = 1; j <= i; j++) {

                stars += "*";
            }

            System.out.println(stars);
        }

        scanner.close();
    }
}
