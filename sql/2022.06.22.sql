-- CONCAT : �� ���ڸ� ����
select concat('DATA', 'BASE') from dual;

-- LENGTH : ������ ���̸� ��ȯ
-- LINGTHB : ������ ���̸� ��ȯ

select length('DataBase'), length('�����ͺ��̽�') from dual;
select lengthb('DataBase'), lengthb('�����ͺ��̽�') from dual;

-- ��] 10�� �μ� �Ҽ� ������� �̸��� ���̸� ���Ͽ� ����Ͻÿ�.
select deptno, empno, ename, length(ename) from emp where deptno=10;
-- ��] ������ �̸��� 4������ ������ �̸��� �ҹ��ڷ� ����Ͻÿ�.
select empno, lower(ename) from emp where length(ename)=4;
/*
    INSRT  : Ư�������� ��ġ ���� ��ȯ
    INSTRB : Ư�������� ��ġ ���� ��ȯ
*/
select instr('DataBase', 'a', 3, 2) from dual;
select instrb('�����ͺ��̽�', '��', 4, 2) from dual;

/*
    SUBSTR  : ���ڸ� �߶� ����
              ���ڿ� �Ϻθ� �����ϴ� �Լ�
    SUBSTRB : ���ڸ� �߶� ����
*/
select substr('DataBase', -1, 3) from dual;
-- select substr('��� ���ڿ�', ������ġ, ������ ����)

-- ��� ���̺��� 20�� �μ� ������� �Ի�⵵�� �����Ͻÿ�.
select ename, substr(hiredate, 1, 2) from emp where deptno=20;
-- 20�� �μ����� 87�⵵�� �Ի��� ����� ������ ����Ͻÿ�.
select ename, substr(hiredate, 1, 2) from emp where deptno=20 and substr(hiredate, 1, 2)=87;

select substr('�����ͺ��̽�', 2, 4) from dual;
select substrb('�����ͺ��̽�', 2, 4) from dual;

-- LPAD, RPAD : �Է¹��� ���ڿ��� ��ȣ�� �����Ͽ� Ư�� ���ڿ��� ���̸� ��ȯ��
select RPAD('�����ͺ��̽�', 20,'@') from dual;

select ename from emp where ename='SMITH';

select ename, trim('       Oracle ll        '), trim('H' from ename) from emp where ename='SMITH';
-- both : ���� �������� trim�� �⺻���� both

-- �����Լ� : ������ �����͸� �����Ͽ� ��ȯ�� ���� ���� ��ȯ�ϴ� �Լ�

/*
abs, cos, exp, floor, log, power, sign, sin, tan, round, trunc, mod
*/
select abs(-15) from dual;
select cos() from dual;
select sin(-1) from dual;
select tan() from dual;

select floor(34.5678) from dual;

select trunc(12.345, -3) from dual;

-- Ư�� �ڸ����� �ݿø��ϴ� �Լ�(round)
-- round(���, ǥ���� �ڸ���)
select round(35.12, 1), -- �Ҽ��� ���� 2��° �ڸ����� �ݿø�, �Ҽ������� ���ڸ����� ǥ��
round(21.125, 2), -- �Ҽ������� 3��° �ڸ����� �ݿø�
round(47.51),  -- 0��° �ڸ����� �ݿø� �Ҽ����� 1�ڸ� �ݿø� ��
round(834.12, -1), -- �ι�° ���ڰ��� �����̸� ���� �ڸ����� �ݿø���
round(653.54, -2) -- ���� �ڸ����� �ݿø���
from dual;

select power(3, 2) from dual;
select mod(34, 5) from dual;

-- ��] ����� ¦���� ������� �����ȣ, �̸�, ������ ����Ͻÿ�.
select empno, ename, job from emp where mod(empno,2)=0;

-- ��¥�Լ� : ��¥���� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
-- sysdate, months_betweens, add_months, next_day, last_day, round, trunc

select sysdate+1 from dual;
-- ��] �μ���ȣ�� 10�� ����� ������� �Ի��� ���κ��� ���ñ��� ��ĥ�� �����°�?
select ename, hiredate, sysdate-hiredate from emp;

select sysdate, hiredate, MONTHS_BETWEEN(SYSDATE,hiredate) from emp where deptno=10;
select hiredate, add_months(hiredate, 6) from emp;

select sysdate, next_day(sysdate, '������') from dual;

alter session set nls_language=american; -- �����϶�
alter session set nls_language=korean; -- �ѱ��϶�

-- LAST_DAY : �ش� ���� ������ ��¥�� ��ȯ��
select sysdate, last_day(sysdate) from dual;

-- trunc : ��¥�� �߶�
select hiredate from emp where deptno=10;
select hiredate, trunc(hiredate, 'MONTH') from emp where deptno=10;

-- round : �Լ��� ���� ���� �����Ƹ� ���� �̿ܿ� ��¥�� ���ؼ��� �ݿø��� ������ �� �ִ�.
-- round(date, 'MONTH');

-- �Ի����� �� �������� �� �ø�
select hiredate, round(hiredate, 'MONTH') from emp where deptno=10;

/*
�� : 7�� 1�Ϻ��� �ݿø�
�� : 16���� �������� �ݿø�
�� : �� �ְ� ���۵Ǵ� ��¥
*/

/*
��ȯ�Լ� : �ڷ����� ��ȯ��Ű���� �Ҷ� ����ϴ� �Լ�
    TO_CHAR : ��¥�� �Ǵ� �������� ���������� ��ȯ�Ҷ�
    TO_DATE : �������� ��¥������ ��ȯ�ϰ��� �Ҷ�
    TO_NUMBER : �������� ���������� ��ȯ�ϰ��� �Ҷ�
*/

-- TO_CHAR : ��¥�� �Ǵ� �������� ���������� ��ȯ�Ҷ�
/*
������� ����
    YYYY : �⵵ ǥ��(4�ڸ�)
    YY : �⵵ ǥ��(2�ڸ�)
    MM : �� ǥ��
    MON : ���� ���ĺ����� ǥ��
    DD : �� ǥ��
    DAY : ���� ǥ��
    DY : ���� ��� ǥ��
*/
select hiredate, to_char(hiredate, 'YYYY/MM/DD') from emp where deptno=20;
select sysdate, to_char(sysdate, 'YYYY/MM/DD DAY') from dual;

/*
�ð� ��� ������ ����

AM �Ǵ� PM : ����, ���� �ð� ǥ��
A.M �Ǵ� P.M : ����, ���� �ð� ǥ��
HH �Ǵ� HH12 : �ð�(1 ~ 12)
HH24 : 1 ~ 24 �ð����� ǥ��
MI : ��
SS : ��
*/
select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') from dual;

/*
    to_char : �������� ���������� ��ȯ
    
    ���� ��� ����
        0 : �ڸ����� ��Ÿ���� �ڸ����� ���� ���� ��� 0���� ä���
        9 : �ڸ����� ��Ÿ���� �ڸ����� ���� �ʾƵ� ä���� �ʴ´�.
        L : �� ������ ��ȭ ��ȣ�� �տ� ǥ���Ѵ�. $,��
        . : �Ҽ���
        , : õ ���� �ڸ� ����
        
    ����              ����              ���
    12345.67        999,999,999     12,345.67
    12345.67        999999          12345
    12345.67        $999,999,999    $12,345.67
    12345.67        L999,999,999    ��12,345.67
    12345.67        S999,999,999    +12,345.67
*/

select ename, sal from emp where deptno=10;
select ename, sal, to_char(sal, '$999,999') from emp where deptno=10;






