package day06.Step2;

// 병찬
public class 광물 {
    String name; //이름
    double weight; //무게
    double height; //크기
    String color; //색상
    //메소드 : 굴리기 , 던지기 , 쪼개지기
}

//민석
class 마라탕 {
    String 재료;
    int 재료의_개수;
    int 가격;
    double 재료의_무게;
    boolean 포장;

    public void 마라탕_계산(){
        System.out.println("가격은 " + 가격 + "입니다");
    }
    public void 재료_계산(){
        System.out.println("재료는 " + 재료 + "입니다");
        System.out.println("재료의 무게는 " + 재료의_무게 + "입니다 ");
    }
}
// 희진
class Cart {
    String shape;   // 카트 모양
    int x;          // 카트 가로 길이
    int y;          // 카트 세로 길이
    int z;          // 카트 높이
    // 메소드 : 움직이기, 담기
}