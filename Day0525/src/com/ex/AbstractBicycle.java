package com.ex;

public abstract class AbstractBicycle { // �߻� Ŭ����

	// ��� ����
	int id;
	String brand;
	
	// �߻� �޼ҵ� ����(�ݵ�� �ϳ��� ����Ǿ����)
	abstract void prtInfo();
	
	// �Ϲ� �޼ҵ� ����
	public String getBrand() {
		return brand;
	}
	
}