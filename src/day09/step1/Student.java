package day09.step1;

public class Student {
    // 1. 멤버변수/필드
        // 접근제한자 : public(공개용) , private(비공개용) : 다른 클래스로부터
        // 타입 : 1. 기본타입(int등등) , 2.참조타입( String등등)
        // 변수명 : 아무거나(임의)
        // 멤버변수의 초기값 : 객체 생성시 초기화 값이 없으면 자동으로 정수:0 , 실수:0.0 , boolean : false , 참조타입:null
        // 지역변수의 초기값 : 없으면 쓰레값/임의값 ;
            // 지역변수(함수/메소드 안에서 선언) vs 멤버변수(클래스안 메소드밖에서 선언된 변수)
    public String studentName;
    public int grade;
    public int money;
    // 2. 생성자 : 객체 생성(new) 할때 객체내 속성(멤버변수) 을 초기화할떄
        // 기본/디폴트 생성자는 클래스내 생성자 정의가 1개라도 존재하지 않을때 자동생성
        // 생성자는 메소드와 동일하지만 반환/리턴 값이 없고 호출방법이 다르다.
        // this : 1.매개변수명과 멤버변수명이 동일할때 멤버변수의 식별용 2.현재 메소드/생성자를 호출한 주체(객체)자
    public Student( String studentName , int money ){
        this.studentName = studentName;
        this.money = money;
    }
    // 3. 메소드 : 객체들간의 상호작용/협력 , 행위/행동
        // 해당 주체(학생) 가 요금(학생에포함) 을 내고 버스(수입에 요금 지출)를 탄다
    public void takeBus( Bus bus ){ // Bus타입 아직 정의하지 않았기때문에 빨간줄.
        bus.take(1000); // bus에 1000을 대입한다.
        this.money -= 1000;
    }
    public void takeSubway( Subway subway ){
        subway.take(1500);
        this.money -=1500;
    }
    public void takeTaxi( Taxi taxi ){
        taxi.take( 10000 );
        this.money -= 10000;
    }
        // 학생 정보 출력하는 함수
    public void showInfo(){}
        // 객체 출력시 객체의 주소값이 아닌 객체의 속성을 호출시 toString() 메소드 활용
            // 오른쪽 클릭 -> 생성 -> toString()
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", grade=" + grade +
                ", money=" + money +
                '}';
    }
}
