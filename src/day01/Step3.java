package day01;

public class Step3 { // class s
    public static void main(String[] args) { // main s

        // 1. 정수 자료형
        // [1] byte : -128 ~ +127
        byte b1 = -128;     System.out.println("b1 : " + b1 );
        byte b2 = 127;      System.out.println("b2 = " + b2); // soutv + 엔터
        // byte b3 = 200;      // 저장가능한 허용범위 벗어남

        // [2] short : -32,768 ~ 32,767 , 대략 +-3만정도
        short s1 = 32000;   System.out.println("s1 = " + s1);
        short s2 = -32000;  System.out.println("s2 = " + s2);
        // short s3 = 40000; // 저장 가능한 허용범위 벗어남

        // [3] int : 대략 +-21억정도 , 자바는 모든 정수 값을 기본으로 int
        int i1 = 2100000000; System.out.println("i1 = " + i1);
        // int i2 = 3000000000; // 저장 가능한 허용범위 벗어남

        // [4] long : 대략 +-21억이상  , 21억이상의 자료는 뒤에 L 붙입니다.
        long l1 = 3000000000L;  System.out.println("l1 = " + l1);
        long l2 = 1000;         System.out.println("l2 = " + l2);

        // 2. 문자 자료형
        // [5] char : 문자 1개만 저장 가능 , ''작은따옴표 , 65536개 문자 표현가능.
        char c1 = 'A';          System.out.println("c1 = " + c1);    // A
        int i3 = 'A';           System.out.println("i3 = " + i3);   // 65
        char c2 = '가';          System.out.println("c2 = " + c2);   // 가
        int i4 = '가';           System.out.println("i4 = " + i4);   // 44032
        // char c3 = '안녕';  // char 문자열 불가능.

        // [6] String 클래스 , 기본자료형[8]이 아닌 클래스를 사용하므로 첫글자 대문자 String
        String str1 = "안녕하세요";  System.out.println("str1 = " + str1);

        // 3. 논리 자료형
        // [7] boolean : true 혹은 false
        boolean bool1 = true;    System.out.println("bool1 = " + bool1);
        boolean bool2 = false;   System.out.println("bool2 = " + bool2);
        // boolean bool3 = 't'; // 허용범위 벗어남

        // 4. 실수 자료형
        // [8] double : [ 소수점 17자리 표현 ] , 자바는 모든 실수 값을 기본으로 int
        double d1 = 0.123456789123456789;    System.out.println("d1 = " + d1);

        // [9] float : [ 소수점 8자리 표현 ] , 뒤에 F 붙입니다.
        float f1 = 0.123456789123456789F;   System.out.println("f1 = " + f1);

    } // main e
} // class e
