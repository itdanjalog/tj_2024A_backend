drop database if exists day06;
create database day06;
use day06;

# 1. 회원테이블 
drop table if exists member;
create table member(		# 아이디 , 비밀번호 , 이름 , 연락처 , 가입일 , 회원번호( pk , ai )
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
create table board(			# 글제목,글내용,글작성일,글작성자,글조회수
	btitle varchar(100) not null ,
    bcontent longtext ,
    bdate datetime default now() , 
    bview smallint default 0 , 
    mno int  , 
    bno int auto_increment , 
    primary key( bno ) , 
    foreign key( mno ) references member( mno )
);
select * from board;

# 3. 댓글테이블 
drop table if exists reply;
create table reply(			# 댓글내용, 댓글작성일 , 댓글작성자
	rcontent varchar(200) not null ,
    rdate datetime default now() ,
    mno int ,
    bno int ,
    rno int auto_increment , 
    primary key( rno ) , 
    foreign key( mno ) references member(mno) ,
    foreign key( bno ) references board(bno)
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
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.1' , '내용입니다.1' , 1 );	# 유재석 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.2' , '내용입니다.2' , 5 );	# 강호동2 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.3' , '내용입니다.3' , 3 );	# 신동엽 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.4' , '내용입니다.4' , 1 );	# 유재석 이 쓴글 
INSERT INTO board( btitle , bcontent , mno ) VALUES( '제목입니다.5' , '내용입니다.5' , 5 );	# 강호동2 이 쓴글 
# 댓글 5개 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용1' , 1 , 1 );	# 1번 게시물의 유재석 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용2' , 5 , 1 );	# 1번 게시물의 강호동2 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용3' , 2 , 3 );	# 3번 게시물의 강호동 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용4' , 1 , 4 );	# 4번 게시물의 유재석 이 쓴 댓글 
INSERT INTO reply( rcontent , mno , bno ) VALUES( '댓글내용5' , 3 , 1 );	# 1번 게시물의 신동엽 이 쓴 댓글 










