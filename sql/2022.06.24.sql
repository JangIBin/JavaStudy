select *from emp01;
insert into emp01(empno, ename, sal) values(2222, 'ceo', 6000);

select * from emp02;

create table emp02 as select * from emp;

/*
-- alter table  ���̺��.       
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

--- ���̺��� ��� ���� ����
truncate table emp03;
truncate table dept;

-------------------------------- END DDL(������ ���Ǿ�)

-------------------------- START DML(������ ���۾�) ------------------------------

/*
���ο� ���� �߰��ϴ� INSERT INTO (C)

    Ư���� �÷����� �����͸� �Է��ϴ� ���
    INSERT INTO ���̺��(�÷���1, �÷���2) values(��1, ��2);
    
    ��� �÷��� �����͸� �Է��ϴ� ���
    INSERT INTO ���̺�� VALUES(��1, ��2);
*/

create table dept01(
deptno number(2),
dname varchar(14),
loc varchar(13)
);
select * from dept;
-- �μ���ȣ : 10, �μ��� : ACCOUNTING, ���� : NEW YORK�� �߰��Ͻÿ�.
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
�������� �����ϴ� UPDATE SET(U)
����
    UPDATE ���̺�� SET �÷���1=��1, �÷Ÿ�2=��2 where ���ǽ�
    
    � ���� �����͸� �����ϴ��� where���� �̿��Ͽ� ������ ����
    where ���� ������� ������ ���̺� �ִ� ��� ���� ������
*/
-- ��� ����� �μ���ȣ�� 30������ ����
update emp01 set deptno=30;
rollback;

-- ��� ����� �޿��� 10% �λ�
update emp01 set sal = sal*1.1;
select * from emp01;

-- ��� ����� �Ի����� ���÷� ����
update emp01 set hiredate=sysdate;

-- 1987�⿡ �Ի��� ����� �Ի����� ���÷� ����
select * from emp01 where substr(hiredate, 1, 2)='87';
update emp01 set hiredate=sysdate where substr(hiredate, 1, 2)='87';
select * from emp01;
rollback;

-- SCOTT ����� �μ���ȣ�� 10, ������ MANAGER�� �����Ͻÿ�.

select deptno, job from emp01 where ename='SCOTT';
update emp01 set deptno=10, job='MANAGER' where ename='SCOTT';

/*
DELETE
    ���̺� Ư�� ���� �����Ҷ�
    ����
        DELETE FROM ���̺�� where ����
*/

select * from tab;
-- create table dept01 as
select * from dept01;
delete from dept01;

delete from dept01 where deptno='30';
-------------------------------end dml----------------------------

/*
Ʈ�����(Transaction)
    - �����ͺ��̽����� �����͸� ó���ϴ� �ϳ��� ������ �۾������� �ǹ���
    - Ʈ������� ����ϴ� ���� : �������� �ϰ����� ����
                              ���������� �����͸� ���� ��Ű�� ����
    insert, update, delete ���
    
    commit �� rollback
    
    commit
    - ��� �۾��� ���������� ó���ϰڴٰ� Ȯ���ϴ� ��ɾ�
      Ʈ����� ó�� ������ �����ͺ��̽��� ��� �ݿ���(����� ������ ��� ���� ����)
      
    rollback
    - �۾� �� ������ �߻��Ǿ Ʈ����� ó�� �������� �߻��� ���� ������ ����ϴ� ���
      ������ ó���� ���۵Ǳ� ���� ���·� �ǵ���
      
      ���������� Ŀ�� ��� ���ĺ��� ���ο� Ŀ�� ����� �����ϴ� �������� �����
      ��� DML ��ɵ��� �ǹ���
*/
drop table dept01;

create table dept01 as select * from dept;
select * from dept01;

-- �μ���ȣ 40�� ����
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





