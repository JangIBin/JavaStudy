package com.methodex;

/*
	�޼ҵ� ���ǽ� ���ϵ� ������ �ڷ��� '...'��� �����ϹǷ� �̸� ���� �޼ҵ带 �����ϴµ�
	�ʿ��� ������ ���� �����ϰ� ������ �� �ִ�.
 */

public class VariableEx {
	
	public void argsTest(String ...n) {
		for(int i = 0; i < n.length; i++) {
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		VariableEx ve = new VariableEx();
		ve.argsTest("����", "������", "����", "������");
		ve.argsTest("12", "13", "14", "15");
		
	}

}