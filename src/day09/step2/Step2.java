package day09.step2;



public class Step2 {

    public static void main(String[] args) {
        // 1. 학생
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println( studentLee );
        System.out.println( studentLee.serialNum ); // 1000
        studentLee.serialNum++; // 1증가

        // 2. 학생
        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println( studentSon );
        System.out.println( studentLee.serialNum ); // 1001
        System.out.println( studentSon.serialNum ); // 1001
        Student studentKim ;

        // ================================= //
        Student1 studentLee1 = new Student1();
        studentLee1.setStudentName("이지원");
        System.out.println( studentLee1.serialNum );    // 1001
        System.out.println( studentLee1.studentName + " 학번 : "+studentLee1.studentID);

        Student1 studentSon1 = new Student1();
        studentSon1.setStudentName("손수경");
        System.out.println( studentSon1.serialNum );    // 1002
        System.out.println( studentSon1.studentName + " 학번 : "+studentSon1.studentID);

        // ================================= //
        System.out.println( Student1.serialNum );

        // ================================= //
        System.out.println( Student2.getSerialNum() );
    }

}
