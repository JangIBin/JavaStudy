package methodex;

/*
 *  �޼ҵ�
 *  
 *   1. �޼ҵ�(��� �Լ�) : ��ü�� �� �� �ִ� ���۵��� ����
 *   				    �޼ҵ��� ������ �ΰ����� ���� ���´�.
 *   					1. �ν��Ͻ� �޼ҵ�
 *   					2. static �޼ҵ�
 */

public class MethodEx01 {

	public int add(int i, int j) {
		return i + j;
	}
	
	public int sub(int i, int j) {
		return i - j;
	}
	
	public int mul(int i, int j) {
		return i * j;
	}
	
	public int div(int i, int j) {
		return i / j;
	}
	
	public static void main(String[] args) {
		
		MethodEx01 me = new MethodEx01();
		
		int i = 10;
		int j = 10;
		
		int a , b, c, d;
		a = me.add(i, j); // ����
		b = me.sub(i, j);
		c = me.mul(i, j);
		d = me.div(i, j);
		
		System.out.println("���ϱ� �� ��� : "+a);
		System.out.println("���� �� ��� : "+b);
		System.out.println("���ϱ� �� ��� : "+c);
		System.out.println("������ �� ��� : "+d);
	}
	
}