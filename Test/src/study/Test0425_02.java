package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  문]
 *  임의의 5개 과목을 점수를 입력받아 총점과 평가를 구하고 평균을 이용하여 학점을 판정하는 프로그램 구현
 *  switch ~ case 문과 BufferedReader를 이용하여 구현 하시오.
 * 
 */

public class Test0425_02 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, num3, num4, num5, total, avg = 0;
		char grade;
		
		System.out.print("국어 점수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("사회 점수 입력 : ");
		num3 = Integer.parseInt(br.readLine());
		
		System.out.print("과학 점수 입력 : ");
		num4 = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 입력 : ");
		num5 = Integer.parseInt(br.readLine());
		
		total = num1 + num2 + num3 + num4 + num5;
		avg = total/5;
		
		System.out.println("평균 : "+avg);
		
		switch (avg/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("학점은 "+grade+"입니다.");
		
	}

}
