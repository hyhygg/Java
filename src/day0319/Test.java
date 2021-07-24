package day0319;

import java.util.Calendar;

//평가 클래스(평가 번호, 교사 번호, 학생 번호, 내용, 작성일)
public class Test {
    
    private int testId;
    
    private int TeacherId;
    
    private int StudentId;
    
    private String content;
    
    private Calendar writtenDate;

    // 메소드
    
    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int teacherId) {
        TeacherId = teacherId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }
    
    // id를 기준으로 한 equals() 메소드
    public boolean equals(Object o) {
        
        if(o instanceof Test) {
            Test t = (Test) o;
            if(testId == t.testId) {
                return true;
            }
        }
        
        return false;
    }
    
    

}
