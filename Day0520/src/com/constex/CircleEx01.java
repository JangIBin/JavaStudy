package com.constex;

public class CircleEx01 {

	public static void main(String[] args) {
		Circle c = new Circle(10, "����");
		Circle c2 = new Circle(10, "����");
		Circle c3 = new Circle(10, "����");
		Circle c4 = new Circle(10, "����");
		Circle c5 = new Circle(10, "����");
		
		System.out.println("���� �������� " + c.radius + "�̰� �̸��� " + c.name + "�̴�.");
		System.out.println("���� ���̴� " + c.getArea() + "�Դϴ�.");
	}

}