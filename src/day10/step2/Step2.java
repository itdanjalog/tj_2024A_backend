package day10.step2;

import java.util.ArrayList;

public class Step2 {
    public static void main(String[] args) {

        // [1] 문자열 10개 저장 , 배열은 고정길이 , 길이보다 커지거나 작아지면 복잡해진다.
        String[] strArray = new String[10];
            strArray[0] = "자바";
            strArray[1] = "파이썬";

        // [2] 문자열 N개 저장 , 가변길이 ,
        // ArrayList< 리스트에저장되는타입 > 리스트변수명 = new ArrayList<>();
        ArrayList< String > strList = new ArrayList<>(); // 기본길이는 10개
            strList.add("자바");
            strList.add("파이썬");

        // [3] p.224
        ArrayList< Book > library = new ArrayList<>();

        Book b1 = new Book("태백산맥","조정래"); // 객체/힙 (주소) 생성
        library.add( b1 );
        library.add( new Book("데미안" , "헤르만 허세") );
        library.add( new Book("어떻게 살 것인가" , "유시민") );
        library.add( new Book("토지" , "박경리") );
        library.add( new Book("어린왕자" , "생텍쥐페리") );

        // 리스트 순회하는 방법1
        // for( int 반복변수명 = 0 ; i<리스트.size() ; i++ ){ }
        for( int i = 0 ; i < library.size() ; i++ ){
            Book book = library.get(i);
            System.out.println( book );
        }
        // 리스트 순회하는 방법2 ( 향상된 for문 )
        // for( 타입 반복변수명 : 리스트 ) { }    , 리스트내 요소를 하나씩 변수에 대입하면서 반복
        for( Book book : library ){
            System.out.println( book );
        }
        // 리스트 순회하는 방법3 ( forEach 함수 - 스트림 함수 )
        // 리스트명.forEach( 반복변수명 -> 실행문 );
        library.forEach( book -> System.out.println( book ) );

        //
        library.clear();
    }
}
