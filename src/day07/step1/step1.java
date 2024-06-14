package day07.step1;

import java.util.Scanner;

// [1.실행 클래스 ]
public class step1 {
    public static void main(String[] args) {

        // [1]객체 만들기
            // 1. 타입/클래스명(설계도선택) 작성한다.
        // Person
            // 2. 객체/인스턴스을 담을 임의 의 변수명 작성한다
        // Person personLee ;
            // 3. 객체/인스턴스을 생성해서 변수에 담는다.
            // new 생성자( );
        Person personLee = new Person();
        personLee.name = "이강인";

        Person personKim = new Person( "김현수");

        Person personPark = new Person("박지성" , 175 , 75);


        // Scanner scanner = new Scanner( );

    }//me
}// ce
