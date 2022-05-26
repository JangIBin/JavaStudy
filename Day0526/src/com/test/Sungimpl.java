package com.test;

import java.util.*;

/*
����

	�ο��� �Է� : n
	
	n��° �л��� �й� �̸� �Է�(���鱸��) ex) 1111 ������
	���� ���� ���� ���� �Է�(���鱸��)
	
	�й� �̸� ���� ���� ���� ���� ��� ����̾簡
	
	Record
	�̸� name
	String[]scor = new String[3] ����
	int[] sco = new int[3] ��������
	int number, avg, sum
	
	�������̽� Sung
	set();
	input();
	print();
	
	�������̽��� ������ Ŭ���� ����
	Sungimpl

*/

public class Sungimpl extends Record implements Sung {
	
	
	int in;
	Record re[];

	@Override
	public void set() { // �ο��� �Է� �޴� ���
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�ο��� �Է� : ");
			in = sc.nextInt();
		} while (in < 1 || in > 10);
		
		re = new Record[in];
		
	}
	
	// �� ������ �Է� �� ���� ó���ϴ� ���
	
	@Override
	public void input() { // �й�, �̸�, ����, ���� �Է±��, ����
		Scanner sc = new Scanner(System.in);
		
		sum = 0;
		
		for(int i = 0; i < in; i++) {
			re[i] = new Record();
			System.out.print((i+1) + "��° �л��� �й� �̸� �Է� : ");
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			System.out.println("���� ���� ���� ������ �Է����ּ���.");
			for(int j = 0; j < 3; j++) {
				re[i].sco[j] = sc.nextInt();
				re[i].sum += re[i].sco[j];
			}
			re[i].avg = re[i].sum /3f;
			
			for(int j = 0; j < sco.length; j++) {																																																
				switch (re[i].sco[j] / 10) {
				case 10:
				case 9:
					re[i].scor[j] = "��";
					break;
				case 8:
					re[i].scor[j] = "��";
					break;
				case 7:
					re[i].scor[j] = "��";
					break;
				case 6:
					re[i].scor[j] = "��";
					break;
				default:
					re[i].scor[j] = "��";
					break;
				}
			}
		}
	}

	@Override
	public void print() {
		String[] title = {"����", "����", "����"};
		for(int i = 0; i < in; i++) {
			System.out.println("�й� : " + re[i].number);
			System.out.println("�̸� : " + re[i].name);
			for(int j = 0; j < 3; j++) {
				System.out.println(title[j] + " : " +re[i].sco[j]);
			}
			System.out.println("���� : " + re[i].sum);
			System.out.println("��� : " + re[i].avg);

			for(int j = 0; j < 3; j++) {
				System.out.println(title[j] + "���� : " +re[i].scor[j]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Sungimpl si = new Sungimpl();
		
		si.set();
		si.input();
		si.print();
		
		
	}

}
