package day02;

import java.util.Arrays;

public class Step4 { // class s
    public static void main(String[] args) { // main s

        // [ 콘솔 출력 ]
        System.out.print("JAVA");
            // System : 시스템 관련 기능 제공하는 클래스
                // out : 출력 관련 객체 제공
                    // print( 리터럴 또는 변수명 또는 연산식 ) : 출력 함수
                    // println()                            : 출력 함수 + 줄바꿈 포함
                        // 인텔리제이 기준 : sout + 엔터
                    // printf( "형식문자" , 리터럴 또는 변수명 )   : 출력 함수 + 형식문자 지원
                        // souf + 엔터
                        /*
                            - 형식문자 : printf() 함수에서 사용되는 형식문자
                            %s  : 문자열   %c  : 문자
                            %d  : 정수    %f  : 실수
                                [ 자릿수 맞추기 ]
                                %자릿수d   : 자릿수만큼 자릿수를 차지 , 만일 비어있으면 공백처리 , 오른쪽정렬
                                %-자릿수d  : 자릿수만큼 자릿수를 차지 , 만일 비어있으면 공백처리 , 왼쪽정렬
                                %0잘릿수d  : 자릿수만큼 자릿수를 차지 , 만일 비어있으면 '0'처리 , 오른쪽정렬
                                [ 소수점 ]
                                %자릿수.소수점자릿수f    : 자릿수(소수점포함)만큼 자릿수를 차지 , 소수점자릿수까지 출력

                            - 제어문자 : 기능이 포함된 문자
                            \ : 엔터 위에 원화기호
                            \n : 줄바꿈        \t : 들여쓰기
                            \r : 개행(커서를 앞으로)
                            \\ : '\' 백슬래시 출력    ,   \" : " 큰따옴표 출력  , \' : ' 작은따옴표 출력
                            -- 엔터 : \n\r 조합 
                        */
        System.out.println("JAVA2");
        System.out.println("JAVA3");

        System.out.printf( "%s" , "JAVA4" );
        System.out.printf( "%d" , 123 );
        System.out.printf( "%f" , 3.14 );

        System.out.print(" \n 줄바꿈 \t 들여쓰기 \"큰따옴표출력 \\백슬래시출력 \'작은따옴표출력 \n");

        int price = 1500;
        String name = "콜라";

        System.out.println("상품의 가격 : "+price+"원 입니다.");
        System.out.printf( "상품의 가격 : %d원 입니다. \n" , price );

        System.out.printf( "%s의 가격 : %d원 입니다. \n" , name , price );
        System.out.printf( "%s의 가격 : %6d원 입니다. \n" , name , price );
        System.out.printf( "%s의 가격 : %-6d원 입니다. \n" , name , price );
        System.out.printf( "%s의 가격 : %06d원 입니다. \n" , name , price );
        System.out.printf( "%s의 가격 : %3.1f원 입니다. \n" , name , 3.14 );

        // 인텔리제이 출력메소드 자동완성
        // 1. sout
        System.out.println();
        // 2. souf
        System.out.printf("");
        // 3. soutm : 현재 함수명을 문자열로 출력
        System.out.println("Step4.main");
        // 4. soutp : 현재 함수의 매개변수 값을 출력
        System.out.println("args = " + Arrays.toString(args));
        // 5. soutv : 커서에서 가장 가까운 변수/상수의 값 출력
        System.out.println("name = " + name);

        // 실습1 : [백준문제] 콘솔에 개 모양 출력
        System.out.println("|\\_/| \n|q p|   /} \n( 0 )\"\"\"\\ \n|\"^\"`    | \n||_/=\\\\__|");




        // [ 콘솔 입력 ]

    } // main e
} // class e

