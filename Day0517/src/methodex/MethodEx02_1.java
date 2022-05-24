package methodex;

public class MethodEx02_1 {
	
	public static void X() {
		for(int a = 0; a < 5; a++) {
			System.out.print("*");
		}
		// void일 경우 return 생략 가능
	}

	public static void main(String[] args) {

		// 메소드 호출
		X();
		System.out.println("\nHello");
		X();
		System.out.println("\nJava");
		X();
		System.out.println("\n!!!!!");
		
		

	}

}
