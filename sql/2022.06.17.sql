-- ���̺��� �˻��ϴ� ���
select * from tab;

-- ���̺� ���� Ȯ�� ���
desc emp;

/*
����Ŭ �ڷ���
- ������
  NUMBER(ũ������) : �⺻ ũ��� 4byte
  DATE ��¥�� : ��, ��, ��, ��, ��, ��, ����

- ������
  VARCHAR2(ũ������) : 
  CHAR(ũ������) : 
*/

select * from table;

-- select : ������ ���̽� ���� �ִ� �����͸� ��ȸ�ϱ� ���� ����̴�.
-- * : ��� �÷�(��)�� �ǹ���.
-- Ư�� �÷�(�̸�, ��ȣ) empno, ename

select empno, ename, sal from emp;
-- from : ���̺� �����Ҷ� from �������� ���̺���� ������.
select * from dept;
select * from emp;

-- emp ���̺��� �����(ename)�� �޿�(sal)�� �Ի���(hiredate)�� ����ϴ� �������� �ۼ��Ͻÿ�.
select ename, sal, hiredate from emp;

-- ��� ������ : +, -, *, /
select ename, sal*12, from emp;
select max(sal) from emp;

/*
NULL�� �������̴�.
NULL�� �ǹ�
  1. 0�� �ƴϰ�
  2. �� ������ �ƴϰ�
  3. �� Ȯ�� ���� �ǹ���
  4. � ������ �� �� ������ � ���� �����ϰ� �ִ�.
  5. ? Ȥ�� �� �� �ǹ̵� ����
  6. ����, �Ҵ�, �񱳰� �Ұ����ϴ�.
*/

DESC dual;
/*
dual ���̺�
- �� ������ ����� ����ϱ� ���� ���̺�
- DUMMY �÷����� �Ѱ��� ���ڸ��� ������ �� �ִ� x��� ���� ����
  �� �ϳ��� �ุ�� ������
*/
select * from dept;
select 24*60*60 from dept;





