package study;

import java.util.*;

/*
 * ��] ������ �г��� �Է¹޾� 60�� �̻��̸� �հ�, �̸��̸� ���հ�
 * ��, 4�г��� ��� 70�� �̻��̾�� �հ�
 * 
 * ó������
 * �г� 4�г�, ������ 65��
 * 
 */



public class Score {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score, grade = 0;
		
		System.out.print("������ �Է����ּ��� : ");
		score = sc.nextInt();
		
		System.out.print("�г��� �Է����ּ��� : ");
		grade = sc.nextInt();
		
		if(score >= 60) {
			if(grade == 4) {
				if(score >= 70) {
					System.out.println("�հ�");
				} else {
					System.out.println("���հ�");
				}
			} else {
				System.out.println("�հ�");
			}
		} else {
			System.out.println("���հ�");
		}
		
		sc.close();

		
	}

}
