package day09.step6;

public class 제품 {
    private String 제품코드;
    private String 제품명;
    private int 제품가격;

    public 제품(String 제품코드, String 제품명, int 제품가격) {
        this.제품코드 = 제품코드;
        this.제품명 = 제품명;
        this.제품가격 = 제품가격;
    }

    public String get제품코드() {
        return 제품코드;
    }

    public void set제품코드(String 제품코드) {
        this.제품코드 = 제품코드;
    }

    public String get제품명() {
        return 제품명;
    }

    public void set제품명(String 제품명) {
        this.제품명 = 제품명;
    }

    public int get제품가격() {
        return 제품가격;
    }

    public void set제품가격(int 제품가격) {
        this.제품가격 = 제품가격;
    }
}
