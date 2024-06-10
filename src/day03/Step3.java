package day03;

import java.util.Scanner;

public class Step3 { // class c

    public static void main(String[] args) {

        // 모든 문제의 공통인 입력객체는 한번만 생성
        Scanner scanner = new Scanner(System.in);

        //문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
            // 배수찾기 : 값 % 수  == 0 , 나머지가 0 이면 값은 그 수의 배수
//        System.out.print(">> 정수 입력 : ");
//        int int1 = scanner.nextInt();
//        System.out.println( int1 % 7 == 0 ? "O" : "X");

        //문제2 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 홀수 이면 'O' 아니면 'X' 출력 하시오.
            // 홀수 찾기 : 값 % 2 == 1 , 나머지가 1이면 홀수 , 나머지가 0 이면 짝수
//        System.out.print(">> 정수 입력 : ");
//        int 정수 = scanner.nextInt();
//        System.out.println(정수 % 2 == 1 ? "O" : "X");

        //문제3 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
            // && : 이면서 면서 이고 그리고 모두
//        System.out.print(">> 정수 입력 : ");
//        int num3 = scanner.nextInt();
//        System.out.println( (num3 % 7 == 0 && num3 % 2 == 0) ? "O" : "X");

        // 문제4 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print(">> 정수 입력 : ");
//        int num = scanner.nextInt();
//        System.out.println( ( num % 11==0 || num % 2==0 )  ? "o":"x");

        // 문제5 : 두개의 정수형으로 정수를 입력받아 입력받은 값이 더 큰수 출력 하시오.
//        System.out.print(">> 정수 1: "); int i1 = scanner.nextInt();
//        System.out.print(">> 정수 2: "); int i2 = scanner.nextInt();
//        System.out.println(
//                i1 == i2 ? ">> 두 정수가 서로 같음" :                   // 조건1 ? 참 :
//                        i2 > i1 ? ">> 정수 2가 더 큼 : " + i2 :          // 조건2 ? 참 :
//                                    ">> 정수 1이 더 큼 : " + i1);            // 거짓

        //문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
        //        계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//        System.out.print("반지름: "); double 반지름 = scanner.nextDouble();
//        double 넓이= 반지름 * 반지름 * 3.14 ;
//        System.out.printf("원 넓이: %.2f\n",넓이);

        // 문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
            // 예) 54.5   84.3 실수 2개입력시 결과는   64.2%
            // printf() 에서 % 출력시 %%
//        System.out.print("실수1을 입력하세요.");   double value1 = scanner.nextDouble(); // 실수1 저장
//        System.out.print("실수2를 입력하세요.");   double value2 = scanner.nextDouble(); // 실수2 저장
//        double result = value1 / value2 * 100; // 결과 저장
//        System.out.printf("%.1f%% \n", result); // 소수점 첫째 자리까지 출력

        //문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
        //  계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
//        System.out.print("윗변 : " ); float 윗변 = scanner.nextFloat();
//        System.out.print("밑변 : " ); float 밑변 = scanner.nextFloat();
//        System.out.print("높이 : " ); float 높이 = scanner.nextFloat();
//        float 넓이 = (윗변 + 밑변) * 높이 / 2.0f;
//        System.out.printf("넓이: %.1f\n",넓이);

        //문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
        //        계산식) 표준체중 계산식 = > (키 - 100) * 0.9
//        System.out.print(" >> 키 입력 : ");    int height = scanner.nextInt();
//        int weight = (height - 100) * 9 / 10 ;
//        System.out.println(" >> 표준 체중 : " + weight + "kg");

        // 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
            // 계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//        System.out.print("몸무게 : ");     double 몸무게 = scanner.nextDouble();
//        System.out.print("키 : ");           double 키 = scanner.nextDouble();
//        double BMI = 몸무게 / ((키 / 100) * (키 /100));
//        System.out.printf("%.2f", BMI);

        //문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
        //        계산식) 1 inch -> 2.54cm
//        System.out.print("cm로 변환할 inch를 입력 : ");    double inch = scanner.nextDouble();
//        double cm = inch * 2.54;
//        System.out.printf("%.2f", cm);

        //문제12: [ 초등학교 3학년 총점수 ] 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 총점수 출력하시오
        //  계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
//        System.out.print("중간고사 :"); int 중간고사= scanner.nextInt(); // 30% 반영
//        System.out.print("기말고사 :"); int 기말고사= scanner.nextInt(); // 30% 반영
//        System.out.print("수행평가 :"); int 수행평가= scanner.nextInt(); // 40% 반영
//        double  중간점수출력 = 중간고사*0.3;        // 100 -> 30
//        double 기말점수출력 = 기말고사*0.3;         // 100 -> 30
//        double 수행점수출력 = 수행평가*0.4;         // 100 -> 40
//        double 총점= 중간점수출력+기말점수출력+수행점수출력;    // 100
//        System.out.printf("총점 = %.2f\n",  총점);

        //문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
        int x = 10;
        int y = x-- + 5 + --x;
        System.out.printf(" x의 값 : %d , y의값 :  %d \n", x, y);
        // x = 8 , y = 23
        // 1. x-- + 5   -> x = 10 + 5 => 15     [ x는 + 연산후 1차감 ]
        // 2. 15 + --x  -> x = 8  + 15 => 23    [ x는 + 연산전 1차감 ]

        // 문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
            // 삼항연산자의 중첩 ,
//        System.out.print("나이: "); short 나이=scanner.nextShort();
//        System.out.println( 나이>=40?"중년":나이>=20?"성인":나이>=10?"학생":"");
        // System.out.println( 나이>=10?"학생":나이>=20?"성인":나이>=40?"중년":""); // 코드오류는 아니지만 조건상의 문제발생

        // 문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
//        System.out.println("국어 점수를 입력하세요.");            int kScore = scanner.nextInt();
//        System.out.println("영어 점수를 입력하세요.");            int eScore = scanner.nextInt();
//        System.out.println("수학 점수를 입력하세요.");            int mScore = scanner.nextInt();
//        double totScore = (double) (kScore + eScore + mScore);  System.out.printf("총점: %.0f\n", totScore); // 총점(소수점 0자리)
//        double avrScore = totScore / 3;                         System.out.printf("평균: %.2f\n", avrScore); // 평균(소수점 2자리)
//
        // 문제16 : 3개의 정수형으로 입력받아 가장 큰수 출력하시오.
//        System.out.print("1번째 정수 : " ); int 정수1 = scanner.nextInt();
//        System.out.print("2번째 정수 : " ); int 정수2 = scanner.nextInt();
//        System.out.print("3번째 정수 : " ); int 정수3 = scanner.nextInt();
//
//        int 큰정수 = 정수1>정수2 && 정수1>정수3 ? 정수1 : 정수2>정수3 ? 정수2 : 정수3;
//        System.out.println("큰정수 = " + 큰정수);

        // 문제17 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력 하시오
            // 문자열(String)은 비교연산자 사용 불가능[ 객체 ]
            // 객체 비교 메소드 : 객체.equals( )
            // 문자열 비교 : "문자열".equals("비교문자열");
        System.out.print(">> ID : ");   String id = scanner.next();
        System.out.print(">> PW : ");   String pw = scanner.next();

        // id == "admin" && pw == "1234" [ 불가능 ]
        System.out.println( id.equals("admin") && pw.equals("1234") ?
                            "로그인 성공" : "로그인 실패");

    }
} // class e
