package study;

import java.util.Scanner;

/*
 * 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 2의 배수인지 3의 배수인지,
 * 2와 3의 배수인지, 2와 3의 배수가 아닌지 판별하여 결과를 출력하는 프로그램을 구현한다.
 * 
 */

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			if(num % 3 == 0 && num % 3 == 0) {
				System.out.println("2와 3의 배수");
			} else {
				System.out.println("2의 배수");
			}
		} else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("2와 3의 배수가 아님");
		}
		
	}

}
