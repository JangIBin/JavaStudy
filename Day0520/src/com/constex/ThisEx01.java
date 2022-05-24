package com.constex;

/*
	this : 객체 자신을 가리키는 레퍼런스임(참조)
	
		this는 컴파일러에 의해 자동으로 관리하르모 개발자는 this를 사용하기만 하면됨
 */

class CircleEx001 {
	
	int radius;
	
	public CircleEx001() {

		this(10);
		
	}

	
	public CircleEx001(int r) {
		
//		this.radius = r;
		
	}
	
	public int getRadius() {
		return radius;
	}
}

public class ThisEx01 {

	public static void main(String[] args) {
		
		

	}

}
