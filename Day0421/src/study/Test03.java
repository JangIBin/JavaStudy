package study;

import java.util.Scanner;

/*
 * ����ڷκ��� ������ ���� ������ �Է¹޾� ���������� ū�� ������ ����ϴ� ���α׷��� �ۼ��Ѵ�
 * 
 */

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("ù ���� ���� �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		num2 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
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
