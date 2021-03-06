package com.classex;

import java.io.*;

public class Banking {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Account na = new Account("감자");
		
		String strWork;
		
		do {
			
			System.out.println("작업을 선택하세요");
			System.out.println("=======================");
			System.out.println("1.입금");
			System.out.println("2.출금");			
			System.out.println("3.잔액 조회");
			System.out.println("0.종료");
			System.out.println("=======================");
			
			System.out.print("작업 내용을 선택하세요 : ");
			strWork = br.readLine();
			
			int switchInt = 0;
			
			if(strWork != null) { // !null(메뉴가 선택되었을 때)
				switchInt = Integer.parseInt(strWork);
			} else { //null
				System.out.println("작업 내용을 입력하지 않으셨습니다.");
				System.exit(0);
			}
			
			switch (switchInt) {
			case 0: // 종료
				System.out.println("프로그램 종료");
				break;
			case 1: // 입금
				System.out.println("\n=======================");
				System.out.println("입금하실 금액을 입력하세요 : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
			case 2: // 출금
				System.out.println("\n=======================");
				System.out.println("출금하실 금액을 입력하세요 : ");
				String strwithDrawIn = br.readLine();
				long withDrawLong = Long.parseLong(strwithDrawIn);
				na.withdraw(withDrawLong);
				break;
			case 3: // 잔고확인
				System.out.println(na.getName()+"님의 잔고는" + na.getBalance() + "원입니다.");
				break;
			default:
				System.out.println("0 ~ 3번 사이의 숫자를 입력해주세요.\n");
				break;
			}
			
			
		} while(!strWork.equals("0"));
		
	}

}
