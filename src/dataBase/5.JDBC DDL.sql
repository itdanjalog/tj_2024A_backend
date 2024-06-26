drop database if exists day05;
create database day05;
use day05;

drop table if exists table1;
create table table1(name varchar(100) );

# 테이블에 레코드 추가 
insert into table1 values('유재석');
# 테이블의 레코드 검색 
select * from table1;
# 테이블에 특정조건에 따른 레코드 수정 
update table1 set name = '신동엽2' where name = '신동엽'; 
# 테이블에 특정조건에 따른 레코드 삭제 
delete from table1 where name = '유재석';


