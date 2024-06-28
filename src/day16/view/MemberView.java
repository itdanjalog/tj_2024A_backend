package day16.view;

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberView {
    // - 해당 클래스의 함수들을 다른 클래스에서 호출 할수 있도록 static변수에 해당 객체 만들기
    public static MemberView mView = new MemberView();
    // 멤버변수 : 입력객체
    Scanner scan = new Scanner(System.in);
    // 0. 초기화면 함수
    public void index(){
        while (true){
            try {
                System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
                int ch = scan.nextInt();
                if( ch == 1 ){ signup(); }
                else if( ch == 2 ){ login(); }
                else if( ch == 3 ){ findId(); }
                else if( ch == 4 ){ findPwd(); }
                else {  System.out.println(">> 없는 기능 번호 입니다.");  }
            }catch ( InputMismatchException e ){
                System.out.println(">> 잘목된 입력이 있습니다. 초기메뉴로 ");
                scan = new Scanner(System.in);
            } // c end
        } // w end
    } // m end
    // 1. 회원가입 화면 함수
    public void signup(){
        // 1. 입력
        System.out.print("아이디:");   String mid = scan.next();
        System.out.print("비밀번호:");  String mpwd = scan.next();
        System.out.print("이름:");    String mname = scan.next();
        System.out.print("연락처:");   String mphone = scan.next();
        // 3. 객체화
        MemberDto memberDto = new MemberDto( mid , mpwd , mname , mphone );
        // 4. Controller에게 전달
        boolean result =  MemberController.mcontrol.signup( memberDto );
        if( result ){  System.out.println(">>회원가입 성공 "); }
        else{  System.out.println(">>회원가입 실패");  }
    }// m end

    // 2. 로그인 화면 함수
    public void login(){
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("비밀번호 : ");
        String mpwd = scan.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setMid( mid ); memberDto.setMpwd( mpwd );
        boolean result = MemberController.mcontrol.login( memberDto );
        if( result ){
            System.out.println("로그인성공 ");
            BoardView.bView.index2();// 로그인 성공시 로그인된 메뉴로 이동
        }
        else{ System.out.println("로그인실패");}
    } // m end

    // 3. 아이디찾기 화면 함수
    public void findId(){
        System.out.print("이름 : ");
        String mname = scan.next();
        System.out.print("연락처 : ");
        String mphone = scan.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setMname( mname ); memberDto.setMphone( mphone );
        String result =  MemberController.mcontrol.findId( memberDto );
        if( result != null ){  System.out.println("회원아이디 : "+result);}
        else{  System.out.println("동일한 회원정보가 없습니다."); }
    } // m end
    // 4. 비밀번호찾기 화면 함수
    public void findPwd(){
        System.out.print("아이디 : ");
        String mid = scan.next();
        System.out.print("연락처 : ");
        String mphone = scan.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setMid( mid ); memberDto.setMphone( mphone );
        String result = MemberController.mcontrol.findPwd( memberDto );
        if( result != null ){ System.out.println("회원비밀번호 : " + result );}
        else{  System.out.println("동일한 회원정보가 없습니다."); }
    } // m end
} // c end







