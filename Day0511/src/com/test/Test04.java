package com.test;

/*
 *  ��]
 *  ��ǻ�Ϳ� ����� ������ ���� ���� �� ������ ����
 *  ����ڰ� ���� 3������ �ϳ��� �Է��ϰ� ������
 *  ��ǻ�ʹ� �ڴ����� �ϳ��� �����Ͽ� ����ڿ� ����
 *  ���� �̰������ �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ������ ������
 *  
 *  ���ڿ� �迭 ����
 *  String[] str = {"����", "����", "��"}
 *  
 *  ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ���
 *  int n = (int)(Math.random()*3);
 *  
 *  ��ǻ�Ͱ� ������ ���� ���� ��
 *  
 *  if(str[n].equals("����")
 */

import java.util.*;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String[] str = {"����", "����", "��"};
		String user = "", com, st, result;
		
		while(true) {
			com = str[r.nextInt(3)];
			
			System.out.print("���������� �Է� : ");
			user = sc.next();
			
			if(com.equals(user)) {
				System.out.println("�ý��� : "+com+", ���� : "+user);
				System.out.println("�����ϴ�.");
			} else {
				if(user.equals("�׸�")) {
					break;
				} else if(com.equals("����")) {
					if(user.equals("����")) {
						System.out.println("�ý��� : "+com+", ���� : "+user+"\n�����ϴ�.");
					} else {
						System.out.println("�ý��� : "+com+", ���� : "+user+"\n�̰���ϴ�.");
					}
				} else if(com.equals("����")) {
					if(user.equals("����")) {
						System.out.println("�ý��� : "+com+", ���� : "+user+"\n�̰���ϴ�");
					} else {
						System.out.println("�ý��� : "+com+", ���� : "+user+"\n�����ϴ�");
					}
				} else if(com.equals("��")) {
					if(user.equals("����")) {
						System.out.println("�ý��� : "+com+", ���� : "+user+"\n�̰���ϴ�");
					} else {
						System.out.println("�ý��� : "+com+", ���� : "+user+"\n�����ϴ�");
					}
				}
			}
		}
		
	}

}
