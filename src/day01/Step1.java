// 한줄주석
/*
    여러줄 주석
*/

package day01;  // 현재 클래스파일이 위치한 폴더/패키지명 // 클래스 생성시 자동으로 할당

public class Step1 { // 클래스 선언 // class start
    // class : 자바는 무조건 클래스 단위 , 모든 코드는 클래스 안에서 작성한다.
    // 클래스명 : Step1
        // 숫자시작 불가능 , 공백 불가능 , 첫글자 대문자!!!!!!
    // { } 클래스 블록/지역/정의하는곳

    // main 입력 + 엔터 -> main함수 자동 작성
    // - main 함수란 : 코드를 읽어주는 스레드(기능) 포함된 미리 만들어진 함수
    // - 실행할 코드는 무조건 main함수 안에서 작성한다.
    public static void main(String[] args) { // main start

        // sout 입력 + 엔터 -> System.out.println()      vs   JS : console.log()
        System.out.println("Hello JAVA");
        // 1. { } 안에 코드 입력할때마다 TAB 이용해서 들여쓰기
        // 2. System.out.println
            // System 클래스 : 시스템 관련 기능 제공하는 클래스
            // out : 출력기능
            // println : 콘솔에 줄바꿈 포함해서 출력하는 함수
        // 3. " " 문자열 처리                             vs   JS : "" , '' , ``
        // 4. ; 세미콜론 : 코드문장 마침( 컴퓨터에게 끝 알림 )

        // - 컴파일 / 번역 /코드 실행
            // 1. ctrl+ shift + f10
            // 2. main 함수 왼쪽에 초록색 화살표 클릭

        // [ p.37 문제 ]
        // 1. 컴파일
        // 2. 객체지향 프로그래밍
        // 3. 자바 가상 머신( JVM )
        // 4. JDK
        // 5. JRE
        // 6.
        System.out.println("김현수");

    } // main end
} // class end

