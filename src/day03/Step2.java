package day03;

import java.util.Scanner;

public class Step2 { // class s

    public static void main(String[] args) { // main s

        // 예제1 : 작성자 , 내용 , 나이 입력받아 형식에 맞추어 출력하시오.
        // 1. 입력객체
            // 1. Scanner 클래스 [ 입력시 자동완성( ctrl+스페이바 ) 권장 ]
                // - import java.util.Scanner; 자동완성시 자동코드 추가 , 아니면 직접 입력 해야됩니다.
                // - 현재 클래스외 다른 패키지로 부터 해당 클래스를 가져오기
                // { } 내 한번만 생성
        Scanner scanner = new Scanner( System.in );

        // 2. 입력받고 변수에 저장
        System.out.print("작성자 : ");     String 작성자 = scanner.next();
        scanner.nextLine(); // 의미없는 nextLine();
        System.out.print("방문록 : ");     String 방문록 = scanner.nextLine();
        System.out.print("나이 : ");      int 나이 = scanner.nextInt();

        // 3. 출력  println vs print vs printf
        System.out.printf(">>작성자 : %s \t 나이 : %3d \n" , 작성자 , 나이 );
        System.out.printf(">>방문록 : %s \n" , 방문록 );
            // VS
        System.out.println(">>작성자 : "+작성자+" \t 나이 : "+나이 );
        System.out.println(">>방문록 : "+방문록 );


        System.out.println("--------------------------------------------------");
        // 예제2 : 기본급 과 수당 을 정수로 입력받아 실수령액 계산해서 출력
            // 실수령액 계산식 : 기본급 + 수당 - 세금[기본급의 10%]

        // 1. 입력받고 변수에 저장
        System.out.print(">기본급 : ");    int 기본급 = scanner.nextInt();
        System.out.print(">수당 : ");     int 수당 = scanner.nextInt();

        // 2. 계산 , 강제형변환 생각!!
        int 실수령액  = 기본급 + 수당 - (int)(기본급*0.1); // 기본급(int) * 0.1(double) => double

        // 3.
        System.out.println("실수령액 = " + 실수령액);












    }// main e
} // class e

