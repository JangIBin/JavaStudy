package q;

/*
	private : ���� ��Ű������ ��� �Ұ���
	protected : ���� ��Ű���� �����ϳ� �ٸ� ��Ű���� ��� �Ұ���
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
