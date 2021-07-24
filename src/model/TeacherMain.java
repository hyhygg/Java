package model;

public class TeacherMain {
    public static void main(String[] args) {
        TeacherDTO t = new TeacherDTO();
        t.setId(1);
        t.setName("윤하연");
        t.setUsername("t1");
        t.setPassword("1");
        t.setGroup(1);
        
        // System.out.println() 메소드의 경우
        // 파라미터로 Object o, 즉 어떤 클래스의 객체가 들어오던간에
        // 그 객체의 toString() 메소드 결과값을 화면에 출력하게 된다.
        System.out.println(t);
    }
}
