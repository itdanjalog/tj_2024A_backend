package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

public class MemberController {
    // 0.
    public static MemberController mcontrol = new MemberController();

    // 1. 회원가입 화면 함수 , 매개변수 : MemberDto(mid , mpwd , mname , mphone)  / 리턴값 : boolean
    public boolean signup(MemberDto memberDto ){
        boolean result  = MemberDao.mdao.signup( memberDto );
        return result;
    }// m end

    // 2-1. 로그인 성공한 회원의 번호 저장하는 멤버변수
    // - 글쓰기,댓글쓰기 할때 현재 로그인된 회원을 식별하기 위해서
    // - 초기값:0 비로그인상태 , 1~ : 로그인된회원번호(로그인된상태)
    public int loginMno = 0;
    // 2-2 : 로그아웃 함수
    public void logout(){ loginMno = 0;  }
    // 2. 로그인 함수
    public boolean login( MemberDto memberDto ){
        loginMno = MemberDao.mdao.login( memberDto );
        return loginMno == 0 ? false : true;
    } // m end



    // 3. 아이디찾기 화면 함수
    public String findId( MemberDto memberDto ){
        return MemberDao.mdao.findId( memberDto );
    } // m end
    // 4. 비밀번호찾기 화면 함수
    public String findPwd( MemberDto memberDto ){
        return MemberDao.mdao.findPwd( memberDto );
    } // m end

    // 5. 회원탈퇴 함수
    public boolean mDelete( String confirmPwd ){
        return MemberDao.mdao.mDelete( confirmPwd , loginMno ); // view로 부터 받은 확인비밀번호와 로그인된회원번호를 Dao 전달
    }
    // 2. 회원수정 함수
    public boolean mUpdate( MemberDto memberDto ){
        // + memberDto에 로그인된 회원번호
        memberDto.setMno( loginMno );
        return MemberDao.mdao.mUpdate( memberDto );
    }
}
/*

[ 기능구현 ]
1. 아이디찾기	: 이름과 연락처를 입력받아 일치한 정보가 있으면'찾은아이디'출력 없으면 '없습니다'출력
			매개변수 : MemberDto( 이름,연락처)
			리턴값 : String( 찾은아이디 /  null ) - 찾았으면 문자열이 들어있고 못찾으면 null 대입

2. 비밀번호찾기	: 아이디과 연락처를 입력받아 일치한 정보가 있으면'찾은비밀번호'출력 없으면 '없습니다'출력
			매개변수 : MemberDto( 아이디,연락처)
			리턴값 : String( 찾은비밀번호, null ) - 찾았으면 문자열이 들어있고 못찾으면 null 대입

3. 로그인 		: 아이디와 비밀번호를 입력받아 일치한 정보가 있으면'로그인성공'출력 없으면 '로그인실패'출력
			매개변수 : MemberDto( 아이디,비밀번호 )
			리턴값 : boolean( 성공 / 실패 )

[ 각 기능들 개발순서 ]

	1. Controller  매개변수와 리턴값 구상 -> 2. Dao 매개변수 와 리턴값 구상 ->
	3. VIEW  로직 -> 4. CONTROLLER  로직 -> 5. DAO  로직 -> 6. 테스트

*/