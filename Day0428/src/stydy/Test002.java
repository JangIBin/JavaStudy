package stydy;

import java.util.Scanner;

/*
 * 무한대로 두개의 정수를 입력받아 합계를 구하는 프로그램을 작성하시오
 */

public class Test002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, sum = 0;
		
//		while (true) {
//			System.out.print("첫번째 정수 입력 : ");
//			num1 = sc.nextInt();
//			if(num1 == 0) {
//				break;
//			}
//			System.out.print("두번째 정수 입력 : ");
//			num2 = sc.nextInt();
//			sum = num1+num2;
//			System.out.println(sum);
//		}
		
		for(;;) {
			System.out.print("첫번째 정수 입력 : ");
			num1 = sc.nextInt();
			if(num1 == 0) {
				break;
			}
			System.out.print("두번째 정수 입력 : ");
			num2 = sc.nextInt();
			sum = num1+num2;
			System.out.println(sum);
		}
		
	}

}
