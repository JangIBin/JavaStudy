package study;

import java.util.Scanner;

/*
 * 문] 임의의 정수로 돈의 금액을 입력받아 오만원권, 만원권, 천원권,
 * 오백원동전, 백원동전, 오십원동전, 십원동전 일원동전을 각 몇개로 변환되는지를 출력하시오.
 * 
 * 금액을 입력하시오 : 
 * 입력금액 : 65376
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
		
		System.out.print("금액을 입력 : ");
		money = sc.nextInt();
		
		res = money/oman;
		money = money%oman;
		if(res > 0) {
			System.out.println("오만원권 : "+res);
		}
		
		res = money/man;
		money = money%man;
		if(res > 0) {
			System.out.println("만원권 : "+res);
		}
		
		res = money/cheon;
		money = money%cheon;
		if(res > 0) {
			System.out.println("천원권 : "+res);
		}
		
		res = money/obak;
		money = money%obak;
		if(res > 0) {
			System.out.println("오백원 : "+res);
		}
		
		res = money/bak;
		money = money%bak;
		if(res > 0) {
			System.out.println("백원 : "+res);
		}
		
		res = money/sib;
		money = money%sib;
		if(res > 0) {
			System.out.println("십원 : "+res);
		}
		
		res = money/il;
		money = money%il;
		if(res > 0) {
			System.out.println("일원: "+res);
		}
		
//		int money = 0;
//		int m_50000,  m_10000,  m_1000,  m_100, m_50,  m_10,  m_1 = 0;
//		
//		System.out.print("금액을 입력하시오 : ");
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
//		System.out.printf("오만원권 : %d\n만원권 : %d\n천원권 : %d\n백원 : %d\n오십원 : %d\n십원 : %d\n일원 : %d\n", 
//				m_50000, m_10000, m_1000, m_100,  m_50, m_10, m_1);
        
	}

}
