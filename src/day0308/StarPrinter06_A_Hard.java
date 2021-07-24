package day0308;

// 별찍기 06
import java.util.Scanner;
public class StarPrinter06_A_Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("별찍기 6번");
        System.out.println("출력할 줄 수");
        System.out.println("> ");
        int userNumber = scanner.nextInt();
        
        
        for (int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            // 공백            
            for (int j = 1 ; j <= i- 1; j++) {
                stars += " ";
            }
            
            // 별            
            for (int j = 1; j <= 2 * userNumber -2 * i + 1; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        
        scanner.close();
    }
}
