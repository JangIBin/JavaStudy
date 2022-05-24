package com.test;

import java.util.Scanner;

/*
 *  문]
 *  양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서
 *  3의 배수만을 출력하는 프로그램을 작성하시오
 *  
 *  배열명 : unit
 */

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] unit= new int[10];
		int[] thr = {};
		
		System.out.print("정수 입력 : ");
		for(int i = 0; i < unit.length; i++) {
			unit[i] = sc.nextInt();
		}
		
		for(int j = 0; j < unit.length;j++) {
			System.out.print(unit[j]%3==0?unit[j]+" ":"");
		}
		

	}

}
