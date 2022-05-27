package com.inner;

public class OuterEx01 { // 외부
	
	public static class InnerEx01 { // 내부
		
		static int x = 10;
		
		public static void main(String[] args) {

			OuterEx01.InnerEx01 oi = new OuterEx01.InnerEx01();
			
			System.out.println("oi : " + oi.x);
			System.out.println("OuterEx01.InnerEx01 : " + OuterEx01.InnerEx01.x);
			
		}
	}

}
