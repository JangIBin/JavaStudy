package com.ex03;

public class Circle {
	
	int radius; // 원의 반지
	String name; // 원의 이름
	
	public Circle() {}
		
		public double getArea() {
		
			double result = radius * radius * 3.14;
			
			return result;
		}
	

}
