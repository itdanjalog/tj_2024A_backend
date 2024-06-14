package day07.step2;

public class 아파트설계도 {
    // 멤버 변수/필드
    private String 냉장고;
    private String 패스워드 = "1234";
    // 생성자
    아파트설계도( String 초기음식 ){
        if( 초기음식.equals("쓰레기") ){
        }else{
            this.냉장고 = 초기음식;
        }
    }
    // 메소드
        // getter
    public String 음식꺼내기( String 입력된패스워드){
        System.out.println( this.냉장고 );
        if( 입력된패스워드.equals( this.패스워드) ){
            return 냉장고;
        }else{
            return "";
        }
    }
        // setter
    public void 음식저장( String 음식 ){
        if( 음식.equals("쓰레기") ) {}
        else{ 냉장고 = 음식;  }
    }

}
