package day03;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        // 1~9문제확인 은  조건문문제9.txt 파일
        Scanner scan = new Scanner(System.in);

        // 1.
//        int question1 = scan.nextInt();
//        if ( question1 >= 90) {  System.out.println("합격"); }
//        else {  System.out.println("불합격"); }

        // 2.
//        System.out.print("점수 : "); int 점수 = scan.nextInt();
//
//        if (점수 >= 90) {System.out.print("A등급");}
//        else if (점수 >= 80) { System.out.print("B등급");}
//        else if (점수 >= 70) { System.out.print("C등급");}
//        else {  System.out.println("재시험");  }

        // 3.
//        System.out.print(" >> 정수 1 : ");  int int1 = scan.nextInt();
//        System.out.print(" >> 정수 2 : ");  int int2 = scan.nextInt();
//        System.out.print(" >> 정수 3 : ");  int int3 = scan.nextInt();
//
//        int large = 0;
//        if( int1 > int2 && int1 > int3 ){ large = int1; }
//        else if( int2 > int3 ){large = int2; }
//        else{  large = int3; }
//
//        System.out.println(" >> 가장 큰 수는 " + large + "입니다.");

        // 4.
//        int q4a = scan.nextInt(); int q4b = scan.nextInt(); int q4c = scan.nextInt();
//        // 오름차순 : 1, 2, 3
//        if (q4a == q4b || q4a == q4c || q4b == q4c) { // SWAP
//            System.out.println("서로 같은 정수값이 있습니다");
//        }
//        if (q4a > q4b) {  int temp = q4a;   q4a = q4b; q4b = temp; }
//        if (q4b > q4c) { int temp = q4b; q4b = q4c;  q4c = temp;   }
//        if (q4a > q4b) {  int temp = q4a;  q4a = q4b;  q4b = temp;  }
//        System.out.printf("\n정수의 순서는 %d, %d, %d", q4a, q4b, q4c);

        // 5.
//        System.out.println("가위: 0, 바위: 1, 보: 2");
//        System.out.print("플레이어1 입력: "); int player1 = scan.nextInt();
//        System.out.print("플레이어2 입력: "); int player2 = scan.nextInt();
//        int result = player1 - player2;
//        if (result == 0) { System.out.println("무승부");}
//        else if (result == 1 || result == -2) { System.out.println("플레이어1 승리"); }
//        else { System.out.println("플레이어2 승리"); }

        // 6.
//        System.out.print(" >> 연도 입력 : ");
//        int year = scan.nextInt();
//        String year1 =
//                (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) ? "윤년"
//                : year % 4 == 0 && year % 100 == 0 ? "평년"
//                : year % 4 == 0 ? "윤년" : "평년";
//        System.out.println(" >> 입력한 " + year + "년은 " + year1 + "입니다.");

        // 7.
//        int inHour = 9; int inMinute = 30;
//        System.out.println(">> 출차시간_시간 : "); int outHour = scan.nextInt();
//        System.out.println(">> 출차시간_분 : ");   int outMinute = scan.nextInt();
//        int passedTime = (outHour*60 + outMinute) - (inHour*60 + inMinute);
//        if (passedTime < 0) {
//            System.out.println("출차시간 오류");
//        } else {
//            System.out.printf("\n사용요금 %4d원", passedTime * 1000);
//        }

        // 8.
//        System.out.print("ID : " ); String id = scan.next();
//        System.out.print("PW : " ); String pw = scan.next();
//
//        if (id.equals("admin")) {
//            if (pw.equals("1234")) { System.out.println("로그인성공"); }
//            else {  System.out.println("비밀번호 정보가 일치하지 않습니다."); }
//        }
//        else {System.out.println("아이디 정보가 일치하지 않습니다.");}

        // 9.
//        int ball1 = 14; int ball2 = 21; int ball3 = 9;
//        System.out.print(" >> 정수 1 입력 : "); int int4 = scan.nextInt();
//        System.out.print(" >> 정수 2 입력 : "); int int5 = scan.nextInt();
//        System.out.print(" >> 정수 3 입력 : "); int int6 = scan.nextInt();
//        int count = 0;
//        if(int4 == ball1 || int5 == ball1 || int6 == ball1){ count++; }
//        if(int4 == ball2 || int5 == ball2 || int6 == ball2){ count++; }
//        if(int4 == ball3 || int5 == ball3 || int6 == ball3){ count++; }
//
//        System.out.println(" >> 동일한 번호는 " + count + "개입니다....");

    }
}
