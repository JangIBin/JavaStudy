package com.ex04;

import java.util.*;

public class RectangleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("가로 : ");
		rect.width = sc.nextInt();
		
		System.out.println("세로 : ");
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 넓이는 "+rect.getArea()+"입니다.");
	}

}
