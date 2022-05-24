package com.ex03;

public class CircleEx {

	public static void main(String[] args) {

		Circle pizza; // 레퍼런스 변수선언
		
		pizza = new Circle();
		
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자";
		
		// 피자크기 구하기(면적)
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle dount = new Circle();
		dount.radius = 2; // 도넛 반지름 2
		dount.name = "자바 도넛";
		area = dount.getArea();
		
	}

}
