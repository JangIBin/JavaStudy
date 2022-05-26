package com.hw;
//추상 클래스를 상속받아 구현하는 구현체(하위클래스)
public class Piano extends Instrument {

	public static void main(String[] args) {
		
		Piano p = new Piano();
		p.play();
		p.volumeUp();
		p.volumeDown();
	}
	
	@Override
	void play() { // 인스턴스 메소드
		System.out.println("Piano : play() 호출됨");
	}
	
	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp() 호출됨");
	}
	
	@Override
	void volumeDown() {
		System.out.println("Piano : volumedOWN() 호출됨");
	}

}
