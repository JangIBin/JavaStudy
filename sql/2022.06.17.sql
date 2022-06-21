-- 테이블을 검색하는 명령
select * from tab;

-- 테이블 구조 확인 명령
desc emp;

/*
오라클 자료형
- 숫자형
  NUMBER(크기저장) : 기본 크기는 4byte
  DATE 날짜형 : 년, 월, 일, 시, 분, 초, 요일

- 문자형
  VARCHAR2(크기저장) : 
  CHAR(크기저장) : 
*/

select * from table;

-- select : 데이터 베이스 내에 있는 데이터를 조회하기 위한 명령이다.
-- * : 모든 컬럼(열)을 의미함.
-- 특정 컬럼(이름, 번호) empno, ename

select empno, ename, sal from emp;
-- from : 테이블 지정할때 from 다음에는 테이블명을 기입함.
select * from dept;
select * from emp;

-- emp 테이블에서 사원명(ename)과 급여(sal)와 입사일(hiredate)을 출력하는 쿼리문을 작성하시오.
select ename, sal, hiredate from emp;

-- 산술 연산자 : +, -, *, /
select ename, sal*12, from emp;
select max(sal) from emp;

/*
NULL도 데이터이다.
NULL의 의미
  1. 0도 아니고
  2. 빈 공간도 아니고
  3. 미 확정 값을 의미함
  4. 어떤 값인지 알 수 없지만 어떤 값이 존재하고 있다.
  5. ? 혹은 ∞ 의 의미도 있음
  6. 연산, 할당, 비교가 불가능하다.
*/

DESC dual;
/*
dual 테이블
- 한 행으로 결과를 출력하기 위한 테이블
- DUMMY 컬럼에는 한개의 문자만을 저장할 수 있는 x라는 값을 가진
  단 하나의 행만을 저장함
*/
select * from dept;
select 24*60*60 from dept;





