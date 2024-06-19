package day09.step3;

import java.util.Scanner;

public class 제품관리_1_변수버전 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        String 제품코드1 = "";    String 제품명1 = "";       int 제품가격1 = 0;
        String 제품코드2 = "";    String 제품명2 = "";       int 제품가격2 = 0;
        String 제품코드3 = "";    String 제품명3 = "";       int 제품가격3 = 0;

        while(true) { // w s // 2.무한루프
            System.out.print(" 1.등록 2.출력 3.수정 4.삭제 5.종료 선택] ");
            System.out.print("선택 : ");     int ch = scanner.nextInt();
            if( ch == 1 ){
                scanner.nextLine();
                System.out.print("제품코드 : ");  String productNo = scanner.nextLine();
                System.out.print("제품명 : ");    String productName = scanner.next();
                System.out.print("제품가격 : ");  int productPrice = scanner.nextInt();
                // // [ if중첩 ] 저장 : 위치에 따른 각 변수에 저장.
                if( 제품코드1.equals("")  ){         제품코드1 = productNo;      제품명1 = productName;      제품가격1 = productPrice; }
                else if( 제품코드2.equals("") ){     제품코드2 = productNo;      제품명2 = productName;      제품가격2 = productPrice; }
                else if( 제품코드3.equals("") ){     제품코드3= productNo;       제품명3 = productName;      제품가격3 = productPrice; }
                else{   System.out.println("[경고] 제품등록 자리가 부족합니다.");   }
            }
            else if( ch == 4 ){
                System.out.print("삭제할 제품코드 : ");      String deleteNo = scanner.next();
                if( deleteNo.equals( 제품코드1 )  ){         제품코드1 = "";     제품명1 = "";      제품가격1 = 0; }
                else if( deleteNo.equals( 제품코드2 )  ){   제품코드2 = "";     제품명2 = "";      제품가격2 = 0; }
                else if( deleteNo.equals( 제품코드3 ) ){   제품코드3= "";      제품명3 = "";      제품가격3 = 0; }
                else{ System.out.println("[경고] 존재하지 않는 제품코드 입니다.");   }
            }
            else if( ch == 3 ){
                System.out.print("수정할 제품코드 : ");      String updateNo = scanner.next();
                System.out.print("새로운 제품명 : ");       String productName = scanner.next();
                System.out.print("새로운 제품가격 : ");      int productPrice = scanner.nextInt();
                if( updateNo.equals( 제품코드1 )  ){              제품명1 = productName;      제품가격1 = productPrice; }
                else if( updateNo.equals( 제품코드2 )  ){         제품명2 = productName;      제품가격2 = productPrice; }
                else if( updateNo.equals( 제품코드3 ) ){           제품명3 = productName;      제품가격3 = productPrice; }
                else{ System.out.println("[경고] 존재하지 않는 제품코드 입니다.");   }
            }
            else if( ch == 2 ){
                // 1. 출력
                System.out.println("========== 제품목록 ==========");
                if( !제품코드1.equals("")  ){         System.out.printf("%10s \t %-10s \t %-10s \n" , 제품코드1 , 제품명1 , 제품가격1 ); }
                if( !제품코드2.equals("") ){     System.out.printf("%10s \t %-10s \t %-10s \n" , 제품코드2 , 제품명2, 제품가격2 ); }
                if( !제품코드3.equals("") ){     System.out.printf("%10s \t %-10s \t %-10s \n" , 제품코드3 , 제품명3 , 제품가격3 ); }
            }
            else if( ch == 5 ){  break;   }
            else{    System.out.println("[경고]알수없는 입력입니다.");  } // if end
        } // w e
    } // main e

}
