package study;

import java.util.Scanner;

/*
 * ��] ������ ������ ���� �ݾ��� �Է¹޾� ��������, ������, õ����,
 * ���������, �������, ���ʿ�����, �ʿ����� �Ͽ������� �� ��� ��ȯ�Ǵ����� ����Ͻÿ�.
 * 
 * �ݾ��� �Է��Ͻÿ� : 
 * �Է±ݾ� : 65376
 * 
 */

public class Test04 {
	
	final static int oman = 50000;
	final static int man = 10000;
	final static int cheon = 1000;
	final static int obak = 500;
	final static int bak = 100;
	final static int sib = 10;
	final static int il = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int res, money;
		
		System.out.print("�ݾ��� �Է� : ");
		money = sc.nextInt();
		
		res = money/oman;
		money = money%oman;
		if(res > 0) {
			System.out.println("�������� : "+res);
		}
		
		res = money/man;
		money = money%man;
		if(res > 0) {
			System.out.println("������ : "+res);
		}
		
		res = money/cheon;
		money = money%cheon;
		if(res > 0) {
			System.out.println("õ���� : "+res);
		}
		
		res = money/obak;
		money = money%obak;
		if(res > 0) {
			System.out.println("����� : "+res);
		}
		
		res = money/bak;
		money = money%bak;
		if(res > 0) {
			System.out.println("��� : "+res);
		}
		
		res = money/sib;
		money = money%sib;
		if(res > 0) {
			System.out.println("�ʿ� : "+res);
		}
		
		res = money/il;
		money = money%il;
		if(res > 0) {
			System.out.println("�Ͽ�: "+res);
		}
		
//		int money = 0;
//		int m_50000,  m_10000,  m_1000,  m_100, m_50,  m_10,  m_1 = 0;
//		
//		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
//		money = sc.nextInt();
//	
//		m_50000 = money/50000;
//		m_10000 = (money%50000) / 10000;
//        m_1000= (money%10000)/1000;
//        m_100= (money%500)/100;
//		m_50 = (money%100)/50;
//		m_10 = (money%50)/10;
//		m_1 = (money%10)/1;
//		
//		System.out.printf("�������� : %d\n������ : %d\nõ���� : %d\n��� : %d\n���ʿ� : %d\n�ʿ� : %d\n�Ͽ� : %d\n", 
//				m_50000, m_10000, m_1000, m_100,  m_50, m_10, m_1);
        
	}

}
