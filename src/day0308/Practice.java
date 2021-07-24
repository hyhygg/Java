package day0308;

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("별찍기 8번");
        System.out.println("출력할 줄 수");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        
        //윗부분
        for(int i = 1; i <= userNumber - 1; i++) {
            String stars = new String();
            
            for(int j = 1; j <= i; j++ ) {
                stars += "*";
            }
    
            System.out.println(stars);
        }
        
        //아랫부분
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
         
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
         
            System.out.println(stars);
        }
        
        scanner.close();
    }
}
