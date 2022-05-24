package com.test;

import java.util.Scanner;

/*
 *  문]
 *  학생 수를 입력받아 입력받은 인원수 만큼 학생의 이름과 전화번호를 입력받고
 *  입력 받은 내용을 전체를 출력하는 프로그램을 작성하시오
 *  단, 배열을 이용하여 작성하시오.
 *  이름과 전화번호는 공백구분으로 입력받는다.
 */

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] name;
		String[] phon;
		int num;
		
		System.out.println("---------------------------------");
		System.out.print("입력받은 학생 수: ");
		num = sc.nextInt();
		System.out.println("---------------------------------");
		
		name = new String[num];
		phon = new String[num];
		
		for(int i = 0; i < name.length; i++) {
			System.out.print("이름 전화번호("+(i+1)+")[공백구분]: ");
			name[i] = sc.next();
			phon[i] = sc.next();
		}
		
		System.out.println("---------------------------------");
		System.out.println("이름\t전화번호");
		for(int j = 0;j < name.length; j++) {
			System.out.println(name[j]+"\t"+phon[j]);
		}
		System.out.println("---------------------------------");
	}
}
