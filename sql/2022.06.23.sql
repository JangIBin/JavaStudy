-- 올해 며칠이 지났는지 날짜를 계산하여 출력하시오.
select sysdate-'2022/01/01' from dual;
select trunc(sysdate-to_date('2022/01/01', 'YYYY/MM/DD')) from dual;
select sysdate-to_date('2022/01/01') from dual;
/*
일반함수 (기타함수)

NVL : 첫번째 인자로 받은 값이 NULL과 같으면 두 번째 인자 값으로 변경
DECODE : 첫번째 인자로 받은 값을 조건에 맞춰 변경(if 조건문과 유사함)
case : 조건에 맞는 문장을 수행함(switch 문과 유사함)

*/
-- NVL : NULL 값을 다른 값으로 변환하는 함수
--       NULL 0 또는 다른 값으로 변환하기 위해 사용하는 함수

select ename, sal, comm, job from emp order by job;

-- 연봉을 계산하기 위해서 급여에 12를 곱한 수 커미션을 더해보면 어떻게 될까
select ename, sal, comm, sal*12, sal*12+comm from emp order by job;

-- 유일하게 상관이 없는 사원이 있는 사람이 CEO
-- mgr의 NULL값을 CEO로 변환하여 출력

desc emp;
select ename, nvl(to_char(mgr, '9999'), 'CEO') ,mgr from emp;

select deptno from emp;
select distinct(deptno) from emp;
select deptno, dname from dept;
select * from emp;

/*
    조건에 맞는 문을 선택하기 위한 함수
    switch case 문과 같이 여러가지 경우에 대해서 선택할 수 있는 함수
    DECODE(표현식, 조건 1, 결과 1
                  조건 2, 결과 2
                  조건 3, 결과 3
                  기본결과 n
    )
*/
select deptno, decode(deptno, 10, 'ACCOUNTING',
                               20, 'RESEARCH',
                               30, 'SALES',
                               40, 'OPERATIONS') as DNAME from emp;
                               
/*
    CASE : 조건에 따라 서로 다른 처리가 가능한 함수
        표현식 WHEN 조건1 THEN 결과1
*/

select deptno, deptno,
                CASE WHEN deptno=10 THEN 'ACCOUNTING'
                     WHEN deptno=20 THEN 'RESEARCH'
                     WHEN deptno=30 THEN 'OPERATIONS'
                END
                DNAME from emp;
                
/*
문] 직급에 따라 보너스를 지급하기 위해 직급이 'MANAGER'인 사원은 15% 인상하고 
    직급이 'CLERK'인 사원은 5% 인상하도록 처리하시오 (DECODE, CASE 함수 사용)
*/
-- DECODE
select deptno, ename job, sal, decode(job, 'MANAGER', sal*1.15,
                                           'CLERK', sal*1.05,
                                           sal) as "UP SAL" from emp;


-- CASE
select deptno, ename, job, sal,
                    CASE WHEN job='MANAGER' THEN (sal*1.15)
                         WHEN job='CLERK' THEN (sal*1.05)
                         ELSE sal
                    END
                    "UP SAL" from emp;

select * from emp;
select trunc(avg(sal)) from emp;
select max(sal), min(sal) from emp;
select count(*), count(comm) from emp;
select count(comm) from emp where deptno=10;
select count(job) from emp;

/*
GROUP BY 절
    특정 컬럼 값을 기준으로 테이블을 그룹별로 나누기 위해 사용함
    형식 : select 컬럼명, 그룹함수 from 테이블명 where 조건식
    group by 컬럼명
*/
-- 사원들을 부서번호로 기준으로 3개
select deptno, sum(sal), avg(sal), max(sal), min(sal) from emp group by deptno;
select deptno, trunc(avg(sal)) from emp group by deptno HAVING avg(sal) >= 2000;
select deptno, max(sal), min(sal) from emp group by deptno HAVING max(sal) >= 2900;

select * from tab;
show user;

-- 테이블 스페이스 생성
create tablespace firstbank
datafile 'C:\app\dlqls\oradata\orcl\first01.dbf' size 10M;

-- 테이블 스페이스 수정
alter tablespace firstbank
add datafile 'C:\app\dlqls\oradata\orcl\first02.dbf' size 1M;

-- 데이터 파일의 크기를 자동화 시키는 방법
alter database
datafile 'C:\app\dlqls\oradata\orcl\first01.dbf'
AUTOEXTEND on
next 1M
maxsize 20m;

-- 테이블 스페이스 삭제
drop tablespace firstbank;

drop tablespace firstbank INCLUDING contents and datafiles;

select tablespace_name, status, contents from dba_tablespaces;

/*
create table 테이블명 (
    컬럼명 데이터자료형,
    컬럼명 데이터자료형,
    컬럼명 데이터자료형,
    컬럼명 데이터자료형
);

char : 고정길이 문자 데이터 최소 크기는 1, 크기 : 2000byte
varchar2 : 가변길이 문자 데이터 실제 입력된 문자열의 길이만큼 저장함 최소크기는 1, 크기 : 4000byte
number : 숫자형 데이터 최대 40자리까지 저장할 수 있음, 소수점이나 부호는 길이에 포함시키지 않음
number(w) : 지정한 자리까지 수치로 최대 38자리까지 가능함
number(w, d) : w는 전체자리수, d는 소수점이하 자릿수
date : 날짜 데이터를 저장(BC 4, AD 까지의 날짜)
long : 가변길이 문자형 데이터 타입, 최대크기 : 2GBYTE
lob : 2GB까지의 가변길이 바이너리 데이터를 저장시킴
      (바이너리 데이터 : 이미지 파일, 실행파일 여러가지 문서파일)
rowid : 데이터베이스에 저장되어 있지 않으며 데이터베이스 데이터도 아니다.

*/

select rowid from emp where rownum <= 5;

/*
테이블명과 컬럼명을 부여하기 위한 규칙
- 반드시 문자로 시작해야한다.
- 1 ~ 30까지 가능하다.
- A ~ Z까지의 대소문자, 0 ~ 9까지의 숫자, 특수 문자(_, $, #)만 가능함
- 공백을 허용하지 않는다.
- 예약어나 테이블명 중복 불가능하다.
*/

create table emp01 (
empno number(4),
ename varchar2(20),
sal number(7, 2)
);
desc emp01;










