package com.excp1;

public class Except03 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
		} catch (NullPointerException ne) {
			if(ne instanceof NullPointerException) {
				System.out.println("NullPointerException");
			}
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
		
	}

}
