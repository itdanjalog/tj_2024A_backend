package day06.step4;

import java.util.Scanner;

public class step4 { // class c

    public static void main(String[] args) {
        // 클래스 사용처 : 1. 객체설계도 2.main함수가지고있는클래스
        // 1. 입력객체  : 키보드로부터 입력받기 위한 기능을 제공하느 객체
        Scanner scanner = new Scanner(System.in);

        // 차 1대당 변수3개씩 사용한다는 가정에 차량이 3대이면 변수는 9개,차량이 100대이면 변수 300개
        int speed = 0; // 속도변수 선언하고 0 으로 초기화
        String color = "빨강";
        String carNumber = "250가4471";

//        int speed2 = 0; // 속도변수 선언하고 0 으로 초기화
//        String color2 = "노랑";
//        String carNumber2 = "250나7517";
//
//        int speed3 = 0; // 속도변수 선언하고 0 으로 초기화
//        String color3 = "빨강";
//        String carNumber3 = "187오1234";

        // 2. 무한루프 : while(true){} vs for( ;; ){}
        while(true){ // w s
            // 출력함수
            System.out.println("----------------------");
            System.out.print(">>> 1.증속 2.감속 3.중지 : ");
            // 입력함수 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 변수에 저장
            int ch = scanner.nextInt();
            // 조건문
            if( ch == 1 ){
                speed++; // 속도 1증가
                System.out.println(">증속(속도증가) 현재속도 : " + speed );
            }
            else if( ch == 2 ){
                speed--; // 속도 1감소
                System.out.println(">감속(속도감소) 현재속도 : " + speed );
            }
            else if( ch == 3 ){
                System.out.println(">중지");
                speed = 0; // 속도 0으로 변경
                break;      // 가장 가까운 반복문,switch 문{ }을 탈출/끝내기
            }
            else{  System.out.println(">알수없는 입력번호 입니다.");   }
        } // w end
    }
} // class e





