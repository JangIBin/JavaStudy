package com.inherex01;

/*
	��ӽ� ���� ����
	
	- ���� Ŭ�������� ����� ��������� ���� Ŭ�������� ������ ��� ������ ������
	  ���� Ŭ������ ��� ������ ���õ�
	  �̶�, ���� Ŭ������ ��������� ����ϱ� ���ؼ��� super��� Ű���带 �̿���
	  
	- ������ �̸����� ��� ������ ������ �̸��� �޼ҵ尡 �� Ŭ���� �ȿ� ���� �Ǵ� ���� ������ �߻���
 */

class SuperTest {
	
	protected double area;
	private String title;
	
	public SuperTest() {
		System.out.println("SuperTest() .. ���ڰ� ���� ������");
	}
	
	public SuperTest(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + " " + area);
	}
	
}

class Rect extends SuperTest {
	/*
	protected double area;
	public void write() {
		System.out.println(title + " " + area);
	}
	*/
	
	private int w, h;
	
	public Rect() {
//		super();
	}
	
	/*
		�޼ҵ� �������̵�
		
		- ���� Ŭ������ ��ӹ��� ���� Ŭ��������
		  ���� Ŭ������ ���ǵ� �޼ҵ带 ������ �ϴ� ���� �ǹ���.
		  
		  ��ü���� ���α׷��� Ư¡�� �������� ��Ÿ��
		  
		������
		- �ݵ�� ��Ӱ��迡 �־���ϸ�
		  �޼ҵ� �̸�, ����Ÿ��, �Ű������� ������ Ÿ���� ������ ��ġ�ؾ���  
	 */
	
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		
	}
	
	@Override
	public void write() {
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("�簢���� ���̴� " + area);
		
	}
}

class A_class {
	public A_class(int n) {
		
	}
}

class B_class extends A_class {
	public B_class() {
		super(10);
	}
}

/*
 	���� Ŭ����              �� ���� Ŭ����               ��   ���
 	===========================================================
 	�����ڸ� �������� ���� ����  �� ������ ���� ����            ��   �����ϴ�
 	                      �� ���ڰ� ���� ������          ��   �����ϴ�.
 	                      �� �μ��� �ִ� ������          ��   �����ϴ�.
 	============================================================
 	�μ��� ���� ������ ����     �� ������ ���� ����            ��   �����ϴ�.
 	                      �� �μ��� ���� ������          ��   �����ϴ�.
 	                      �� �μ��� �ִ� ������          ��   �����ϴ�.
 	============================================================
 	�μ��� �ִ� �����ڸ� ����    �� ������ ���� ����            ��  ���� �߻�
 	                      �� ������ ���� ������           �� ���� Ŭ������ �ش� �����ڸ� 
 	                                                  ȣ������ ������ ������ �߻�
 	                      �� �μ��� �ִ� ������           �� ���� Ŭ������ �ش� �����ڸ� 
 	                                                  ȣ������ ������ ������ �߻���
*/

public class InherExam01 {
	
	public static void main(String[] args) {

		Rect r = new Rect();
	}

}
