package com.inherex;

class Sawon2 {
	
	String name;
	String dept;
	int salary;
	
	public Sawon2() {
	}
	
	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	}
}

class Sales2 extends Sawon2 {
	
	int commition;
	
	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}
	
	@Override
	String displayInfo() {
		return super.displayInfo()+", 수당 : " + commition;
	}
}

public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales2 se = new Sales2("홍길동", "개발부", 100000000, 5000000);
		System.out.println(se.displayInfo());
	}

}
