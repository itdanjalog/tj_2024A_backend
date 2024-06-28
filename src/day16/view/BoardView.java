package day16.view;

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

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
            else if( ch == 3 ){
                if( mDelete( ) ) {
                    logout(); return;
                }
            }
            else if( ch == 4 ){ bPrint( ); }
        } // w end
    } // main end
    // 1. 로그아웃 함수
    public void logout( ){
        MemberController.mcontrol.logout();  // 회원 컨트롤러에 로그아웃 메소드 호출
        System.out.println(">> 로그아웃 성공 [초기메뉴로]");
    }
    // 2. 회원수정 함수
    public void mUpdate( ){
        System.out.print("수정할 회원명 : ");  String newMname = scan.next();
        System.out.print("수정할 연락처 : ");  String newMphone = scan.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setMname( newMname ); memberDto.setMphone( newMphone );
        boolean result = MemberController.mcontrol.mUpdate( memberDto );
        if( result ){   System.out.println("수정성공"); } else{   System.out.println("수정실패"); }
    }

    // 3. 회원탈퇴 함수
    public boolean mDelete( ){
        System.out.print("[정말 탈퇴할까요?]");
        System.out.print("확인 비밀번호 : ");
        String confirmPwd = scan.next();
        boolean result  = MemberController.mcontrol.mDelete( confirmPwd );
        if( result ){ System.out.println("탈퇴 성공"); return true; }
        else{  System.out.println("비밀번호 불일치");   return false; }
    }

    // 4. 게시판(게시물전체출력) 함수
    public void bPrint( ) { }

} // class end







