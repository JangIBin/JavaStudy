package study;

import java.util.*;

/*
 *  ������ ī�� ���� ���ߴ� ����
 *  
 *  0���� ���� 99���� ������ ���� ���� ī�带 ���� �����
 *  �� ī�� ���� ���ߴ� ������
 *  ī����� ���� 77�̶�� ���� ���ߴ� ����� 55�� �Է��ϸ�
 *  �� ���� �ٽ� �Է��϶�� �ϸ� ������ �������� ���ڸ� ���ߴ� ����
 *  ������ �ݺ��ϱ� ���� y/n�� ����, n�� ���� ������
 */

public class WhileExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int i = r.nextInt(100);
		
		int num = 0;
		char c;
		
		while(true) {
			System.out.print("(0~99)���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if(num > i) {
				System.out.println("�� �۰� �Է��ּ���.");
			} else if(num < i) {
				System.out.println("�� ���� �Է����ּ���");
			} else {
				System.out.println("���߼̽��ϴ�.");
				System.out.print("�ٽ� �Ͻðڽ��ϱ�?(y/n) : ");
				c = sc.next().charAt(0);
				if(c=='y') {
					i = r.nextInt(100);
				} else if (c=='n') {
					return;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}
		}
	}
}
