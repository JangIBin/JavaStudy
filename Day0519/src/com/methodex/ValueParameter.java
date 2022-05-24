package com.methodex;

public class ValueParameter {
	
	public int increase(int n) {
		
		++n;
		return n;
	}

	public static void main(String[] args) {
		
		int value = 100;
		ValueParameter vp = new ValueParameter();
		int value2 = vp.increase(value); // 101
		System.out.println("value : " + value + ", value2 : " + value2);
		
	}

}
