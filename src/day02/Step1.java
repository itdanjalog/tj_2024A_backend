package day02; // 현재 클래스파일이 위치한 패키지명/폴더명

public class Step1 { // class s // 자바는 모든 코드를 클래스 안에 작성한다.

    // main + 엔터 : main 함수 // 실행할 코드는 모두 main함수(스레드 포함) 안에 작성한다.
    // 지역변수 정의 , 함수 호출
    public static void main(String[] args) { // main s

        // p.61 : 상수 : 변하지 않는 수  vs 변수 : 변하는 수
        // final 예약어/키워드
        final int MAX_NUM = 100;

        System.out.println("MAX_NUM = " + MAX_NUM);

        final int MIN_NUM;
        MIN_NUM = 0 ;
        System.out.println("MIN_NUM = " + MIN_NUM);

        // MAX_NUM =1000; // 오류 발생 : 상수이므로 수정이 불가능하다.

        // soutv + 엔터 : 가장 가까운 변수의 출력 함수 자동완성 해준다.
        // 코드 실행 : 1. ctrl+shift+f10   ,  2. main함수 왼쪽에 초록색 실행 화살표 클릭

        char c1 = 'a';  // 'a' 상수 풀에 이미 존재하는 'a'(리터럴)를 char c1 변수에 복사/대입
            // 'a' 값   a값이 살고 있는 주소
            // 'a'     부평구 20-12번지
            // c1 에는 부평구 20-12번지 저장된 상태
        char c2 = 'a';
            // c2 에는 부평구 20-12번지 저장된 상태

        // 리터럴 이란 ? 개발자 코드에 입력하는 모든 숫자,문자,논리값 들을 일컫는 말 , (문자열 제외 )

    } // main e
} // class e
