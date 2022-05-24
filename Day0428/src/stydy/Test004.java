package stydy;

import java.util.Scanner;

/*
 *  입력받은 정수의 평균을 구하는 프로그램을 구현하시오.
 *  
 *  1. 제일먼저 입력할 정수의 개수를 사용자로 부터 입력 받는다.
 *  2. 입력받은 수만큼 평균값을 구하여 출력한다.
 *  단, 평균값을 실수로 처리한다.
 *  
 */

public class Test004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1= 0, num2 = 0;
		float sum = 0.0f, avg = 0.0f;
		
		System.out.print("입력받을 정수의 갯수를 입력해주세요 : ");
		num1 = sc.nextInt();
		
		for (int i =1;i <= num1; i ++) {
			System.out.printf("%d번째를 입력해주세요 : ", i);
			num2 = sc.nextInt();
			sum = sum+num2;
		}
		avg = sum/num1;
		System.out.printf("평균 : %.2f", avg);
		
		
	}

}
