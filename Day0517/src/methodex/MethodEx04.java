package methodex;

import java.io.*;

public class MethodEx04 {
	public static int sum(int x,int y) {
		return x + y;
	}
	public static int sub(int x,int y) {
		return x - y;
	}
	public static int mul(int x,int y) {
		return x * y;
	}
	public static int div(int x,int y) {
		return x / y;
	}
	public static int per(int x,int y) {
		return x % y;
	}
	
	public static void disp(int a, char b, int c, int result) { // a:첫번째 수 b:연산자 c:두번째 수 d:결과값
		System.out.println("\n"+a+" "+b+" "+c+" = "+result);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 선언
		int num1 = 0, num2 = 0, tot = 0;
		char op;
		
		System.out.print("첫 번째 수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		
		do {
			System.out.print("op(+,-,*,/,%) 입력 : ");
			op = (char)System.in.read();
//			System.in.read();
//			System.in.read();
			System.in.skip(2);
			
		} while(op != '+' && op != '-' && op != '*' && op != '/' && op != '%');
		
		System.out.print("두 번째 수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		// 연산자를 조건으로 처리
		switch (op) {
		case '+':
			tot = sum(num1, num2);
			break;
		case '-':
			tot = sub(num1, num2);
			break;
		case '*':
			tot = mul(num1, num2);
			break;
		case '/':
			tot = div(num1, num2);
			break;
		case '%':
			tot = per(num1, num2);
			break;
		default:
			System.out.println("연산자 입력 오류");
			break;
		}
		
		disp(num1, op, num2, tot);
		
	}

}
