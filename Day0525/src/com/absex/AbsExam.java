package com.absex;

public class AbsExam extends AbsEx02 {

	public static void main(String[] args) {

		AbsExam ae = new AbsExam();
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
		
	}
	
	@Override
	public String getStr() { // AbsEx02의 추상메소드를 재정의
		return str; // AbsEx01의 멤버 변수
	}

}
