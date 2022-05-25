package com.star;

public class Marine extends Unit {
	
	@Override
	void move(int x, int y) {
		System.out.println("Marine의 위치 이동 좌표 x : "+ x + ", y : " + y);
	}
	
	@Override
	void stop() {
		System.out.println("Marine 대기 상태");
	}
	
	@Override
	void message() {
		System.out.println("Message :: Standing back..");
	}
	
	void stimPack() {
		System.out.println("마린이 스팀팩을 사용합니다.");
	}

}
