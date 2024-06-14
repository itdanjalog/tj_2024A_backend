package day07.step1;

// 클래스의 사용처
    // 1. 객체의 설계도
    // 2. main함수 가지고 있는 실행클래스
// [1.사람 객체의 설계도 ]
public class Person {
    // 1. 멤버변수/필드
    String name;
    float height;
    float weight;
    // 2. 생성자 : 인스턴스/객체 생성될떄 실행되는 구역
        // 1. 생성자명은 클래스명과 동일
        // 2. 반환/return 이 없으므로 반환타입 생략한다.
        // 3. 디폴트/기본 생성자는 컴파일/실행 자동으로 생성된다.
            // - 클래스내 생성자가 1개도 없을때만 자동. 주의)
        // 4. 오버로딩 : 동일한 이름의 생성자을 여러개 선언이 선언할때
            // 매개변수의 타입,순서,개수 따라 식별 합니다.

    // 1. 기본생성자
    Person( ){ }
    // 2. 매개변수 1개 생상지
    Person( String pname ){
        name = pname;
            // name : 멤버변수
            // pname : 매개변수
    }
    Person( String pname , float pheight , float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
    // Person( String pname , float pweight  , float pheight){}
    // 3. 메소드/함수
    void person_(){ }

}
