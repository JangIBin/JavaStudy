package com.constex;

public class Circle { // Ŭ����
	
	int radius; // �Ӽ�, �������, �ʵ�
	String name;
	
	// �������� ������ ��ü�� �����ɶ�, �ʵ带 �ʱ�ȭ�ϱ� �����̴�.
	
	public Circle() { // ������ �޼ҵ� : �������� �̸��� Ŭ������ �̸��� ����.
		// �ʵ� �ʱ�ȭ
		radius = 1;
		name = "";
		

	}
	public Circle(int r, String n) { // �Ű������� Ȱ���Ͽ� �ʵ� �ʱ�ȭ
		// �Ű������� ���� ������
		// �����ڿ� returnŸ���� ����
		radius = r;
		name = n;
		
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

}
