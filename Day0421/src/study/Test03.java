package study;

import java.util.Scanner;

/*
 * 사용자로부터 임의의 정수 세개를 입력받아 작은수에서 큰수 순으로 출력하는 프로그램을 작성한다
 * 
 */

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("첫 번쨰 정수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("세 번째 정수 입력 : ");
		num3 = sc.nextInt();
		
//		if (num1 > num2 && num1 > num3) {
//			if (num2 > num3) {
//				System.out.printf("%d %d %d", num3, num2, num1);
//			} else {
//				System.out.printf("%d %d %d", num2, num3, num1);
//			}
//		} else if(num2 > num1 && num2 > num3) {
//			if(num1	> num3) {
//				System.out.printf("%d %d %d",num3, num1, num2);
//			} else {
//				System.out.printf("%d %d %d", num1, num3, num2);
//			}
//		} else {
//			if(num1 > num2) {
//				System.out.printf("%d %d %d", num2, num1, num3);
//			} else {
//				System.out.printf("%d %d %d", num1, num2, num3);
//			}
//		}
		
		if (num1 > num2) {
			num1 = num1 ^ num2;
			num2 = num1 ^ num2;
			num1 = num1 ^ num2;
		} 
		
		if (num2 > num3) {
			num2 = num2 ^ num3;
			num3 = num2 ^ num3;
			num2 = num2 ^ num3;
		}
		
		if (num1 > num2) {
			num1 = num1 ^ num2;
			num2 = num1 ^ num2;
			num1 = num1 ^ num2;
		}
		
		System.out.printf("%d %d %d", num1, num2, num3);
		
	}
}
