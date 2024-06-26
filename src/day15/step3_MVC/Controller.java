package day15.step3_MVC;

import java.util.ArrayList;

public class Controller {
    // - 외부 클래스로부터 내부 메소드를 사용할수 있도록 만든 static변수
    static Controller controller = new Controller();
    // 2. 등록제어 함수 , 매개변수 : 저장할이름 String , 리턴 : 등록성공여부 boolean
    public boolean signupC( String name ){
        System.out.println("Controller.signupC");
        return false;
    }
    // 3. 출력제어 함수 , 매개변수 : x , 리턴 : 회원목록 ArrayList<String>
    public ArrayList<String> printC(){
        System.out.println("Controller.printC");
        return null;
    }
    // 4. 수정제어 함수   , 매개변수 : 기존이름String,새로운이름String , 리턴 : 수정성공여부 boolean
    public boolean updateC( String oldName , String newName ){
        System.out.println("Controller.updateC");
        return false;
    }
    // 5. 삭제제어 함수   , 매개변수 : 삭제할이름 String , 리턴 : 삭제성공여부 boolean
    public boolean deleteC( String name ){
        System.out.println("Controller.deleteC");
        return false;
    }

}
