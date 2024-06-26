package day15.step3_MVC;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    // - 외부 클래스로부터 내부 메소드를 사용할수 있도록 만든 static변수
    static View view = new View();
    // 입력객체
    Scanner scan = new Scanner(System.in); // 멤버변수
    // 1. 메인페이지 함수
    public void mainView(){
        while ( true ) {
            try {
                System.out.println(" ===== 메인화면 ===== ");
                System.out.print("1.등록 2.출력 3.수정 4.삭제 : ");
                int ch = scan.nextInt();
                if (ch == 1) { signupView(); }
                else if (ch == 2) { printView(); }
                else if (ch == 3) { updateView(); }
                else if (ch == 4) { deleteView(); }
                else { System.out.println(">> 없는 기능 번호 입니다.");   }
            }catch (Exception e ){
                System.out.println(" >> 잘못된 입력입니다. ");
                scan = new Scanner( System.in );
            }
        }
    } // mainView() end

    // 2. 등록페이지 함수
    public void signupView(){
        System.out.println(" >> 등록페이지 << ");
        System.out.print(">>[저장C] 이름 : ");String name = scan.next();
        boolean result = Controller.controller.signupC( name );
        if( result ){  System.out.println(">>등록성공"); }
        else{ System.out.println(">>등록실패"); }
    }
    // 3. 출력페이지 함수
    public void printView(){
        System.out.println(" >> 출력페이지 << ");
        ArrayList<String> result = Controller.controller.printC();
    }
    // 4. 수정페이지 함수
    public void updateView(){
        System.out.println(" >> 수정페이지 << ");
        System.out.print("[수정U] 기존이름 : "); String oldName = scan.next();
        System.out.print("[수정U] 새로운이름 : "); String newName = scan.next();
        boolean result = Controller.controller.updateC( oldName , newName );
        if( result ){  System.out.println(">>수정성공"); }
        else{ System.out.println(">>수정실패"); }
    }
    // 5. 삭제페이지 함수
    public void deleteView(){
        System.out.println(" >> 삭제페이지 << ");
        System.out.print(">>[삭제D] 이름 : ");String name = scan.next();
        boolean result = Controller.controller.deleteC( name );
        if( result ){  System.out.println(">>삭제성공"); }
        else{ System.out.println(">>삭제실패"); }
    }
} // class end













