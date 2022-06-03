package com.study;

import javax.swing.*;

class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class GenericEx01 {
	
	

	public static void main(String[] args) {
		
		Box<Integer> bi = new Box<Integer>();
		bi.setT(100);
		System.out.println(bi.getT());
		
		Box<String> bs = new Box<String>();
		bs.setT("ȫ�浿");
		System.out.println(bs.getT());
		
	}
	
	

}
