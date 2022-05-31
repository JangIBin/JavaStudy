package com.inherex;

class OverridingParent2 {
	
	int money = 20;
	void parentMethod() {
		System.out.println("parent Method....");
	}
}

class OverridingChild2 extends OverridingParent2 {
	
	String money = "20원";
	@Override
	void parentMethod() {
		System.out.println("overriding method....");
	}
}



public class OverridingTest02 {

	public static void main(String[] args) {

		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30원";
//		oc2.money = 10; // 부모
		System.out.println(oc2.money);
		
	}

}
