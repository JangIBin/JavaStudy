package study;

import java.util.Scanner;

/*
 * 임의의 정수를 입력받아 짝수인지 홀수인지 0인지를 판정하는 프로그램을 작성하시오
 * 단, 이 외의 것이 들어오면 판정 불가를 출력
 * 
 */

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		String exm;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		exm = (num % 2 ==0) ? "짝수" : "홀수";
		System.out.println(exm);
		
	}

}
