package day12.step1;

public class Customer {  // 클래스 ----------------
    // 1.멤버변수  :  객체내 속성 값을 저장할 변수 , 접근제한자 static 타입 변수명
        // 접근제한자
        // - private : 다른 클래스부터 접근제한, 현재 클래스에서만 호출이 가능하다.
        // - public : 다른 클래스로부터 접근가능 , 현재 외 다른 클래스에서도 호출이 가능하다.
        // 정적변수
        // static : 메소드영역에 저장되는 변수로써 객체가 없어도 사용이 가능하다. -
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;
    // 2. 생성자   : 객체 생성(new) 시 사용되는 메소드 , 반환타입이 없다.
        // 오버로딩 : 생성자명은 동일하지만 매개변수 개수 , 타입 , 선언순서 가 *다르면 여러개 선언가능.
        // 클래스내 생성자가 1개도 없으면 기본(default)생성자 자동으로 생성되지만
            // - 생성자가 1개 이상 존재하면 기본생성자는 자동으로 생성되지 않는다.
        // - 주로 객체 생성시 멤버변수의 초기화 또는 유효성검사를 진행할때.
    public Customer(){  customerGrade = "SILVER";   bonusRatio = 0.01;  }
    public Customer( int customerID ){ }

    // 3. 메소드 : 함수 , 객체의 방법/행위/행동 정의
        // 접근제한자 static 반환타입 함수명( 타입 매개변수1 , 타입 매개변수2 ) { 실행문; return값 }
    public int calcPrice( int price  ){
        this.bonusPoint += price * this.bonusRatio;
        // this란? 매개변수와 멤버변수 구분하기위해 , 해당 함수를 실행한 객체를 식별용
        return price; // return 값 , 값은 메소드 타입타입과 일치한 값 , 반환 값이 없으면 void 타입
    }
    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade +"이며, 보너스 포인트는"+bonusPoint+"입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
} // 클래스 -----------------------------------------
