package com.test;

import java.util.*;

public class Test04_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] str = {"가위", "바위", "보"};
		
		Random rd = new Random();
		
		// 난수 발생
		int com = rd.nextInt(3)+1;
		
		int user=0;
		
		do {
			System.out.println("1:가위 2:바위 3:보 중 입력");
			user = sc.nextInt();
		} while(user < 1 || user > 3);
		
		String result;
		result = "무승부";
		// 사용자가 승리한 경우
		if((user == 1 && com == 3)||(user == 2 && com == 1) || (user == 3&&com == 2)) {
			result = "사용자 승리";
		}
		if((user == 1 && com == 2)||(user == 2 && com == 3) || (user == 3&&com == 1)) {
			result = "사용자가 패배";
		}
		
		System.out.println("최종 승부 결과 : " + result);
		
	}

}
