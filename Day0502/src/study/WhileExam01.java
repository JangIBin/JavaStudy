package study;

import java.util.Scanner;

/*
 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
 * ���࿡ 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� �����ϴ� ���α׷��� �����Ͻÿ�.
 * ��, while�� �̿�
 */

public class WhileExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num, sum = 0;
		
		while(true) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			sum = sum + num;
			if(num == 0) {
				System.out.printf("�Է��� �� ������ �հ� : %d", sum);
				break;
			}
		}
	}

}
