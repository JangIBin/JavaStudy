package com.constex;

class ThisEx {
	
	String name, jumin, tel;
	
	public ThisEx() {
		this.name = "GamJa";
		this.jumin = "012345-6789012";
		tel = "010-1234-5678";
	}
	
	public ThisEx(String name) {
		this();
		this.name = name;
		
	}

	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;
		
	}

	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getJumin() {
		return jumin;
	}
	
	public String getTel() {
		return tel;
	}
	
}

public class ThisEx04 {

	public static void main(String[] args) {
		
		ThisEx t = new ThisEx();
		
		System.out.println("name : " + t.getName());
		System.out.println("jumin : " + t.getJumin());
		System.out.println("tel : " + t.getTel());
		
	}
	
}
