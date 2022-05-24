package study;

/*
 *  1. 년도가 4로 나누어 떨어지는 해는 윤년으로 한다.
 *  2. 그 중에서 100으로 나누어 떨어지는 해는 평년으로 한다.
 *  3. 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정함.
 *  
 *  1년의 평균날짜는 365.2425일로 정하여 씀
 *  실제 1년보다 0.0003일 이 길다
 *  
 *  끝나는 날짜가 30, 31일
 *  
 *  29일이면 윤년, 28일이면 평년
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year, month, day = 0;
		String exm,ex;
		
		
		System.out.print("임의의 년도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
		System.out.print("월 입력 : ");
		month = Integer.parseInt(br.readLine());
		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "년은 윤년이다");
//		} else {
//			System.out.println(year + "년은 평년이다.");
//		}
		
//		exm = (year%4==0 && year%100!=0 || year%400==0) ? "윤년" : "평년"; 
//		System.out.println(year + "년은 "+exm + "이다.");
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			day = 0;
			break;
		}
		
		if(day != 0) {
			if(month != 2) {
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					System.out.println(year+"년 "+month+"월은 "+day+" 윤달입니다.");
				} else {
					System.out.println(year+"년 "+month+"월은 "+day+" 평달입니다.");
				}
			} else {
				if(day == 29) {
					System.out.println(year+"년 "+month+"월은 "+day+" 윤달입니다.");
				} else {
					System.out.println(year+"년 "+month+"월은 "+day+" 평달입니다.");
				}
			}
		} else {
			System.out.println("입력 오류!!!");
		}
	}
}
