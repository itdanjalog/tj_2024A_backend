package day10.step1;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        //* 입력객체
        Scanner scan = new Scanner(System.in);
        // 1. 배열구성
        Product[] productArray = new Product[3];
        // 2. 무한루프
        while(true){ //
            System.out.print(" 1.등록 2.출력 3.수정 4.삭제 5.종료 선택] "); // 무한출력
            int ch = scan.nextInt(); // 무한입력 , 입력받은 데이터로 기능을 구분짓기 위해
            // - 입력값에 따라 논리/경우의수 판단
            if( ch == 1 ){}
            else if( ch == 2 ){}
            else if( ch == 3 ){}
            else if( ch == 4 ){}
            else if( ch == 5 ){}
        } // while end
    } // main end
} // class end
/*
    [ 메모리 설계 ]
    1. 객체의 추상적인 구성( 특성 , 행위) 하기
    2. 구성한 개념을 클래스로 구현 하기
    3. 해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정/만들기
        - 배열 선언방법 : 타입[] 배열변수명 = new 타입[길이]
    [ 화면 구현 설계 ]
    1. 콘솔에 출력할 내용들을 구성

 */
