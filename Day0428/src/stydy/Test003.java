package stydy;

import java.util.Scanner;

/*
 *  사용자로부터 임의의 정수를 입력받아
 *  1부터 입력받은 수까지의 합계, 짝수의 합계, 홀수의 합을 각각 출력하는 프로그램을 구형하고
 *  
 *  10단위로 합계를 출력하시오
 *  
 *  1~10
 *  1~20
 *  1~30
 */

public class Test003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int odd=0, even=0, sum=0,num1 = 0, num2=0;
		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		num2 = sc.nextInt();
//		
//		for(;num1 <= num2;num1++) {
//			if(num1<=num2) {
//				if(num1 % 2 == 0) {
//					even = even+num1;
//				} else {
//					odd = odd + num1;
//				}
//			} else {
//				System.out.println("첫번째 정수를 더 작게 입력해주세요");
//				break;
//			}
//			sum = sum+num1;
//		}
//		System.out.println("총합 : "+sum+", "+"짝수의 총합 : "+even+", "+"홀수의 총합 : "+odd);
		
		for (int i = 1;i <= num1;i++) {
			if(i % 2 == 0) {
				even = even+i;
			} else {
				odd = odd + i;
			}
			sum = sum + i;
			if(i == num1) {
				System.out.printf("1~%d의 총합 : %d\n", i, sum);
				System.out.printf("1~%d의 짝수총합 : %d\n", i, even);
				System.out.printf("1~%d의 홀수총합 : %d\n", i, odd);
			} else if(i%10 == 0) {
				System.out.printf("1~%d의 총합 : %d\n", i, sum);
				System.out.printf("1~%d의 짝수총합 : %d\n", i, even);
				System.out.printf("1~%d의 홀수총합 : %d\n", i, odd);
			}
		}
		
	}

}
