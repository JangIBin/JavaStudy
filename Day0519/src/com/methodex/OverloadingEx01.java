package com.methodex;

/*
	- ������(�ϳ���)Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ���� �� ���ǵǴ� ���� �ǹ���
	- ���� �̸��� �޼ҵ忡 ����(�Ű�����)�� �ٸ� ���
	- ���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, �ڷ����� �ٸ��ų�, ������ ���� �ٸ����� �ǹ���
	- ���� �������� ����� ������ �����ϴ� �޼ҵ���� ��� �̸��� ���� ����� �ϰ����� �����ϱ� ����
	
	����������  ��ȯ��   �޼ҵ��(�ڷ��� ����, �ڷ��� ����, ...)
		1. ���������ڿ� ��ȯ���� �������
		2. �޼ҵ� �̸��� �ݵ�� ���ƾ��Ѵ�. (�����ؾ���)
		3. �ڷ����̳� ������ ������ �ݵ�� �ٸ��� �ؾ���
 */

public class OverloadingEx01 {

	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ���� : " + s.length());
	}
	public void floatLength(double d) {
		String s = String.valueOf(d);
		System.out.println("�Է��� ���� ���� : " + s.length());
	}
	public void stringLength(String a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ���� : " + s.length());
	}
	
	
	public static void main(String[] args) {

		OverloadingEx01 oe = new OverloadingEx01();
		oe.intLength(12);
		oe.floatLength(12.34);
		oe.stringLength("1234");
		
	}

}
