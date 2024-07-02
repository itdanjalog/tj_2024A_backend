drop database if exists day08;
create database day08;
use day08;
# 1. A 테이블 
create table table1(  num int ,   primary key ( num ) );
# 2. B 테이블 
create table table2(
	no int , primary key( no ) , num int , 
    foreign key( num ) references table1( num )
);
# 샘플 
insert into table1 values( 1 ) , ( 2 ) , ( 3 ) , ( 4 ) , ( 5 );
insert into table2 values( 1 , 1 ) , ( 2 , 2 ) , ( 3 , 1 ) , ( 4 , 1 ) , ( 5 , 2 ); 

# 확인 
select * from table1;
select * from table2;

# 1. 단일 테이블의 데이터 검색 
select * from table1; 	# 레코드 5개
select * from table2;	# 레코드 5개
select * from table1 where num = 1;
select * from table2 where num = 1;
# 2. 다중 테이블의 데이터 검색 : ,(쉼표) 이용한 테이블명 구분 
	# select * from 테이블명1 , 테이블명2 
	# select * from 테이블명1 , 테이블명2 where 테이블명1.필드명 = 조건값 
    # select * from 테이블명1 별칭 , 테이블명2 별칭 
		# 별칭 : 주로 테이블명,필드명 을 간추려 SQL 질의어 에서 사용할때 
select * from table1 , table2;	# 레코드 25개 , 첫번째테이블개수 * 두번째테이블개수 
select * from table1 , table2 where num = num;	# pk필드와 fk필드의 식별 불가능 해서 오류 발생 
select * from table1 , table2 where table1.num = table2.num;	# 5개
select * from table1 a , table2 b where a.num = b.num;			# 5개
# 왜? PK 와 FK 필드가 같은 경우를 검색하는지? 관계 를 찾기 위해서 

# 3. JOIN 절 
# 3-1 교집합 ->  두 개이상의 집합/테이블 이 공통된 수/데이터 찾기 , pk-fk 교집합 
# [1] where 절 
select * from table1 , table2 where table1.num = table2.num;
# [2] 테이블명1 natural join 테이블명2 
select * from table1 natural join table2;
# [3] 테이블명1 join 테이블명2 on 조인조건
select * from table1 join table2 on table1.num = table2.num;
# [4] 테이블명1 join 테이블명2 using( 필드명 )
select * from table1 join table2 using( num );
# [5]  테이블명1 inner join 테이블명2 on 조인조건
select * from table1 inner join table2 on table1.num = table2.num;

 
 


 
















