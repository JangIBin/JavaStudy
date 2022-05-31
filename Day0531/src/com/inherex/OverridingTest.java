package com.inherex;

/*
	�������̵��� ������ �� �ִ� ��Ģ
	1. �θ�Ŭ������ �ڽ� Ŭ���� ���̿����� �����Ѵ�.
	2. static �޼ҵ�� Ŭ������ ���ϴ� �޼ҵ��̱� ������ ��� ��ü�� �ȵȴ�.
	   ���� �������̵��� �� �� ����.
	3. ���� �����ڰ� private�� ���ǵ� �޼ҵ�� ��� ��ü�� ���� �ʴ´�.
	4. interface�� �����ؼ� �޼ҵ带 �������̵� �Ҷ��� �ݵ�� ���� �����ڸ� public���� �������Ѵ�.
	5. �޼ҵ��� ������ ������ Ÿ���� ���� ��ġ�ؾ��ϰ� ����Ÿ�Ա��� ��ġ�ؾ��Ѵ�.
	6. �θ�Ŭ������ �޼ҵ��� ���������ں��� �� ������ �� ����.
	7. �θ� Ŭ������ �޼ҵ� ���� �� ���� ���ܸ� ���� �� ����.
	8. final ���� ������ �޼ҵ�� �������̵� �� �� ����.
*/

class OverridingParent {
	void parentMethod() {
		System.out.println("parentMethod....");
	}
	
}

class OverridingChild extends OverridingParent {
	
	@Override
	void parentMethod() {
		System.out.println("childMethod....");
	}
	
}

public class OverridingTest {

	public static void main(String[] args) {

		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
		
		
	}

}
