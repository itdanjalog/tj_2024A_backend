package day09.step6;

import java.util.Arrays;
import java.util.Scanner;

public class 제품관리_4_객체와가변배열버전 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int count = 0;
        제품[] 제품목록 = new 제품[count];

        while(true) { // w s // 2.무한루프
            System.out.print(" 1.등록 2.출력 3.수정 4.삭제 5.종료 선택] ");
            System.out.print("선택 : ");     int ch = scanner.nextInt();
            if( ch == 1 ){
                scanner.nextLine();
                System.out.print("제품코드 : ");  String productNo = scanner.nextLine();
                System.out.print("제품명 : ");    String productName = scanner.next();
                System.out.print("제품가격 : ");  int productPrice = scanner.nextInt();
                count++;
                제품[] new제품목록 = new 제품[count];
                for( int i = 0 ; i < 제품목록.length ; i++ ){
                    new제품목록[i] = 제품목록[i];
                }
                new제품목록[count-1] = new 제품( productNo , productName , productPrice );
                제품목록 = new제품목록;
            }
            else if( ch == 2 ){
                System.out.println("========== 제품목록 ==========");
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    System.out.printf("%10s \t %-10s \t %-10s \n" , 제품목록[i].get제품코드() , 제품목록[i].get제품명() , 제품목록[i].get제품가격() );
                }
            }
            else if( ch == 3 ){
                System.out.print("수정할 제품코드 : ");      String updateNo = scanner.next();
                System.out.print("새로운 제품명 : ");       String productName = scanner.next();
                System.out.print("새로운 제품가격 : ");      int productPrice = scanner.nextInt();

                boolean saveCheck = false;
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    if( updateNo.equals( 제품목록[i].get제품코드() )  ){
                        제품목록[i].set제품명(productName);  제품목록[i].set제품가격(productPrice);
                        saveCheck = true;
                        break;
                    }
                }
                if( saveCheck == false ){ System.out.println("[경고] 존재하지 않는 제품코드 입니다."); }
            }
            else if( ch == 4 ){
                System.out.print("삭제할 제품코드 : ");      String deleteNo = scanner.next();

                boolean saveCheck = false;
                for( int i = 0 ;i<제품목록.length ; i++ ){
                    if( deleteNo.equals( 제품목록[i].get제품코드() )  ){
                        제품목록[i] = null;
                        saveCheck = true;

                        // ============================= //
                        count--;
                        제품[] new제품목록 = new 제품[count];

                        int n = 0;
                        for( int j = 0 ; j < 제품목록.length ; j++ ){

                            if( 제품목록[j] == null ) { n++; }

                            if( j+n == 제품목록.length )break;;

                            new제품목록[j] = 제품목록[j+n];
                        }
                        제품목록 = new제품목록;

                        break;
                    }
                }
                if( saveCheck == false ){ System.out.println("[경고] 존재하지 않는 제품코드 입니다."); }

            }

            else if( ch == 5 ){  break;   }
            else{    System.out.println("[경고]알수없는 입력입니다.");  } // if end
        } // w e
    } // main e

}
