package day16.view;

import day16.controller.MemberController;

import java.util.Scanner;

public class BoardView {
    // 0.
    public static BoardView bView = new BoardView();
    public Scanner scan = new Scanner(System.in);
    // 0. 로그인 성공시 초기화면
    public void index2( ){
        while (true){
            System.out.print(">> 1.로그아웃 2.회원수정 3.회원탈퇴 4.게시판 : ");
            int ch = scan.nextInt();
            if( ch == 1 ){ logout( ); return; }
            else if( ch == 2 ){ mUpdate( ); }
            else if( ch == 3 ){ mDelete( );}
            else if( ch == 4 ){ bPrint( ); }
        } // w end
    } // main end
    // 1. 로그아웃 함수
    public void logout( ){
        MemberController.mcontrol.logout();  // 회원 컨트롤러에 로그아웃 메소드 호출
        System.out.println(">> 로그아웃 성공 [초기메뉴로]");
    }
    // 2. 회원수정 함수
    public void mUpdate( ){ }
    // 3. 회원탈퇴 함수
    public void mDelete( ){ }
    // 4. 게시판(게시물전체출력) 함수
    public void bPrint( ) { }
} // class end







