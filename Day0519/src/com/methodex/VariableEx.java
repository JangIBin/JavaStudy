package com.methodex;

/*
	메소드 정의시 통일된 인자의 자료형 '...'라고 명시하므로 이를 통해 메소드를 수행하는데
	필요한 인자의 수를 유연하게 구현할 수 있다.
 */

public class VariableEx {
	
	public void argsTest(String ...n) {
		for(int i = 0; i < n.length; i++) {
			System.out.println("n[" + i + "] : " + n[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		VariableEx ve = new VariableEx();
		ve.argsTest("감자", "고구마", "수박", "오렌지");
		ve.argsTest("12", "13", "14", "15");
		
	}

}
