package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 정수와 연산자를 입력받아 계산하는 프로그램을 구현
// switch ~ case

public class SwitchEx01 {

	public static void main(String[] args)  throws IOException{
		
		int num1, num2, total = 0;
		char op;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자를 골라주세요(+, -, *, /, %) : ");
		op = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		System.out.print("두번째 숫자 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		switch (op) {
		// char + - * /
			case '+' :
				total = num1 + num2;	
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;
			case '-' : 
				total = num1 - num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;		
			case '*' : 
				total = num1 * num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;
			case '/' : 
				total = num1 / num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;	
			case '%' : 
				total = num1 % num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;	
			default:
				System.out.println("잘못된 연산자를 입력하셨습니다.");
				break;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + total);
		
		
	}

}
