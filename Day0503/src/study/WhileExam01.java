package study;

import java.util.Scanner;

/*
 *  ����ڷκ��� �ϳ��� ���ڸ� �Է¹��� ����, �� ����ŭ 3�� ����� ����ϴ� ���α׷��� �ۼ�
 *  ���࿡ ����ڷκ��� 5�� �Է¹޾Ҵٸ� 3 6 9 12 15 ����Ͻÿ�
 */

public class WhileExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = 1, num;
		
		System.out.printf("���� �Է� : ");
		num = sc.nextInt();
		
		while(i <= num) {
			System.out.print(i*3+" ");
			i++;
		}
		
	}

}
