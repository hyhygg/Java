package day0319;


//학생 클래스(학생 번호, 이름, 소속 반, 점수 입력 여부, 국어 점수, 영어 점수, 수학 점수)
public class Student {

    private int id;

    private String userName;

    private String password;

    private String name;

    private int ownClass;

    private boolean score;

    private int korean;

    private int english;

    private int math;

    // 메소드
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getOwnClass() {
        return ownClass;
    }

    public void setOwnClass(int ownClass) {
        this.ownClass = ownClass;
    }

    public boolean isScore() {
        return score;
    }

    public void setScore(boolean score) {
        this.score = score;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // equals
    public boolean equals(Object o) {
        if (o instanceof Student) {

            Student s = (Student) o;
            if (id == s.id) {
                return true;
            }
        }
        return false;
    }
    
    // 사용자로부터 넘겨받은 userName과 password가 일치하면 true가 리턴되는
    // logIn 메소드
    public boolean logIn(Student s) {
        if(userName.equals(s.userName) && password.equals(s.password)) {
            return true;
        }
        
        return false;
    }

}
