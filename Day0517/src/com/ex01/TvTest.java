package com.ex01;

public class TvTest extends Tv{
	

	public static void main(String[] args) {

		// Tv 인스턴스를 참조하기 위한 변수 t를 선언했다.
		Tv t;
		t = new Tv(); // 인스턴스를 생성(인스턴스 = 객체)
		t.channel = 24; // Tv객체의 멤버변수 채널 값을 24로 지정했다.
		t.channelDown(); // 23 : 연합뉴스
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		
	}

}
