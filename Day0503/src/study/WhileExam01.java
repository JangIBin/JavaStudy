package study;

import java.util.Scanner;

/*
 *  사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성
 *  만약에 사용자로부터 5를 입력받았다면 3 6 9 12 15 출력하시오
 */

public class WhileExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = 1, num;
		
		System.out.printf("정수 입력 : ");
		num = sc.nextInt();
		
		while(i <= num) {
			System.out.print(i*3+" ");
			i++;
		}
		
	}

}
