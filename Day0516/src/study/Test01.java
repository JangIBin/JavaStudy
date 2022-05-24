package study;

class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() {
		return speed;
	}
}

public class Test01 {
	
	int a;
	static int b;

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();
		t1.a = 10;
		t1.a = 20;
		
		Car car1 = new Car();
		car1.color = "보라색"; // car 클래스 멤버변수에 값을 설정한다.
		car1.speed = 0;
		
		// car 클래스의 upSpeed(30)메소드에 30을 메개변수를 대입했다.
		car1.upSpeed(30);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getSpeed());
		
		
	}

}
