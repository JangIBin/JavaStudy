package com.star;

public class Marine extends Unit {
	
	@Override
	void move(int x, int y) {
		System.out.println("Marine�� ��ġ �̵� ��ǥ x : "+ x + ", y : " + y);
	}
	
	@Override
	void stop() {
		System.out.println("Marine ��� ����");
	}
	
	@Override
	void message() {
		System.out.println("Message :: Standing back..");
	}
	
	void stimPack() {
		System.out.println("������ �������� ����մϴ�.");
	}

}
