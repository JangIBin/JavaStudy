package com.star;

public class SiegeTank extends Unit {
	
	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SiegeTank ==> x : " + x + ", y : " + y);
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void message() {
		System.out.println("Message :: GO, Siege!");
	}
	
	void changeMode() {
		System.out.println("Yes, Sir!!");
	}

}
