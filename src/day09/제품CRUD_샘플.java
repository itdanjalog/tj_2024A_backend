package day09;

import java.util.Scanner;

public class 제품CRUD_샘플 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        // 제품 메모리 설계

        while(true){ // 무한반복
            System.out.print("1.등록(C) 2.출력(R) 3.수정(U) 4.삭제(D) 5.종료 선택 >> "); // 무한출력
            int ch = scanner.nextInt(); // 무한입력
            if( ch == 1 ){}
            else if( ch == 2 ){}
            else if( ch == 3 ){}
            else if( ch == 4 ){}
            else if( ch == 5 ){ System.out.println("안내] 프로그램 종료합니다."); break;}
            else{  System.out.println("안내] 알수없는 번호 입니다.");  }
        } // while end
    } // main end 
} // class end 
