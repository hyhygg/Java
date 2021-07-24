package day0308;

// 별찍기 06
import java.util.Scanner;
public class StarPrinter06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력하세요.");
        int userNumber = scanner.nextInt();
        
        for (int i = userNumber; i >= 1; i--) {
            
            for (int j = 1 ; j < userNumber-i+1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
        scanner.close();
    }
}
