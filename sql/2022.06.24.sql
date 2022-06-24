select *from emp01;
insert into emp01(empno, ename, sal) values(2222, 'ceo', 6000);

select * from emp02;

create table emp02 as select * from emp;

/*
-- alter table  테이블명.       
*/

drop table emp01;
select * from tab;

desc recyclebin;

purge RECYCLEBIN;

flashback table "BIN$BQHfXWzXQMGAbBHQII+CAg==$0" to before drop;

rename emp02 to emp03;

select * from emp03;
rollback;
select * from emp02;

--- 테이블의 모든 행을 제거
truncate table emp03;
truncate table dept;

-------------------------------- END DDL(데이터 정의어)

-------------------------- START DML(데이터 조작어) ------------------------------

/*
새로운 행을 추가하는 INSERT INTO (C)

    특정한 컬럼에만 데이터를 입력하는 경우
    INSERT INTO 테이블명(컬럼명1, 컬럼명2) values(값1, 값2);
    
    모든 컬럼에 데이터를 입력하는 경우
    INSERT INTO 테이블명 VALUES(값1, 값2);
*/

create table dept01(
deptno number(2),
dname varchar(14),
loc varchar(13)
);
select * from dept;
-- 부서번호 : 10, 부서명 : ACCOUNTING, 지역 : NEW YORK을 추가하시오.
insert into dept01(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept01 values(20, 'RESEARCH', 'DALLAS');
insert into dept01(deptno, dname) values(30, 'SALES');

desc dept02;

create table dept02 as select * from dept;

select * from dept02;

create table emp04 (
deptno number(2) not null,
dname varchar(14),
loc varchar(13)
);
select * from emp04;

desc emp04;
select * from dept02;
insert into emp04 values(null, null, null);

select * from dept02;
insert into emp04 values(20, '', '');

drop table emp04;

create table emp01 as select * from emp;
select * from emp01;

/*
기존행을 수정하는 UPDATE SET(U)
형식
    UPDATE 테이블명 SET 컬럼명1=값1, 컬렴명2=값2 where 조건식
    
    어떤 행의 데이터를 수정하는지 where절을 이용하여 조건을 지정
    where 절을 사용하지 않으면 테이블에 있는 모든 행이 수정됨
*/
-- 모든 사원을 부서번호를 30번으로 수정
update emp01 set deptno=30;
rollback;

-- 모든 사원의 급여를 10% 인상
update emp01 set sal = sal*1.1;
select * from emp01;

-- 모든 사원의 입사일을 오늘로 수정
update emp01 set hiredate=sysdate;

-- 1987년에 입사한 사원의 입사일을 오늘로 수정
select * from emp01 where substr(hiredate, 1, 2)='87';
update emp01 set hiredate=sysdate where substr(hiredate, 1, 2)='87';
select * from emp01;
rollback;

-- SCOTT 사원의 부서번호를 10, 직급은 MANAGER로 수정하시오.

select deptno, job from emp01 where ename='SCOTT';
update emp01 set deptno=10, job='MANAGER' where ename='SCOTT';

/*
DELETE
    테이블에 특정 행을 삭제할때
    형식
        DELETE FROM 테이블명 where 조건
*/

select * from tab;
-- create table dept01 as
select * from dept01;
delete from dept01;

delete from dept01 where deptno='30';
-------------------------------end dml----------------------------

/*
트랜잭션(Transaction)
    - 데이터베이스에서 데이터를 처리하는 하나의 논리적인 작업단위를 의미함
    - 트랜잭션을 사용하는 이유 : 데이터의 일관성을 유지
                              안정적으로 데이터를 복구 시키기 위해
    insert, update, delete 명령
    
    commit 과 rollback
    
    commit
    - 모든 작업을 정상적으로 처리하겠다고 확정하는 명령어
      트랜잭션 처리 과정을 데이터베이스에 모두 반영함(변경된 내용을 모두 영구 저장)
      
    rollback
    - 작업 중 문제가 발생되어서 트랜잭션 처리 과정에서 발생한 변경 사항을 취소하는 명령
      데이터 처리가 시작되기 이전 상태로 되돌림
      
      마지막으로 커밋 명령 이후부터 새로운 커밋 명령을 실행하는 지점까지 수행된
      모든 DML 명령들을 의미함
*/
drop table dept01;

create table dept01 as select * from dept;
select * from dept01;

-- 부서번호 40번 삭제
delete from dept01 where deptno=40;
commit;

delete from dept01 where deptno=30;
savepoint c1;
delete from dept01 where deptno=20;
savepoint c2;
delete from dept01 where deptno=10;
savepoint c3;

rollback to c2;
rollback to c1;





