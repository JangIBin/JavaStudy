package stydy;

import java.util.Scanner;

/*
 * ���Ѵ�� �ΰ��� ������ �Է¹޾� �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 */

public class Test002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, sum = 0;
		
//		while (true) {
//			System.out.print("ù��° ���� �Է� : ");
//			num1 = sc.nextInt();
//			if(num1 == 0) {
//				break;
//			}
//			System.out.print("�ι�° ���� �Է� : ");
//			num2 = sc.nextInt();
//			sum = num1+num2;
//			System.out.println(sum);
//		}
		
		for(;;) {
			System.out.print("ù��° ���� �Է� : ");
			num1 = sc.nextInt();
			if(num1 == 0) {
				break;
			}
			System.out.print("�ι�° ���� �Է� : ");
			num2 = sc.nextInt();
			sum = num1+num2;
			System.out.println(sum);
		}
		
	}

}
