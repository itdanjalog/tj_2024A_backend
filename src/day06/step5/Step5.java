package day06.step5;

import java.util.Scanner;

public class Step5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int speed = 0; // 속도변수 선언하고 0 으로 초기화
//        String color = "빨강";
//        String carNumber = "250가4471";
        // 변수 3개 대신에 'Car' 클래스/설계도 를 정의하기
        // 정의한 'Car' 클래스로 객체 생성
        Car myCar = new Car();              // 객체 생성
        myCar.speed = 0;                        // 객채내 멤버변수/필드 에 값 대입
        myCar.color = "빨강";                     // 객채내 멤버변수/필드 에 값 대입
        myCar.carNumber = "250가4471";           // 객채내 멤버변수/필드 에 값 대입

        // 2. 무한루프 : while(true){} vs for( ;; ){}
        while(true){ // w s
            // 출력함수
            System.out.println("----------------------");
            System.out.print(">>> 1.증속 2.감속 3.중지 : ");
            // 입력함수 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 변수에 저장
            int ch = scanner.nextInt();
            // 조건문
            if( ch == 1 ){
                myCar.speed++; // 속도 1증가
                System.out.println(">증속(속도증가) 현재속도 : " + myCar.speed );
            }
            else if( ch == 2 ){
                myCar.speed--; // 속도 1감소
                System.out.println(">감속(속도감소) 현재속도 : " + myCar.speed );
            }
            else if( ch == 3 ){
                System.out.println(">중지");
                myCar.speed = 0; // 속도 0으로 변경
                break;      // 가장 가까운 반복문,switch 문{ }을 탈출/끝내기
            }
            else{  System.out.println(">알수없는 입력번호 입니다.");   }
        } // w end
    }
}
