package com.test;

import java.util.Scanner;

/*
 *  ��]
 *  Ű����� ���� �׼��� �Է¹޾� ������, ����, ��õ��, õ��, �����, 
 *  ���, ���ʿ�, �ʿ�. 1������ ��ȯ�ϴ� ���α׷� �ۼ�
 *  ��, �迭�� �ݺ��� ���
 *  
 */

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int money=0;
		int count=0;
		int unit[]= {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("�ݾ� �Է� : ");
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			count=money/unit[i];
			money=money%unit[i];
			System.out.println(unit[i]+"�� ���� : "+count);
		}
	}

}
