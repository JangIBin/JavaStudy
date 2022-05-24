package study;

import java.util.*;

/*
 * 임의의 수를 입력 받아 입력받은 수가 짝수인지 판정하시오.
 */



public class IfExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b ;
		char op;
		String s;
		
		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
//		op = sc.next().charAt(0);
		s = sc.next();
		
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
//		if(op == '+') {
		if(s.equals("+")) {
			System.out.printf("%d %s %d = %d \n", a,  s,  b, (a+b));
//		} else if(op == '-') {
		} else	if(s.equals("-")) {
			System.out.printf("%d %s %d = %d \n", a,  s,  b, (a-b));
//		} else if(op == '*') {
		} else if(s.equals("*")) {
			System.out.printf("%d %s %d = %d \n", a,  s,  b, (a*b));
//		} else if(op == '/') {
		}	else if(s.equals("/")) {
			System.out.printf("%d %s %d = %d \n", a,  s,  b, (a/b));
//		} else if(op == '%') {
		}	if(s.equals("%")) {
			System.out.printf("%d %s %d = %d \n", a,  s,  b, (a%b));
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
	}

}
