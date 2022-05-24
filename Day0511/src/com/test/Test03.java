package com.test;

import java.util.Scanner;

/*
 *  문]
 *  키보드로 돈의 액수를 입력받아 오만원, 만원, 오천원, 천원, 오백원, 
 *  백원, 오십원, 십원. 1원으로 변환하는 프로그램 작성
 *  단, 배열과 반복문 사용
 *  
 */

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int money=0;
		int count=0;
		int unit[]= {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("금액 입력 : ");
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			count=money/unit[i];
			money=money%unit[i];
			System.out.println(unit[i]+"원 갯수 : "+count);
		}
	}

}
