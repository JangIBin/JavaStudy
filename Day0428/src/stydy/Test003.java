package stydy;

import java.util.Scanner;

/*
 *  ����ڷκ��� ������ ������ �Է¹޾�
 *  1���� �Է¹��� �������� �հ�, ¦���� �հ�, Ȧ���� ���� ���� ����ϴ� ���α׷��� �����ϰ�
 *  
 *  10������ �հ踦 ����Ͻÿ�
 *  
 *  1~10
 *  1~20
 *  1~30
 */

public class Test003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int odd=0, even=0, sum=0,num1 = 0, num2=0;
		System.out.print("ù��° ���� �Է� : ");
		num1 = sc.nextInt();
//		System.out.print("�ι�° ���� �Է� : ");
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
//				System.out.println("ù��° ������ �� �۰� �Է����ּ���");
//				break;
//			}
//			sum = sum+num1;
//		}
//		System.out.println("���� : "+sum+", "+"¦���� ���� : "+even+", "+"Ȧ���� ���� : "+odd);
		
		for (int i = 1;i <= num1;i++) {
			if(i % 2 == 0) {
				even = even+i;
			} else {
				odd = odd + i;
			}
			sum = sum + i;
			if(i == num1) {
				System.out.printf("1~%d�� ���� : %d\n", i, sum);
				System.out.printf("1~%d�� ¦������ : %d\n", i, even);
				System.out.printf("1~%d�� Ȧ������ : %d\n", i, odd);
			} else if(i%10 == 0) {
				System.out.printf("1~%d�� ���� : %d\n", i, sum);
				System.out.printf("1~%d�� ¦������ : %d\n", i, even);
				System.out.printf("1~%d�� Ȧ������ : %d\n", i, odd);
			}
		}
		
	}

}
