package day16.model.dao;

import day16.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {
    // --- 싱글톤
    private static BoardDao bDao = new BoardDao();
    private BoardDao(){
        try { // - DB 연동
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/day06", "root","1234"  );
        }catch (Exception e ){  System.out.println(e);}
    }
    public static BoardDao getInstance(){ return bDao;  }

    // --- JDBC 인터페이스
    Connection conn; PreparedStatement ps;   ResultSet rs;

    // 4. 게시판(게시물전체출력) 함수 : 매개변수:x , 리턴값 : 여러개 게시물 -> 여러개 레코드 -> 여러개 DTO
    public ArrayList<BoardDto> bPrint( ) {
        // - 여러개 DTO 담을 리스트 선언
        ArrayList<BoardDto> list = new ArrayList<>();
        try{// 0.예외처리
            String sql = "select * from board";// 1. SQL 작성
            ps = conn.prepareStatement( sql );// 2.SQL기재
            rs = ps.executeQuery();// 3. 기재된 sql 실행 하고 결과 반환
            while( rs.next() ) {// 4. 결과 레코드 전체를 하나씩 순회하기 // 레코드 1개당 --> Dto 1개
                // rs.next() : 다음 레코드 이동 , 존재하면 true , 없으면 false
                    // rs.getString("필드명") : 현재 레코드의 해당 필드명 값 호출
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bdate = rs.getString("bdate");
                int bview = rs.getInt("bview");
                int mno = rs.getInt("mno"); int bno = rs.getInt("bno");

                BoardDto boardDto = new BoardDto(btitle,bcontent,bdate,bview,mno,bno);  // Dto 1개 만들기
                list.add( boardDto ); // 리스트에 dto 담기
                // return list; // -- 여러개 담긴 Dto 의 리스트를 반환
            }
            return list; // -- 여러개 담긴 Dto 의 리스트를 반환
        }catch (Exception e ){  System.out.println(e);}
        return list; // -- 여러개 담긴 Dto 의 리스트를 반환
    }
}
