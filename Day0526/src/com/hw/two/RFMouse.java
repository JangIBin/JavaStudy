package com.hw.two;

public class RFMouse extends Mouse implements IRF {
	
	public static void main(String[] args) {

		RFMouse rfm = new RFMouse();
		System.out.println("������� : " + IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
		
	}

	@Override
	public void wconnect() { // �������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� �����");
	}

	@Override
	public void wdisconnect() { // �������̽��� �޼ҵ� ������
		System.out.println("���콺 ���� �������");
	}

	@Override
	void move() { // �߻�Ŭ���� �޼ҵ� ������
		System.out.println("���콺 ������");
	}

	@Override
	void scroll() { // �߻�Ŭ���� �޼ҵ� ������
		System.out.println("���콺 ��ũ�� ����");		
	}

}
