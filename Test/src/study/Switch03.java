package study;

import java.util.Scanner;

/*
 * 	사칙 연산을 입력받아 계산하는 프로그램을 작성하시오.
 * 	연산자는 +, -, *, / 네가지로 모두 실수로 처리함
 * 
 * 	피연산자와 연산자는 빈칸으로 분리하여 입력
 * 	0으로 나누기 시 "0으로 나눌수 없습니다"를 출력하고 종료함
 * 
 * 	switch ~ case 문을 이용하여 작성
 * 	연산자는 Scanner를 사용하여 문자열로 입력받으시오.
 */

public class Switch03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result = 0;
		String op;
		
		System.out.print("연산 입력 : ");
		num1 = sc.nextInt();
		op = sc.next();
		num2 = sc.nextInt();

//		System.out.print("숫자 입력 : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("연산자 입력 : ");
//		op = sc.next();
//		
//		System.out.print("숫자 입력 : ");
//		num2 = sc.nextInt();
		
		switch (op) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
				return;
			}
			result = num1/num2;
			break;
		default:
			System.out.println("연산자 입력 오류!");
			break;
		}
		
		System.out.println(num1+" "+op+" "+ num2 +" = "+ result);
		
		
	}

}
