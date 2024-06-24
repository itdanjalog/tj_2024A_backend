# 데이터베이스 생성 
drop database if exists day04;	# 
create database day04;			# 
use day04;						# 

# 테이블 생성 
drop table if exists table1;				#
create table table1( 						#
	mno int , 								#
    mname varchar(30) not null unique 		#
);

# DML : 조작어 
# 1. INSERT 2. SELECT 3. UPDATE 4.DELETE 
# -   ( C )      (R)       (U)      (D)

# [1] INSERT : 레코드(행,튜플,가로단위) 삽입 
# 1. 모든 필드에 값 대입 : insert into 테이블명 values( 값1 , 값2 , 값3 ~~~ );		
insert into table1 values( 1 , '박명수');

# 2. 특정 필드에 값 대입 : insert into( 필드명 , 필드명 ) values( 값1 , 값2 );
insert into table1( mno , mname ) values( 2 , '유재석');
insert into table1( mname , mno ) values( '신동엽' , 3 );
insert into table1( mname ) values('서장훈');

# 3. 여러개의 레코드 삽입 : insert into( 필드명 , 필드명 ) values( 값1 , 값2 ), ( 값1 , 값2 ), ( 값1 , 값2);
insert into table1 values( 4 , '강호동'), ( 5 , '김희철' ) ;

# --- 확인 
select * from table1;

# [2] SELECT 			: 레코드(행,튜플,가로단위) 조회/검색/찾기 
# 1. 전체필드 조회 : select *(와일드카드) from 테이블명;				# * : 모든 필드를 조회 하는 전체 레코드 검색 
select * from table1;

# 2. 특정필드 조회 		: select 필드명1 , 필드명2 from 테이블명;
select mno from table1;
select mname from table1;
select mname , mno from table1;

# 3. 레코드 조건 조회 		: select 필드명1 , 필드명2 from 테이블명 where 조건절 
select * from table1 where mname = '유재석';						# = 같다.  ( java,js 처럼 =대입이 아니다 )
		# 테이블의 mname 필드내 '유재석'인 데이터의 레코드 검색 













