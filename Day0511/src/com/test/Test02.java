package com.test;

import java.util.Scanner;

/*
 *  ��]
 *  ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿���
 *  3�� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *  
 *  �迭�� : unit
 */

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] unit= new int[10];
		int[] thr = {};
		
		System.out.print("���� �Է� : ");
		for(int i = 0; i < unit.length; i++) {
			unit[i] = sc.nextInt();
		}
		
		for(int j = 0; j < unit.length;j++) {
			System.out.print(unit[j]%3==0?unit[j]+" ":"");
		}
		

	}

}
