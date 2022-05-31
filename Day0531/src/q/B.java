package q;

/*
	private : 같은 패키지여도 사용 불가능
	protected : 같은 패키지는 가능하나 다른 패키지는 사용 불가능
*/

class FinalClass {
	protected final int finalMethod() {
		return 0;
	}
}

class SubClass extends FinalClass {
//	protected int finalMethod() {
//		return 0;
//	}
}

public class B {
	
	int n;
	void g() {
		n = 5;
	}
}
