package day07.step2;

// public : (다른 클래스로부터, 외부)     공개용
    // public class 클래스명(){}
// private : (다른 클래스로부터, 외부)    비공개용
    // public/private/(default) 멤버변수
    // public/private/(default) 반환타입 함수명(){}
// default(생략)                      같은 패키지/폴더 내 클래스끼리 공개용

// getter and setter    ,   get : 호출  , set : 저장
    // - private 선언된 멤버변수/필드가 외부로부터 접근하기 위해 필요한 함수
public class Student {
    // 1. 멤버변수/필드
    int studentID;
    private String studentName;
    int grade;
    String address;
    // 2. 생성자
        // x
    // 3. 메소드
        // getter and setter
        // 클래스 안에서 오른쪽 클릭 -> 생성

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
