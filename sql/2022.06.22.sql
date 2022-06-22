-- CONCAT : 두 문자를 연결
select concat('DATA', 'BASE') from dual;

-- LENGTH : 문자의 길이를 반환
-- LINGTHB : 문자의 길이를 반환

select length('DataBase'), length('데이터베이스') from dual;
select lengthb('DataBase'), lengthb('데이터베이스') from dual;

-- 문] 10번 부서 소속 사원들의 이름의 길이를 구하여 출력하시오.
select deptno, empno, ename, length(ename) from emp where deptno=10;
-- 문] 직원중 이름이 4글자인 직원의 이름을 소문자로 출력하시오.
select empno, lower(ename) from emp where length(ename)=4;
/*
    INSRT  : 특정문자의 위치 값을 반환
    INSTRB : 특정문자의 위치 값을 반환
*/
select instr('DataBase', 'a', 3, 2) from dual;
select instrb('데이터베이스', '이', 4, 2) from dual;

/*
    SUBSTR  : 문자를 잘라서 추출
              문자열 일부만 추출하는 함수
    SUBSTRB : 문자를 잘라서 추출
*/
select substr('DataBase', -1, 3) from dual;
-- select substr('대상 문자열', 시작위치, 추출할 개수)

-- 사원 테이블에서 20번 부서 사원들의 입사년도를 추출하시오.
select ename, substr(hiredate, 1, 2) from emp where deptno=20;
-- 20번 부서에서 87년도에 입사한 사원의 정보를 출력하시오.
select ename, substr(hiredate, 1, 2) from emp where deptno=20 and substr(hiredate, 1, 2)=87;

select substr('데이터베이스', 2, 4) from dual;
select substrb('데이터베이스', 2, 4) from dual;

-- LPAD, RPAD : 입력받은 문자열과 기호를 정렬하여 특정 문자열의 길이를 반환함
select RPAD('데이터베이스', 20,'@') from dual;

select ename from emp where ename='SMITH';

select ename, trim('       Oracle ll        '), trim('H' from ename) from emp where ename='SMITH';
-- both : 양쪽 공백제거 trim을 기본값은 both

-- 숫자함수 : 숫자형 데이터를 조작하여 변환된 숫자 값을 반환하는 함수

/*
abs, cos, exp, floor, log, power, sign, sin, tan, round, trunc, mod
*/
select abs(-15) from dual;
select cos() from dual;
select sin(-1) from dual;
select tan() from dual;

select floor(34.5678) from dual;

select trunc(12.345, -3) from dual;

-- 특정 자리순서 반올림하는 함수(round)
-- round(대상, 표시할 자릿수)
select round(35.12, 1), -- 소수점 이하 2번째 자리에서 반올림, 소수점이하 한자리까지 표시
round(21.125, 2), -- 소수점이하 3번째 자리에서 반올림
round(47.51),  -- 0번째 자리에서 반올림 소수이하 1자리 반올림 함
round(834.12, -1), -- 두번째 인자값이 음수이면 일의 자리에서 반올림함
round(653.54, -2) -- 십의 자리에서 반올림함
from dual;

select power(3, 2) from dual;
select mod(34, 5) from dual;

-- 문] 사번이 짝수인 사원들의 사원번호, 이름, 직급을 출력하시오.
select empno, ename, job from emp where mod(empno,2)=0;

-- 날짜함수 : 날짜값을 다른 형태로 변환하여 나타냄
-- sysdate, months_betweens, add_months, next_day, last_day, round, trunc

select sysdate+1 from dual;
-- 문] 부서번호가 10인 사원을 대상으로 입사한 날로부터 오늘까지 며칠이 지났는가?
select ename, hiredate, sysdate-hiredate from emp;

select sysdate, hiredate, MONTHS_BETWEEN(SYSDATE,hiredate) from emp where deptno=10;
select hiredate, add_months(hiredate, 6) from emp;

select sysdate, next_day(sysdate, '수요일') from dual;

alter session set nls_language=american; -- 영어일때
alter session set nls_language=korean; -- 한글일때

-- LAST_DAY : 해당 달의 마지막 날짜를 반환함
select sysdate, last_day(sysdate) from dual;

-- trunc : 날짜도 잘라냄
select hiredate from emp where deptno=10;
select hiredate, trunc(hiredate, 'MONTH') from emp where deptno=10;

-- round : 함수에 형식 모델을 지저아면 숫자 이외에 날짜에 대해서도 반올림을 적용할 수 있다.
-- round(date, 'MONTH');

-- 입사일을 월 기준으로 반 올림
select hiredate, round(hiredate, 'MONTH') from emp where deptno=10;

/*
년 : 7월 1일부터 반올림
월 : 16일을 기준으로 반올림
일 : 한 주가 시작되는 날짜
*/

/*
변환함수 : 자료형을 변환시키고자 할때 사용하는 함수
    TO_CHAR : 날짜형 또는 숫자형을 문자형으로 변환할때
    TO_DATE : 문자형을 날짜형으로 변환하고자 할때
    TO_NUMBER : 문자형을 숫자형으로 변환하고자 할때
*/

-- TO_CHAR : 날짜형 또는 숫자형을 문자형으로 변환할때
/*
출력형식 종류
    YYYY : 년도 표시(4자리)
    YY : 년도 표시(2자리)
    MM : 월 표시
    MON : 월을 알파벳으로 표시
    DD : 일 표시
    DAY : 요일 표시
    DY : 요일 약어 표시
*/
select hiredate, to_char(hiredate, 'YYYY/MM/DD') from emp where deptno=20;
select sysdate, to_char(sysdate, 'YYYY/MM/DD DAY') from dual;

/*
시간 출력 형식의 종류

AM 또는 PM : 오전, 오후 시간 표시
A.M 또는 P.M : 오전, 오후 시간 표시
HH 또는 HH12 : 시간(1 ~ 12)
HH24 : 1 ~ 24 시간으로 표시
MI : 분
SS : 초
*/
select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') from dual;

/*
    to_char : 숫자형을 문자형으로 변환
    
    숫자 출력 형식
        0 : 자릿수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다
        9 : 자릿수를 나타내며 자릿수가 맞지 않아도 채우지 않는다.
        L : 각 지역별 통화 기호를 앞에 표시한다. $,￦
        . : 소수점
        , : 천 단위 자리 구분
        
    숫자              형식              결과
    12345.67        999,999,999     12,345.67
    12345.67        999999          12345
    12345.67        $999,999,999    $12,345.67
    12345.67        L999,999,999    ￦12,345.67
    12345.67        S999,999,999    +12,345.67
*/

select ename, sal from emp where deptno=10;
select ename, sal, to_char(sal, '$999,999') from emp where deptno=10;






