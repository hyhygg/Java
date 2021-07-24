package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EvaluationDTO {
    private int id;
    private int teacherId;
    private int studentId;
    private String content;
    private Calendar writtenDate;
    
    private final String DATE_FORMAT = new String("yy년 MM월 dd일");
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
    
    public boolean equals(Object o) {
        if (o instanceof EvaluationDTO) {
            EvaluationDTO e = (EvaluationDTO) o;
            if(id == e.id) {
                return true;
            }
        }
        return false;
    }
    
    public void print(TeacherDTO t, StudentDTO s) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        System.out.printf("%s: %s - %s \n", t.getName(), content, s.getName(), sdf.format(writtenDate.getTime()));
        
    }

    
}
