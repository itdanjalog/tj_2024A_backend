package day05;

import java.util.Scanner;

public class Step3 { // class c
    public static void main(String[] args) { // main e

        // [ 입력 ] : 입력객체
        Scanner scanner = new Scanner(System.in);

        /*
        // [1] 입력받은 수 만큼 별 출력 하시오.
        System.out.print("[1]별 개수 : ");
            // 1. 키보드로부터 정수형으로 입력받아 정수형 변수에 저장
        int star1 = scanner.nextInt();
        System.out.println(">star1 = " + star1);
            // 2. 입력받은 수 만큼 '*'출력
        for ( int i = 1 ; i <= star1 ; i++ ){
            System.out.print("*");
        }
        System.out.println("\n=========== 구분선 ===================");

        // [2] 입력받은 수 만큼 별 출력 하는데 3의 배수마다 줄바꿈 처리 하시오.
        System.out.print("[2]별 개수 : ");
        int star2 = scanner.nextInt(); // scanner객체 생성은 { } 마다 1번 선언
        System.out.println("star2 = " + star2);
            // 2. 입력받은 수 만큼 '*' 출력 만약에 3의 배수이면 줄바꿈처리
        for( int i = 1 ; i <= star2 ; i++ ){
            System.out.print("*");
            if( i % 3 == 0 ){ System.out.println(); }
        }
        System.out.println("\n=========== 구분선 ===================");

        // [3] 입력받은 수 만큼 별을 하나의 변수에 하나씩 추가후 해당 변수 출력
        System.out.print("[3]별 배수 : ");
        int star3 = scanner.nextInt();
        String starTotal = "";
        for( int i = 1 ; i <= star3 ; i++ ){
            starTotal += "*";
        }
        System.out.println("starTotal = " + starTotal);
        System.out.println("\n=========== 구분선 ===================");
        */

        // [4]
        /*
        System.out.print("[4] 줄수 : ");
        int iLine = scanner.nextInt();
        String html = "";

        // 현재줄수는 1부터 입력받은 줄수 까지 1씩 증가 
        for ( int cLine = 1 ; cLine<=iLine ; cLine++ ){
            for( int star = 1 ; star<=cLine ; star++ ){
                html += "*";
            }
            // 줄바꿈 
            html += "\n";
        }
        // 반복문 종료후 html 변수 출력
        System.out.println( html );
        */
        /*
        // [5]
        System.out.print("[5] 줄수 : "); // 안내문 출력
        int iLine = scanner.nextInt(); // 키보드로부터 입력받은 값을 반환 해서 변수에 저장
        String html = "";

        for( int cLine = 1 ; cLine <= iLine ; cLine++ ){
            // 줄마다 공백출력
            for( int blank = 1 ; blank <= iLine - cLine ; blank++ ){
                html += " ";
            }
            // 줄마다 별 출력
            for( int star = 1 ; star <= cLine ; star++ ){
                html += "*";
            }
            // 줄마다 줄바꿈
            html += "\n";
        }
        System.out.println( html );

         */



















    } // maine
} // class e

