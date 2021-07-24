package day0323;

public class BMW implements Car {
    
    // 필드
    private String number;
    private String model;
    private int price;
    private String color;
    
    // getter/setter
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    // 메소드
    public void turnOn() {
        System.out.println("운행을 시작합니다.");
    }
    public void speedUp() {
        System.out.println("운전 속도가 올라갑니다.");
    }
    public void speedDown() {
        System.out.println("운전 속도가 내려갑니다.");
    }
    public void goLeft() {
        System.out.println("좌회전입니다.");
    }
    public void goRight() {
        System.out.println("우회전입니다.");
    }
    public void park() {
        System.out.println("주차 모드입니다.");
    }
    public void turnOff() {
        System.out.println("운행을 마칩니다.");
    }
}