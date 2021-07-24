package day0315;

public class StudentEx01 {
    public static void main(String[] args) {
        Student s = null; // s는 객체
        System.out.println(s);
        s = new Student();

        s.showInfo();

        s.id = 1;
        s.name = new String("윤하연");
        s.korean = 86;
        s.english = 80;
        s.math = 74;

        s.showInfo();

        Student s2 = new Student(1, "김민수", 90, 80, 81);
        s2.id = 1;
        s2.name = new String("윤하연");
        s2.korean = 86;
        s2.english = 80;
        s2.math = 74;
        s2.showInfo();

        System.out.println("s1.equals(s2): " + s.equals(s2));
        String str = new String("안녕하세요");
        System.out.println("s.equals(str): " + s.equals(str));

    }
}
