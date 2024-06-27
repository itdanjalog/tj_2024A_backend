package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

public class MemberController {
    // 0.
    public static MemberController mcontrol
            = new MemberController();

    // 1. 회원가입 화면 함수 , 매개변수 : MemberDto(mid , mpwd , mname , mphone)  / 리턴값 : boolean
    public boolean signup(MemberDto memberDto ){
        boolean result
                = MemberDao.mdao.signup( memberDto );
        return result;
    }// m end

    // 2. 로그인 화면 함수
    public void login(){ } // m end
    // 3. 아이디찾기 화면 함수
    public void findId(){   } // m end
    // 4. 비밀번호찾기 화면 함수
    public void findPwd(){ } // m end

}
