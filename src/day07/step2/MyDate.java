package day07.step2;

public class MyDate {
    // 멤버변수/필드
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;
    // 생성자 : 객체 생성시 객체의 멤버변수 초기화 할때 사용
        // 객체내 멤버변수 와 생성자의 매개변수명이 동일할때
        // 1. 다르게 변수명을 사용하자. 만일 다르면 코드 작성시 가독성 떨어짐
        // 2. 가독성위해 변수명 동일할때 this 키워드를 이용해 구분하자
            // - this.멤버변수   : 현재 객체의 멤버변수를 호출한다.
    MyDate( int pday , int pmonth , int pyear ){
        // 저장 뿐만 아니라 유효성사도 가능하다.
            if( pday < 1 || pday > 31 ) isValid = false;
            if( pmonth < 1 || pmonth > 12 ) isValid = false;
            if( ( pyear % 4 == 0 && pyear % 100 != 0 )  || pyear % 400 == 0  ){ //윤년이 아닐떄
                if( pday < 1 || pday > 29 ){ isValid = false; }
            }else{ // 윤년이 아닐때
                if( pday < 1 || pday > 28 ){ isValid = false; }
            }
            if( pyear < 1900 || pyear > 9999 ) isValid = false;

        this.day = pday;
        this.month = pmonth;
        this.year = pyear;
    }
    // 메소드
        // 해당 날짜가 유효한지 유효성검사 함수.
    public String isValid(){
        if( isValid ){
            return "유효한 날짜입니다";
        }else{
            return "유효하지 않은 날짜닙니다.";
        }
    }

        // - getter and setter
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
// 1. 멤버변수의 저장할 데이터 와 자료형 생각
// 2. 멤버변수의 접근제한 선택
// 3. 만일 멤버변수가 private 이면 getter and setter 메소드 생성

