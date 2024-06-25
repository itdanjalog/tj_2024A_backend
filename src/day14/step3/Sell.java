package day14.step3;

public interface Sell {
    void sell();  // 추상메소드
    static void pay(){}
    default void order(){ System.out.println("판매 주문"); }
}
