package stydy;

import java.util.Scanner;

/*
 *  �Է¹��� ������ ����� ���ϴ� ���α׷��� �����Ͻÿ�.
 *  
 *  1. ���ϸ��� �Է��� ������ ������ ����ڷ� ���� �Է� �޴´�.
 *  2. �Է¹��� ����ŭ ��հ��� ���Ͽ� ����Ѵ�.
 *  ��, ��հ��� �Ǽ��� ó���Ѵ�.
 *  
 */

public class Test004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1= 0, num2 = 0;
		float sum = 0.0f, avg = 0.0f;
		
		System.out.print("�Է¹��� ������ ������ �Է����ּ��� : ");
		num1 = sc.nextInt();
		
		for (int i =1;i <= num1; i ++) {
			System.out.printf("%d��°�� �Է����ּ��� : ", i);
			num2 = sc.nextInt();
			sum = sum+num2;
		}
		avg = sum/num1;
		System.out.printf("��� : %.2f", avg);
		
		
	}

}
