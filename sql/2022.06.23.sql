-- ���� ��ĥ�� �������� ��¥�� ����Ͽ� ����Ͻÿ�.
select sysdate-'2022/01/01' from dual;
select trunc(sysdate-to_date('2022/01/01', 'YYYY/MM/DD')) from dual;
select sysdate-to_date('2022/01/01') from dual;
/*
�Ϲ��Լ� (��Ÿ�Լ�)

NVL : ù��° ���ڷ� ���� ���� NULL�� ������ �� ��° ���� ������ ����
DECODE : ù��° ���ڷ� ���� ���� ���ǿ� ���� ����(if ���ǹ��� ������)
case : ���ǿ� �´� ������ ������(switch ���� ������)

*/
-- NVL : NULL ���� �ٸ� ������ ��ȯ�ϴ� �Լ�
--       NULL 0 �Ǵ� �ٸ� ������ ��ȯ�ϱ� ���� ����ϴ� �Լ�

select ename, sal, comm, job from emp order by job;

-- ������ ����ϱ� ���ؼ� �޿��� 12�� ���� �� Ŀ�̼��� ���غ��� ��� �ɱ�
select ename, sal, comm, sal*12, sal*12+comm from emp order by job;

-- �����ϰ� ����� ���� ����� �ִ� ����� CEO
-- mgr�� NULL���� CEO�� ��ȯ�Ͽ� ���

desc emp;
select ename, nvl(to_char(mgr, '9999'), 'CEO') ,mgr from emp;

select deptno from emp;
select distinct(deptno) from emp;
select deptno, dname from dept;
select * from emp;

/*
    ���ǿ� �´� ���� �����ϱ� ���� �Լ�
    switch case ���� ���� �������� ��쿡 ���ؼ� ������ �� �ִ� �Լ�
    DECODE(ǥ����, ���� 1, ��� 1
                  ���� 2, ��� 2
                  ���� 3, ��� 3
                  �⺻��� n
    )
*/
select deptno, decode(deptno, 10, 'ACCOUNTING',
                               20, 'RESEARCH',
                               30, 'SALES',
                               40, 'OPERATIONS') as DNAME from emp;
                               
/*
    CASE : ���ǿ� ���� ���� �ٸ� ó���� ������ �Լ�
        ǥ���� WHEN ����1 THEN ���1
*/

select deptno, deptno,
                CASE WHEN deptno=10 THEN 'ACCOUNTING'
                     WHEN deptno=20 THEN 'RESEARCH'
                     WHEN deptno=30 THEN 'OPERATIONS'
                END
                DNAME from emp;
                
/*
��] ���޿� ���� ���ʽ��� �����ϱ� ���� ������ 'MANAGER'�� ����� 15% �λ��ϰ� 
    ������ 'CLERK'�� ����� 5% �λ��ϵ��� ó���Ͻÿ� (DECODE, CASE �Լ� ���)
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
GROUP BY ��
    Ư�� �÷� ���� �������� ���̺��� �׷캰�� ������ ���� �����
    ���� : select �÷���, �׷��Լ� from ���̺�� where ���ǽ�
    group by �÷���
*/
-- ������� �μ���ȣ�� �������� 3��
select deptno, sum(sal), avg(sal), max(sal), min(sal) from emp group by deptno;
select deptno, trunc(avg(sal)) from emp group by deptno HAVING avg(sal) >= 2000;
select deptno, max(sal), min(sal) from emp group by deptno HAVING max(sal) >= 2900;

select * from tab;
show user;

-- ���̺� �����̽� ����
create tablespace firstbank
datafile 'C:\app\dlqls\oradata\orcl\first01.dbf' size 10M;

-- ���̺� �����̽� ����
alter tablespace firstbank
add datafile 'C:\app\dlqls\oradata\orcl\first02.dbf' size 1M;

-- ������ ������ ũ�⸦ �ڵ�ȭ ��Ű�� ���
alter database
datafile 'C:\app\dlqls\oradata\orcl\first01.dbf'
AUTOEXTEND on
next 1M
maxsize 20m;

-- ���̺� �����̽� ����
drop tablespace firstbank;

drop tablespace firstbank INCLUDING contents and datafiles;

select tablespace_name, status, contents from dba_tablespaces;

/*
create table ���̺�� (
    �÷��� �������ڷ���,
    �÷��� �������ڷ���,
    �÷��� �������ڷ���,
    �÷��� �������ڷ���
);

char : �������� ���� ������ �ּ� ũ��� 1, ũ�� : 2000byte
varchar2 : �������� ���� ������ ���� �Էµ� ���ڿ��� ���̸�ŭ ������ �ּ�ũ��� 1, ũ�� : 4000byte
number : ������ ������ �ִ� 40�ڸ����� ������ �� ����, �Ҽ����̳� ��ȣ�� ���̿� ���Խ�Ű�� ����
number(w) : ������ �ڸ����� ��ġ�� �ִ� 38�ڸ����� ������
number(w, d) : w�� ��ü�ڸ���, d�� �Ҽ������� �ڸ���
date : ��¥ �����͸� ����(BC 4, AD ������ ��¥)
long : �������� ������ ������ Ÿ��, �ִ�ũ�� : 2GBYTE
lob : 2GB������ �������� ���̳ʸ� �����͸� �����Ŵ
      (���̳ʸ� ������ : �̹��� ����, �������� �������� ��������)
rowid : �����ͺ��̽��� ����Ǿ� ���� ������ �����ͺ��̽� �����͵� �ƴϴ�.

*/

select rowid from emp where rownum <= 5;

/*
���̺��� �÷����� �ο��ϱ� ���� ��Ģ
- �ݵ�� ���ڷ� �����ؾ��Ѵ�.
- 1 ~ 30���� �����ϴ�.
- A ~ Z������ ��ҹ���, 0 ~ 9������ ����, Ư�� ����(_, $, #)�� ������
- ������ ������� �ʴ´�.
- ���� ���̺�� �ߺ� �Ұ����ϴ�.
*/

create table emp01 (
empno number(4),
ename varchar2(20),
sal number(7, 2)
);
desc emp01;










