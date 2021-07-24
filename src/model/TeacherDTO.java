package model;

public class TeacherDTO {
    
    // 필드
    private int id;
    private String username;
    private String password;
    private String name;
    private int group;
    
    
    // getters/setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    
    
    // equals()
    public boolean equals(Object o) {
        if(o instanceof TeacherDTO) {
            TeacherDTO t = (TeacherDTO)o;
            if(id == t.id) {
                return true;
            }
        }
        
        return false;
    }
    
    // 우리가 객체의 내용을 출력할 때에는
    // 물론 getter를 호출하여 원하는 내용으로 만들어주거나
    // 아니면 클래스에 출력을 담당하는 메소드를 따로 만들어주어도 되지만
    // java.lang.Object의 toString()을 오버라이드 하면 우리가 원하는 내용으로 출력할 수 있다.
    // java.lang.Object의 toString()은 "클래스위치@메모리주소값"이 String 으로 리턴이 되는 형태로 짜여져 있기 때문이다.

    // toString() 오버라이드
    public String toString() {
        
        return "교사번호: "+id+"번, " 
                +"교사이름: " +name+", "
                +"교사아이디: "+username+", "
                +"담당반: "+group+"반";
    }
}
