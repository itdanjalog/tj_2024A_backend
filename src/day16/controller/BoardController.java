package day16.controller;

import day16.model.dao.BoardDao;
import day16.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {

    // ========== 싱글톤 만들기 =========== //
    // 싱글톤 : 프로그램내 해당 클래스의 하나의 객체만 갖는 패턴
        // 1. private static 변수에 해당 클래스의 객체 생성해서 대입
    private static BoardController bControl = new BoardController();
        // 2. 해당 클래스의 생성자를 private 한다. 다른 클래스로부터 new 사용하지 못하게 차단하기
    private BoardController(){}
        // 3. 해당 객체(싱글톤)를 외부로부터 접근할수 있도록 간접(추후에 유효성검사) 호출 메소드
    public static BoardController getInstance(){ return bControl; }
    // ================================== //

    // 4. 게시판(게시물전체출력) 함수
    public ArrayList<BoardDto> bPrint( ) {
        return BoardDao.getInstance().bPrint();   // dao 에게 전체 게시물 조회 요청 후 결과를 반환
    }
    // 5. 게시물 쓰기 함수
    public boolean bWrite( BoardDto boardDto ) {
        // - 매개변수로 전달받은 boardDto에 현재 로그인된 회원번호를 대입
        boardDto.setMno( MemberController.mcontrol.loginMno );
        // - boardDto(제목,내용,작성자번호)을 다오 에게 전달후 결과 받기.
        return BoardDao.getInstance().bWrite( boardDto );
    }
    // 6. 게시물 개별조회 함수
    public BoardDto bView( int bno ){
        return BoardDao.getInstance().bView( bno );
    }


}

















