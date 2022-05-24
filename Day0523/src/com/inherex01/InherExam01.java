package com.inherex01;

/*
	상속시 주의 사항
	
	- 상위 클래스에서 선언된 멤버변수와 하위 클래스에서 선언한 멤버 변수가 같으면
	  상위 클래스의 멤버 변수가 무시됨
	  이때, 상위 클래스의 멤버변수를 사용하기 위해서는 super라는 키워드를 이용함
	  
	- 동일한 이르므이 멤버 변수나 동일한 이름의 메소드가 한 클래스 안에 정의 되는 경우는 에러가 발생됨
 */

class SuperTest {
	
	protected double area;
	private String title;
	
	public SuperTest() {
		System.out.println("SuperTest() .. 인자가 없는 생성자");
	}
	
	public SuperTest(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + " " + area);
	}
	
}

class Rect extends SuperTest {
	/*
	protected double area;
	public void write() {
		System.out.println(title + " " + area);
	}
	*/
	
	private int w, h;
	
	public Rect() {
//		super();
	}
	
	/*
		메소드 오버라이딩
		
		- 상위 클래스를 상속받은 하위 클래스에서
		  상위 클래스에 정의된 메소드를 재정의 하는 것을 의미함.
		  
		  객체지향 프로그램의 특징인 다형성을 나타냄
		  
		재정의
		- 반드시 상속관계에 있어야하며
		  메소드 이름, 리턴타입, 매개변수의 개수나 타입이 완전히 일치해야함  
	 */
	
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		
	}
	
	@Override
	public void write() {
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형의 넓이는 " + area);
		
	}
}

class A_class {
	public A_class(int n) {
		
	}
}

class B_class extends A_class {
	public B_class() {
		super(10);
	}
}

/*
 	상위 클래스              ㅣ 하위 클래스               ㅣ   결과
 	===========================================================
 	생성자를 정의하지 않은 않음  ㅣ 생성자 정의 안함            ㅣ   가능하다
 	                      ㅣ 인자가 없는 생성자          ㅣ   가능하다.
 	                      ㅣ 인수가 있는 생성자          ㅣ   가능하다.
 	============================================================
 	인수가 없는 생성자 정의     ㅣ 생성자 정의 안함            ㅣ   가능하다.
 	                      ㅣ 인수가 없는 생성자          ㅣ   가능하다.
 	                      ㅣ 인수가 있는 생성자          ㅣ   가능하다.
 	============================================================
 	인수가 있는 생성자만 정의    ㅣ 생성자 정의 안함            ㅣ  에러 발생
 	                      ㅣ 변수가 없는 생성자           ㅣ 상위 클래스의 해당 생성자를 
 	                                                  호출하지 않으면 에러가 발생
 	                      ㅣ 인수가 있는 생성자           ㅣ 상위 클래스의 해당 생성자를 
 	                                                  호출하지 않으면 에러가 발생함
*/

public class InherExam01 {
	
	public static void main(String[] args) {

		Rect r = new Rect();
	}

}
