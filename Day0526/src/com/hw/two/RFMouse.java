package com.hw.two;

public class RFMouse extends Mouse implements IRF {
	
	public static void main(String[] args) {

		RFMouse rfm = new RFMouse();
		System.out.println("무선방식 : " + IRF.RF_Type_BT);
		rfm.wconnect();
		rfm.move();
		rfm.scroll();
		rfm.wdisconnect();
		
	}

	@Override
	public void wconnect() { // 인터페이스의 메소드 재정의
		System.out.println("마우스 무선 연결됨");
	}

	@Override
	public void wdisconnect() { // 인터페이스의 메소드 재정의
		System.out.println("마우스 무선 연결끊김");
	}

	@Override
	void move() { // 추상클래스 메소드 재정의
		System.out.println("마우스 움직임");
	}

	@Override
	void scroll() { // 추상클래스 메소드 재정의
		System.out.println("마우스 스크롤 동작");		
	}

}
