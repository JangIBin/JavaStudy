package study;

import java.util.Scanner;

/*
 * 국어, 영어, 수학 점수를 입력받아 총점과 평균 그리고 학점을 구하는 프로그램을 작성
 * 학점: 100~90:A, ~ 60점 이하는 F로 처리
 * 평균은 소수점이하 두자리 까지 표시
 * 단, 각 과목을 점수는 0~100을 벗어나지 못함
 */

public class DoWhileExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum = 0;
		double avg = 0.00f;
		String grd;
		
//		do {
//		
//			System.out.print("국어 점수 : ");
//			kor = sc.nextInt();
//			
//			System.out.print("영어 점수 : ");
//			eng = sc.nextInt();
//			
//			System.out.print("수학 점수 : ");
//			mat = sc.nextInt();
//			
//			if((kor <= 0 || kor >= 100) || (eng <= 0 || eng >= 100) || (mat <= 0 || mat >= 100)) {
//				System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해주세요(0~100)");
//			}
//			
//		} while ((kor <= 0 || kor >= 100) || (eng <= 0 || eng >= 100) || (mat <= 0 || mat >= 100));
		
		do {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
		} while (kor <= 0 || kor >= 100);
		
		do {
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
		} while (eng <= 0 || eng >= 100);
		
		do {
			System.out.print("수학 점수 : ");
			mat = sc.nextInt();
		} while (mat <= 0 || mat >= 100);
		
		
		sum = kor+eng+mat;
		
		avg = sum/3.00f;
		
		switch((sum/3)/10) {
			case 10:
			case 9:
				grd = "A";
				break;
			case 8:
				grd = "B";
				break;
			case 7:
				grd = "C";
				break;
			case 6:
				grd = "D";
				break;
			default :
				grd = "F";
				break;
		}
		
		System.out.printf("총점 : %d\n평균 : %.2f\n학점 : %s", sum, avg, grd);
		
	}

}
