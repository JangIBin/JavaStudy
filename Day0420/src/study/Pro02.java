package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 문] 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램 구현
 * 
 * if or 삼항연산자 활용
 * 
 */


public class Pro02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num = 0;
		String exm;
		
		System.out.print("정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		exm = (num >= 0) ? ((num == 0) ? "0입니다" : "양수입니다") : "음수입니다.";
		
		System.out.println(exm);
		
		
	}

}
