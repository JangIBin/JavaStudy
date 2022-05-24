package stydy;

/*
 * 임의의 두 정수와 연산자를 입력받아 산술연산 프로그램을 구현하시오. 
 * 단, 산술연산자는(+, -, *, /, %)
 * 모든 입력은 BufferedReader로 처리하시오
 * 
 */

import java.io.*;


public class Calculator {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, result = 0;
		char op;
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자를 골라주세요(+, -, *, /, %) : ");
		op = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		if(op == 43) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1+num2));
		} else if(op == 45) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1-num2));
		} else if(op == 42) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1*num2));
		} else if(op == 47) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1/num2));
		} else if(op == 37) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1%num2));
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
//		System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1+num2));
		
//		result = num1 + num2;
//		System.out.println(result);
		
	}

}
