package study;

//논리 연산자 : &&, ||
public class OperExam04 {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = false;
		
		if((a = 4 > 3) || (b = 5 > 7)) {
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		
	}

}
