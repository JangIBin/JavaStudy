package study;

import java.util.Scanner;

/*
 * ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ 2�� ������� 3�� �������,
 * 2�� 3�� �������, 2�� 3�� ����� �ƴ��� �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
 * 
 */

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			if(num % 3 == 0 && num % 3 == 0) {
				System.out.println("2�� 3�� ���");
			} else {
				System.out.println("2�� ���");
			}
		} else if(num % 3 == 0) {
			System.out.println("3�� ���");
		}else {
			System.out.println("2�� 3�� ����� �ƴ�");
		}
		
	}

}
