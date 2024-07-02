package day16.view;

import day16.controller.BoardController;
import day16.controller.MemberController;
import day16.model.dto.BoardDto;
import day16.model.dto.MemberDto;
import day16.model.dto.ReplyDto;

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
        System.out.println("번호\t조회수\t작성일\t\t\t\t작성자\t제목");
        // 리스트객체명.forEach( 반복변수 -> { 실행문; } ); // 리스트내 전체 dto 를 하나씩 반복변수에 대입 반복
        result.forEach( dto -> {
            System.out.printf("%2d\t%2d\t%10s\t%10s\t%s \n" ,
             dto.getBno() , dto.getBview() , dto.getBdate() , dto.getMid() , dto.getBtitle() );
        } );
        System.out.print(" 0.글쓰기 1~:개별글(번호)조회: ");
        int ch = scan.nextInt();
        if( ch == 0 ){ bWrite(); }
        else if ( ch >= 1 ){ bView( ch ); }
    }
    // 5. 게시물 쓰기 함수
    public void bWrite() {
        scan.nextLine(); // 1. 입력받기
        System.out.print("제목 : ");String btitle = scan.nextLine();
        System.out.print("내용 : ");String bcontent = scan.nextLine();
        BoardDto boardDto = new BoardDto(); // 2. 입력받은 값들을 객체의 각각 매개변수에 값 대입
        boardDto.setBtitle( btitle ); boardDto.setBcontent( bcontent );
        // 3. 입력받은 객체를 컨트롤에게 전달후 결과 응답 받기.
        boolean result =  BoardController.getInstance().bWrite( boardDto );
        if( result ){  System.out.println(">> 글작성 성공");
        }else{  System.out.println(">> 글작성 실패");   }
    }

    // 6. 게시물 개별조회 함수
    public void bView( int bno ){
        // - 매개변수로 선택 받은 게시물을 번호를 컨트롤에게 전달 후 해당 게시물 정보 받기
        BoardDto result = BoardController.getInstance().bView( bno );
        if( result == null ){
            System.out.println(">>존재하지 않는 게시물 입니다.");  return;
        }
        System.out.println("-------------- 게시물 -------------- ");
        System.out.println("제목 : " + result.getBtitle() );
        System.out.print("작성자 : " + result.getMno() );
        System.out.println("\t조회수 : " + result.getBview() );
        System.out.println("작성일 : " + result.getBdate() );
        System.out.println("내용 : " + result.getBcontent() );
        // ------- 댓글 출력 -------- //
        rPrint( bno );
        // ------------------------ //
        System.out.print(">> 1. 글 삭제 2. 글 수정 3.댓글쓰기 : ");
        int ch = scan.nextInt();
        if( ch == 1 ){ bDelete( bno ); }
        else if( ch == 2 ){ bUpdate();  }
        else if( ch == 3 ){ rWrite( bno ); }
    }
    // 7. 게시물 삭제 함수
    public void bDelete( int bno ) {
        boolean result = BoardController.getInstance().bDelete(bno);
        if (result) {  System.out.println(">> 삭제 성공");}
        else {  System.out.println(">>삭제 실패");}
    }
    // 8. 게시물 수정 함수
    public void bUpdate(){ }
    // 9. 댓글 출력 함수
    public void rPrint( int bno ){
        ArrayList<ReplyDto> result = BoardController.getInstance().rPrint( bno );
        // 리스트객체명.forEach( 반복변수 -> { 실행문 } )
            // 리스트내 요소들을 하나씩 반복변수에 대입 반복 처리
        System.out.println("-------------- 댓글 -------------- ");
        result.forEach( reply -> {
            System.out.printf( "%s %d %s  \n" ,
                    reply.getRdate() , reply.getMno() ,  reply.getRcontent()  );
        });
        // 1.
        System.out.println(".　　　　　 　n__r 、\n" +
                "　　　　　 /)・ ェ・)/)\n" +
                "　　　 _／　　￣￣　＼\n" +
                "　　／　　　　　　　　 ヽ\n" +
                "　/　　　　●　　　　　●ヽ\n" +
                "　!　　　　　　 　　 ▼　　l\n" +
                "　ヽ_ 　 　　　 　　 人 　 ノ\n" +
                "　　　ﾞﾞーＪ――――Ｊ\n");
    }

    // 10. 댓글 쓰기 함수
    public void rWrite( int bno ){
        // - 만약에 코드 상황 상 로그인후 댓글쓰기 가 아니였다면
            // 로그인상태를 확인후 댓글 쓰기 진행
        if( !MemberController.mcontrol.loginState() ){
            System.out.println(">>로그인후 가능합니다.");
            return;
        }

        // 위에서 next() 후 엔터 쳤을때 scan객체에 엔터/개행 기록이 남아있기 때문에 nextLine() 인식해서 입력했다는걸로 간주
        // - 해결방안 : next() nextLine() 사이에 의미 없는 scan.nextLine(); 코드 작성
        scan.nextLine();
        System.out.print("댓글 내용 : ");   String rcontent = scan.nextLine();
        ReplyDto replyDto = new ReplyDto();
        replyDto.setBno( bno ); replyDto.setRcontent( rcontent );
        boolean result = BoardController.getInstance().rWrite( replyDto );
        if( result ){  System.out.println(">> 댓글 작성 성공 "); }
        else{ System.out.println(">> 댓글 작성 실패  "); }
    }

} // class end







