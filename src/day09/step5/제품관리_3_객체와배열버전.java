package day09.step5;

import java.util.Scanner;

public class 제품관리_3_객체와배열버전 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        제품[] 제품목록 = new 제품[3]; // [null] [null] [null]

        while(true) { // w s // 2.무한루프
            System.out.print(" 1.등록 2.출력 3.수정 4.삭제 5.종료 선택] ");
            System.out.print("선택 : ");     int ch = scanner.nextInt();
            if( ch == 1 ){
                scanner.nextLine();
                System.out.print("제품코드 : ");  String productNo = scanner.nextLine();
                System.out.print("제품명 : ");    String productName = scanner.next();
                System.out.print("제품가격 : ");  int productPrice = scanner.nextInt();

                // // [ if중첩 ] 저장 : 위치에 따른 각 변수에 저장.
                boolean saveCheck = false; // 나 아직 빈공간 못찾어.
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    if( 제품목록[i] == null  ){
                        제품 p = new 제품();
                        p.제품코드 = productNo; p.제품명 = productName; p.제품가격 = productPrice;
                        제품목록[i] = p;
                        saveCheck = true;
                        break;
                    }
                }
                if( saveCheck == false ){ System.out.println("[경고] 제품등록 자리가 부족합니다."); }
            }
            else if( ch == 4 ){
                System.out.print("삭제할 제품코드 : ");      String deleteNo = scanner.next();

                boolean saveCheck = false;
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    if( 제품목록[i] != null && deleteNo.equals( 제품목록[i].제품코드 )  ){
                        제품목록[i] = null;
                        saveCheck = true;
                        break;
                    }
                }
                if( saveCheck == false ){ System.out.println("[경고] 존재하지 않는 제품코드 입니다."); }
            }
            else if( ch == 3 ){
                System.out.print("수정할 제품코드 : ");      String updateNo = scanner.next();
                System.out.print("새로운 제품명 : ");       String productName = scanner.next();
                System.out.print("새로운 제품가격 : ");      int productPrice = scanner.nextInt();

                boolean saveCheck = false;
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    if( 제품목록[i] != null && updateNo.equals( 제품목록[i].제품코드 )  ){
                        제품목록[i].제품명 = productName;  제품목록[i].제품가격 = productPrice;
                        saveCheck = true;
                        break;
                    }
                }
                if( saveCheck == false ){ System.out.println("[경고] 존재하지 않는 제품코드 입니다."); }


            }
            else if( ch == 2 ){
                // 1. 출력
                System.out.println("========== 제품목록 ==========");
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    if( 제품목록[i] != null ){
                        System.out.printf("%10s \t %-10s \t %-10s \n" , 제품목록[i].제품코드 , 제품목록[i].제품명 , 제품목록[i].제품가격 );
                    }
                }
            }
            else if( ch == 5 ){  break;   }
            else{    System.out.println("[경고]알수없는 입력입니다.");  } // if end
        } // w e
    } // main e

}
