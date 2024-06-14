package day07.step2;

public class Step2 {
    public static void main(String[] args) {

        Student studentLee = new Student();
        //studentLee.studentName = "이상원";
        studentLee.setStudentName( "이상원" );

        studentLee.grade = 3;

        //System.out.println( studentLee.studentName );
        System.out.println( studentLee.getStudentName() );

    }
}
