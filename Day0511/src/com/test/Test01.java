package com.test;

import java.util.Scanner;

/*
 *  ��]
 *  �л� ���� �Է¹޾� �Է¹��� �ο��� ��ŭ �л��� �̸��� ��ȭ��ȣ�� �Է¹ް�
 *  �Է� ���� ������ ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *  ��, �迭�� �̿��Ͽ� �ۼ��Ͻÿ�.
 *  �̸��� ��ȭ��ȣ�� ���鱸������ �Է¹޴´�.
 */

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] name;
		String[] phon;
		int num;
		
		System.out.println("---------------------------------");
		System.out.print("�Է¹��� �л� ��: ");
		num = sc.nextInt();
		System.out.println("---------------------------------");
		
		name = new String[num];
		phon = new String[num];
		
		for(int i = 0; i < name.length; i++) {
			System.out.print("�̸� ��ȭ��ȣ("+(i+1)+")[���鱸��]: ");
			name[i] = sc.next();
			phon[i] = sc.next();
		}
		
		System.out.println("---------------------------------");
		System.out.println("�̸�\t��ȭ��ȣ");
		for(int j = 0;j < name.length; j++) {
			System.out.println(name[j]+"\t"+phon[j]);
		}
		System.out.println("---------------------------------");
	}
}
