package com.poly;

public class Dog extends Animal {

	private String name;
	
	public Dog() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		return "?? ?? ??";
	}

	public String getName() {
		return name;
	}	
  	
}
