package study;

import java.util.Scanner;

/*
 * ������ ������ �Է¹޾� ¦������ Ȧ������ 0������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * ��, �� ���� ���� ������ ���� �Ұ��� ���
 * 
 */

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		String exm;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		exm = (num % 2 ==0) ? "¦��" : "Ȧ��";
		System.out.println(exm);
		
	}

}
