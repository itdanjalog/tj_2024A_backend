package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

public class MemberController {
    // 0.
    public static MemberController mcontrol
            = new MemberController();

    // 1. 회원가입 화면 함수 , 매개변수 : MemberDto(mid , mpwd , mname , mphone)  / 리턴값 : boolean
    public boolean signup(MemberDto memberDto ){
        boolean result  = MemberDao.mdao.signup( memberDto );
        return result;
    }// m end
    // 2. 로그인 화면 함수
    public boolean login( MemberDto memberDto ){
        return MemberDao.mdao.login( memberDto );
    } // m end
    // 3. 아이디찾기 화면 함수
    public String findId( MemberDto memberDto ){
        return MemberDao.mdao.findId( memberDto );
    } // m end
    // 4. 비밀번호찾기 화면 함수
    public String findPwd( MemberDto memberDto ){
        return MemberDao.mdao.findPwd( memberDto );
    } // m end

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