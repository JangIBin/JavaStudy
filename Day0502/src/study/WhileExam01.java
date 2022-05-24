package study;

import java.util.Scanner;

/*
 * 사용자가 입력하는 정수를 계속해서 더해 나간다.
 * 만약에 0이 입력되면 지금까지 입력된 정수의 합계를 출력하고 종료하는 프로그램을 구현하시오.
 * 단, while문 이용
 */

public class WhileExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, sum = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			sum = sum + num;
			if(num == 0) {
				System.out.printf("입력한 총 정수의 합계 : %d", sum);
				break;
			}
		}
	}

}
