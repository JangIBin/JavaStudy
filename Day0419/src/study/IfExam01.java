package study;

import java.util.*;

/*
 * ������ ���� �Է� �޾� �Է¹��� ���� ¦������ �����Ͻÿ�.
 */



public class IfExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b ;
		char op;
		String s;
		
		System.out.print("ù��° ���� �Է� : ");
		a = sc.nextInt();
		
		System.out.print("������ �Է� : ");
//		op = sc.next().charAt(0);
		s = sc.next();
		
		System.out.print("�ι�° ���� �Է� : ");
		b = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		
	}

}
