package day0323;

import java.util.Scanner;

import util.ScannerUtil;

// Car 인터페이스를 상속받는
// 페라리, BMW, 현대 클래스를 만들고
// 사용자가 원하는 차량을 선택하면
// 사용자가 그 차량의 메소드들을 다양하게 테스트 해볼 수 있는 프로그램을 작성하시오.
// 단, 페라리, BMW, 현대 클래스의 경우
// 메소드마다 특색있는 메시지가 출력되어야 합니다.

// Car 인터페이스에 있어야 할 메소드들:
// 1. turnOn()
// 2. speedUp()
// 3. speedDown()
// 4. goLeft()
// 5. goRight()
// 6. park()
// 7. turnOff()

// 각각의 클래스에 필요한 필드
// 1. 차량 번호("00가 0000")
// 2. 모델명("소나타")
// 3. 가격(3000) -> 3000만원을 의미하게 됨
// 4. 색상("검정")

public class Ex02CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarImpl carImpl = new CarImpl();
        
        Car c = new Ferrari();
        carImpl.showLife(c);
        
        c = new BMW();
        carImpl.showLife(c);
        
        c = new Hyundai();
        carImpl.showLife(c);
        
        String message = new String("1.Ferrari 2.BMW 3.Hyundai");
        int userChoice = ScannerUtil.nextInt(scanner, message);
        if(userChoice == 1) {
            c = new Ferrari();
        } else if (userChoice == 2) {
            c = new BMW();            
        } else if (userChoice == 3) {
            c = new Hyundai();
        }
        
        carImpl.showLife(c);
    }
    
    private void CarNumber() {
        
    }
}
