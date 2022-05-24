package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지 판정하는 프로그램 구현
 * 
 * 윤년판정 조건
 * - 년도가 4의 배수이면서 100의 배수가 아니거나 400의 배수이면 윤년 그렇치 않으면 평년
 * 
 */

public class Pro03 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year = 0;
		String exm;
		
		
		System.out.print("임의의 년도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "년은 윤년이다");
//		} else {
//			System.out.println(year + "년은 평년이다.");
//		}
		
		exm = (year%4==0 && year%100!=0 || year%400==0) ? "윤년" : "평년"; 
		System.out.println(year + "년은 "+exm + "이다.");
		
		
	}

}
