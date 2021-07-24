package day0319;


//교사 클래스(교사 번호, 이름, 소속 반)
public class Teacher {
    
    private int id;
    
    private String userName;

    private String password;
    
    private String name;
    
    private int ownClass;
    
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

    // id를 기준으로 한 equals() 메소드
    public boolean equals(Object o) {
        
        if(o instanceof Teacher) {
            Teacher t = (Teacher) o;
            if(id == t.id) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public boolean logIn(Teacher t) {
        if(userName.equals(t.userName) && password.equals(t.password)) {
            return true;
        }
        
        return false;
    } 

}
