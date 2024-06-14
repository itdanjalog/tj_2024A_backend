package day07.step3;

public class Account {
    // 멤버변수/필드 선언
    private int balance;
    private String number;
    // 생성자
        // 1. 디폴트 생성자
    public Account(){ }
        // 2. 매개변수 2개를 갖는 생성자
    public Account( int balance , String number ){
        this.balance = balance;
        this.number = number;
    }
    // 메소드
        // getter , setter
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

/*
    Account 클래스
    [조건]
    1. 멤버변수/필드 선언
        balance 예금액
        number 계좌번호
    2. 모든 멤버변수/필드 private 선언하기
    3. 생성자 2개 선언하기
        1. (default)기본생성자
        2. balance , number 초기화하는 생성자
    4. private 필드를 접근하기 위해 getter and setter 함수 선언
*/
