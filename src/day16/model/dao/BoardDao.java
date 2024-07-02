package day16.model.dao;

import day16.controller.MemberController;
import day16.model.dto.BoardDto;
import day16.model.dto.ReplyDto;

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
            // String sql = "select * from board";// 1. SQL 작성
            String sql = "select * from board b inner join member m on b.mno = m.mno";
            ps = conn.prepareStatement( sql );// 2.SQL기재
            rs = ps.executeQuery();// 3. 기재된 sql 실행 하고 결과 반환
            while( rs.next() ) {// 4. 결과 레코드 전체를 하나씩 순회하기 // 레코드 1개당 --> Dto 1개
                // rs.next() : 다음 레코드 이동 , 존재하면 true , 없으면 false
                    // rs.getString("필드명") : 현재 레코드의 해당 필드명 값 호출
                String btitle = rs.getString("btitle");
                String bcontent = rs.getString("bcontent");
                String bdate = rs.getString("bdate");
                int bview = rs.getInt("bview");
                int mno = rs.getInt("mno");
                int bno = rs.getInt("bno");
                BoardDto boardDto = new BoardDto(btitle,bcontent,bdate,bview,mno,bno);  // Dto 1개 만들기
                boardDto.setMid( rs.getString("mid") );

                list.add( boardDto ); // 리스트에 dto 담기
                // return list; // -- 여러개 담긴 Dto 의 리스트를 반환
            }
            return list; // -- 여러개 담긴 Dto 의 리스트를 반환
        }catch (Exception e ){  System.out.println(e);}
        return list; // -- 여러개 담긴 Dto 의 리스트를 반환
    }

    // 6. 게시물 개별조회 함수
    public BoardDto bView( int bno ){
        try{ // 0.예외처리
            String sql = "select * from board where bno = ? ";// 1. SQL 작성
            ps = conn.prepareStatement(sql); // 2. SQL 기재
            ps.setInt( 1 , bno );// 3. 기재된 SQL ? 매개변수 대입
            rs = ps.executeQuery(); // 4. SQL 실행 후 결과 반환
            if( rs.next() ) { // 5. 결과에 따른 처리
                // - 현재 레코드들의 필드값 각 호출 해서 생성자에 매개변수로 대입
                BoardDto boardDto = new BoardDto(
                        rs.getString("btitle"), rs.getString("bcontent"),
                        rs.getString("bdate"),rs.getInt("bview"),
                        rs.getInt("mno"),rs.getInt("bno"));
                return boardDto; // - 생성된 boardDto 반환
            }
        }catch (Exception e ){ System.out.println(e); }
        return null; // - 오류 또는 게시물이 존재하지 않을때 null 반환
    }
    // 5. 게시물 쓰기 함수
    public boolean bWrite( BoardDto boardDto ) {
        try{ // 0. 예외처리
            String sql = "insert into board(btitle,bcontent,mno) " +
                    " values( ? , ? , ? ) ";// 1. SQL 작성
            ps = conn.prepareStatement(sql); // 2. sql 기재
            ps.setString( 1 , boardDto.getBtitle() ); // 3. 기재된 sql의 ? 매개변수 값 대입
            ps.setString( 2 , boardDto.getBcontent() );
            ps.setInt( 3 , boardDto.getMno() );
            int count = ps.executeUpdate(); // 4. sql 실행후 결과받기
            if( count == 1 ) { // 5. 결과에 따른 처리 // insert 결과 레코드가 1개 이면
                return true;
            }
        }catch (Exception e ){  System.out.println(e);   } return false;
    }
    // 7. 게시물 삭제 함수
    public boolean bDelete( int bno , int mno  ){
        try{ //0.예외처리
            String sql ="delete from board where bno = ? and mno = ? "; // 1. SQL 작성
            ps = conn.prepareStatement(sql); // 2. sql 기재
            ps.setInt( 1 , bno );// 3. 기재된 sql의 ? 매개변수 값 대입
            ps.setInt( 2 , mno );
            int count = ps.executeUpdate(); // 4. sql 실행 후 결과 받기
            if( count == 1 ) return true; // 5. 결과에 따른 반환처리
        }catch (Exception e ){ System.out.println(e);}
        return false;
    }

    // 8. 게시물 수정 함수
    public void bUpdate(){}

    // 9. 댓글 출력 함수
    public ArrayList<ReplyDto> rPrint(int bno ) {
        ArrayList<ReplyDto> list = new ArrayList<>(); // 여러개 ReplayDto 담을 리스트
        try{ // 0.예외처리
            String sql = "select * from reply where bno = ? ";// 1. SQL 작성
            ps = conn.prepareStatement(sql); // 2. SQL 기재
            ps.setInt( 1 , bno );// 3. 기재된 SQL 의 ? 매개변수 값 대입
            rs = ps.executeQuery(); // 4. sql 실행 후 결과 반환
            while ( rs.next() ){    // 5. 결과에 따른 처리 , rs.next() : 결과에서 다음 레코드 이동
                // - rs.get타입( "필드명" ) , rs.get타입( 필드번호 ) : 두 가지 방법 가능.
                ReplyDto replyDto = new ReplyDto(
                        rs.getString( "rcontent" ) , rs.getString( 2 ) ,
                        rs.getInt( 3 ) , rs.getInt( 4 ) , rs.getInt( 5 ) );
                // 생성된 dto를 리스트에 담기
                list.add( replyDto );
            }
        }  catch (Exception e ){ System.out.println( e );  }
        return list; // 리스트 반환
    }
    // 10. 댓글 쓰기 함수
    public boolean rWrite( ReplyDto replyDto ){
        try {
            String sql = "insert into reply(rcontent,mno,bno)values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString( 1 , replyDto.getRcontent() );
            ps.setInt( 2 , replyDto.getMno() );
            ps.setInt( 3 , replyDto.getBno() );
            int count = ps.executeUpdate();
            if( count == 1 ){ return true; }
        }catch (Exception e ){ System.out.println( e ); }
        return false;
    }
}











