package day06.step6;

import java.util.Scanner;

public class Step6 { // class c
    public static void main(String[] args) { // main s

        // 1. 입력 객체 : 입력기능( .next() )을 사용할려고
            // .next() 관련된 기능을 scanner 객체가 가지고 있으니까

        Scanner scanner = new Scanner(System.in);

        // 1. 객체 생성
        Account myAccount = new Account();

        // 2. 객체내 필드/멤버변수 에 값 대입
        myAccount.balance = 0;
        myAccount.number = "123-123";

        while ( true ){ // w s : 무한반복
            // 출력
            System.out.println("==============================");
            System.out.print("1.예금 2.출금 3.잔고 4.종료 : ");
            // 입력
            int ch = scanner.nextInt();     System.out.println("ch = " + ch);
            // 3. 입력값에 따른 서로 다른 로직 처리 ( 조건문 )
            if( ch ==1 ){
                System.out.println("예금처리");     System.out.print("예금할 금액 입력 : ");
                int money = scanner.nextInt();      myAccount.balance += money;
            } // 만약에 내가 입력한 값이 1 이면 예금처리
            else if( ch==2 ){
                System.out.println("출금처리");     System.out.print("출금할 금액 입력 : ");
                int money = scanner.nextInt();      myAccount.balance -= money ;
            }  // 만약에 내가 입력한 값이 2 이면 출금처리 
            else if( ch==3 ){
                System.out.println("잔고확인처리");    System.out.println("balance = " + myAccount.balance);
            } // 만약에 내가 입력한 값이 3 이면 잔고확인처리
            else if( ch==4 ){
                System.out.println("종료"); break;
            } // 만약에 내가 입력한 값이 4 이면 종료
            else{
                System.out.println("알수없는 번호 입니다.");
            } // 그외
        } // w end
    } // main e
} // class e

