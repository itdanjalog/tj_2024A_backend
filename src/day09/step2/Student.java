package day09.step2;

public class Student {
    //필드
    // 1.정적변수/클래스변수
    public static int serialNum = 1000;
    // 2.멤버변수
    public String studentName;

    // 생성자

    // 메소드
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
