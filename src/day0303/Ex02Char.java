package day0303;
// 기본형 데이터타입 03

// 문자형 데이터타입
// 문자형 데이터타입은 char 이라는 데이터타입인데
// "차" 라고 읽지 않고 "캐릭터" 라고 읽어야 한다.
// 왜냐하면 char은 character의 앞 4글자를 딴 것이기 때문

// char는 ASCII 테이블이라는 문자표를 기반으로 만들어져서
// 숫자값과 그에 대응하는 문자가 정의 되어있다.
// 즉 우리가 어떠한 문자를 할당하면 그 문자에 대응되는 숫자값이
// 이진법의 형태로 변수에 저장되는 형태가 된다.

// 하지만 캐릭터란 데이터타입 자체는 잘 안쓰이게 된다.
// 왜냐하면 char는 한번에 1개의 문자만 다룰 수 있기 때문이다!!!

// char 값은 우리가 '' 안에 한 글자를 넣어서 만들어주게 된다.
public class Ex02Char {
   public static void main(String[] args) {
       // char 변수 myChar를 선언하고 알파벳 B 를 할당해보자
       char myChar = 'B';
       
       // myChar의 현재 값을 화면에 출력해보자
       System.out.println(myChar);
       
       // char는 실제론 해당 공간에 2진법 값을 저장하기 때문에 다음과 같은 코드도 가능해진다.
       
       // myChar에 99를 할당해보자 **ASCII테이블 표 참고
       myChar = 99;
       
       // myChardd의 현재 값을 화면에 출력해보자
       System.out.println(myChar);
       
       // 하지만 위에서 설명했듯이
       // char 변수는 한번에 1개의 값만 저장 가능하기 때문에 쓰임새가 매우 적다.
       // 그렇다면 여러개의 글자를 할당하고 관리하기 위해선 무엇이 필요할까..?
       // 바로 String 데이터타입이 필요하다!!!
       
       
   }
}