package day16.view;

import day16.controller.BoardController;
import day16.controller.MemberController;
import day16.model.dto.BoardDto;
import day16.model.dto.MemberDto;

import java.util.ArrayList;
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
    public void bPrint( ) {
        ArrayList<BoardDto> result =  BoardController.getInstance().bPrint( );   // 컨트롤에게 전체 게시물 조회 요청
        System.out.println("번호\t조회수\t작성일\t\t\t제목");
        // 리스트객체명.forEach( 반복변수 -> { 실행문; } ); // 리스트내 전체 dto 를 하나씩 반복변수에 대입 반복
        result.forEach( dto -> {
            System.out.printf("%2d\t%2d\t%10s\t%s \n" ,
                    dto.getBno() , dto.getBview() , dto.getBdate() , dto.getBtitle() );
        } );
        System.out.print(" 0.글쓰기 1~:개별글(번호)조회: ");
        int ch = scan.nextInt();
        if( ch == 0 ){ bWrite(); }
        else if ( ch >= 1 ){ bView( ch ); }
    }
    // 5. 게시물 쓰기 함수
    public void bWrite() { }

    // 6. 게시물 개별조회 함수
    public void bView( int bno ){
        // - 매개변수로 선택 받은 게시물을 번호를 컨트롤에게 전달 후 해당 게시물 정보 받기
        BoardDto result = BoardController.getInstance().bView( bno );
        if( result == null ){
            System.out.println(">>존재하지 않는 게시물 입니다.");
            return;
        }
        System.out.println("제목 : " + result.getBtitle() );
        System.out.print("작성자 : " + result.getMno() );
        System.out.println("\t조회수 : " + result.getBview() );
        System.out.println("작성일 : " + result.getBdate() );
        System.out.println("내용 : " + result.getBcontent() );
    }

    // 7. 게시물 삭제 함수

    // 8. 게시물 수정 함수

} // class end







