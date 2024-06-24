
// ---------------------------------   .JAVA파일 ---------------------------------
package day13.step1;

import java.util.ArrayList;

class 동물{
    String myName; // 멤버변수
    동물(){  myName = "동물";
        System.out.println("<<동물 생성자 탄생>>");
    } // 생성자
    void showMe(){System.out.println( "myName : " + myName );} // 메소드
}
class 조류 extends 동물{
    조류(){  myName = "조류";
        System.out.println("<<조류 생성자 탄생>>");
    }
}
class 참새 extends 조류{
    참새(){  myName = "참새";
        System.out.println("<<참새 생성자 탄생>>");
    }
}
class 닭 extends 조류{
    닭(){  myName = "닭";
        System.out.println("<<닭 생성자 탄생>>");
    }
}

public class Step1 {
    public static void main(String[] args) {

        동물 animal = new 동물();       animal.showMe();    // 동물
        조류 bird = new 조류();         bird.showMe();      // 조류
        참새 sparrow = new 참새();      sparrow.showMe();   // 참새

        // - 자동타입 변환                    : byte -> short -> int -> long
        // - 자식 타입은 부모타입으로 변환 가능
        동물 bird2 = new 조류();        bird2.showMe();
        동물 sparrow2 = new 참새();     sparrow2.showMe();
        // - 강제타입 변환 * 전제조건이 필요     : byte <- (byte)short <- (short)int <- (int)long
        // - 부모 타입은 자식타입으로 변환 불가능 , 단 상속관계이면 가능, 상하관계만 가능( 형제는 불가능 )
        // 조류 bird3 = new 동물();
        참새 sparrow3 = new 참새();
        동물 참새에서동물 = sparrow3;           // 자식타입 --> 부모타입
        참새 동물에서참새 = (참새)참새에서동물;     // 부모타입 --> 타입타입

        닭 chicken = new 닭();
        동물 닭에서동물 = chicken;             // 자식타입 --> 부모타입
        닭 동물에서닭 = (닭)닭에서동물;            // 부모타입 --> 자식타입

        // 닭 참새에서닭 = (닭)sparrow3;         // 형제관계 불가능.

        // 부모타입으로 배열/리스트를 선언하면 해당 배열/리스트에는 본인타입 포함 하위타입도 저장이 가능하다.
        ArrayList< 동물 > 동물사전 = new ArrayList<>();
        동물사전.add( animal ); 동물사전.add( bird ); 동물사전.add( sparrow );

        // 부모타입으로 배열/리스트를 선언하면 해당 배열/리스트에는 본인타입 포함 하위타입도 저장이 가능하다. 상위타입은 불가능.
        ArrayList< 조류 > 조류사전 = new ArrayList<>();
        // 조류사전.add( animal );
        조류사전.add( bird ); 조류사전.add( sparrow );

    }
}



// ---------------------------------   .JAVA파일 ---------------------------------