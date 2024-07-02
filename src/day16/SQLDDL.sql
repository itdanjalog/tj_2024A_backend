drop database if exists day06;
create database day06;
use day06;

# 1. 회원테이블 
drop table if exists member;
create table member(      # 아이디 , 비밀번호 , 이름 , 연락처 , 가입일 , 회원번호( pk , ai )
   mid varchar(30) not null unique , 
    mpwd varchar(30) not null , 
    mname varchar(20) not null ,
    mphone varchar(15) not null ,
    mdate datetime default now(),
    mno int auto_increment , 
    primary key( mno )
); 
select * from member; -- 확인용 

# 2. 게시물테이블
drop table if exists board;
create table board(         # 글제목,글내용,글작성일,글작성자,글조회수
   btitle varchar(100) not null ,
    bcontent longtext ,
    bdate datetime default now() , 
    bview smallint default 0 , 
    mno int  , 
    bno int auto_increment , 
    primary key( bno ) , 
    foreign key( mno ) references member( mno ) 
    on delete cascade on update cascade # 회원의 pk값이 삭제/수정하면 게시물fk 어떻게 할껀지.. 제약조건옵션 설정하기  
);
select * from board;

# 3. 댓글테이블 
drop table if exists reply;
create table reply(         # 댓글내용, 댓글작성일 , 댓글작성자
   rcontent varchar(200) not null ,
    rdate datetime default now() ,
    mno int ,
    bno int ,
    rno int auto_increment , 
    primary key( rno ) , 
    foreign key( mno ) references member(mno) on delete cascade on update cascade ,
    foreign key( bno ) references board(bno) on delete cascade on update cascade
);
select * from reply;
# ERR 다이어그램 확인 
# 샘플 데이터 등록 
# 회원 5명 
INSERT INTO member( mid , mpwd , mname , mphone ) VALUES( 'qwe1' , '1234' , '유재석' , '010-0000-0000');
INSERT INTO member( mid , mpwd , mname , mphone ) VALUES( 'qwe2' , '1234' , '강호동' , '010-1111-1111');
INSERT INTO member( mid , mpwd , mname , mphone ) VALUES( 'qwe3' , '1234' , '신동엽' , '010-2222-2222');
INSERT INTO member( mid , mpwd , mname , mphone ) VALUES( 'qwe4' , '1234' , '유재석2' , '010-3333-3333');
INSERT INTO member( mid , mpwd , mname , mphone ) VALUES( 'qwe5' , '1234' , '강호동2' , '010-4444-4444');
# 게시물 5개
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.1' , '내용입니다.1' , 1 );   # 유재석 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.2' , '내용입니다.2' , 5 );   # 강호동2 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.3' , '내용입니다.3' , 3 );   # 신동엽 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.4' , '내용입니다.4' , 1 );   # 유재석 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.5' , '내용입니다.5' , 5 );   # 강호동2 이 쓴글 
# 댓글 5개 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용1' , 1 , 1 );   # 1번 게시물의 유재석 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용2' , 5 , 1 );   # 1번 게시물의 강호동2 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용3' , 2 , 3 );   # 3번 게시물의 강호동 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용4' , 1 , 4 );   # 4번 게시물의 유재석 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용5' , 3 , 1 );   # 1번 게시물의 신동엽 이 쓴 댓글 

# 검색
# 1. 전체 검색 
SELECT * FROM member;
# 2. 조건 검색 
SELECT * FROM member where mno = 1; -- mno가 '1'인 회원 레코드 검색 
SELECT * FROM member where mid = 'qwe1'; -- mid가 'qwe1'인 회원 레코드 검색
SELECT * FROM member where mphone = '010-0000-0000'; -- mphone가 '010-0000-0000'인 회원레코드 검색 
# 아이디찾기 / 비교 ( 회원명과 연락처가 동일한 회원 검색 )
# 비교연산자 : >초과 <미만 >=이상 <=이하 =같다 !=같지않다.   # 관계연산자 : and or not      vs   java : &&  ||  !
SELECT * FROM member where mname = '유재석' and mphone = '010-0000-0000';  #  mysql :  a = 1 and b = 2   vs  java : a == 1 && b == 2 
   # JDBC의 DAO SQL 작성시 : SELECT * FROM member where mname = ? and mphone = ?;
# 비밀번호찾기 / 비교 ( 아이디와 연락처가 동일한 회원 검색 )
SELECT * FROM member where mid = 'qwe1' and mphone = '010-0000-0000';
   # JDBC의 DAO SQL 작성시 : SELECT * FROM member where mid = ? and mphone = ?;
# 로그인 / 비교 ( 아이디와 비밀번호가 동일한 회원 검색 )
SELECT * FROM member where mid = 'qwe1' and mpwd = '1234'; 
   # JDBC의 DAO SQL 작성시 : SELECT * FROM member where mid = ? and mpwd = ?;
    
# 탈퇴 
# 1. 회원번호가 '0' 인 회원 삭제
delete from member where mno = 0;
# 2. 회원번호가 '0' 이면서 비밀번호가 '1' 인 회원 삭제 
delete from member where mno = 0 and mpwd = 1;
# JDBC SQL : delete from member where mno = ? and mpwd = ?;

# 수정
# 1. 회원번호가 '0' 인 회원 레코드의 이름을 '유재석'으로 수정 
update member set mname = '유재석' where mno = 0;
# 2. 회원번호가 '0' 인 회원 레코드의 이름을 '유재석' ,(쉼표)구분 해서  연락처를 '010-9999-9999' 으로 수정
update member set mname = '유재석' , mphone = '010-9999-9999' where mno = 0;
# JDBC SQL : update member set mname = ? , mphone = ? where mno = ?;

# 조회 
# 1. 전체 조회
select * from board;
# 2. 개별 조회 ( 조건 )
select * from board where bno = 3;	# 3번 게시물 개별 조회

# 삭제 
delete from board where bno = 0 ; # 0번 게시물을 삭제 
# 작성자번호 가 0 이면서 게시물번호가 0 인 게시물/레코드 삭제
delete from board where bno = 0 and mno = 0; 	

# 수정 

# 댓글 출력/조회
select * from reply; # 댓글 전체 출력 
select * from reply where mno = 1; # 회원번호가 '1'인 회원이 작성한 댓글들
select * from reply where bno = 1; # 게시물번호가 '1'인 게시물의 작성된 댓글들

# 댓글 쓰기 

# 게시물 출력
use day06;	select * from board;
# 게시물 출력시 mno 가 아닌 mid 출력 
	# 1. 두 테이블을 출력한다.
select * from board , member;
	# 2. 두 테이블의 관계 기준으로 (내부/교집합)조인한다.
select * from board , member where board.mno = member.mno;
select * from board natural join member;
select * from board join member on board.mno = member.mno;
select * from board join member using( mno );
select * from board inner join member on board.mno = member.mno;
	# 테이블명을 간소화 할때 : 별칭 , 테이블명 뒤에 별칭/별명 작성 
select * from board b inner join member m on b.mno = m.mno;

# 댓글 출력
select * from reply;
select * from reply r inner join member m on r.mno = m.mno;
# 조건 
select * from reply r inner join member m on r.mno = m.mno where r.bno = 1;


#









 










        