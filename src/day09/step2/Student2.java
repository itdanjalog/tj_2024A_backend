package day09.step2;

public class Student2 {
    //필드
    // 1.정적변수/클래스변수
    private static int serialNum = 1000;
    // 2.멤버변수
    public int studentID;
    public String studentName;


    // 생성자
    public Student2(){
        serialNum++;
        this.studentID = serialNum;
    }

    // 메소드
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        // static 함수 내에서는 멤버변수 사용불가능
        // studentName = "이지원";
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
