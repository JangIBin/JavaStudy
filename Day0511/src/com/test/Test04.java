package com.test;

/*
 *  문]
 *  컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듬
 *  사용자가 먼저 3가지중 하나를 입력하고 실행함
 *  컴퓨터는 핸덤으로 하나를 선택하여 사용자와 비교함
 *  누가 이겼는지를 판단하고 사용자가 그만을 입력하면 게임을 종료함
 *  
 *  문자열 배열 선언
 *  String[] str = {"가위", "바위", "보"}
 *  
 *  컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는
 *  int n = (int)(Math.random()*3);
 *  
 *  컴퓨터가 낸것이 바위 인지 비교
 *  
 *  if(str[n].equals("바위")
 */

import java.util.*;

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String[] str = {"가위", "바위", "보"};
		String user = "", com, st, result;
		
		while(true) {
			com = str[r.nextInt(3)];
			
			System.out.print("가위바위보 입력 : ");
			user = sc.next();
			
			if(com.equals(user)) {
				System.out.println("시스템 : "+com+", 유저 : "+user);
				System.out.println("비겼습니다.");
			} else {
				if(user.equals("그만")) {
					break;
				} else if(com.equals("바위")) {
					if(user.equals("가위")) {
						System.out.println("시스템 : "+com+", 유저 : "+user+"\n졌습니다.");
					} else {
						System.out.println("시스템 : "+com+", 유저 : "+user+"\n이겼습니다.");
					}
				} else if(com.equals("가위")) {
					if(user.equals("바위")) {
						System.out.println("시스템 : "+com+", 유저 : "+user+"\n이겼습니다");
					} else {
						System.out.println("시스템 : "+com+", 유저 : "+user+"\n졌습니다");
					}
				} else if(com.equals("보")) {
					if(user.equals("가위")) {
						System.out.println("시스템 : "+com+", 유저 : "+user+"\n이겼습니다");
					} else {
						System.out.println("시스템 : "+com+", 유저 : "+user+"\n졌습니다");
					}
				}
			}
		}
		
	}

}
